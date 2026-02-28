// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeInstanceGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceGatewayResponseBody</p>
 */
public class QueryEdgeInstanceGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GatewayList")
    private java.util.List<GatewayList> gatewayList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEdgeInstanceGatewayResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.gatewayList = builder.gatewayList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeInstanceGatewayResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return gatewayList
     */
    public java.util.List<GatewayList> getGatewayList() {
        return this.gatewayList;
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
        private String errorMessage; 
        private java.util.List<GatewayList> gatewayList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryEdgeInstanceGatewayResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.gatewayList = model.gatewayList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message that is returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The data that is returned if the call was successful.</p>
         */
        public Builder gatewayList(java.util.List<GatewayList> gatewayList) {
            this.gatewayList = gatewayList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>28D159F4-980F-423D-95F0-F705E9DFC016</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeInstanceGatewayResponseBody build() {
            return new QueryEdgeInstanceGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeInstanceGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceGatewayResponseBody</p>
     */
    public static class GatewayList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("EdgeVersion")
        private String edgeVersion;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        private GatewayList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.edgeVersion = builder.edgeVersion;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return edgeVersion
         */
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private String edgeVersion; 
            private String iotId; 
            private String productKey; 

            private Builder() {
            } 

            private Builder(GatewayList model) {
                this.deviceName = model.deviceName;
                this.edgeVersion = model.edgeVersion;
                this.iotId = model.iotId;
                this.productKey = model.productKey;
            } 

            /**
             * <p>The name of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gateway_01</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The version number of Link IoT Edge.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.0</p>
             */
            public Builder edgeVersion(String edgeVersion) {
                this.edgeVersion = edgeVersion;
                return this;
            }

            /**
             * <p>The ID of the gateway in IoT Platform.</p>
             * 
             * <strong>example:</strong>
             * <p>LuD9x5hiRUdVemWU****000101</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The key that uniquely identifies the product to which the gateway belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1mAdeG****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public GatewayList build() {
                return new GatewayList(this);
            } 

        } 

    }
}
