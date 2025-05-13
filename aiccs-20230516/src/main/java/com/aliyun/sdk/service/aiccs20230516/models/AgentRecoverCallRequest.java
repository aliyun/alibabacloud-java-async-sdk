// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link AgentRecoverCallRequest} extends {@link RequestModel}
 *
 * <p>AgentRecoverCallRequest</p>
 */
public class AgentRecoverCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private Long agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTag")
    private String agentTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginImportTime")
    private String beginImportTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndImportTime")
    private String endImportTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Numbers")
    private java.util.List<String> numbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    private AgentRecoverCallRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentTag = builder.agentTag;
        this.beginImportTime = builder.beginImportTime;
        this.endImportTime = builder.endImportTime;
        this.numbers = builder.numbers;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentRecoverCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentTag
     */
    public String getAgentTag() {
        return this.agentTag;
    }

    /**
     * @return beginImportTime
     */
    public String getBeginImportTime() {
        return this.beginImportTime;
    }

    /**
     * @return endImportTime
     */
    public String getEndImportTime() {
        return this.endImportTime;
    }

    /**
     * @return numbers
     */
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AgentRecoverCallRequest, Builder> {
        private Long agentId; 
        private String agentTag; 
        private String beginImportTime; 
        private String endImportTime; 
        private java.util.List<String> numbers; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> tags; 

        private Builder() {
            super();
        } 

        private Builder(AgentRecoverCallRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentTag = request.agentTag;
            this.beginImportTime = request.beginImportTime;
            this.endImportTime = request.endImportTime;
            this.numbers = request.numbers;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
        } 

        /**
         * <p>坐席ID</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>坐席标签</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder agentTag(String agentTag) {
            this.putQueryParameter("AgentTag", agentTag);
            this.agentTag = agentTag;
            return this;
        }

        /**
         * <p>查询开始导入时间</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-06 10:10:10</p>
         */
        public Builder beginImportTime(String beginImportTime) {
            this.putQueryParameter("BeginImportTime", beginImportTime);
            this.beginImportTime = beginImportTime;
            return this;
        }

        /**
         * <p>查询结束导入时间</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-06 10:10:10</p>
         */
        public Builder endImportTime(String endImportTime) {
            this.putQueryParameter("EndImportTime", endImportTime);
            this.endImportTime = endImportTime;
            return this;
        }

        /**
         * <p>号码列表</p>
         */
        public Builder numbers(java.util.List<String> numbers) {
            String numbersShrink = shrink(numbers, "Numbers", "json");
            this.putQueryParameter("Numbers", numbersShrink);
            this.numbers = numbers;
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
         * <p>用户自定义标签列表</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public AgentRecoverCallRequest build() {
            return new AgentRecoverCallRequest(this);
        } 

    } 

}
