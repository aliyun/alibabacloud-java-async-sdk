// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceGroupRequest</p>
 */
public class CreateDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicOperator")
    @Deprecated
    private String dynamicOperator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicRule")
    private Rule dynamicRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateDeviceGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dynamicOperator = builder.dynamicOperator;
        this.dynamicRule = builder.dynamicRule;
        this.groupType = builder.groupType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dynamicOperator
     */
    public String getDynamicOperator() {
        return this.dynamicOperator;
    }

    /**
     * @return dynamicRule
     */
    public Rule getDynamicRule() {
        return this.dynamicRule;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateDeviceGroupRequest, Builder> {
        private String description; 
        private String dynamicOperator; 
        private Rule dynamicRule; 
        private String groupType; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceGroupRequest request) {
            super(request);
            this.description = request.description;
            this.dynamicOperator = request.dynamicOperator;
            this.dynamicRule = request.dynamicRule;
            this.groupType = request.groupType;
            this.name = request.name;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DynamicOperator.
         */
        public Builder dynamicOperator(String dynamicOperator) {
            this.putBodyParameter("DynamicOperator", dynamicOperator);
            this.dynamicOperator = dynamicOperator;
            return this;
        }

        /**
         * DynamicRule.
         */
        public Builder dynamicRule(Rule dynamicRule) {
            String dynamicRuleShrink = shrink(dynamicRule, "DynamicRule", "json");
            this.putBodyParameter("DynamicRule", dynamicRuleShrink);
            this.dynamicRule = dynamicRule;
            return this;
        }

        /**
         * GroupType.
         */
        public Builder groupType(String groupType) {
            this.putBodyParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateDeviceGroupRequest build() {
            return new CreateDeviceGroupRequest(this);
        } 

    } 

}
