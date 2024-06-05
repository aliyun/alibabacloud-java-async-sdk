// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUserGatewayByIdResponseBody} extends {@link TeaModel}
 *
 * <p>FindUserGatewayByIdResponseBody</p>
 */
public class FindUserGatewayByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("Gateway")
    private Gateway gateway;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindUserGatewayByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMsg = builder.errorMsg;
        this.gateway = builder.gateway;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserGatewayByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return gateway
     */
    public Gateway getGateway() {
        return this.gateway;
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
        private String errorMsg; 
        private Gateway gateway; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Gateway.
         */
        public Builder gateway(Gateway gateway) {
            this.gateway = gateway;
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

        public FindUserGatewayByIdResponseBody build() {
            return new FindUserGatewayByIdResponseBody(this);
        } 

    } 

    public static class Gateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("DgVersion")
        private String dgVersion;

        @com.aliyun.core.annotation.NameInMap("ExceptionMsg")
        private String exceptionMsg;

        @com.aliyun.core.annotation.NameInMap("GatewayDesc")
        private String gatewayDesc;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("NumOfExceptionInstance")
        private Integer numOfExceptionInstance;

        @com.aliyun.core.annotation.NameInMap("NumOfRunningInstance")
        private Integer numOfRunningInstance;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Gateway(Builder builder) {
            this.creatorId = builder.creatorId;
            this.dgVersion = builder.dgVersion;
            this.exceptionMsg = builder.exceptionMsg;
            this.gatewayDesc = builder.gatewayDesc;
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.numOfExceptionInstance = builder.numOfExceptionInstance;
            this.numOfRunningInstance = builder.numOfRunningInstance;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateway create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return dgVersion
         */
        public String getDgVersion() {
            return this.dgVersion;
        }

        /**
         * @return exceptionMsg
         */
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        /**
         * @return gatewayDesc
         */
        public String getGatewayDesc() {
            return this.gatewayDesc;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return numOfExceptionInstance
         */
        public Integer getNumOfExceptionInstance() {
            return this.numOfExceptionInstance;
        }

        /**
         * @return numOfRunningInstance
         */
        public Integer getNumOfRunningInstance() {
            return this.numOfRunningInstance;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String creatorId; 
            private String dgVersion; 
            private String exceptionMsg; 
            private String gatewayDesc; 
            private String gatewayId; 
            private String gatewayName; 
            private Integer numOfExceptionInstance; 
            private Integer numOfRunningInstance; 
            private String regionId; 
            private String status; 
            private String userId; 

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * DgVersion.
             */
            public Builder dgVersion(String dgVersion) {
                this.dgVersion = dgVersion;
                return this;
            }

            /**
             * ExceptionMsg.
             */
            public Builder exceptionMsg(String exceptionMsg) {
                this.exceptionMsg = exceptionMsg;
                return this;
            }

            /**
             * 网关的描述
             */
            public Builder gatewayDesc(String gatewayDesc) {
                this.gatewayDesc = gatewayDesc;
                return this;
            }

            /**
             * 网关的编号
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * 网关的名称
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * NumOfExceptionInstance.
             */
            public Builder numOfExceptionInstance(Integer numOfExceptionInstance) {
                this.numOfExceptionInstance = numOfExceptionInstance;
                return this;
            }

            /**
             * NumOfRunningInstance.
             */
            public Builder numOfRunningInstance(Integer numOfRunningInstance) {
                this.numOfRunningInstance = numOfRunningInstance;
                return this;
            }

            /**
             * 地域的编号
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 网关的状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 用户的编号
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Gateway build() {
                return new Gateway(this);
            } 

        } 

    }
}
