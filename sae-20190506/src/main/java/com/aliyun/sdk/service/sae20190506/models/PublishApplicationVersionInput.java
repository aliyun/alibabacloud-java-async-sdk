// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link PublishApplicationVersionInput} extends {@link TeaModel}
 *
 * <p>PublishApplicationVersionInput</p>
 */
public class PublishApplicationVersionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    private PublishApplicationVersionInput(Builder builder) {
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishApplicationVersionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder {
        private String description; 

        private Builder() {
        } 

        private Builder(PublishApplicationVersionInput model) {
            this.description = model.description;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public PublishApplicationVersionInput build() {
            return new PublishApplicationVersionInput(this);
        } 

    } 

}
