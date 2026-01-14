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
 * {@link AgentCallListRequest} extends {@link RequestModel}
 *
 * <p>AgentCallListRequest</p>
 */
public class AgentCallListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private Long agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTag")
    private String agentTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCallDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endCallDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberMD5s")
    private java.util.List<String> numberMD5s;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Numbers")
    private java.util.List<String> numbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    private AgentCallListRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentTag = builder.agentTag;
        this.callDate = builder.callDate;
        this.endCallDate = builder.endCallDate;
        this.numberMD5s = builder.numberMD5s;
        this.numbers = builder.numbers;
        this.ownerId = builder.ownerId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentCallListRequest create() {
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
     * @return callDate
     */
    public String getCallDate() {
        return this.callDate;
    }

    /**
     * @return endCallDate
     */
    public String getEndCallDate() {
        return this.endCallDate;
    }

    /**
     * @return numberMD5s
     */
    public java.util.List<String> getNumberMD5s() {
        return this.numberMD5s;
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
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AgentCallListRequest, Builder> {
        private Long agentId; 
        private String agentTag; 
        private String callDate; 
        private String endCallDate; 
        private java.util.List<String> numberMD5s; 
        private java.util.List<String> numbers; 
        private Long ownerId; 
        private Long page; 
        private Long pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> tags; 

        private Builder() {
            super();
        } 

        private Builder(AgentCallListRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentTag = request.agentTag;
            this.callDate = request.callDate;
            this.endCallDate = request.endCallDate;
            this.numberMD5s = request.numberMD5s;
            this.numbers = request.numbers;
            this.ownerId = request.ownerId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
        } 

        /**
         * <p>坐席ID</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
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
         * <p>abcd</p>
         */
        public Builder agentTag(String agentTag) {
            this.putQueryParameter("AgentTag", agentTag);
            this.agentTag = agentTag;
            return this;
        }

        /**
         * <p>开始外呼时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-06 10:10:10</p>
         */
        public Builder callDate(String callDate) {
            this.putQueryParameter("CallDate", callDate);
            this.callDate = callDate;
            return this;
        }

        /**
         * <p>结束外呼时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-07 10:10:10</p>
         */
        public Builder endCallDate(String endCallDate) {
            this.putQueryParameter("EndCallDate", endCallDate);
            this.endCallDate = endCallDate;
            return this;
        }

        /**
         * <p>号码MD5列表</p>
         */
        public Builder numberMD5s(java.util.List<String> numberMD5s) {
            String numberMD5sShrink = shrink(numberMD5s, "NumberMD5s", "json");
            this.putQueryParameter("NumberMD5s", numberMD5sShrink);
            this.numberMD5s = numberMD5s;
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
         * <p>页数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>每页外呼记录数</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder pageSize(Long pageSize) {
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
         * <p>用户自定义标签列表</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public AgentCallListRequest build() {
            return new AgentCallListRequest(this);
        } 

    } 

}
