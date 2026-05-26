// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConfigResponseBody</p>
 */
public class CreateConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private CreateConfigResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.key = builder.key;
        this.updatedAt = builder.updatedAt;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String createdAt; 
        private String key; 
        private String updatedAt; 
        private String value; 

        private Builder() {
        } 

        private Builder(CreateConfigResponseBody model) {
            this.createdAt = model.createdAt;
            this.key = model.key;
            this.updatedAt = model.updatedAt;
            this.value = model.value;
        } 

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * UpdatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public CreateConfigResponseBody build() {
            return new CreateConfigResponseBody(this);
        } 

    } 

}
