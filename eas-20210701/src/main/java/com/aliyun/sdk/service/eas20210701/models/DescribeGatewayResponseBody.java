// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        private String status; 
        private String updateTime; 

        /**
         * The time when the private gateway was created. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The ID of the self-managed cluster.
         */
        public Builder externalClusterId(String externalClusterId) {
            this.externalClusterId = externalClusterId;
            return this;
        }

        /**
         * The ID of the private gateway.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * The alias of the private gateway.
         */
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * The instance type used by the private gateway.
         * <p>
         * 
         * Valid values:
         * 
         * *   8c16g
         * *   4c8g
         * *   2c4g
         * *   16c32g
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The public endpoint.
         */
        public Builder internetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }

        /**
         * Indicates whether Internet access is enabled.
         */
        public Builder internetEnabled(Boolean internetEnabled) {
            this.internetEnabled = internetEnabled;
            return this;
        }

        /**
         * Indicates whether Internet access is enabled.
         * <p>
         * 
         * Valid values:
         * 
         * *   Creating: Internet access is being enabled.
         * *   Failed: Internet access failed to be enabled or deleted.
         * *   Running: Internet access is running.
         * *   Deleted: Internet access is deleted.
         * *   Deleting: Internet access is being deleted.
         */
        public Builder internetStatus(String internetStatus) {
            this.internetStatus = internetStatus;
            return this;
        }

        /**
         * The internal endpoint.
         */
        public Builder intranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }

        /**
         * Indicates whether it is the default private gateway.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * The number of nodes in the private gateway.
         */
        public Builder replicas(Integer replicas) {
            this.replicas = replicas;
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
         * The status of the private gateway.
         * <p>
         * 
         * Valid values:
         * 
         * *   Creating
         * *   Stopped
         * *   Failed
         * *   Running
         * *   Deleted
         * *   Deleting
         * *   Waiting
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time when the private gateway was updated. The time is displayed in UTC.
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
