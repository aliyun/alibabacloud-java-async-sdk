// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link AddSmartAccessGatewayDnsForwardResponseBody} extends {@link TeaModel}
 *
 * <p>AddSmartAccessGatewayDnsForwardResponseBody</p>
 */
public class AddSmartAccessGatewayDnsForwardResponseBody extends TeaModel {
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

    private AddSmartAccessGatewayDnsForwardResponseBody(Builder builder) {
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

    public static AddSmartAccessGatewayDnsForwardResponseBody create() {
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

        private Builder(AddSmartAccessGatewayDnsForwardResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information returned for the request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E93884AC-6C21-4FEA-8E3A-7377D33B194F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddSmartAccessGatewayDnsForwardResponseBody build() {
            return new AddSmartAccessGatewayDnsForwardResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddSmartAccessGatewayDnsForwardResponseBody} extends {@link TeaModel}
     *
     * <p>AddSmartAccessGatewayDnsForwardResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MasterIp")
        private String masterIp;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("OutboundPortIndex")
        private Integer outboundPortIndex;

        @com.aliyun.core.annotation.NameInMap("OutboundPortName")
        private String outboundPortName;

        @com.aliyun.core.annotation.NameInMap("OutboundPortType")
        private String outboundPortType;

        @com.aliyun.core.annotation.NameInMap("SlaveIp")
        private String slaveIp;

        private Data(Builder builder) {
            this.domain = builder.domain;
            this.instanceId = builder.instanceId;
            this.masterIp = builder.masterIp;
            this.mode = builder.mode;
            this.outboundPortIndex = builder.outboundPortIndex;
            this.outboundPortName = builder.outboundPortName;
            this.outboundPortType = builder.outboundPortType;
            this.slaveIp = builder.slaveIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return masterIp
         */
        public String getMasterIp() {
            return this.masterIp;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return outboundPortIndex
         */
        public Integer getOutboundPortIndex() {
            return this.outboundPortIndex;
        }

        /**
         * @return outboundPortName
         */
        public String getOutboundPortName() {
            return this.outboundPortName;
        }

        /**
         * @return outboundPortType
         */
        public String getOutboundPortType() {
            return this.outboundPortType;
        }

        /**
         * @return slaveIp
         */
        public String getSlaveIp() {
            return this.slaveIp;
        }

        public static final class Builder {
            private String domain; 
            private String instanceId; 
            private String masterIp; 
            private String mode; 
            private Integer outboundPortIndex; 
            private String outboundPortName; 
            private String outboundPortType; 
            private String slaveIp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.domain = model.domain;
                this.instanceId = model.instanceId;
                this.masterIp = model.masterIp;
                this.mode = model.mode;
                this.outboundPortIndex = model.outboundPortIndex;
                this.outboundPortName = model.outboundPortName;
                this.outboundPortType = model.outboundPortType;
                this.slaveIp = model.slaveIp;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>yfiy.cn</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sagv3dnsforward-nc7qabskj17werc7su</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The primary DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>14.104.81.13</p>
             */
            public Builder masterIp(String masterIp) {
                this.masterIp = masterIp;
                return this;
            }

            /**
             * <p>The forwarding mode.</p>
             * 
             * <strong>example:</strong>
             * <p>first</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The number of the egress port.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder outboundPortIndex(Integer outboundPortIndex) {
                this.outboundPortIndex = outboundPortIndex;
                return this;
            }

            /**
             * <p>The egress port.</p>
             * 
             * <strong>example:</strong>
             * <p>eth0</p>
             */
            public Builder outboundPortName(String outboundPortName) {
                this.outboundPortName = outboundPortName;
                return this;
            }

            /**
             * <p>The type of the egress port.</p>
             * 
             * <strong>example:</strong>
             * <p>PhysicalPort</p>
             */
            public Builder outboundPortType(String outboundPortType) {
                this.outboundPortType = outboundPortType;
                return this;
            }

            /**
             * <p>The secondary DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.14</p>
             */
            public Builder slaveIp(String slaveIp) {
                this.slaveIp = slaveIp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
