// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Element} extends {@link TeaModel}
 *
 * <p>Element</p>
 */
public class Element extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElementContents")
    private java.util.List < ElementContent > elementContents;

    private Element(Builder builder) {
        this.elementContents = builder.elementContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Element create() {
        return builder().build();
    }

    /**
     * @return elementContents
     */
    public java.util.List < ElementContent > getElementContents() {
        return this.elementContents;
    }

    public static final class Builder {
        private java.util.List < ElementContent > elementContents; 

        /**
         * ElementContents.
         */
        public Builder elementContents(java.util.List < ElementContent > elementContents) {
            this.elementContents = elementContents;
            return this;
        }

        public Element build() {
            return new Element(this);
        } 

    } 

}
