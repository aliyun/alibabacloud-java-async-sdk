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
 * {@link CreateModelInput} extends {@link TeaModel}
 *
 * <p>CreateModelInput</p>
 */
public class CreateModelInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("models")
    private java.util.List<String> models;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateModelInput(Builder builder) {
        this.address = builder.address;
        this.apiKey = builder.apiKey;
        this.desc = builder.desc;
        this.models = builder.models;
        this.name = builder.name;
        this.provider = builder.provider;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return models
     */
    public java.util.List<String> getModels() {
        return this.models;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String address; 
        private String apiKey; 
        private String desc; 
        private java.util.List<String> models; 
        private String name; 
        private String provider; 
        private String type; 

        private Builder() {
        } 

        private Builder(CreateModelInput model) {
            this.address = model.address;
            this.apiKey = model.apiKey;
            this.desc = model.desc;
            this.models = model.models;
            this.name = model.name;
            this.provider = model.provider;
            this.type = model.type;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * models.
         */
        public Builder models(java.util.List<String> models) {
            this.models = models;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateModelInput build() {
            return new CreateModelInput(this);
        } 

    } 

}
