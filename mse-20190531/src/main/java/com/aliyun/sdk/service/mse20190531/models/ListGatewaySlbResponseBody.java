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
         * The status code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data entries returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGatewaySlbResponseBody build() {
            return new ListGatewaySlbResponseBody(this);
        } 

    } 

    public static class VServiceList extends TeaModel {
        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("VServerGroupId")
        private String vServerGroupId;

        @NameInMap("VServerGroupName")
        private String vServerGroupName;

        private VServiceList(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.vServerGroupId = builder.vServerGroupId;
            this.vServerGroupName = builder.vServerGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServiceList create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        /**
         * @return vServerGroupName
         */
        public String getVServerGroupName() {
            return this.vServerGroupName;
        }

        public static final class Builder {
            private String port; 
            private String protocol; 
            private String vServerGroupId; 
            private String vServerGroupName; 

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * VServerGroupName.
             */
            public Builder vServerGroupName(String vServerGroupName) {
                this.vServerGroupName = vServerGroupName;
                return this;
            }

            public VServiceList build() {
                return new VServiceList(this);
            } 

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

        @NameInMap("VServiceList")
        private java.util.List < VServiceList> vServiceList;

        @NameInMap("VsMetaInfo")
        private String vsMetaInfo;

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
            this.vServiceList = builder.vServiceList;
            this.vsMetaInfo = builder.vsMetaInfo;
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

        /**
         * @return vServiceList
         */
        public java.util.List < VServiceList> getVServiceList() {
            return this.vServiceList;
        }

        /**
         * @return vsMetaInfo
         */
        public String getVsMetaInfo() {
            return this.vsMetaInfo;
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
            private java.util.List < VServiceList> vServiceList; 
            private String vsMetaInfo; 

            /**
             * Indicates whether the edit operation is supported.
             */
            public Builder editEnable(Boolean editEnable) {
                this.editEnable = editEnable;
                return this;
            }

            /**
             * The ID of the gateway.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * The mode of the SLB instance.
             */
            public Builder gatewaySlbMode(String gatewaySlbMode) {
                this.gatewaySlbMode = gatewaySlbMode;
                return this;
            }

            /**
             * The association status.
             */
            public Builder gatewaySlbStatus(String gatewaySlbStatus) {
                this.gatewaySlbStatus = gatewaySlbStatus;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The port number of the HTTP virtual service group.
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * The port number of the HTTPS virtual service group.
             */
            public Builder httpsPort(Integer httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * The ID of the HTTPS virtual service group.
             */
            public Builder httpsVServerGroupId(String httpsVServerGroupId) {
                this.httpsVServerGroupId = httpsVServerGroupId;
                return this;
            }

            /**
             * The ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The service weight.
             */
            public Builder serviceWeight(Integer serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            /**
             * The ID of the SLB instance.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * The IP address of the SLB instance.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * The port number of the SLB instance.
             */
            public Builder slbPort(String slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * The description of the status.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the HTTP virtual service group.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * VServiceList.
             */
            public Builder vServiceList(java.util.List < VServiceList> vServiceList) {
                this.vServiceList = vServiceList;
                return this;
            }

            /**
             * VsMetaInfo.
             */
            public Builder vsMetaInfo(String vsMetaInfo) {
                this.vsMetaInfo = vsMetaInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
