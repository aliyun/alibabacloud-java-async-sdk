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
 * {@link CloudListOnlineAgentRequest} extends {@link RequestModel}
 *
 * <p>CloudListOnlineAgentRequest</p>
 */
public class CloudListOnlineAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PauseDescription")
    private String pauseDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PauseType")
    private String pauseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qnos")
    private String qnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StateCode")
    private String stateCode;

    private CloudListOnlineAgentRequest(Builder builder) {
        super(builder);
        this.cnos = builder.cnos;
        this.enterpriseId = builder.enterpriseId;
        this.ownerId = builder.ownerId;
        this.pauseDescription = builder.pauseDescription;
        this.pauseType = builder.pauseType;
        this.qnos = builder.qnos;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.stateCode = builder.stateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListOnlineAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnos
     */
    public String getCnos() {
        return this.cnos;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pauseDescription
     */
    public String getPauseDescription() {
        return this.pauseDescription;
    }

    /**
     * @return pauseType
     */
    public String getPauseType() {
        return this.pauseType;
    }

    /**
     * @return qnos
     */
    public String getQnos() {
        return this.qnos;
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
     * @return stateCode
     */
    public String getStateCode() {
        return this.stateCode;
    }

    public static final class Builder extends Request.Builder<CloudListOnlineAgentRequest, Builder> {
        private String cnos; 
        private Long enterpriseId; 
        private Long ownerId; 
        private String pauseDescription; 
        private String pauseType; 
        private String qnos; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String stateCode; 

        private Builder() {
            super();
        } 

        private Builder(CloudListOnlineAgentRequest request) {
            super(request);
            this.cnos = request.cnos;
            this.enterpriseId = request.enterpriseId;
            this.ownerId = request.ownerId;
            this.pauseDescription = request.pauseDescription;
            this.pauseType = request.pauseType;
            this.qnos = request.qnos;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.stateCode = request.stateCode;
        } 

        /**
         * <p>坐席工号，指定座席工号则查询该工号座席的监控信息，可指定多个座席工号，指定多个座席工号使用英文逗号&quot;,&quot;分隔，不指定则查询所有队列监控信息，不指定则查询该账户下所有座席的监控信息</p>
         * 
         * <strong>example:</strong>
         * <p>1111,1112</p>
         */
        public Builder cnos(String cnos) {
            this.putQueryParameter("Cnos", cnos);
            this.cnos = cnos;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
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
         * <p>置忙原因，根据座席置忙原因过滤监控数据，可指定多个置忙原因，指定多个置忙原因使用英文逗号&quot;,&quot;分隔，不指定则默认查询所有设置状态的座席</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder pauseDescription(String pauseDescription) {
            this.putQueryParameter("PauseDescription", pauseDescription);
            this.pauseDescription = pauseDescription;
            return this;
        }

        /**
         * <p>置忙类型，根据座席置忙类型过滤监控数据，可指定多个置忙类型，指定多个置忙类型使用英文逗号&quot;,&quot;分隔，不指定则默认查询所有设置状态的座席。<br>取值说明1普通，2休息，3 IM，4 强制</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pauseType(String pauseType) {
            this.putQueryParameter("PauseType", pauseType);
            this.pauseType = pauseType;
            return this;
        }

        /**
         * <p>队列号，指定队列号则查询该队列号所对应队列的监控信息，支持同时查询多个队列号对应队列的监控信息，多个队列号使用英文逗号&quot;,&quot;分隔，不指定则查询所有队列监控信息</p>
         * 
         * <strong>example:</strong>
         * <p>123,124</p>
         */
        public Builder qnos(String qnos) {
            this.putQueryParameter("Qnos", qnos);
            this.qnos = qnos;
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
         * <p>坐席状态，s1:空闲，s2:置忙，s3:整理，s4:呼叫中，s5:响铃，s6通话   可传多个状态码，多个值之间以&quot;,&quot;分隔</p>
         * 
         * <strong>example:</strong>
         * <p>s1</p>
         */
        public Builder stateCode(String stateCode) {
            this.putQueryParameter("StateCode", stateCode);
            this.stateCode = stateCode;
            return this;
        }

        @Override
        public CloudListOnlineAgentRequest build() {
            return new CloudListOnlineAgentRequest(this);
        } 

    } 

}
