// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link EnableCenVbrHealthCheckRequest} extends {@link RequestModel}
 *
 * <p>EnableCenVbrHealthCheckRequest</p>
 */
public class EnableCenVbrHealthCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckOnly")
    private Boolean healthCheckOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckSourceIp")
    private String healthCheckSourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTargetIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String healthCheckTargetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 8, minimum = 3)
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vbrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrInstanceOwnerId")
    private Long vbrInstanceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vbrInstanceRegionId;

    private EnableCenVbrHealthCheckRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.description = builder.description;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckOnly = builder.healthCheckOnly;
        this.healthCheckSourceIp = builder.healthCheckSourceIp;
        this.healthCheckTargetIp = builder.healthCheckTargetIp;
        this.healthyThreshold = builder.healthyThreshold;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vbrInstanceId = builder.vbrInstanceId;
        this.vbrInstanceOwnerId = builder.vbrInstanceOwnerId;
        this.vbrInstanceRegionId = builder.vbrInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCenVbrHealthCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    /**
     * @return healthCheckOnly
     */
    public Boolean getHealthCheckOnly() {
        return this.healthCheckOnly;
    }

    /**
     * @return healthCheckSourceIp
     */
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    /**
     * @return healthCheckTargetIp
     */
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return vbrInstanceId
     */
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    /**
     * @return vbrInstanceOwnerId
     */
    public Long getVbrInstanceOwnerId() {
        return this.vbrInstanceOwnerId;
    }

    /**
     * @return vbrInstanceRegionId
     */
    public String getVbrInstanceRegionId() {
        return this.vbrInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<EnableCenVbrHealthCheckRequest, Builder> {
        private String cenId; 
        private String description; 
        private Integer healthCheckInterval; 
        private Boolean healthCheckOnly; 
        private String healthCheckSourceIp; 
        private String healthCheckTargetIp; 
        private Integer healthyThreshold; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vbrInstanceId; 
        private Long vbrInstanceOwnerId; 
        private String vbrInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableCenVbrHealthCheckRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.description = request.description;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckOnly = request.healthCheckOnly;
            this.healthCheckSourceIp = request.healthCheckSourceIp;
            this.healthCheckTargetIp = request.healthCheckTargetIp;
            this.healthyThreshold = request.healthyThreshold;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vbrInstanceId = request.vbrInstanceId;
            this.vbrInstanceOwnerId = request.vbrInstanceOwnerId;
            this.vbrInstanceRegionId = request.vbrInstanceRegionId;
        } 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-hahhfskfkseig****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The description of the health check.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The time interval at which probe packets are sent during a health check. Unit: seconds. Default value: <strong>2</strong>. Valid values: <strong>2 to 3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>Specifies whether to enable probing during the health check. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes</p>
         * <pre><code>If you enable probing, the system does not switch to another route if the detected route is not reachable. 
         * 
         *   Make sure that a redundant route is available. Otherwise, network disconnections may occur. 
         * </code></pre>
         * </li>
         * <li><p><strong>false</strong> (default): no</p>
         * <pre><code>Probing is disabled by default. If a redundant route is specified, the system switches to the redundant route if the detected route is not reachable.
         * </code></pre>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder healthCheckOnly(Boolean healthCheckOnly) {
            this.putQueryParameter("HealthCheckOnly", healthCheckOnly);
            this.healthCheckOnly = healthCheckOnly;
            return this;
        }

        /**
         * <p>The source IP address for the health check. You can set the source IP address in the following ways:</p>
         * <ul>
         * <li><strong>Automatic IP Address</strong> (recommended): The system automatically assigns an IP address from the 100.96.0.0/16 CIDR block.</li>
         * <li><strong>Custom IP Address</strong>: You must specify an idle IP address from the 10.0.0.0/8, 192.168.0.0/16, or 172.16.0.0/12 CIDR block. The specified IP address cannot be the IP address of the VBR on the Alibaba Cloud side, the IP address of the VBR on the customer side, or other IP addresses with which the VBR communicates through the CEN instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * <p>The destination IP address for the health check.</p>
         * <p>Set the destination IP address to the IP address of the VBR on the customer side.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XX.XX.1</p>
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * <p>The number of probe packets that are sent during a health check. Unit: packets. Valid values: <strong>3 to 8</strong>. Default value: <strong>8</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the VBR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-wz95o9aylj181n5mzk****</p>
         */
        public Builder vbrInstanceId(String vbrInstanceId) {
            this.putQueryParameter("VbrInstanceId", vbrInstanceId);
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
         * <blockquote>
         * <p>This parameter is required if the VBR and the CEN instance belong to different Alibaba Cloud accounts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1250123456123456</p>
         */
        public Builder vbrInstanceOwnerId(Long vbrInstanceOwnerId) {
            this.putQueryParameter("VbrInstanceOwnerId", vbrInstanceOwnerId);
            this.vbrInstanceOwnerId = vbrInstanceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the region where the VBR is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder vbrInstanceRegionId(String vbrInstanceRegionId) {
            this.putQueryParameter("VbrInstanceRegionId", vbrInstanceRegionId);
            this.vbrInstanceRegionId = vbrInstanceRegionId;
            return this;
        }

        @Override
        public EnableCenVbrHealthCheckRequest build() {
            return new EnableCenVbrHealthCheckRequest(this);
        } 

    } 

}
