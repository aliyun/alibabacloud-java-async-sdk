// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link PublishRuntimeVersionInput} extends {@link TeaModel}
 *
 * <p>PublishRuntimeVersionInput</p>
 */
public class PublishRuntimeVersionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("publisher")
    private String publisher;

    private PublishRuntimeVersionInput(Builder builder) {
        this.description = builder.description;
        this.publisher = builder.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRuntimeVersionInput create() {
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

    /**
     * @return publisher
     */
    public String getPublisher() {
        return this.publisher;
    }

    public static final class Builder {
        private String description; 
        private String publisher; 

        private Builder() {
        } 

        private Builder(PublishRuntimeVersionInput model) {
            this.description = model.description;
            this.publisher = model.publisher;
        } 

        /**
         * <p>此版本的描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>发布此版本的用户或系统标识</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public PublishRuntimeVersionInput build() {
            return new PublishRuntimeVersionInput(this);
        } 

    } 

}
