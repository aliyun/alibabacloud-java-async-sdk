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
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

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
        this.remark = builder.remark;
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
        private String remark; 
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
            this.remark = request.remark;
            this.source = request.source;
            this.targetType = request.targetType;
            this.targetValue = request.targetValue;
        } 

        /**
         * <p>Alert name:</p>
         * <ul>
         * <li>ALL: All alerts</li>
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
         * <p>Field used for whitelist in sensitive file alerts.</p>
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
         * <p>Expected value of the field to be whitelisted.</p>
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
         * <p>Rule judgment operator:</p>
         * <ul>
         * <li>strEqual: String equals</li>
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
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>whitelist</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Business source:</p>
         * <ul>
         * <li>agentless: Agentless detection</li>
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
         * <p>Effective target type:</p>
         * <ul>
         * <li>ALL: All assets</li>
         * <li>SELECTION_KEY: Assets selected via the asset selection component</li>
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
         * <p>Target effective scope:</p>
         * <ul>
         * <li>ALL: All assets</li>
         * <li>Other: Key of the asset range selected by the asset selection component</li>
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
