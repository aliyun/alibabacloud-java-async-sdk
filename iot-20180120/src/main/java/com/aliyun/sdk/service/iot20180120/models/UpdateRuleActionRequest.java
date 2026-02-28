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
 * {@link UpdateRuleActionRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleActionRequest</p>
 */
public class UpdateRuleActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long actionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UpdateRuleActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.configuration = builder.configuration;
        this.iotInstanceId = builder.iotInstanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public Long getActionId() {
        return this.actionId;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateRuleActionRequest, Builder> {
        private Long actionId; 
        private String configuration; 
        private String iotInstanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleActionRequest request) {
            super(request);
            this.actionId = request.actionId;
            this.configuration = request.configuration;
            this.iotInstanceId = request.iotInstanceId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the rule action to be modified.</p>
         * <p>After you call the <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a> operation to create a rule action, the rule action ID is returned. You can call the <a href="https://help.aliyun.com/document_detail/69517.html">ListRuleActions</a> operation to view the rule action ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000003</p>
         */
        public Builder actionId(Long actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
        }

        /**
         * <p>The configurations of the rule action. The configurations for different rule action types are different. For more information about the configurations for different rule action types, see <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(String configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
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
         * <p>The type of the rule action. Valid values:</p>
         * <ul>
         * <li><strong>MNS</strong>: forwards topic data that is processed by the rules engine to MNS.</li>
         * <li><strong>FC</strong>: forwards topic data that is processed by the rules engine to Function Compute for event computing.</li>
         * <li><strong>REPUBLISH</strong>: forwards topic data that is processed by the rules engine to another IoT Platform topic.</li>
         * <li><strong>AMQP</strong>: forwards data to an AMQP consumer group.</li>
         * <li><strong>OTS</strong>: forwards topic data that is processed by the rules engine to Tablestore for NoSQL data storage.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set the <strong>DataType</strong> parameter to <strong>BINARY</strong>, rules are created in the binary format. These rules cannot be used to forward data to Tablestore.</li>
         * <li>Destination Alibaba Cloud services that are supported by the rules engine vary based on regions. For more information about the regions and destination cloud services that are supported by the rules engine, see <a href="https://help.aliyun.com/document_detail/85669.html">Regions and zones</a>.</li>
         * </ul>
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
        public UpdateRuleActionRequest build() {
            return new UpdateRuleActionRequest(this);
        } 

    } 

}
