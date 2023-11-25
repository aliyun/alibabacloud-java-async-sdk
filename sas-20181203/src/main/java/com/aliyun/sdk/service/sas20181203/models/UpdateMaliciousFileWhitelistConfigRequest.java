// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateMaliciousFileWhitelistConfigRequest</p>
 */
public class UpdateMaliciousFileWhitelistConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("EventName")
    private String eventName;

    @Query
    @NameInMap("Field")
    private String field;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("Operator")
    private String operator;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("TargetValue")
    private String targetValue;

    private UpdateMaliciousFileWhitelistConfigRequest(Builder builder) {
        super(builder);
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

    public static UpdateMaliciousFileWhitelistConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateMaliciousFileWhitelistConfigRequest, Builder> {
        private Long configId; 
        private String eventName; 
        private String field; 
        private String fieldValue; 
        private String operator; 
        private String source; 
        private String targetType; 
        private String targetValue; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMaliciousFileWhitelistConfigRequest request) {
            super(request);
            this.configId = request.configId;
            this.eventName = request.eventName;
            this.field = request.field;
            this.fieldValue = request.fieldValue;
            this.operator = request.operator;
            this.source = request.source;
            this.targetType = request.targetType;
            this.targetValue = request.targetValue;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * FieldValue.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * TargetValue.
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public UpdateMaliciousFileWhitelistConfigRequest build() {
            return new UpdateMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

}
