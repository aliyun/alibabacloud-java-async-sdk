// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryGuideItemGroupForCrowdOperationRequest} extends {@link RequestModel}
 *
 * <p>QueryGuideItemGroupForCrowdOperationRequest</p>
 */
public class QueryGuideItemGroupForCrowdOperationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemState")
    private String itemState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserFlag")
    private String userFlag;

    private QueryGuideItemGroupForCrowdOperationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.groupId = builder.groupId;
        this.itemState = builder.itemState;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.userFlag = builder.userFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGuideItemGroupForCrowdOperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return itemState
     */
    public String getItemState() {
        return this.itemState;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userFlag
     */
    public String getUserFlag() {
        return this.userFlag;
    }

    public static final class Builder extends Request.Builder<QueryGuideItemGroupForCrowdOperationRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String groupId; 
        private String itemState; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String userFlag; 

        private Builder() {
            super();
        } 

        private Builder(QueryGuideItemGroupForCrowdOperationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.groupId = request.groupId;
            this.itemState = request.itemState;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.userFlag = request.userFlag;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ItemState.
         */
        public Builder itemState(String itemState) {
            this.putQueryParameter("ItemState", itemState);
            this.itemState = itemState;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * UserFlag.
         */
        public Builder userFlag(String userFlag) {
            this.putQueryParameter("UserFlag", userFlag);
            this.userFlag = userFlag;
            return this;
        }

        @Override
        public QueryGuideItemGroupForCrowdOperationRequest build() {
            return new QueryGuideItemGroupForCrowdOperationRequest(this);
        } 

    } 

}
