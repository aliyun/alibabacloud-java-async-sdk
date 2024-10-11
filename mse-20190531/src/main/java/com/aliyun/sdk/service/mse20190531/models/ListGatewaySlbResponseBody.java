// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewaySlbResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewaySlbResponseBody</p>
 */
public class ListGatewaySlbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data entries returned.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EAB345F4-3AC3-560C-B653-65717703****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGatewaySlbResponseBody build() {
            return new ListGatewaySlbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewaySlbResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaySlbResponseBody</p>
     */
    public static class VServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupName")
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
    /**
     * 
     * {@link ListGatewaySlbResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaySlbResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EditEnable")
        private Boolean editEnable;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewaySlbMode")
        private String gatewaySlbMode;

        @com.aliyun.core.annotation.NameInMap("GatewaySlbStatus")
        private String gatewaySlbStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private Integer httpPort;

        @com.aliyun.core.annotation.NameInMap("HttpsPort")
        private Integer httpsPort;

        @com.aliyun.core.annotation.NameInMap("HttpsVServerGroupId")
        private String httpsVServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ServiceWeight")
        private Integer serviceWeight;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbIp")
        private String slbIp;

        @com.aliyun.core.annotation.NameInMap("SlbPort")
        private String slbPort;

        @com.aliyun.core.annotation.NameInMap("SlbType")
        private String slbType;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        @com.aliyun.core.annotation.NameInMap("VServiceList")
        private java.util.List < VServiceList> vServiceList;

        @com.aliyun.core.annotation.NameInMap("VsMetaInfo")
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
            this.slbType = builder.slbType;
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
         * @return slbType
         */
        public String getSlbType() {
            return this.slbType;
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
            private String slbType; 
            private String statusDesc; 
            private String type; 
            private String vServerGroupId; 
            private java.util.List < VServiceList> vServiceList; 
            private String vsMetaInfo; 

            /**
             * <p>Indicates whether the edit operation is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder editEnable(Boolean editEnable) {
                this.editEnable = editEnable;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The mode of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>UserSelect</p>
             */
            public Builder gatewaySlbMode(String gatewaySlbMode) {
                this.gatewaySlbMode = gatewaySlbMode;
                return this;
            }

            /**
             * <p>The association status.</p>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder gatewaySlbStatus(String gatewaySlbStatus) {
                this.gatewaySlbStatus = gatewaySlbStatus;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-14 14:39:16</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The port number of the HTTP virtual service group.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * <p>The port number of the HTTPS virtual service group.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder httpsPort(Integer httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * <p>The ID of the HTTPS virtual service group.</p>
             * 
             * <strong>example:</strong>
             * <p>353</p>
             */
            public Builder httpsVServerGroupId(String httpsVServerGroupId) {
                this.httpsVServerGroupId = httpsVServerGroupId;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ID</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The service weight.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder serviceWeight(Integer serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            /**
             * <p>The ID of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1kmnli3hdpreptw2ah3</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The IP address of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>121.199.XX.XX</p>
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * <p>The port number of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80,443</p>
             */
            public Builder slbPort(String slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * SlbType.
             */
            public Builder slbType(String slbType) {
                this.slbType = slbType;
                return this;
            }

            /**
             * <p>The description of the status.</p>
             * 
             * <strong>example:</strong>
             * <p>Associating</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>PUB_NET</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the HTTP virtual service group.</p>
             * 
             * <strong>example:</strong>
             * <p>353</p>
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
