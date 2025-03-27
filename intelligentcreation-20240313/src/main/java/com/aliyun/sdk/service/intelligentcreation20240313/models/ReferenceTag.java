// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReferenceTag} extends {@link TeaModel}
 *
 * <p>ReferenceTag</p>
 */
public class ReferenceTag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("referenceContent")
    private String referenceContent;

    @com.aliyun.core.annotation.NameInMap("referenceTitle")
    private String referenceTitle;

    private ReferenceTag(Builder builder) {
        this.referenceContent = builder.referenceContent;
        this.referenceTitle = builder.referenceTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReferenceTag create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return referenceContent
     */
    public String getReferenceContent() {
        return this.referenceContent;
    }

    /**
     * @return referenceTitle
     */
    public String getReferenceTitle() {
        return this.referenceTitle;
    }

    public static final class Builder {
        private String referenceContent; 
        private String referenceTitle; 

        private Builder() {
        } 

        private Builder(ReferenceTag model) {
            this.referenceContent = model.referenceContent;
            this.referenceTitle = model.referenceTitle;
        } 

        /**
         * referenceContent.
         */
        public Builder referenceContent(String referenceContent) {
            this.referenceContent = referenceContent;
            return this;
        }

        /**
         * referenceTitle.
         */
        public Builder referenceTitle(String referenceTitle) {
            this.referenceTitle = referenceTitle;
            return this;
        }

        public ReferenceTag build() {
            return new ReferenceTag(this);
        } 

    } 

}
