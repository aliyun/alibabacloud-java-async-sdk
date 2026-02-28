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
 * {@link CreateRuleActionRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleActionRequest</p>
 */
public class CreateRuleActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorActionFlag")
    private Boolean errorActionFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateRuleActionRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.errorActionFlag = builder.errorActionFlag;
        this.iotInstanceId = builder.iotInstanceId;
        this.ruleId = builder.ruleId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return errorActionFlag
     */
    public Boolean getErrorActionFlag() {
        return this.errorActionFlag;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateRuleActionRequest, Builder> {
        private String configuration; 
        private Boolean errorActionFlag; 
        private String iotInstanceId; 
        private Long ruleId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleActionRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.errorActionFlag = request.errorActionFlag;
            this.iotInstanceId = request.iotInstanceId;
            this.ruleId = request.ruleId;
            this.type = request.type;
        } 

        /**
         * <p>The configurations of the rule action. You must specify a JSON string. The configurations vary based on the types of rule actions. For more information about required syntax and examples, see the following tables.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(String configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>Specifies whether the rule action forwards error operation data. Error operation data is generated when the rules engine failed to forward data from the IoT Platform topic to the destination cloud service. A data forwarding failure indicates that forwarding retries also fail. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: forwards error operation data.</li>
         * <li><strong>false</strong>: forwards normal data instead of error operation data.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder errorActionFlag(Boolean errorActionFlag) {
            this.putQueryParameter("ErrorActionFlag", errorActionFlag);
            this.errorActionFlag = errorActionFlag;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
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
         * <p>The ID of the rule for which you want to create an action. You can log on to the IoT Platform console, and choose <strong>Rules</strong> &gt; <strong>Data Forwarding</strong> to view the rule ID. You can also call the <a href="https://help.aliyun.com/document_detail/69486.html">ListRule</a> operation and view the rule ID in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The type of the rule action. Valid values:</p>
         * <ul>
         * <li><strong>REPUBLISH</strong>: forwards topic data that is processed by the rules engine to another IoT Platform topic.</li>
         * <li><strong>AMQP</strong>: forwards data to an AMQP consumer group.</li>
         * <li><strong>MNS</strong>: forwards data that is processed by the rules engine to Message Service (MNS).</li>
         * <li><strong>FC</strong>: forwards topic data that is processed by the rules engine to Function Compute for event computing.</li>
         * <li><strong>OTS</strong>: forwards data that is processed by the rules engine to OTS for NoSQL data storage.</li>
         * </ul>
         * <blockquote>
         * <p> If you set the <strong>DataType</strong> parameter to <strong>BINARY</strong>, rules are created in the binary format. These rules cannot be used to forward data to Tablestore.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REPUBLISH</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateRuleActionRequest build() {
            return new CreateRuleActionRequest(this);
        } 

    } 

}
