// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateMaliciousFileWhitelistConfigRequest</p>
 */
public class CreateMaliciousFileWhitelistConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    private String targetValue;

    private CreateMaliciousFileWhitelistConfigRequest(Builder builder) {
        super(builder);
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

    public static CreateMaliciousFileWhitelistConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateMaliciousFileWhitelistConfigRequest, Builder> {
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

        private Builder(CreateMaliciousFileWhitelistConfigRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.field = request.field;
            this.fieldValue = request.fieldValue;
            this.operator = request.operator;
            this.source = request.source;
            this.targetType = request.targetType;
            this.targetValue = request.targetValue;
        } 

        /**
         * <p>The name of the alert.</p>
         * <ul>
         * <li>Set the value to ALL, which indicates all alert types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The field that you want to use in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>fileMd5</p>
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * <p>The value of the field that you want to use in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>b2cf9747ee49d8d9b105cf16e078cc16</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>The logical operator that you want to use in the whitelist rule.</p>
         * <ul>
         * <li>Set the value to strEqual, which indicates the equality operator (=).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>strEqual</p>
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>The feature to which this operation belongs.</p>
         * <ul>
         * <li>Set the value to agentless, which indicates the agentless detection feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The type of the assets on which you want the whitelist rule to take effect. Valid values:</p>
         * <ul>
         * <li>ALL: all assets</li>
         * <li>SELECTION_KEY: selected assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The assets on which you want the whitelist rule to take effect. Valid values:</p>
         * <ul>
         * <li>ALL: all assets</li>
         * <li>Others: selected assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public CreateMaliciousFileWhitelistConfigRequest build() {
            return new CreateMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

}
