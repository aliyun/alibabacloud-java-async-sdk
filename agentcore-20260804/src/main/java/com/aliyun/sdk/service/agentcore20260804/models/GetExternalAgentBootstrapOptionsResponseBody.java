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
 * {@link GetExternalAgentBootstrapOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetExternalAgentBootstrapOptionsResponseBody</p>
 */
public class GetExternalAgentBootstrapOptionsResponseBody extends TeaModel {
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

    private GetExternalAgentBootstrapOptionsResponseBody(Builder builder) {
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

    public static GetExternalAgentBootstrapOptionsResponseBody create() {
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

        private Builder(GetExternalAgentBootstrapOptionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. The value SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The available network access information for the external agent.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The result message of the request.</p>
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
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetExternalAgentBootstrapOptionsResponseBody build() {
            return new GetExternalAgentBootstrapOptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExternalAgentBootstrapOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentBootstrapOptionsResponseBody</p>
     */
    public static class NetworkOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        private NetworkOptions(Builder builder) {
            this.available = builder.available;
            this.networkType = builder.networkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkOptions create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        public static final class Builder {
            private Boolean available; 
            private String networkType; 

            private Builder() {
            } 

            private Builder(NetworkOptions model) {
                this.available = model.available;
                this.networkType = model.networkType;
            } 

            /**
             * <p>Indicates whether the network access type is available.</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li>INTRANET: internal network.</li>
             * <li>INTERNET: public network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            public NetworkOptions build() {
                return new NetworkOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExternalAgentBootstrapOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentBootstrapOptionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("networkOptions")
        private java.util.List<NetworkOptions> networkOptions;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.networkOptions = builder.networkOptions;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return networkOptions
         */
        public java.util.List<NetworkOptions> getNetworkOptions() {
            return this.networkOptions;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private java.util.List<NetworkOptions> networkOptions; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.networkOptions = model.networkOptions;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The external agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The list of available network access options.</p>
             */
            public Builder networkOptions(java.util.List<NetworkOptions> networkOptions) {
                this.networkOptions = networkOptions;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
