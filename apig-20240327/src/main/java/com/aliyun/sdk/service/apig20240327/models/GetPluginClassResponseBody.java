// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetPluginClassResponseBody} extends {@link TeaModel}
 *
 * <p>GetPluginClassResponseBody</p>
 */
public class GetPluginClassResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPluginClassResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginClassResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPluginClassResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPluginClassResponseBody build() {
            return new GetPluginClassResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPluginClassResponseBody} extends {@link TeaModel}
     *
     * <p>GetPluginClassResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("publishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("wasmLanguage")
        private String wasmLanguage;

        private Data(Builder builder) {
            this.alias = builder.alias;
            this.description = builder.description;
            this.document = builder.document;
            this.name = builder.name;
            this.publishStatus = builder.publishStatus;
            this.type = builder.type;
            this.wasmLanguage = builder.wasmLanguage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return wasmLanguage
         */
        public String getWasmLanguage() {
            return this.wasmLanguage;
        }

        public static final class Builder {
            private String alias; 
            private String description; 
            private String document; 
            private String name; 
            private String publishStatus; 
            private String type; 
            private String wasmLanguage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alias = model.alias;
                this.description = model.description;
                this.document = model.document;
                this.name = model.name;
                this.publishStatus = model.publishStatus;
                this.type = model.type;
                this.wasmLanguage = model.wasmLanguage;
            } 

            /**
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * document.
             */
            public Builder document(String document) {
                this.document = document;
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
             * publishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * wasmLanguage.
             */
            public Builder wasmLanguage(String wasmLanguage) {
                this.wasmLanguage = wasmLanguage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
