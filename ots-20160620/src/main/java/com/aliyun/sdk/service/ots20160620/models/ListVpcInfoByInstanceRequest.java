// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcInfoByInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListVpcInfoByInstanceRequest</p>
 */
public class ListVpcInfoByInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListVpcInfoByInstanceRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcInfoByInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ListVpcInfoByInstanceRequest, Builder> {
        private String instanceName; 
        private Long pageNum; 
        private Long pageSize; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcInfoByInstanceRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListVpcInfoByInstanceRequest build() {
            return new ListVpcInfoByInstanceRequest(this);
        } 

    } 

}
