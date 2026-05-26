// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link VideoInsightsCaptionConfig} extends {@link TeaModel}
 *
 * <p>VideoInsightsCaptionConfig</p>
 */
public class VideoInsightsCaptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PersonReference")
    private PersonReferenceConfig personReference;

    private VideoInsightsCaptionConfig(Builder builder) {
        this.personReference = builder.personReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsightsCaptionConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return personReference
     */
    public PersonReferenceConfig getPersonReference() {
        return this.personReference;
    }

    public static final class Builder {
        private PersonReferenceConfig personReference; 

        private Builder() {
        } 

        private Builder(VideoInsightsCaptionConfig model) {
            this.personReference = model.personReference;
        } 

        /**
         * PersonReference.
         */
        public Builder personReference(PersonReferenceConfig personReference) {
            this.personReference = personReference;
            return this;
        }

        public VideoInsightsCaptionConfig build() {
            return new VideoInsightsCaptionConfig(this);
        } 

    } 

}
