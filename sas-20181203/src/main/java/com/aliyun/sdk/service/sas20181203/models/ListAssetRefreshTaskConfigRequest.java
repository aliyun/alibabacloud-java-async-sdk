// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetRefreshTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>ListAssetRefreshTaskConfigRequest</p>
 */
public class ListAssetRefreshTaskConfigRequest extends Request {
    @Query
    @NameInMap("RefreshConfigType")
    private Integer refreshConfigType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetId")
    private Long targetId;

    private ListAssetRefreshTaskConfigRequest(Builder builder) {
        super(builder);
        this.refreshConfigType = builder.refreshConfigType;
        this.regionId = builder.regionId;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetRefreshTaskConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return refreshConfigType
     */
    public Integer getRefreshConfigType() {
        return this.refreshConfigType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetId
     */
    public Long getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<ListAssetRefreshTaskConfigRequest, Builder> {
        private Integer refreshConfigType; 
        private String regionId; 
        private Long targetId; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetRefreshTaskConfigRequest request) {
            super(request);
            this.refreshConfigType = request.refreshConfigType;
            this.regionId = request.regionId;
            this.targetId = request.targetId;
        } 

        /**
         * The type of the configuration. Valid values:
         * <p>
         * 
         * *   **0**: server synchronization task
         * *   **1**: cloud service synchronization task
         * *   **2**: scheduled AccessKey pair verification task
         */
        public Builder refreshConfigType(Integer refreshConfigType) {
            this.putQueryParameter("RefreshConfigType", refreshConfigType);
            this.refreshConfigType = refreshConfigType;
            return this;
        }

        /**
         * The region where the Security Center instance is deployed.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the data entry containing the AccessKey pair that you specify when you configure the scheduled AccessKey pair verification task.
         */
        public Builder targetId(Long targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public ListAssetRefreshTaskConfigRequest build() {
            return new ListAssetRefreshTaskConfigRequest(this);
        } 

    } 

}
