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
 * {@link CreateQosCarRequest} extends {@link RequestModel}
 *
 * <p>CreateQosCarRequest</p>
 */
public class CreateQosCarRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String limitType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBandwidthAbs")
    private Integer maxBandwidthAbs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBandwidthPercent")
    private Integer maxBandwidthPercent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinBandwidthAbs")
    private Integer minBandwidthAbs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinBandwidthPercent")
    private Integer minBandwidthPercent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PercentSourceType")
    private String percentSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateQosCarRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.limitType = builder.limitType;
        this.maxBandwidthAbs = builder.maxBandwidthAbs;
        this.maxBandwidthPercent = builder.maxBandwidthPercent;
        this.minBandwidthAbs = builder.minBandwidthAbs;
        this.minBandwidthPercent = builder.minBandwidthPercent;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.percentSourceType = builder.percentSourceType;
        this.priority = builder.priority;
        this.qosId = builder.qosId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosCarRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return limitType
     */
    public String getLimitType() {
        return this.limitType;
    }

    /**
     * @return maxBandwidthAbs
     */
    public Integer getMaxBandwidthAbs() {
        return this.maxBandwidthAbs;
    }

    /**
     * @return maxBandwidthPercent
     */
    public Integer getMaxBandwidthPercent() {
        return this.maxBandwidthPercent;
    }

    /**
     * @return minBandwidthAbs
     */
    public Integer getMinBandwidthAbs() {
        return this.minBandwidthAbs;
    }

    /**
     * @return minBandwidthPercent
     */
    public Integer getMinBandwidthPercent() {
        return this.minBandwidthPercent;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return percentSourceType
     */
    public String getPercentSourceType() {
        return this.percentSourceType;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateQosCarRequest, Builder> {
        private String description; 
        private String limitType; 
        private Integer maxBandwidthAbs; 
        private Integer maxBandwidthPercent; 
        private Integer minBandwidthAbs; 
        private Integer minBandwidthPercent; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String percentSourceType; 
        private Integer priority; 
        private String qosId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateQosCarRequest request) {
            super(request);
            this.description = request.description;
            this.limitType = request.limitType;
            this.maxBandwidthAbs = request.maxBandwidthAbs;
            this.maxBandwidthPercent = request.maxBandwidthPercent;
            this.minBandwidthAbs = request.minBandwidthAbs;
            this.minBandwidthPercent = request.minBandwidthPercent;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.percentSourceType = request.percentSourceType;
            this.priority = request.priority;
            this.qosId = request.qosId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The description of the traffic throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Qosdesc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the traffic throttling rule. Valid values:</p>
         * <ul>
         * <li><strong>Absolute</strong>: throttles traffic based on a specific range of bandwidth values.</li>
         * <li><strong>Percent</strong>: throttles traffic based on a specific range of bandwidth percentage.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Absolute</p>
         */
        public Builder limitType(String limitType) {
            this.putQueryParameter("LimitType", limitType);
            this.limitType = limitType;
            return this;
        }

        /**
         * <p>The maximum bandwidth value. The value must be an integer. Unit: Mbit/s.</p>
         * <p>This parameter is returned when <strong>LimitType</strong> is set to <strong>Absolute</strong>.</p>
         * <blockquote>
         * <p> The maximum bandwidth value must be greater than the minimum bandwidth value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder maxBandwidthAbs(Integer maxBandwidthAbs) {
            this.putQueryParameter("MaxBandwidthAbs", maxBandwidthAbs);
            this.maxBandwidthAbs = maxBandwidthAbs;
            return this;
        }

        /**
         * <p>The maximum bandwidth percentage. Unit: percent (%). Valid values: <strong>1 to 100</strong>.</p>
         * <p>This parameter is required when you set <strong>LimitType</strong> to <strong>Percent</strong>.</p>
         * <blockquote>
         * <p> The maximum bandwidth percentage must be greater than the minimum bandwidth percentage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder maxBandwidthPercent(Integer maxBandwidthPercent) {
            this.putQueryParameter("MaxBandwidthPercent", maxBandwidthPercent);
            this.maxBandwidthPercent = maxBandwidthPercent;
            return this;
        }

        /**
         * <p>The minimum bandwidth value. The value must be an integer. Unit: Mbit/s.</p>
         * <p>This parameter is returned when <strong>LimitType</strong> is set to <strong>Absolute</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minBandwidthAbs(Integer minBandwidthAbs) {
            this.putQueryParameter("MinBandwidthAbs", minBandwidthAbs);
            this.minBandwidthAbs = minBandwidthAbs;
            return this;
        }

        /**
         * <p>The minimum bandwidth percentage. Unit: percent (%). Valid values: <strong>1 to 100</strong>.</p>
         * <p>This parameter is required when you set <strong>LimitType</strong> to <strong>Percent</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder minBandwidthPercent(Integer minBandwidthPercent) {
            this.putQueryParameter("MinBandwidthPercent", minBandwidthPercent);
            this.minBandwidthPercent = minBandwidthPercent;
            return this;
        }

        /**
         * <p>The name of the traffic throttling rule.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The type of bandwidth when traffic is throttled based on bandwidth percentage. Valid values:</p>
         * <ul>
         * <li><strong>CcnBandwidth</strong>: CCN bandwidth</li>
         * <li><strong>InternetUpBandwidth</strong>: total Internet bandwidth</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CcnBandwidth</p>
         */
        public Builder percentSourceType(String percentSourceType) {
            this.putQueryParameter("PercentSourceType", percentSourceType);
            this.percentSourceType = percentSourceType;
            return this;
        }

        /**
         * <p>The priority of the traffic throttling rule.</p>
         * <p>Valid values: <strong>1</strong> to <strong>3</strong>. A smaller value indicates a higher priority. If rules have the same priority, the one created the earliest is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the QoS policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-xitd8690ucu8ro****</p>
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The ID of the region to which the QoS policy belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public CreateQosCarRequest build() {
            return new CreateQosCarRequest(this);
        } 

    } 

}
