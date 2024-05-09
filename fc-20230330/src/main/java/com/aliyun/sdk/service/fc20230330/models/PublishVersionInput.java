// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishVersionInput} extends {@link TeaModel}
 *
 * <p>PublishVersionInput</p>
 */
public class PublishVersionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    private PublishVersionInput(Builder builder) {
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishVersionInput create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder {
        private String description; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public PublishVersionInput build() {
            return new PublishVersionInput(this);
        } 

    } 

}
