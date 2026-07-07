// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ActivateEdgeMobileAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ActivateEdgeMobileAgentResponseBody</p>
 */
public class ActivateEdgeMobileAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ActivateEdgeMobileAgentResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateEdgeMobileAgentResponseBody create() {
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

        private Builder(ActivateEdgeMobileAgentResponseBody model) {
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

        public ActivateEdgeMobileAgentResponseBody build() {
            return new ActivateEdgeMobileAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ActivateEdgeMobileAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ActivateEdgeMobileAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Idempotent")
        private Boolean idempotent;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private Data(Builder builder) {
            this.authToken = builder.authToken;
            this.deviceId = builder.deviceId;
            this.idempotent = builder.idempotent;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return idempotent
         */
        public Boolean getIdempotent() {
            return this.idempotent;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String authToken; 
            private String deviceId; 
            private Boolean idempotent; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authToken = model.authToken;
                this.deviceId = model.deviceId;
                this.idempotent = model.idempotent;
                this.instanceId = model.instanceId;
            } 

            /**
             * AuthToken.
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Idempotent.
             */
            public Builder idempotent(Boolean idempotent) {
                this.idempotent = idempotent;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
