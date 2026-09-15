// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link EnableConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>EnableConnectorResponseBody</p>
 */
public class EnableConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private EnableConnectorResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableConnectorResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnableConnectorResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The Connector details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnableConnectorResponseBody build() {
            return new EnableConnectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnableConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>EnableConnectorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundAgentCount")
        private Long boundAgentCount;

        @com.aliyun.core.annotation.NameInMap("enabledAt")
        private String enabledAt;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.boundAgentCount = builder.boundAgentCount;
            this.enabledAt = builder.enabledAt;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return boundAgentCount
         */
        public Long getBoundAgentCount() {
            return this.boundAgentCount;
        }

        /**
         * @return enabledAt
         */
        public String getEnabledAt() {
            return this.enabledAt;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long boundAgentCount; 
            private String enabledAt; 
            private String metadata; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.boundAgentCount = model.boundAgentCount;
                this.enabledAt = model.enabledAt;
                this.metadata = model.metadata;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>The number of agents attached to the Connector.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder boundAgentCount(Long boundAgentCount) {
                this.boundAgentCount = boundAgentCount;
                return this;
            }

            /**
             * <p>The time when the Connector was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01T08:00:00Z</p>
             */
            public Builder enabledAt(String enabledAt) {
                this.enabledAt = enabledAt;
                return this;
            }

            /**
             * <p>A JSON string. For qodercli: {&quot;site&quot;:&quot;global|cn&quot;,&quot;organizationId&quot;:&quot;...&quot;,&quot;apiKey&quot;:&quot;...&quot;,&quot;serviceAccountKeys&quot;:[{&quot;id&quot;:&quot;ckey-xxx&quot;,&quot;name&quot;:&quot;default&quot;,&quot;serviceAccountKey&quot;:&quot;...&quot;}]}. This field is empty when the Connector is not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The Connector name.</p>
             * 
             * <strong>example:</strong>
             * <p>qodercli</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Connector status.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
