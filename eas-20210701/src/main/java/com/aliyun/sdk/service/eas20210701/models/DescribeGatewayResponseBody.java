// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayResponseBody</p>
 */
public class DescribeGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExternalClusterId")
    private String externalClusterId;

    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("GatewayName")
    private String gatewayName;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("InternetDomain")
    private String internetDomain;

    @com.aliyun.core.annotation.NameInMap("InternetEnabled")
    private Boolean internetEnabled;

    @com.aliyun.core.annotation.NameInMap("InternetStatus")
    private String internetStatus;

    @com.aliyun.core.annotation.NameInMap("IntranetDomain")
    private String intranetDomain;

    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLRedirectionEnabled")
    private Boolean SSLRedirectionEnabled;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private DescribeGatewayResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.externalClusterId = builder.externalClusterId;
        this.gatewayId = builder.gatewayId;
        this.gatewayName = builder.gatewayName;
        this.instanceType = builder.instanceType;
        this.internetDomain = builder.internetDomain;
        this.internetEnabled = builder.internetEnabled;
        this.internetStatus = builder.internetStatus;
        this.intranetDomain = builder.intranetDomain;
        this.isDefault = builder.isDefault;
        this.replicas = builder.replicas;
        this.requestId = builder.requestId;
        this.SSLRedirectionEnabled = builder.SSLRedirectionEnabled;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return externalClusterId
     */
    public String getExternalClusterId() {
        return this.externalClusterId;
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetDomain
     */
    public String getInternetDomain() {
        return this.internetDomain;
    }

    /**
     * @return internetEnabled
     */
    public Boolean getInternetEnabled() {
        return this.internetEnabled;
    }

    /**
     * @return internetStatus
     */
    public String getInternetStatus() {
        return this.internetStatus;
    }

    /**
     * @return intranetDomain
     */
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SSLRedirectionEnabled
     */
    public Boolean getSSLRedirectionEnabled() {
        return this.SSLRedirectionEnabled;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String externalClusterId; 
        private String gatewayId; 
        private String gatewayName; 
        private String instanceType; 
        private String internetDomain; 
        private Boolean internetEnabled; 
        private String internetStatus; 
        private String intranetDomain; 
        private Boolean isDefault; 
        private Integer replicas; 
        private String requestId; 
        private Boolean SSLRedirectionEnabled; 
        private String status; 
        private String updateTime; 

        /**
         * <p>The time when the private gateway was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-19T14:19:42Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the self-managed cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c935eadf284c14c2da57a2a13ad6******</p>
         */
        public Builder externalClusterId(String externalClusterId) {
            this.externalClusterId = externalClusterId;
            return this;
        }

        /**
         * <p>The ID of the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The alias of the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>mygateway1</p>
         */
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * <p>The instance type used by the private gateway.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>8c16g</li>
         * <li>4c8g</li>
         * <li>2c4g</li>
         * <li>16c32g</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.4xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******-1801786532******.cn-hangzhou.pai-eas.aliyuncs.com</p>
         */
        public Builder internetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }

        /**
         * <p>Indicates whether Internet access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder internetEnabled(Boolean internetEnabled) {
            this.internetEnabled = internetEnabled;
            return this;
        }

        /**
         * <p>Indicates whether Internet access is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating: Internet access is being enabled.</li>
         * <li>Failed: Internet access failed to be enabled or deleted.</li>
         * <li>Running: Internet access is running.</li>
         * <li>Deleted: Internet access is deleted.</li>
         * <li>Deleting: Internet access is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder internetStatus(String internetStatus) {
            this.internetStatus = internetStatus;
            return this;
        }

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******-1801786532******-vpc.cn-hangzhou.pai-eas.aliyuncs.com</p>
         */
        public Builder intranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }

        /**
         * <p>Indicates whether it is the default private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The number of nodes in the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder replicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SSLRedirectionEnabled.
         */
        public Builder SSLRedirectionEnabled(Boolean SSLRedirectionEnabled) {
            this.SSLRedirectionEnabled = SSLRedirectionEnabled;
            return this;
        }

        /**
         * <p>The status of the private gateway.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Stopped</li>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>Deleted</li>
         * <li>Deleting</li>
         * <li>Waiting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateGatewayRunning</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the private gateway was updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-24T11:52:17Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DescribeGatewayResponseBody build() {
            return new DescribeGatewayResponseBody(this);
        } 

    } 

}
