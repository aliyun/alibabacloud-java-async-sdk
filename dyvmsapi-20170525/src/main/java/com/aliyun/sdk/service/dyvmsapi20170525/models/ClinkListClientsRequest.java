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
 * {@link ClinkListClientsRequest} extends {@link RequestModel}
 *
 * <p>ClinkListClientsRequest</p>
 */
public class ClinkListClientsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    private Long active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindTel")
    private String bindTel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clid")
    private String clid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qno")
    private String qno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateEndTime")
    private Long updateEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateStartTime")
    private Long updateStartTime;

    private ClinkListClientsRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.bindTel = builder.bindTel;
        this.clid = builder.clid;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.qno = builder.qno;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.updateEndTime = builder.updateEndTime;
        this.updateStartTime = builder.updateStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListClientsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Long getActive() {
        return this.active;
    }

    /**
     * @return bindTel
     */
    public String getBindTel() {
        return this.bindTel;
    }

    /**
     * @return clid
     */
    public String getClid() {
        return this.clid;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qno
     */
    public String getQno() {
        return this.qno;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return updateEndTime
     */
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

    /**
     * @return updateStartTime
     */
    public Long getUpdateStartTime() {
        return this.updateStartTime;
    }

    public static final class Builder extends Request.Builder<ClinkListClientsRequest, Builder> {
        private Long active; 
        private String bindTel; 
        private String clid; 
        private Long endTime; 
        private Long enterpriseId; 
        private Long limit; 
        private Long offset; 
        private Long ownerId; 
        private String qno; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long startTime; 
        private Long updateEndTime; 
        private Long updateStartTime; 

        private Builder() {
            super();
        } 

        private Builder(ClinkListClientsRequest request) {
            super(request);
            this.active = request.active;
            this.bindTel = request.bindTel;
            this.clid = request.clid;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.limit = request.limit;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.qno = request.qno;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.updateEndTime = request.updateEndTime;
            this.updateStartTime = request.updateStartTime;
        } 

        /**
         * <p>是否激活，1: 激活；0: 未激活</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder active(Long active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * <p>绑定电话</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder bindTel(String bindTel) {
            this.putQueryParameter("BindTel", bindTel);
            this.bindTel = bindTel;
            return this;
        }

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder clid(String clid) {
            this.putQueryParameter("Clid", clid);
            this.clid = clid;
            return this;
        }

        /**
         * <p>创建时间查询范围-结束时间,秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>查询记录条数，默认值为 10，最大范围 100</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>偏移量，默认值为 0，最大范围 10000</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
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
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>12112</p>
         */
        public Builder qno(String qno) {
            this.putQueryParameter("Qno", qno);
            this.qno = qno;
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
         * <p>创建时间查询范围-开始时间,秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>修改时间查询范围-结束时间,秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder updateEndTime(Long updateEndTime) {
            this.putQueryParameter("UpdateEndTime", updateEndTime);
            this.updateEndTime = updateEndTime;
            return this;
        }

        /**
         * <p>修改时间查询范围-开始时间,秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder updateStartTime(Long updateStartTime) {
            this.putQueryParameter("UpdateStartTime", updateStartTime);
            this.updateStartTime = updateStartTime;
            return this;
        }

        @Override
        public ClinkListClientsRequest build() {
            return new ClinkListClientsRequest(this);
        } 

    } 

}
