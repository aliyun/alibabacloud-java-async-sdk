// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link BatchModifyEntitlementRequest} extends {@link RequestModel}
 *
 * <p>BatchModifyEntitlementRequest</p>
 */
public class BatchModifyEntitlementRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private java.util.List<String> endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDesktopPerUser")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxDesktopPerUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxUserPerDesktop")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxUserPerDesktop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Preview")
    private Boolean preview;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    private String strategy;

    private BatchModifyEntitlementRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.endUserId = builder.endUserId;
        this.maxDesktopPerUser = builder.maxDesktopPerUser;
        this.maxUserPerDesktop = builder.maxUserPerDesktop;
        this.preview = builder.preview;
        this.regionId = builder.regionId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchModifyEntitlementRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return endUserId
     */
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return maxDesktopPerUser
     */
    public Integer getMaxDesktopPerUser() {
        return this.maxDesktopPerUser;
    }

    /**
     * @return maxUserPerDesktop
     */
    public Integer getMaxUserPerDesktop() {
        return this.maxUserPerDesktop;
    }

    /**
     * @return preview
     */
    public Boolean getPreview() {
        return this.preview;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<BatchModifyEntitlementRequest, Builder> {
        private java.util.List<String> desktopId; 
        private java.util.List<String> endUserId; 
        private Integer maxDesktopPerUser; 
        private Integer maxUserPerDesktop; 
        private Boolean preview; 
        private String regionId; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(BatchModifyEntitlementRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.endUserId = request.endUserId;
            this.maxDesktopPerUser = request.maxDesktopPerUser;
            this.maxUserPerDesktop = request.maxUserPerDesktop;
            this.preview = request.preview;
            this.regionId = request.regionId;
            this.strategy = request.strategy;
        } 

        /**
         * <p>The IDs of the cloud computers for which you want to modify end users.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The IDs of the users.</p>
         */
        public Builder endUserId(java.util.List<String> endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The number of cloud computers allocated to each user.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxDesktopPerUser(Integer maxDesktopPerUser) {
            this.putQueryParameter("MaxDesktopPerUser", maxDesktopPerUser);
            this.maxDesktopPerUser = maxDesktopPerUser;
            return this;
        }

        /**
         * <p>The number of users assigned to each cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxUserPerDesktop(Integer maxUserPerDesktop) {
            this.putQueryParameter("MaxUserPerDesktop", maxUserPerDesktop);
            this.maxUserPerDesktop = maxUserPerDesktop;
            return this;
        }

        /**
         * <p>Whether to preview the assign results instead of actually assigning cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder preview(Boolean preview) {
            this.putQueryParameter("Preview", preview);
            this.preview = preview;
            return this;
        }

        /**
         * <p>The ID of the region. Call the DescribeRegions operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The disproportional assignment policy. Valid values:</p>
         * <p>AVERAGE: The system preferentially guarantees that each user is assigned with at least a cloud computer. If the number of selected cloud computers cannot be proportionally assigned to the selected users, ensure that each user is assigned a cloud computer.</p>
         * <p>CENTRAL: The system preferentially assigns the designated number of cloud computers to each user. If the number of selected cloud computers cannot be proportionally assigned to the selected users, ensure that each user is assigned the specified number of cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>AVERAGE</p>
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public BatchModifyEntitlementRequest build() {
            return new BatchModifyEntitlementRequest(this);
        } 

    } 

}
