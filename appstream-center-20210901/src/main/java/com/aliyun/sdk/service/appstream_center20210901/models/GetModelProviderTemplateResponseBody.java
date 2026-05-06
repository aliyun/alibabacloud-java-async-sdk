// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetModelProviderTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelProviderTemplateResponseBody</p>
 */
public class GetModelProviderTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetModelProviderTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelProviderTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetModelProviderTemplateResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetModelProviderTemplateResponseBody build() {
            return new GetModelProviderTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelProviderTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelProviderTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableWuyingProxy")
        private Boolean enableWuyingProxy;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
        private String providerTemplateId;

        private Data(Builder builder) {
            this.config = builder.config;
            this.description = builder.description;
            this.enableWuyingProxy = builder.enableWuyingProxy;
            this.name = builder.name;
            this.providerName = builder.providerName;
            this.providerTemplateId = builder.providerTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableWuyingProxy
         */
        public Boolean getEnableWuyingProxy() {
            return this.enableWuyingProxy;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return providerTemplateId
         */
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

        public static final class Builder {
            private String config; 
            private String description; 
            private Boolean enableWuyingProxy; 
            private String name; 
            private String providerName; 
            private String providerTemplateId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.description = model.description;
                this.enableWuyingProxy = model.enableWuyingProxy;
                this.name = model.name;
                this.providerName = model.providerName;
                this.providerTemplateId = model.providerTemplateId;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableWuyingProxy.
             */
            public Builder enableWuyingProxy(Boolean enableWuyingProxy) {
                this.enableWuyingProxy = enableWuyingProxy;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * ProviderTemplateId.
             */
            public Builder providerTemplateId(String providerTemplateId) {
                this.providerTemplateId = providerTemplateId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
