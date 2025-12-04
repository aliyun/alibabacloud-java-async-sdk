// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link QueryVmsVirtualNumberRelationByPageRequest} extends {@link RequestModel}
 *
 * <p>QueryVmsVirtualNumberRelationByPageRequest</p>
 */
public class QueryVmsVirtualNumberRelationByPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberCity")
    private String numberCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberProvince")
    private String numberProvince;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealNumber")
    private String realNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private Long state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNumber")
    private String virtualNumber;

    private QueryVmsVirtualNumberRelationByPageRequest(Builder builder) {
        super(builder);
        this.numberCity = builder.numberCity;
        this.numberProvince = builder.numberProvince;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.realNumber = builder.realNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.state = builder.state;
        this.virtualNumber = builder.virtualNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVmsVirtualNumberRelationByPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return numberCity
     */
    public String getNumberCity() {
        return this.numberCity;
    }

    /**
     * @return numberProvince
     */
    public String getNumberProvince() {
        return this.numberProvince;
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
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return realNumber
     */
    public String getRealNumber() {
        return this.realNumber;
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
     * @return state
     */
    public Long getState() {
        return this.state;
    }

    /**
     * @return virtualNumber
     */
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

    public static final class Builder extends Request.Builder<QueryVmsVirtualNumberRelationByPageRequest, Builder> {
        private String numberCity; 
        private String numberProvince; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String realNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long state; 
        private String virtualNumber; 

        private Builder() {
            super();
        } 

        private Builder(QueryVmsVirtualNumberRelationByPageRequest request) {
            super(request);
            this.numberCity = request.numberCity;
            this.numberProvince = request.numberProvince;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.realNumber = request.realNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.state = request.state;
            this.virtualNumber = request.virtualNumber;
        } 

        /**
         * <p>号码归属地--城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder numberCity(String numberCity) {
            this.putQueryParameter("NumberCity", numberCity);
            this.numberCity = numberCity;
            return this;
        }

        /**
         * <p>号码归属地--省</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder numberProvince(String numberProvince) {
            this.putQueryParameter("NumberProvince", numberProvince);
            this.numberProvince = numberProvince;
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
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * <p>真实号码</p>
         * 
         * <strong>example:</strong>
         * <p>131***1234</p>
         */
        public Builder realNumber(String realNumber) {
            this.putQueryParameter("RealNumber", realNumber);
            this.realNumber = realNumber;
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
         * <p>状态 1:有效；0:无效；-1:注销</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder state(Long state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>虚拟号码</p>
         * 
         * <strong>example:</strong>
         * <p>0571****1234</p>
         */
        public Builder virtualNumber(String virtualNumber) {
            this.putQueryParameter("VirtualNumber", virtualNumber);
            this.virtualNumber = virtualNumber;
            return this;
        }

        @Override
        public QueryVmsVirtualNumberRelationByPageRequest build() {
            return new QueryVmsVirtualNumberRelationByPageRequest(this);
        } 

    } 

}
