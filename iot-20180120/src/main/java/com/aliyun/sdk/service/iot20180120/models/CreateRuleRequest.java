// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDesc")
    private String ruleDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Select")
    private String select;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShortTopic")
    private String shortTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicType")
    private Integer topicType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Where")
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

        private Builder(CreateRuleRequest request) {
            super(request);
            this.dataType = request.dataType;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.productKey = request.productKey;
            this.resourceGroupId = request.resourceGroupId;
            this.ruleDesc = request.ruleDesc;
            this.select = request.select;
            this.shortTopic = request.shortTopic;
            this.topic = request.topic;
            this.topicType = request.topicType;
            this.where = request.where;
        } 

        /**
         * <p>The format of the data that is processed based on the rule. The value of this parameter must be consistent with the format of device data that you want to process. Valid values:</p>
         * <ul>
         * <li><strong>JSON</strong>: JSON data. This is the default value.</li>
         * <li><strong>BINARY</strong>: binary data.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is set to <strong>BINARY</strong>, you cannot set the <strong>TopicType</strong> parameter to 0 and cannot forward data to Tablestore and ApsaraDB RDS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the <strong>ID</strong> of the instance.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The name of the data forwarding rule. The rule name must be 1 to 30 characters in length, and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_test1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>a1T27vz****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the rule is assigned. You can view the resource group information in the <a href="https://resourcemanager.console.aliyun.com/resource-groups">Resource Management console</a>.</p>
         * <blockquote>
         * <p>You can specify a value for this parameter only if you have activated Resource Management.</p>
         * </blockquote>
         * <p>If you do not specify this parameter, the rule is assigned to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The description of the rule. The description can be up to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>rule test</p>
         */
        public Builder ruleDesc(String ruleDesc) {
            this.putQueryParameter("RuleDesc", ruleDesc);
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * <p>The SQL SELECT statement that you want to execute. For more information about the syntax, see <a href="https://help.aliyun.com/document_detail/30554.html">SQL statements</a>.</p>
         * <blockquote>
         * <p> This parameter specifies the fields in SELECT statements. For example, if the SELECT statement is <code>SELECT a,b,c</code>, specify <code>a,b,c</code> for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deviceName() as deviceName, items.Humidity.value as Humidity, items.Temperature.value as Temperature</p>
         */
        public Builder select(String select) {
            this.putQueryParameter("Select", select);
            this.select = select;
            return this;
        }

        /**
         * <p>The topic to which this rule is applied. Format: <code>${deviceName}/topicShortName</code>. <code>${deviceName}</code> specifies the name of the device, and <code>topicShortName</code> specifies the custom name of the topic.</p>
         * <ul>
         * <li><p>Basic communication topics or Thing Specification Language (TSL)-based communication topics. Format: <code>${deviceName}/topicShortName</code>. You can replace <code>${deviceName}</code> with the <code>+</code> wildcard character. The wildcard character indicates that the topic applies to all devices under the product. Valid values of <code>topicShortName</code>:</p>
         * <ul>
         * <li><p><code>/thing/event/property/post</code>: submits the property data of a device.</p>
         * </li>
         * <li><p><code>/thing/event/${tsl.event.identifier}/post</code>: submits the event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL model.</p>
         * </li>
         * <li><p><code>/thing/lifecycle</code>: submits device lifecycle changes.</p>
         * </li>
         * <li><p><code>/thing/downlink/reply/message</code>: sends a response to a request from IoT Platform.</p>
         * </li>
         * <li><p><code>/thing/list/found</code>: submits the data when a gateway detects a new sub-device.</p>
         * </li>
         * <li><p><code>/thing/topo/lifecycle</code>: submits device topology changes.</p>
         * </li>
         * <li><p><code>/thing/event/property/history/post</code>: submits the historical property data of a device.</p>
         * </li>
         * <li><p><code>/thing/event/${tsl.event.identifier}/post</code>: submits the historical event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL model.</p>
         * </li>
         * <li><p><code>/ota/upgrade</code>: submits the OTA update status.</p>
         * </li>
         * <li><p><code>/ota/version/post</code>: submits OTA module versions.</p>
         * </li>
         * <li><p><code>/thing/deviceinfo/update</code>: submits device tag changes.</p>
         * </li>
         * <li><p><code>/edge/driver/${driver_id}/point_post</code>: submits pass-through data from Link IoT Edge. <code>${driver_id}</code> specifies the ID of the driver that a device uses to access Link IoT Edge.</p>
         * <p>The <code>${packageId}/${jobId}/ota/job/status</code> topic submits the status of OTA update batches. This topic is a basic communication topic. <code>${packageId}</code> specifies the ID of the update package. <code>${jobId}</code> specifies the ID of the update batch.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Custom topics. Example: <code>${deviceName}/user/get</code>.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation to view all custom topics of the product.</p>
         * <p>When you specify a custom topic, you can use the <code>+</code> and <code>#</code> wildcard characters.</p>
         * <ul>
         * <li><p>You can replace <code>${deviceName}</code> with the <code>+</code> wildcard character. The wildcard character specifies that the topic applies to all devices in the product.</p>
         * </li>
         * <li><p>You can add <code>/user/#</code> after ${deviceName}. The <code>#</code> wildcard character can match all field values at the levels that follow <code>/user</code>.</p>
         * <p>For more information about how to use wildcard characters, see <a href="https://help.aliyun.com/document_detail/85539.html">Custom topics with one or more wildcard characters</a>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Topics that are used to submit device status changes. The topic name is in the <code>${deviceName}</code> format.</p>
         * <p>You can use the <code>+</code> wildcard character. In this case, the status changes of all devices under the product are submitted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>+/thing/event/property/post</p>
         */
        public Builder shortTopic(String shortTopic) {
            this.putQueryParameter("ShortTopic", shortTopic);
            this.shortTopic = shortTopic;
            return this;
        }

        /**
         * <p>The complete topic to which the rule applies.</p>
         * <p>If you specify this parameter, you do not need to specify the <strong>ShortTopic</strong> and <strong>TopicType</strong> parameters.</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <ul>
         * <li><strong>0</strong>: The topic is a basic communication topic or TSL-based communication topic. The topic that is used to submit the status of OTA update batches belongs to the basic communication topics.****</li>
         * <li><strong>1</strong>: a custom topic.</li>
         * <li><strong>2</strong>: The topic is used to submit device status changes. Format: <code>/as/mqtt/status/${productKey}/${deviceName}</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder topicType(Integer topicType) {
            this.putQueryParameter("TopicType", topicType);
            this.topicType = topicType;
            return this;
        }

        /**
         * <p>The condition that is used to trigger the rule. For more information about the rule, see <a href="https://help.aliyun.com/document_detail/30554.html">SQL statements</a>.</p>
         * <blockquote>
         * <p> This parameter specifies the fields in the <strong>WHERE</strong> clause. For example, if the <strong>WHERE</strong> clause is <code>WHERE a &gt; 10</code>, you must specify <code>a &gt; 10</code> for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Temperature&gt;35</p>
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
