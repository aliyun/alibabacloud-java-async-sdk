// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAssetRefreshTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>ListAssetRefreshTaskConfigRequest</p>
 */
public class ListAssetRefreshTaskConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefreshConfigType")
    private Integer refreshConfigType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
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
         * <p>The type of the configuration. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: server synchronization task</li>
         * <li><strong>1</strong>: cloud service synchronization task</li>
         * <li><strong>2</strong>: scheduled AccessKey pair verification task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder refreshConfigType(Integer refreshConfigType) {
            this.putQueryParameter("RefreshConfigType", refreshConfigType);
            this.refreshConfigType = refreshConfigType;
            return this;
        }

        /**
         * <p>The region where the Security Center instance is deployed.</p>
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
         * <p>The ID of the data entry containing the AccessKey pair that you specify when you configure the scheduled AccessKey pair verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>2295</p>
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
