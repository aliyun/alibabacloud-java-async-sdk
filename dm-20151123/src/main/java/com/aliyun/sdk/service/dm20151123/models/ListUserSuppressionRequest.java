// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ListUserSuppressionRequest} extends {@link RequestModel}
 *
 * <p>ListUserSuppressionRequest</p>
 */
public class ListUserSuppressionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndBounceTime")
    private Integer endBounceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCreateTime")
    private Integer endCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartBounceTime")
    private Integer startBounceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartCreateTime")
    private Integer startCreateTime;

    private ListUserSuppressionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.address = builder.address;
        this.endBounceTime = builder.endBounceTime;
        this.endCreateTime = builder.endCreateTime;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startBounceTime = builder.startBounceTime;
        this.startCreateTime = builder.startCreateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserSuppressionRequest create() {
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
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return endBounceTime
     */
    public Integer getEndBounceTime() {
        return this.endBounceTime;
    }

    /**
     * @return endCreateTime
     */
    public Integer getEndCreateTime() {
        return this.endCreateTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return startBounceTime
     */
    public Integer getStartBounceTime() {
        return this.startBounceTime;
    }

    /**
     * @return startCreateTime
     */
    public Integer getStartCreateTime() {
        return this.startCreateTime;
    }

    public static final class Builder extends Request.Builder<ListUserSuppressionRequest, Builder> {
        private String regionId; 
        private String address; 
        private Integer endBounceTime; 
        private Integer endCreateTime; 
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer startBounceTime; 
        private Integer startCreateTime; 

        private Builder() {
            super();
        } 

        private Builder(ListUserSuppressionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.address = request.address;
            this.endBounceTime = request.endBounceTime;
            this.endCreateTime = request.endCreateTime;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startBounceTime = request.startBounceTime;
            this.startCreateTime = request.startCreateTime;
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
         * <p>Email address or domain name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.net">test@example.net</a></p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>End time of the last bounce hit, timestamp, accurate to the second. The span between start and end times cannot exceed 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1715669077</p>
         */
        public Builder endBounceTime(Integer endBounceTime) {
            this.putQueryParameter("EndBounceTime", endBounceTime);
            this.endBounceTime = endBounceTime;
            return this;
        }

        /**
         * <p>End creation time, timestamp, accurate to the second. The span between start and end times cannot exceed 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1715669077</p>
         */
        public Builder endCreateTime(Integer endCreateTime) {
            this.putQueryParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
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
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * <p>Start time of the last bounce hit, timestamp, accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1715668852</p>
         */
        public Builder startBounceTime(Integer startBounceTime) {
            this.putQueryParameter("StartBounceTime", startBounceTime);
            this.startBounceTime = startBounceTime;
            return this;
        }

        /**
         * <p>Start creation time, timestamp, accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1715668852</p>
         */
        public Builder startCreateTime(Integer startCreateTime) {
            this.putQueryParameter("StartCreateTime", startCreateTime);
            this.startCreateTime = startCreateTime;
            return this;
        }

        @Override
        public ListUserSuppressionRequest build() {
            return new ListUserSuppressionRequest(this);
        } 

    } 

}
