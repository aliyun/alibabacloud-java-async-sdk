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
 * {@link UpdateDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceGroupRequest</p>
 */
public class UpdateDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    private String deviceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicOperator")
    @Deprecated
    private String dynamicOperator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicRule")
    private Rule dynamicRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateDeviceGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.deviceGroupId = builder.deviceGroupId;
        this.dynamicOperator = builder.dynamicOperator;
        this.dynamicRule = builder.dynamicRule;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceGroupRequest create() {
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
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceGroupRequest, Builder> {
        private String description; 
        private String deviceGroupId; 
        private String dynamicOperator; 
        private Rule dynamicRule; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceGroupRequest request) {
            super(request);
            this.description = request.description;
            this.deviceGroupId = request.deviceGroupId;
            this.dynamicOperator = request.dynamicOperator;
            this.dynamicRule = request.dynamicRule;
            this.name = request.name;
        } 

        /**
         * <p>The description of the device label. Set this parameter to an empty string to clear the description. The description can contain letters, digits, Chinese characters, spaces, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>Test device group description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the device label.</p>
         * 
         * <strong>example:</strong>
         * <p>device-group-5191cf830a5e****</p>
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putBodyParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * <p>The operator of the dynamic device group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder dynamicOperator(String dynamicOperator) {
            this.putBodyParameter("DynamicOperator", dynamicOperator);
            this.dynamicOperator = dynamicOperator;
            return this;
        }

        /**
         * <p>The matching rule of the dynamic device label.</p>
         */
        public Builder dynamicRule(Rule dynamicRule) {
            String dynamicRuleShrink = shrink(dynamicRule, "DynamicRule", "json");
            this.putBodyParameter("DynamicRule", dynamicRuleShrink);
            this.dynamicRule = dynamicRule;
            return this;
        }

        /**
         * <p>The name of the device label. The name must be 1 to 128 characters in length and can contain letters, digits, Chinese characters, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
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
        public UpdateDeviceGroupRequest build() {
            return new UpdateDeviceGroupRequest(this);
        } 

    } 

}
