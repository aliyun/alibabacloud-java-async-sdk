// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link BatchUpdateMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateMaliciousFileWhitelistConfigRequest</p>
 */
public class BatchUpdateMaliciousFileWhitelistConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    private BatchUpdateMaliciousFileWhitelistConfigRequest(Builder builder) {
        super(builder);
        this.configList = builder.configList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateMaliciousFileWhitelistConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configList
     */
    public java.util.List<ConfigList> getConfigList() {
        return this.configList;
    }

    public static final class Builder extends Request.Builder<BatchUpdateMaliciousFileWhitelistConfigRequest, Builder> {
        private java.util.List<ConfigList> configList; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateMaliciousFileWhitelistConfigRequest request) {
            super(request);
            this.configList = request.configList;
        } 

        /**
         * <p>The list of whitelist rules for sensitive file alerts in agentless detection.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
            return this;
        }

        @Override
        public BatchUpdateMaliciousFileWhitelistConfigRequest build() {
            return new BatchUpdateMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchUpdateMaliciousFileWhitelistConfigRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateMaliciousFileWhitelistConfigRequest</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        private String fieldValue;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TargetValue")
        private String targetValue;

        private ConfigList(Builder builder) {
            this.configId = builder.configId;
            this.eventName = builder.eventName;
            this.field = builder.field;
            this.fieldValue = builder.fieldValue;
            this.operator = builder.operator;
            this.source = builder.source;
            this.targetType = builder.targetType;
            this.targetValue = builder.targetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return targetValue
         */
        public String getTargetValue() {
            return this.targetValue;
        }

        public static final class Builder {
            private Long configId; 
            private String eventName; 
            private String field; 
            private String fieldValue; 
            private String operator; 
            private String source; 
            private String targetType; 
            private String targetValue; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.configId = model.configId;
                this.eventName = model.eventName;
                this.field = model.field;
                this.fieldValue = model.fieldValue;
                this.operator = model.operator;
                this.source = model.source;
                this.targetType = model.targetType;
                this.targetValue = model.targetValue;
            } 

            /**
             * <p>The ID of the whitelist rule for sensitive file alerts in agentless detection. This parameter is optional. If you do not specify this parameter, a new rule is created. You can call the <a href="~~ListMaliciousFileWhitelistConfigs~~">ListMaliciousFileWhitelistConfigs</a> operation to obtain the ID of the whitelist rule for sensitive files.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The alerting name. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong>: all Alarm Metrics.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The field used to determine the whitelist for sensitive file alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>fileMd5</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The expected field value to be whitelisted.</p>
             * 
             * <strong>example:</strong>
             * <p>b2cf9747ee49d8d9b105cf16e078cc16</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * <p>The operator used to evaluate the rule. Valid values:</p>
             * <ul>
             * <li>strEqual: equal to.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>strEqual</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The business source. Valid values:</p>
             * <ul>
             * <li>agentless: agentless detection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>agentless</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The type of the target to which the rule applies. Valid values:</p>
             * <ul>
             * <li>ALL: all assets.</li>
             * <li>SELECTION_KEY: assets selected by using the asset selection component.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The scope of the target to which the rule applies. Valid values:</p>
             * <ul>
             * <li>ALL: all assets.</li>
             * <li>Other values: the key of the asset scope selected by using the asset selection component.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder targetValue(String targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
