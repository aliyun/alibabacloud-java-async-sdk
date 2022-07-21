// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleRequest</p>
 */
public class UpdateRuleRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("RuleDesc")
    private String ruleDesc;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("Select")
    private String select;

    @Query
    @NameInMap("ShortTopic")
    private String shortTopic;

    @Query
    @NameInMap("Topic")
    private String topic;

    @Query
    @NameInMap("TopicType")
    private Integer topicType;

    @Query
    @NameInMap("Where")
    private String where;

    private UpdateRuleRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.productKey = builder.productKey;
        this.ruleDesc = builder.ruleDesc;
        this.ruleId = builder.ruleId;
        this.select = builder.select;
        this.shortTopic = builder.shortTopic;
        this.topic = builder.topic;
        this.topicType = builder.topicType;
        this.where = builder.where;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
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
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
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
     * @return where
     */
    public String getWhere() {
        return this.where;
    }

    public static final class Builder extends Request.Builder<UpdateRuleRequest, Builder> {
        private String iotInstanceId; 
        private String name; 
        private String productKey; 
        private String ruleDesc; 
        private Long ruleId; 
        private String select; 
        private String shortTopic; 
        private String topic; 
        private Integer topicType; 
        private String where; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.productKey = request.productKey;
            this.ruleDesc = request.ruleDesc;
            this.ruleId = request.ruleId;
            this.select = request.select;
            this.shortTopic = request.shortTopic;
            this.topic = request.topic;
            this.topicType = request.topicType;
            this.where = request.where;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * RuleDesc.
         */
        public Builder ruleDesc(String ruleDesc) {
            this.putQueryParameter("RuleDesc", ruleDesc);
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Select.
         */
        public Builder select(String select) {
            this.putQueryParameter("Select", select);
            this.select = select;
            return this;
        }

        /**
         * ShortTopic.
         */
        public Builder shortTopic(String shortTopic) {
            this.putQueryParameter("ShortTopic", shortTopic);
            this.shortTopic = shortTopic;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * TopicType.
         */
        public Builder topicType(Integer topicType) {
            this.putQueryParameter("TopicType", topicType);
            this.topicType = topicType;
            return this;
        }

        /**
         * Where.
         */
        public Builder where(String where) {
            this.putQueryParameter("Where", where);
            this.where = where;
            return this;
        }

        @Override
        public UpdateRuleRequest build() {
            return new UpdateRuleRequest(this);
        } 

    } 

}
