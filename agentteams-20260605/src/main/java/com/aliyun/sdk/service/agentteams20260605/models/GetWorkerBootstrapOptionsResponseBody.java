// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetWorkerBootstrapOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkerBootstrapOptionsResponseBody</p>
 */
public class GetWorkerBootstrapOptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkerBootstrapOptionsResponseBody(Builder builder) {
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

    public static GetWorkerBootstrapOptionsResponseBody create() {
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

        private Builder(GetWorkerBootstrapOptionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkerBootstrapOptionsResponseBody build() {
            return new GetWorkerBootstrapOptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkerBootstrapOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerBootstrapOptionsResponseBody</p>
     */
    public static class NetworkOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
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
             * Available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * NetworkType.
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
     * {@link GetWorkerBootstrapOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerBootstrapOptionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkOptions")
        private java.util.List<NetworkOptions> networkOptions;

        private Data(Builder builder) {
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.networkOptions = builder.networkOptions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkOptions
         */
        public java.util.List<NetworkOptions> getNetworkOptions() {
            return this.networkOptions;
        }

        public static final class Builder {
            private String instanceId; 
            private String name; 
            private java.util.List<NetworkOptions> networkOptions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.networkOptions = model.networkOptions;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * NetworkOptions.
             */
            public Builder networkOptions(java.util.List<NetworkOptions> networkOptions) {
                this.networkOptions = networkOptions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
