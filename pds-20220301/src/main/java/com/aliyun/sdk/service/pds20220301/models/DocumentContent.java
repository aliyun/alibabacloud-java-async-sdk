// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DocumentContent} extends {@link TeaModel}
 *
 * <p>DocumentContent</p>
 */
public class DocumentContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("element_contents")
    private java.util.List < ElementContent > elementContents;

    private DocumentContent(Builder builder) {
        this.elementContents = builder.elementContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentContent create() {
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
         * element_contents.
         */
        public Builder elementContents(java.util.List < ElementContent > elementContents) {
            this.elementContents = elementContents;
            return this;
        }

        public DocumentContent build() {
            return new DocumentContent(this);
        } 

    } 

}
