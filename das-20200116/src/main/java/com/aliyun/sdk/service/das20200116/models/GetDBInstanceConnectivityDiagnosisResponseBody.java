// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetDBInstanceConnectivityDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBInstanceConnectivityDiagnosisResponseBody</p>
 */
public class GetDBInstanceConnectivityDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetDBInstanceConnectivityDiagnosisResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request was successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDBInstanceConnectivityDiagnosisResponseBody build() {
            return new GetDBInstanceConnectivityDiagnosisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDBInstanceConnectivityDiagnosisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBInstanceConnectivityDiagnosisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connCheckErrorCode")
        private String connCheckErrorCode;

        @com.aliyun.core.annotation.NameInMap("connCheckErrorMessage")
        private String connCheckErrorMessage;

        @com.aliyun.core.annotation.NameInMap("failType")
        private String failType;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("success")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.connCheckErrorCode = model.connCheckErrorCode;
                this.connCheckErrorMessage = model.connCheckErrorMessage;
                this.failType = model.failType;
                this.instanceId = model.instanceId;
                this.success = model.success;
            } 

            /**
             * <p>The exception detection items:</p>
             * <ul>
             * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist of the user.</li>
             * <li><strong>VIP_NOT_EXISTS</strong>: The Application Load Balancer (ALB) instance corresponding to the virtual IP address (VIP) does not exist.</li>
             * <li><strong>RS_NOT_EXISTS</strong>: The resource sharing (RS) is not properly mounted.</li>
             * <li><strong>VIP_TUNNEL_ID_NOT_CONSISTENT</strong>: The tunnel ID used by the VIP of the virtual private cloud (VPC) type is different from the tunnel ID of the VPC.</li>
             * <li><strong>VIP_VPC_CLOUD_INSTANCE_NOT_EXISTS</strong>: The VIP of the VPC type does not exist.</li>
             * <li><strong>VIP_IS_NOT_NGLB</strong>: The NGLB mode is disabled for the VIP.</li>
             * <li><strong>CUSTINS_NOT_ASSOCIATE_ECS_SECURITY_GROUP</strong>: No security group is associated with the instance.</li>
             * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist of the user.</li>
             * <li><strong>SRC_IP_NOT_IN_ADMIN_WHITELIST</strong>: The source IP address is not added to the whitelist of the instance.</li>
             * <li><strong>SRC_IP_NOT_IN_ECS_SECURITY_GROUP</strong>: The source IP address is not added to the security group that is associated with the instance.</li>
             * <li><strong>VPC_INSTANCE_IP_NOT_WORKING_STATUS</strong>: The IP address in the VPC is in an abnormal state.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SRC_IP_NOT_IN_USER_WHITELIST</p>
             */
            public Builder connCheckErrorCode(String connCheckErrorCode) {
                this.connCheckErrorCode = connCheckErrorCode;
                return this;
            }

            /**
             * <p>The details of the exception detection.</p>
             * 
             * <strong>example:</strong>
             * <p>Src ip:47.110.180.62 not in user whitelist</p>
             */
            public Builder connCheckErrorMessage(String connCheckErrorMessage) {
                this.connCheckErrorMessage = connCheckErrorMessage;
                return this;
            }

            /**
             * <p>The type of the exception:</p>
             * <ul>
             * <li><strong>0</strong>: an exception that can be handled by the user.</li>
             * <li><strong>1</strong>: an exception that can be handled by a technical engineer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failType(String failType) {
                this.failType = failType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the connectivity test was passed:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
