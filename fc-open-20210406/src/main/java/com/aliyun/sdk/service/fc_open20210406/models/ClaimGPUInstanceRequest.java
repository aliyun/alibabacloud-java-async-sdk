// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClaimGPUInstanceRequest} extends {@link RequestModel}
 *
 * <p>ClaimGPUInstanceRequest</p>
 */
public class ClaimGPUInstanceRequest extends Request {
    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("diskPerformanceLevel")
    private String diskPerformanceLevel;

    @Body
    @NameInMap("diskSizeGigabytes")
    private String diskSizeGigabytes;

    @Body
    @NameInMap("imageId")
    @Validation(required = true)
    private String imageId;

    @Body
    @NameInMap("instanceType")
    @Validation(required = true)
    private String instanceType;

    @Body
    @NameInMap("internetBandwidthOut")
    private String internetBandwidthOut;

    @Body
    @NameInMap("password")
    private String password;

    @Body
    @NameInMap("role")
    private String role;

    @Body
    @NameInMap("sgId")
    private String sgId;

    @Body
    @NameInMap("sourceCidrIp")
    @Validation(required = true)
    private String sourceCidrIp;

    @Body
    @NameInMap("tcpPortRange")
    private java.util.List < String > tcpPortRange;

    @Body
    @NameInMap("udpPortRange")
    private java.util.List < String > udpPortRange;

    @Body
    @NameInMap("vpcId")
    private String vpcId;

    @Body
    @NameInMap("vswId")
    private String vswId;

    private ClaimGPUInstanceRequest(Builder builder) {
        super(builder);
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.diskPerformanceLevel = builder.diskPerformanceLevel;
        this.diskSizeGigabytes = builder.diskSizeGigabytes;
        this.imageId = builder.imageId;
        this.instanceType = builder.instanceType;
        this.internetBandwidthOut = builder.internetBandwidthOut;
        this.password = builder.password;
        this.role = builder.role;
        this.sgId = builder.sgId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.tcpPortRange = builder.tcpPortRange;
        this.udpPortRange = builder.udpPortRange;
        this.vpcId = builder.vpcId;
        this.vswId = builder.vswId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClaimGPUInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return diskPerformanceLevel
     */
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
    }

    /**
     * @return diskSizeGigabytes
     */
    public String getDiskSizeGigabytes() {
        return this.diskSizeGigabytes;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetBandwidthOut
     */
    public String getInternetBandwidthOut() {
        return this.internetBandwidthOut;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return sgId
     */
    public String getSgId() {
        return this.sgId;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    /**
     * @return tcpPortRange
     */
    public java.util.List < String > getTcpPortRange() {
        return this.tcpPortRange;
    }

    /**
     * @return udpPortRange
     */
    public java.util.List < String > getUdpPortRange() {
        return this.udpPortRange;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswId
     */
    public String getVswId() {
        return this.vswId;
    }

    public static final class Builder extends Request.Builder<ClaimGPUInstanceRequest, Builder> {
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String diskPerformanceLevel; 
        private String diskSizeGigabytes; 
        private String imageId; 
        private String instanceType; 
        private String internetBandwidthOut; 
        private String password; 
        private String role; 
        private String sgId; 
        private String sourceCidrIp; 
        private java.util.List < String > tcpPortRange; 
        private java.util.List < String > udpPortRange; 
        private String vpcId; 
        private String vswId; 

        private Builder() {
            super();
        } 

        private Builder(ClaimGPUInstanceRequest request) {
            super(request);
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.diskPerformanceLevel = request.diskPerformanceLevel;
            this.diskSizeGigabytes = request.diskSizeGigabytes;
            this.imageId = request.imageId;
            this.instanceType = request.instanceType;
            this.internetBandwidthOut = request.internetBandwidthOut;
            this.password = request.password;
            this.role = request.role;
            this.sgId = request.sgId;
            this.sourceCidrIp = request.sourceCidrIp;
            this.tcpPortRange = request.tcpPortRange;
            this.udpPortRange = request.udpPortRange;
            this.vpcId = request.vpcId;
            this.vswId = request.vswId;
        } 

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * GPU渲染实例磁盘性能级别
         */
        public Builder diskPerformanceLevel(String diskPerformanceLevel) {
            this.putBodyParameter("diskPerformanceLevel", diskPerformanceLevel);
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }

        /**
         * GPU渲染实例系统盘空间
         */
        public Builder diskSizeGigabytes(String diskSizeGigabytes) {
            this.putBodyParameter("diskSizeGigabytes", diskSizeGigabytes);
            this.diskSizeGigabytes = diskSizeGigabytes;
            return this;
        }

        /**
         * GPU渲染实例镜像ID
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("imageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * GPU渲染实例规格
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * GPU渲染实例公网出向带宽
         */
        public Builder internetBandwidthOut(String internetBandwidthOut) {
            this.putBodyParameter("internetBandwidthOut", internetBandwidthOut);
            this.internetBandwidthOut = internetBandwidthOut;
            return this;
        }

        /**
         * GPU渲染实例密码
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * 用户角色
         */
        public Builder role(String role) {
            this.putBodyParameter("role", role);
            this.role = role;
            return this;
        }

        /**
         * 安全组ID
         */
        public Builder sgId(String sgId) {
            this.putBodyParameter("sgId", sgId);
            this.sgId = sgId;
            return this;
        }

        /**
         * GPU渲染实例源端IPv4 CIDR地址块
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putBodyParameter("sourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * GPU渲染实例安全组开放的TCP协议端口范围
         */
        public Builder tcpPortRange(java.util.List < String > tcpPortRange) {
            this.putBodyParameter("tcpPortRange", tcpPortRange);
            this.tcpPortRange = tcpPortRange;
            return this;
        }

        /**
         * GPU渲染实例安全组开放的UDP协议端口范围
         */
        public Builder udpPortRange(java.util.List < String > udpPortRange) {
            this.putBodyParameter("udpPortRange", udpPortRange);
            this.udpPortRange = udpPortRange;
            return this;
        }

        /**
         * 专有网络ID
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 交换机ID
         */
        public Builder vswId(String vswId) {
            this.putBodyParameter("vswId", vswId);
            this.vswId = vswId;
            return this;
        }

        @Override
        public ClaimGPUInstanceRequest build() {
            return new ClaimGPUInstanceRequest(this);
        } 

    } 

}
