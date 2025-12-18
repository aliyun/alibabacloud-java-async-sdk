// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DryRunConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>DryRunConfigRuleRequest</p>
 */
public class DryRunConfigRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigurationItem")
    private String configurationItem;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private DryRunConfigRuleRequest(Builder builder) {
        super(builder);
        this.configurationItem = builder.configurationItem;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DryRunConfigRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configurationItem
     */
    public String getConfigurationItem() {
        return this.configurationItem;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DryRunConfigRuleRequest, Builder> {
        private String configurationItem; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DryRunConfigRuleRequest request) {
            super(request);
            this.configurationItem = request.configurationItem;
            this.resourceType = request.resourceType;
        } 

        /**
         * ConfigurationItem.
         */
        public Builder configurationItem(String configurationItem) {
            this.putBodyParameter("ConfigurationItem", configurationItem);
            this.configurationItem = configurationItem;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DryRunConfigRuleRequest build() {
            return new DryRunConfigRuleRequest(this);
        } 

    } 

}
