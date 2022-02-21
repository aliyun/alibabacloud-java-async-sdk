// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleResponseBody</p>
 */
public class GetRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleInfo")
    private RuleInfo ruleInfo;

    @NameInMap("Success")
    private Boolean success;

    private GetRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.ruleInfo = builder.ruleInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleInfo
     */
    public RuleInfo getRuleInfo() {
        return this.ruleInfo;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private RuleInfo ruleInfo; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleInfo.
         */
        public Builder ruleInfo(RuleInfo ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRuleResponseBody build() {
            return new GetRuleResponseBody(this);
        } 

    } 

    public static class RuleInfo extends TeaModel {
        @NameInMap("CreateUserId")
        private Long createUserId;

        @NameInMap("Created")
        private String created;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Modified")
        private String modified;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("RuleDesc")
        private String ruleDesc;

        @NameInMap("Select")
        private String select;

        @NameInMap("ShortTopic")
        private String shortTopic;

        @NameInMap("Status")
        private String status;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("TopicType")
        private Integer topicType;

        @NameInMap("UtcCreated")
        private String utcCreated;

        @NameInMap("UtcModified")
        private String utcModified;

        @NameInMap("Where")
        private String where;

        private RuleInfo(Builder builder) {
            this.createUserId = builder.createUserId;
            this.created = builder.created;
            this.dataType = builder.dataType;
            this.id = builder.id;
            this.modified = builder.modified;
            this.name = builder.name;
            this.productKey = builder.productKey;
            this.ruleDesc = builder.ruleDesc;
            this.select = builder.select;
            this.shortTopic = builder.shortTopic;
            this.status = builder.status;
            this.topic = builder.topic;
            this.topicType = builder.topicType;
            this.utcCreated = builder.utcCreated;
            this.utcModified = builder.utcModified;
            this.where = builder.where;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfo create() {
            return builder().build();
        }

        /**
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modified
         */
        public String getModified() {
            return this.modified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return select
         */
        public String getSelect() {
            return this.select;
        }

        /**
         * @return shortTopic
         */
        public String getShortTopic() {
            return this.shortTopic;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return topicType
         */
        public Integer getTopicType() {
            return this.topicType;
        }

        /**
         * @return utcCreated
         */
        public String getUtcCreated() {
            return this.utcCreated;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        /**
         * @return where
         */
        public String getWhere() {
            return this.where;
        }

        public static final class Builder {
            private Long createUserId; 
            private String created; 
            private String dataType; 
            private Long id; 
            private String modified; 
            private String name; 
            private String productKey; 
            private String ruleDesc; 
            private String select; 
            private String shortTopic; 
            private String status; 
            private String topic; 
            private Integer topicType; 
            private String utcCreated; 
            private String utcModified; 
            private String where; 

            /**
             * CreateUserId.
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Modified.
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * RuleDesc.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * Select.
             */
            public Builder select(String select) {
                this.select = select;
                return this;
            }

            /**
             * ShortTopic.
             */
            public Builder shortTopic(String shortTopic) {
                this.shortTopic = shortTopic;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * TopicType.
             */
            public Builder topicType(Integer topicType) {
                this.topicType = topicType;
                return this;
            }

            /**
             * UtcCreated.
             */
            public Builder utcCreated(String utcCreated) {
                this.utcCreated = utcCreated;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * Where.
             */
            public Builder where(String where) {
                this.where = where;
                return this;
            }

            public RuleInfo build() {
                return new RuleInfo(this);
            } 

        } 

    }
}
