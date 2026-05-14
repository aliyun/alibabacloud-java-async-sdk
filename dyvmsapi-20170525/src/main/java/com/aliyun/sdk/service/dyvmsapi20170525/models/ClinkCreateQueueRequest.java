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
 * {@link ClinkCreateQueueRequest} extends {@link RequestModel}
 *
 * <p>ClinkCreateQueueRequest</p>
 */
public class ClinkCreateQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatLocation")
    private Long chatLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatMaxWait")
    private Long chatMaxWait;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatStrategy")
    private Long chatStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IbAllowed")
    private Long ibAllowed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JoinEmpty")
    private Long joinEmpty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPauseClientFlag")
    private Long maxPauseClientFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPauseClientType")
    private Long maxPauseClientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPauseClientValue")
    private Long maxPauseClientValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxWait")
    private Long maxWait;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberTimeout")
    private Long memberTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueMembers")
    private java.util.List<QueueMembers> queueMembers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueTimeout")
    private Long queueTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SayCno")
    private Long sayCno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceLevel")
    private Long serviceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    private Long strategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VipSupport")
    private Long vipSupport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    private Long weight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WrapupTime")
    private Long wrapupTime;

    private ClinkCreateQueueRequest(Builder builder) {
        super(builder);
        this.chatLocation = builder.chatLocation;
        this.chatMaxWait = builder.chatMaxWait;
        this.chatStrategy = builder.chatStrategy;
        this.enterpriseId = builder.enterpriseId;
        this.ibAllowed = builder.ibAllowed;
        this.joinEmpty = builder.joinEmpty;
        this.maxPauseClientFlag = builder.maxPauseClientFlag;
        this.maxPauseClientType = builder.maxPauseClientType;
        this.maxPauseClientValue = builder.maxPauseClientValue;
        this.maxWait = builder.maxWait;
        this.memberTimeout = builder.memberTimeout;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.qno = builder.qno;
        this.queueMembers = builder.queueMembers;
        this.queueTimeout = builder.queueTimeout;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sayCno = builder.sayCno;
        this.serviceLevel = builder.serviceLevel;
        this.strategy = builder.strategy;
        this.vipSupport = builder.vipSupport;
        this.weight = builder.weight;
        this.wrapupTime = builder.wrapupTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkCreateQueueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatLocation
     */
    public Long getChatLocation() {
        return this.chatLocation;
    }

    /**
     * @return chatMaxWait
     */
    public Long getChatMaxWait() {
        return this.chatMaxWait;
    }

    /**
     * @return chatStrategy
     */
    public Long getChatStrategy() {
        return this.chatStrategy;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return ibAllowed
     */
    public Long getIbAllowed() {
        return this.ibAllowed;
    }

    /**
     * @return joinEmpty
     */
    public Long getJoinEmpty() {
        return this.joinEmpty;
    }

    /**
     * @return maxPauseClientFlag
     */
    public Long getMaxPauseClientFlag() {
        return this.maxPauseClientFlag;
    }

    /**
     * @return maxPauseClientType
     */
    public Long getMaxPauseClientType() {
        return this.maxPauseClientType;
    }

    /**
     * @return maxPauseClientValue
     */
    public Long getMaxPauseClientValue() {
        return this.maxPauseClientValue;
    }

    /**
     * @return maxWait
     */
    public Long getMaxWait() {
        return this.maxWait;
    }

    /**
     * @return memberTimeout
     */
    public Long getMemberTimeout() {
        return this.memberTimeout;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return queueMembers
     */
    public java.util.List<QueueMembers> getQueueMembers() {
        return this.queueMembers;
    }

    /**
     * @return queueTimeout
     */
    public Long getQueueTimeout() {
        return this.queueTimeout;
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
     * @return sayCno
     */
    public Long getSayCno() {
        return this.sayCno;
    }

    /**
     * @return serviceLevel
     */
    public Long getServiceLevel() {
        return this.serviceLevel;
    }

    /**
     * @return strategy
     */
    public Long getStrategy() {
        return this.strategy;
    }

    /**
     * @return vipSupport
     */
    public Long getVipSupport() {
        return this.vipSupport;
    }

    /**
     * @return weight
     */
    public Long getWeight() {
        return this.weight;
    }

    /**
     * @return wrapupTime
     */
    public Long getWrapupTime() {
        return this.wrapupTime;
    }

    public static final class Builder extends Request.Builder<ClinkCreateQueueRequest, Builder> {
        private Long chatLocation; 
        private Long chatMaxWait; 
        private Long chatStrategy; 
        private Long enterpriseId; 
        private Long ibAllowed; 
        private Long joinEmpty; 
        private Long maxPauseClientFlag; 
        private Long maxPauseClientType; 
        private Long maxPauseClientValue; 
        private Long maxWait; 
        private Long memberTimeout; 
        private String name; 
        private Long ownerId; 
        private String qno; 
        private java.util.List<QueueMembers> queueMembers; 
        private Long queueTimeout; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long sayCno; 
        private Long serviceLevel; 
        private Long strategy; 
        private Long vipSupport; 
        private Long weight; 
        private Long wrapupTime; 

        private Builder() {
            super();
        } 

        private Builder(ClinkCreateQueueRequest request) {
            super(request);
            this.chatLocation = request.chatLocation;
            this.chatMaxWait = request.chatMaxWait;
            this.chatStrategy = request.chatStrategy;
            this.enterpriseId = request.enterpriseId;
            this.ibAllowed = request.ibAllowed;
            this.joinEmpty = request.joinEmpty;
            this.maxPauseClientFlag = request.maxPauseClientFlag;
            this.maxPauseClientType = request.maxPauseClientType;
            this.maxPauseClientValue = request.maxPauseClientValue;
            this.maxWait = request.maxWait;
            this.memberTimeout = request.memberTimeout;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.qno = request.qno;
            this.queueMembers = request.queueMembers;
            this.queueTimeout = request.queueTimeout;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sayCno = request.sayCno;
            this.serviceLevel = request.serviceLevel;
            this.strategy = request.strategy;
            this.vipSupport = request.vipSupport;
            this.weight = request.weight;
            this.wrapupTime = request.wrapupTime;
        } 

        /**
         * <p>在线客服排队位置推送(小于该位置则推送)；默认值为 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder chatLocation(Long chatLocation) {
            this.putQueryParameter("ChatLocation", chatLocation);
            this.chatLocation = chatLocation;
            return this;
        }

        /**
         * <p>在线客服最大排队数；默认值为 20</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder chatMaxWait(Long chatMaxWait) {
            this.putQueryParameter("ChatMaxWait", chatMaxWait);
            this.chatMaxWait = chatMaxWait;
            return this;
        }

        /**
         * <p>在线客服分配策略，2：轮选；4：随机；5：技能优先；默认值为 2</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder chatStrategy(Long chatStrategy) {
            this.putQueryParameter("ChatStrategy", chatStrategy);
            this.chatStrategy = chatStrategy;
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
         * <p>是否允许呼入队列，0: 否；1: 是；默认值为 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ibAllowed(Long ibAllowed) {
            this.putQueryParameter("IbAllowed", ibAllowed);
            this.ibAllowed = ibAllowed;
            return this;
        }

        /**
         * <p>队列中为空时是否可以join，1: 置忙；2: 通话中；4: 振铃；8: 无效；16: 整理 如选多种状态则传对应数值的和，如选置忙和通话中，值为 3。默认值为 0，即都未选中</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder joinEmpty(Long joinEmpty) {
            this.putQueryParameter("JoinEmpty", joinEmpty);
            this.joinEmpty = joinEmpty;
            return this;
        }

        /**
         * <p>最大并发置忙座席数，开关配置，0:关闭，1:开启；默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxPauseClientFlag(Long maxPauseClientFlag) {
            this.putQueryParameter("MaxPauseClientFlag", maxPauseClientFlag);
            this.maxPauseClientFlag = maxPauseClientFlag;
            return this;
        }

        /**
         * <p>最大并发置忙座席数，配置类型，0:百分比，1:数值；默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxPauseClientType(Long maxPauseClientType) {
            this.putQueryParameter("MaxPauseClientType", maxPauseClientType);
            this.maxPauseClientType = maxPauseClientType;
            return this;
        }

        /**
         * <p>最大并发置忙座席数，配置值，当配置类型为百分比时最大值为100，默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxPauseClientValue(Long maxPauseClientValue) {
            this.putQueryParameter("MaxPauseClientValue", maxPauseClientValue);
            this.maxPauseClientValue = maxPauseClientValue;
            return this;
        }

        /**
         * <p>最大等待数，设置范围 0-999，0 表示不做任何限制。默认值为 5</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxWait(Long maxWait) {
            this.putQueryParameter("MaxWait", maxWait);
            this.maxWait = maxWait;
            return this;
        }

        /**
         * <p>座席超时时间，取值范围 20-60 秒。默认值为 25</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        public Builder memberTimeout(Long memberTimeout) {
            this.putQueryParameter("MemberTimeout", memberTimeout);
            this.memberTimeout = memberTimeout;
            return this;
        }

        /**
         * <p>队列名称，只允许输入中文，字母，数字，下划线，长度不超过 20 个字符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>队列工号，4 位数字，要求唯一</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder qno(String qno) {
            this.putQueryParameter("Qno", qno);
            this.qno = qno;
            return this;
        }

        /**
         * <p>队列内座席及技能值设置。技能值 1-10，技能值 1 的优先级为最高 cno 队列下座席号 penalty该座席在队列中的优先级</p>
         */
        public Builder queueMembers(java.util.List<QueueMembers> queueMembers) {
            String queueMembersShrink = shrink(queueMembers, "QueueMembers", "json");
            this.putQueryParameter("QueueMembers", queueMembersShrink);
            this.queueMembers = queueMembers;
            return this;
        }

        /**
         * <p>队列超时时间，取值范围 30-600 秒。默认值为 600</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        public Builder queueTimeout(Long queueTimeout) {
            this.putQueryParameter("QueueTimeout", queueTimeout);
            this.queueTimeout = queueTimeout;
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
         * <p>是否报座席号，0: 否；1:是；默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sayCno(Long sayCno) {
            this.putQueryParameter("SayCno", sayCno);
            this.sayCno = sayCno;
            return this;
        }

        /**
         * <p>服务水平秒数，取值范围 10-30 秒，低于此时间内接听的认为是高服务水平。默认值为 15</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder serviceLevel(Long serviceLevel) {
            this.putQueryParameter("ServiceLevel", serviceLevel);
            this.serviceLevel = serviceLevel;
            return this;
        }

        /**
         * <p>呼叫策略， 1：顺序，2：轮选，3：平均，4：随机，5：技能优先，6：距上一通呼入空闲时间累计最长，7：技能优先+距上一通呼入空闲时间累计最长，8：距上一通呼入空闲时间累计最长(全队列)，9：技能优先+距上一通呼入空闲时间累计最长(全队列)，10：全队列平均，11：技能优先+轮选，12：最长空闲时长，13：技能优先+当前空闲状态时长最长，14：距上一通通话空闲时间累计最长，默认值为 2</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder strategy(Long strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>VIP客户优先，0:不支持；1:支持；默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vipSupport(Long vipSupport) {
            this.putQueryParameter("VipSupport", vipSupport);
            this.vipSupport = vipSupport;
            return this;
        }

        /**
         * <p>队列优先级，取值范围 1-10。默认值为 1 座席属于多个队列时，优先级高的队列的来电将优先接听；数值越高，优先级越高</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder weight(Long weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        /**
         * <p>整理时长，取值范围 3-300 秒，整理期间座席不接受新的呼叫。默认值为 15</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder wrapupTime(Long wrapupTime) {
            this.putQueryParameter("WrapupTime", wrapupTime);
            this.wrapupTime = wrapupTime;
            return this;
        }

        @Override
        public ClinkCreateQueueRequest build() {
            return new ClinkCreateQueueRequest(this);
        } 

    } 

    /**
     * 
     * {@link ClinkCreateQueueRequest} extends {@link TeaModel}
     *
     * <p>ClinkCreateQueueRequest</p>
     */
    public static class QueueMembers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("Penalty")
        private Long penalty;

        private QueueMembers(Builder builder) {
            this.cno = builder.cno;
            this.penalty = builder.penalty;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueMembers create() {
            return builder().build();
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return penalty
         */
        public Long getPenalty() {
            return this.penalty;
        }

        public static final class Builder {
            private String cno; 
            private Long penalty; 

            private Builder() {
            } 

            private Builder(QueueMembers model) {
                this.cno = model.cno;
                this.penalty = model.penalty;
            } 

            /**
             * <p>队列下座席号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>该座席在队列中的优先级</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder penalty(Long penalty) {
                this.penalty = penalty;
                return this;
            }

            public QueueMembers build() {
                return new QueueMembers(this);
            } 

        } 

    }
}
