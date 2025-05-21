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
 * {@link CreatePluginAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePluginAttachmentResponseBody</p>
 */
public class CreatePluginAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePluginAttachmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginAttachmentResponseBody create() {
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

        private Builder(CreatePluginAttachmentResponseBody model) {
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
         * 
         * <strong>example:</strong>
         * <p>EBCB8485-24F9-54CD-B258-CB15FDB27677</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePluginAttachmentResponseBody build() {
            return new CreatePluginAttachmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePluginAttachmentResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePluginAttachmentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pluginAttachmentId")
        private String pluginAttachmentId;

        private Data(Builder builder) {
            this.pluginAttachmentId = builder.pluginAttachmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pluginAttachmentId
         */
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

        public static final class Builder {
            private String pluginAttachmentId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pluginAttachmentId = model.pluginAttachmentId;
            } 

            /**
             * pluginAttachmentId.
             */
            public Builder pluginAttachmentId(String pluginAttachmentId) {
                this.pluginAttachmentId = pluginAttachmentId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
