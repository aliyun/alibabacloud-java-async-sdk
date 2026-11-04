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
 * {@link AddSmartAccessGatewayDnsForwardRequest} extends {@link RequestModel}
 *
 * <p>AddSmartAccessGatewayDnsForwardRequest</p>
 */
public class AddSmartAccessGatewayDnsForwardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String masterIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundPortIndex")
    private String outboundPortIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundPortName")
    private String outboundPortName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundPortType")
    private String outboundPortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagInsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveIp")
    private String slaveIp;

    private AddSmartAccessGatewayDnsForwardRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.masterIp = builder.masterIp;
        this.mode = builder.mode;
        this.outboundPortIndex = builder.outboundPortIndex;
        this.outboundPortName = builder.outboundPortName;
        this.outboundPortType = builder.outboundPortType;
        this.regionId = builder.regionId;
        this.sagInsId = builder.sagInsId;
        this.sagSn = builder.sagSn;
        this.slaveIp = builder.slaveIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSmartAccessGatewayDnsForwardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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
    public String getOutboundPortIndex() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sagInsId
     */
    public String getSagInsId() {
        return this.sagInsId;
    }

    /**
     * @return sagSn
     */
    public String getSagSn() {
        return this.sagSn;
    }

    /**
     * @return slaveIp
     */
    public String getSlaveIp() {
        return this.slaveIp;
    }

    public static final class Builder extends Request.Builder<AddSmartAccessGatewayDnsForwardRequest, Builder> {
        private String domain; 
        private String masterIp; 
        private String mode; 
        private String outboundPortIndex; 
        private String outboundPortName; 
        private String outboundPortType; 
        private String regionId; 
        private String sagInsId; 
        private String sagSn; 
        private String slaveIp; 

        private Builder() {
            super();
        } 

        private Builder(AddSmartAccessGatewayDnsForwardRequest request) {
            super(request);
            this.domain = request.domain;
            this.masterIp = request.masterIp;
            this.mode = request.mode;
            this.outboundPortIndex = request.outboundPortIndex;
            this.outboundPortName = request.outboundPortName;
            this.outboundPortType = request.outboundPortType;
            this.regionId = request.regionId;
            this.sagInsId = request.sagInsId;
            this.sagSn = request.sagSn;
            this.slaveIp = request.slaveIp;
        } 

        /**
         * <p>The domain name.</p>
         * <blockquote>
         * <ul>
         * <li>Wildcard domain names and full match are supported. You can enter an asterisk (*) for the domain name to match all. Examples:
         * *.baidu.com. The allowed input format is baidu.com.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The primary DNS server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>114.114.114.114</p>
         */
        public Builder masterIp(String masterIp) {
            this.putQueryParameter("MasterIp", masterIp);
            this.masterIp = masterIp;
            return this;
        }

        /**
         * <p>The forwarding mode.</p>
         * <blockquote>
         * <ul>
         * <li>This field is invalid. You can ignore it.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>first</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The outbound port index.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is optional when OutboundPortType is set to PhysicalPort, and is not required when OutboundPortType is set to Tunnel.</li>
         * <li>OutboundPortIndex and OutboundPortName have a one-to-one mapping: 0 - eth0; 2 - lte.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder outboundPortIndex(String outboundPortIndex) {
            this.putQueryParameter("OutboundPortIndex", outboundPortIndex);
            this.outboundPortIndex = outboundPortIndex;
            return this;
        }

        /**
         * <p>The outbound port.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is optional when OutboundPortType is set to PhysicalPort, and is not required when OutboundPortType is set to Tunnel.</li>
         * <li>OutboundPortIndex and OutboundPortName have a one-to-one mapping: 0 - eth0; 2 - lte.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        public Builder outboundPortName(String outboundPortName) {
            this.putQueryParameter("OutboundPortName", outboundPortName);
            this.outboundPortName = outboundPortName;
            return this;
        }

        /**
         * <p>The outbound port type.</p>
         * <blockquote>
         * <ul>
         * <li>A value of Tunnel indicates a tunnel port, and a value of PhysicalPort indicates a physical port.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Tunnel</p>
         */
        public Builder outboundPortType(String outboundPortType) {
            this.putQueryParameter("OutboundPortType", outboundPortType);
            this.outboundPortType = outboundPortType;
            return this;
        }

        /**
         * <p>The region ID of the Smart Access Gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Smart Access Gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-v9un1ccz22owd76lf8</p>
         */
        public Builder sagInsId(String sagInsId) {
            this.putQueryParameter("SagInsId", sagInsId);
            this.sagInsId = sagInsId;
            return this;
        }

        /**
         * <p>The serial number of the device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sagf4dkqh78</p>
         */
        public Builder sagSn(String sagSn) {
            this.putQueryParameter("SagSn", sagSn);
            this.sagSn = sagSn;
            return this;
        }

        /**
         * <p>The secondary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.14</p>
         */
        public Builder slaveIp(String slaveIp) {
            this.putQueryParameter("SlaveIp", slaveIp);
            this.slaveIp = slaveIp;
            return this;
        }

        @Override
        public AddSmartAccessGatewayDnsForwardRequest build() {
            return new AddSmartAccessGatewayDnsForwardRequest(this);
        } 

    } 

}
