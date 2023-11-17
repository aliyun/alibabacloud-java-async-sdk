// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBInstanceConnectivityDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBInstanceConnectivityDiagnosisResponseBody</p>
 */
public class GetDBInstanceConnectivityDiagnosisResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetDBInstanceConnectivityDiagnosisResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBInstanceConnectivityDiagnosisResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * > If the request was successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDBInstanceConnectivityDiagnosisResponseBody build() {
            return new GetDBInstanceConnectivityDiagnosisResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("connCheckErrorCode")
        private String connCheckErrorCode;

        @NameInMap("connCheckErrorMessage")
        private String connCheckErrorMessage;

        @NameInMap("failType")
        private String failType;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("success")
        private Boolean success;

        private Data(Builder builder) {
            this.connCheckErrorCode = builder.connCheckErrorCode;
            this.connCheckErrorMessage = builder.connCheckErrorMessage;
            this.failType = builder.failType;
            this.instanceId = builder.instanceId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connCheckErrorCode
         */
        public String getConnCheckErrorCode() {
            return this.connCheckErrorCode;
        }

        /**
         * @return connCheckErrorMessage
         */
        public String getConnCheckErrorMessage() {
            return this.connCheckErrorMessage;
        }

        /**
         * @return failType
         */
        public String getFailType() {
            return this.failType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String connCheckErrorCode; 
            private String connCheckErrorMessage; 
            private String failType; 
            private String instanceId; 
            private Boolean success; 

            /**
             * The exception detection items:
             * <p>
             * 
             * *   **SRC_IP_NOT_IN_USER_WHITELIST**: The source IP address is not added to the whitelist of the user.
             * *   **VIP_NOT_EXISTS**: The Application Load Balancer (ALB) instance corresponding to the virtual IP address (VIP) does not exist.
             * *   **RS_NOT_EXISTS**: The resource sharing (RS) is not properly mounted.
             * *   **VIP_TUNNEL_ID_NOT_CONSISTENT**: The tunnel ID used by the VIP of the virtual private cloud (VPC) type is different from the tunnel ID of the VPC.
             * *   **VIP_VPC_CLOUD_INSTANCE_NOT_EXISTS**: The VIP of the VPC type does not exist.
             * *   **VIP_IS_NOT_NGLB**: The NGLB mode is disabled for the VIP.
             * *   **CUSTINS_NOT_ASSOCIATE_ECS_SECURITY_GROUP**: No security group is associated with the instance.
             * *   **SRC_IP_NOT_IN_USER_WHITELIST**: The source IP address is not added to the whitelist of the user.
             * *   **SRC_IP_NOT_IN_ADMIN_WHITELIST**: The source IP address is not added to the whitelist of the instance.
             * *   **SRC_IP_NOT_IN_ECS_SECURITY_GROUP**: The source IP address is not added to the security group that is associated with the instance.
             * *   **VPC_INSTANCE_IP_NOT_WORKING_STATUS**: The IP address in the VPC is in an abnormal state.
             */
            public Builder connCheckErrorCode(String connCheckErrorCode) {
                this.connCheckErrorCode = connCheckErrorCode;
                return this;
            }

            /**
             * The details of the exception detection.
             */
            public Builder connCheckErrorMessage(String connCheckErrorMessage) {
                this.connCheckErrorMessage = connCheckErrorMessage;
                return this;
            }

            /**
             * The type of the exception:
             * <p>
             * 
             * *   **0**: an exception that can be handled by the user.
             * *   **1**: an exception that can be handled by a technical engineer.
             */
            public Builder failType(String failType) {
                this.failType = failType;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the connectivity test was passed:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
