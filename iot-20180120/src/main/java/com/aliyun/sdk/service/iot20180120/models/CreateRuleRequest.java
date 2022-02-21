// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @Query
    @NameInMap("DataType")
    private String dataType;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RuleDesc")
    private String ruleDesc;

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

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.productKey = builder.productKey;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleDesc = builder.ruleDesc;
        this.select = builder.select;
        this.shortTopic = builder.shortTopic;
        this.topic = builder.topic;
        this.topicType = builder.topicType;
        this.where = builder.where;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private String dataType; 
        private String iotInstanceId; 
        private String name; 
        private String productKey; 
        private String resourceGroupId; 
        private String ruleDesc; 
        private String select; 
        private String shortTopic; 
        private String topic; 
        private Integer topicType; 
        private String where; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleRequest response) {
            super(response);
            this.dataType = response.dataType;
            this.iotInstanceId = response.iotInstanceId;
            this.name = response.name;
            this.productKey = response.productKey;
            this.resourceGroupId = response.resourceGroupId;
            this.ruleDesc = response.ruleDesc;
            this.select = response.select;
            this.shortTopic = response.shortTopic;
            this.topic = response.topic;
            this.topicType = response.topicType;
            this.where = response.where;
        } 

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

}
