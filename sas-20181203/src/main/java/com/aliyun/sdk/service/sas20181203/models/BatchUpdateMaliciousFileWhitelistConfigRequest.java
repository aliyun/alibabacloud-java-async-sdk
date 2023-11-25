// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateMaliciousFileWhitelistConfigRequest</p>
 */
public class BatchUpdateMaliciousFileWhitelistConfigRequest extends Request {
    @Query
    @NameInMap("ConfigList")
    private java.util.List < ConfigList> configList;

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
    public java.util.List < ConfigList> getConfigList() {
        return this.configList;
    }

    public static final class Builder extends Request.Builder<BatchUpdateMaliciousFileWhitelistConfigRequest, Builder> {
        private java.util.List < ConfigList> configList; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateMaliciousFileWhitelistConfigRequest request) {
            super(request);
            this.configList = request.configList;
        } 

        /**
         * ConfigList.
         */
        public Builder configList(java.util.List < ConfigList> configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
            return this;
        }

        @Override
        public BatchUpdateMaliciousFileWhitelistConfigRequest build() {
            return new BatchUpdateMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

    public static class ConfigList extends TeaModel {
        @NameInMap("ConfigId")
        private Long configId;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("Field")
        private String field;

        @NameInMap("FieldValue")
        private String fieldValue;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Source")
        private String source;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TargetValue")
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

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * FieldValue.
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * TargetValue.
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
