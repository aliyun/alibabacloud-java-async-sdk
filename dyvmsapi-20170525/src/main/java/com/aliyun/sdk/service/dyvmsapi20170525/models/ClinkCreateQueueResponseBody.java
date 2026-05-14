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
 * {@link ClinkCreateQueueResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkCreateQueueResponseBody</p>
 */
public class ClinkCreateQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkCreateQueueResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkCreateQueueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkCreateQueueResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClinkCreateQueueResponseBody build() {
            return new ClinkCreateQueueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkCreateQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCreateQueueResponseBody</p>
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
             * <p>7</p>
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
    /**
     * 
     * {@link ClinkCreateQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCreateQueueResponseBody</p>
     */
    public static class Queue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatLocation")
        private Long chatLocation;

        @com.aliyun.core.annotation.NameInMap("ChatMaxWait")
        private Long chatMaxWait;

        @com.aliyun.core.annotation.NameInMap("ChatStrategy")
        private Long chatStrategy;

        @com.aliyun.core.annotation.NameInMap("IbAllowed")
        private Long ibAllowed;

        @com.aliyun.core.annotation.NameInMap("JoinEmpty")
        private Long joinEmpty;

        @com.aliyun.core.annotation.NameInMap("MaxPauseClientFlag")
        private Long maxPauseClientFlag;

        @com.aliyun.core.annotation.NameInMap("MaxPauseClientType")
        private Long maxPauseClientType;

        @com.aliyun.core.annotation.NameInMap("MaxPauseClientValue")
        private Long maxPauseClientValue;

        @com.aliyun.core.annotation.NameInMap("MaxWait")
        private Long maxWait;

        @com.aliyun.core.annotation.NameInMap("MemberTimeout")
        private Long memberTimeout;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("QueueMembers")
        private java.util.List<QueueMembers> queueMembers;

        @com.aliyun.core.annotation.NameInMap("QueueTimeout")
        private Long queueTimeout;

        @com.aliyun.core.annotation.NameInMap("SayCno")
        private Long sayCno;

        @com.aliyun.core.annotation.NameInMap("ServiceLevel")
        private Long serviceLevel;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Long strategy;

        @com.aliyun.core.annotation.NameInMap("VipSupport")
        private Long vipSupport;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        @com.aliyun.core.annotation.NameInMap("WrapupTime")
        private Long wrapupTime;

        private Queue(Builder builder) {
            this.chatLocation = builder.chatLocation;
            this.chatMaxWait = builder.chatMaxWait;
            this.chatStrategy = builder.chatStrategy;
            this.ibAllowed = builder.ibAllowed;
            this.joinEmpty = builder.joinEmpty;
            this.maxPauseClientFlag = builder.maxPauseClientFlag;
            this.maxPauseClientType = builder.maxPauseClientType;
            this.maxPauseClientValue = builder.maxPauseClientValue;
            this.maxWait = builder.maxWait;
            this.memberTimeout = builder.memberTimeout;
            this.name = builder.name;
            this.qno = builder.qno;
            this.queueMembers = builder.queueMembers;
            this.queueTimeout = builder.queueTimeout;
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

        public static Queue create() {
            return builder().build();
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

        public static final class Builder {
            private Long chatLocation; 
            private Long chatMaxWait; 
            private Long chatStrategy; 
            private Long ibAllowed; 
            private Long joinEmpty; 
            private Long maxPauseClientFlag; 
            private Long maxPauseClientType; 
            private Long maxPauseClientValue; 
            private Long maxWait; 
            private Long memberTimeout; 
            private String name; 
            private String qno; 
            private java.util.List<QueueMembers> queueMembers; 
            private Long queueTimeout; 
            private Long sayCno; 
            private Long serviceLevel; 
            private Long strategy; 
            private Long vipSupport; 
            private Long weight; 
            private Long wrapupTime; 

            private Builder() {
            } 

            private Builder(Queue model) {
                this.chatLocation = model.chatLocation;
                this.chatMaxWait = model.chatMaxWait;
                this.chatStrategy = model.chatStrategy;
                this.ibAllowed = model.ibAllowed;
                this.joinEmpty = model.joinEmpty;
                this.maxPauseClientFlag = model.maxPauseClientFlag;
                this.maxPauseClientType = model.maxPauseClientType;
                this.maxPauseClientValue = model.maxPauseClientValue;
                this.maxWait = model.maxWait;
                this.memberTimeout = model.memberTimeout;
                this.name = model.name;
                this.qno = model.qno;
                this.queueMembers = model.queueMembers;
                this.queueTimeout = model.queueTimeout;
                this.sayCno = model.sayCno;
                this.serviceLevel = model.serviceLevel;
                this.strategy = model.strategy;
                this.vipSupport = model.vipSupport;
                this.weight = model.weight;
                this.wrapupTime = model.wrapupTime;
            } 

            /**
             * <p>在线客服排队位置推送(小于该位置则推送)</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder chatLocation(Long chatLocation) {
                this.chatLocation = chatLocation;
                return this;
            }

            /**
             * <p>在线客服最大排队数</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder chatMaxWait(Long chatMaxWait) {
                this.chatMaxWait = chatMaxWait;
                return this;
            }

            /**
             * <p>在线客服分配策略，2：轮选；4：随机；5：技能优先</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder chatStrategy(Long chatStrategy) {
                this.chatStrategy = chatStrategy;
                return this;
            }

            /**
             * <p>是否允许呼入队列，0: 否；1: 是</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ibAllowed(Long ibAllowed) {
                this.ibAllowed = ibAllowed;
                return this;
            }

            /**
             * <p>队列中为空时是否可以join，1: 置忙，2: 通话中，4: 振铃，8: 无效，16: 整理 如选多种状态则传对应数值的和，如选置忙和通话中，值为 3。默认值为 0 即都未选中</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder joinEmpty(Long joinEmpty) {
                this.joinEmpty = joinEmpty;
                return this;
            }

            /**
             * <p>最大并发置忙座席数，开关配置</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder maxPauseClientFlag(Long maxPauseClientFlag) {
                this.maxPauseClientFlag = maxPauseClientFlag;
                return this;
            }

            /**
             * <p>最大并发置忙座席数，配置类型</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder maxPauseClientType(Long maxPauseClientType) {
                this.maxPauseClientType = maxPauseClientType;
                return this;
            }

            /**
             * <p>最大并发置忙座席数，配置值</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder maxPauseClientValue(Long maxPauseClientValue) {
                this.maxPauseClientValue = maxPauseClientValue;
                return this;
            }

            /**
             * <p>最大等待数，设置范围 0-999，0 表示不做任何限制</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxWait(Long maxWait) {
                this.maxWait = maxWait;
                return this;
            }

            /**
             * <p>座席超时时间，取值范围 20-60 秒</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder memberTimeout(Long memberTimeout) {
                this.memberTimeout = memberTimeout;
                return this;
            }

            /**
             * <p>座席名称，只允许输入中文，字母，数字，下划线，长度不超过 20 个字符</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>队列工号，4位数字，要求唯一</p>
             * 
             * <strong>example:</strong>
             * <p>1122</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            /**
             * <p>队列内座席及技能值设置。技能值 1-10，技能值 1 的优先级为最高 cno 队列下座席号 penalty该座席在队列中的优先级</p>
             */
            public Builder queueMembers(java.util.List<QueueMembers> queueMembers) {
                this.queueMembers = queueMembers;
                return this;
            }

            /**
             * <p>队列超时时间，取值范围 30-600 秒</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder queueTimeout(Long queueTimeout) {
                this.queueTimeout = queueTimeout;
                return this;
            }

            /**
             * <p>语音报号(是否报座席号)(1:是 0: 否)</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sayCno(Long sayCno) {
                this.sayCno = sayCno;
                return this;
            }

            /**
             * <p>服务水平秒数，取值范围 10-30 秒，低于此时间内接听的认为是高服务水平</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder serviceLevel(Long serviceLevel) {
                this.serviceLevel = serviceLevel;
                return this;
            }

            /**
             * <p>呼叫策略，1：顺序，2：轮选，3：平均，4：随机，5：技能优先，6：距上一通呼入空闲时间累计最长，7：技能优先+距上一通呼入空闲时间累计最长，8：距上一通呼入空闲时间累计最长(全队列)，9：技能优先+距上一通呼入空闲时间累计最长(全队列)，10：全队列平均，11：技能优先+轮选，12：最长空闲时长，13：技能优先+当前空闲状态时长最长，14：距上一通通话空闲时间累计最长</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder strategy(Long strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>支持VIP级别(VIP客户优先)(0:不支持 1:支持)</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vipSupport(Long vipSupport) {
                this.vipSupport = vipSupport;
                return this;
            }

            /**
             * <p>队列优先级，取值范围 1-10 座席属于多个队列时，优先级高的队列的来电将优先接听；数值越高，优先级越高</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>整理时长，取值范围 3-300 秒，整理期间座席不接受新的呼叫</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder wrapupTime(Long wrapupTime) {
                this.wrapupTime = wrapupTime;
                return this;
            }

            public Queue build() {
                return new Queue(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkCreateQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCreateQueueResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private Queue queue;

        private Data(Builder builder) {
            this.clinkRequestId = builder.clinkRequestId;
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return queue
         */
        public Queue getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private String clinkRequestId; 
            private Queue queue; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clinkRequestId = model.clinkRequestId;
                this.queue = model.queue;
            } 

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(Queue queue) {
                this.queue = queue;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
