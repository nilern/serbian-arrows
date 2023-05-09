# serbian-arrows

> Personally, basing myself on the knowledge of this art to which I have
> devoted my best energies, I do not hesitate to state here for future
> reference and as a test of accuracy of my scientific forecast that flying
> machines and ships propelled by electricity transmitted without wire will
> have ceased to be a wonder in ten years from now. I would say five were it
> not that there is such a thing as “inertia of human opinion” resisting
> revolutionary ideas.
>
> -- Nikola Tesla, Serbian inventor

Transducer-backed threading macros.

## Rationale

* Unnecessary waste of resources is to be avoided.
* Transducers are more efficient in both space and time.
* Transducers are in `clojure.core`.
* Therefore we should utilize transducers whenever possible.
* Unfortunately transducer usages are slightly harder to read than sequence
  pipelines using threading macros.
* Therefore we should provide transducer-backed threading macros.

## Usage

FIXME

## Credits

* [swiss-arrows](https://github.com/rplevy/swiss-arrows) for the name.
* Nikola Tesla for transducers such as AC generators/motors and radio
  transmitters/receivers.

## License

Copyright © 2023 Pauli Jaakkola

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
