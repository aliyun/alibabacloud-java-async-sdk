// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewaySlbResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewaySlbResponseBody</p>
 */
public class ListGatewaySlbResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListGatewaySlbResponseBody(Builder builder) {
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

    public static ListGatewaySlbResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Integer code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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
         * Id of the request
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

        public ListGatewaySlbResponseBody build() {
            return new ListGatewaySlbResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EditEnable")
        private Boolean editEnable;

        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("GatewaySlbMode")
        private String gatewaySlbMode;

        @NameInMap("GatewaySlbStatus")
        private String gatewaySlbStatus;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("HttpPort")
        private Integer httpPort;

        @NameInMap("HttpsPort")
        private Integer httpsPort;

        @NameInMap("HttpsVServerGroupId")
        private String httpsVServerGroupId;

        @NameInMap("Id")
        private String id;

        @NameInMap("ServiceWeight")
        private Integer serviceWeight;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SlbPort")
        private String slbPort;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("Type")
        private String type;

        @NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Data(Builder builder) {
            this.editEnable = builder.editEnable;
            this.gatewayId = builder.gatewayId;
            this.gatewaySlbMode = builder.gatewaySlbMode;
            this.gatewaySlbStatus = builder.gatewaySlbStatus;
            this.gmtCreate = builder.gmtCreate;
            this.httpPort = builder.httpPort;
            this.httpsPort = builder.httpsPort;
            this.httpsVServerGroupId = builder.httpsVServerGroupId;
            this.id = builder.id;
            this.serviceWeight = builder.serviceWeight;
            this.slbId = builder.slbId;
            this.slbIp = builder.slbIp;
            this.slbPort = builder.slbPort;
            this.statusDesc = builder.statusDesc;
            this.type = builder.type;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return editEnable
         */
        public Boolean getEditEnable() {
            return this.editEnable;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewaySlbMode
         */
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        /**
         * @return gatewaySlbStatus
         */
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return httpPort
         */
        public Integer getHttpPort() {
            return this.httpPort;
        }

        /**
         * @return httpsPort
         */
        public Integer getHttpsPort() {
            return this.httpsPort;
        }

        /**
         * @return httpsVServerGroupId
         */
        public String getHttpsVServerGroupId() {
            return this.httpsVServerGroupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return serviceWeight
         */
        public Integer getServiceWeight() {
            return this.serviceWeight;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return slbPort
         */
        public String getSlbPort() {
            return this.slbPort;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private Boolean editEnable; 
            private String gatewayId; 
            private String gatewaySlbMode; 
            private String gatewaySlbStatus; 
            private String gmtCreate; 
            private Integer httpPort; 
            private Integer httpsPort; 
            private String httpsVServerGroupId; 
            private String id; 
            private Integer serviceWeight; 
            private String slbId; 
            private String slbIp; 
            private String slbPort; 
            private String statusDesc; 
            private String type; 
            private String vServerGroupId; 

            /**
             * EditEnable.
             */
            public Builder editEnable(Boolean editEnable) {
                this.editEnable = editEnable;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewaySlbMode.
             */
            public Builder gatewaySlbMode(String gatewaySlbMode) {
                this.gatewaySlbMode = gatewaySlbMode;
                return this;
            }

            /**
             * GatewaySlbStatus.
             */
            public Builder gatewaySlbStatus(String gatewaySlbStatus) {
                this.gatewaySlbStatus = gatewaySlbStatus;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * HttpPort.
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * HttpsPort.
             */
            public Builder httpsPort(Integer httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * HttpsVServerGroupId.
             */
            public Builder httpsVServerGroupId(String httpsVServerGroupId) {
                this.httpsVServerGroupId = httpsVServerGroupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ServiceWeight.
             */
            public Builder serviceWeight(Integer serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            /**
             * SlbId.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * SlbIp.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * SlbPort.
             */
            public Builder slbPort(String slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
