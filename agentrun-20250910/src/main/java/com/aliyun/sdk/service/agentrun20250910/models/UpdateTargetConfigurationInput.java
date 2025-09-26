// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateTargetConfigurationInput} extends {@link TeaModel}
 *
 * <p>UpdateTargetConfigurationInput</p>
 */
public class UpdateTargetConfigurationInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("targetConfiguration")
    private TargetConfiguration targetConfiguration;

    private UpdateTargetConfigurationInput(Builder builder) {
        this.domainId = builder.domainId;
        this.targetConfiguration = builder.targetConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTargetConfigurationInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return targetConfiguration
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    public static final class Builder {
        private String domainId; 
        private TargetConfiguration targetConfiguration; 

        private Builder() {
        } 

        private Builder(UpdateTargetConfigurationInput model) {
            this.domainId = model.domainId;
            this.targetConfiguration = model.targetConfiguration;
        } 

        /**
         * domainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * targetConfiguration.
         */
        public Builder targetConfiguration(TargetConfiguration targetConfiguration) {
            this.targetConfiguration = targetConfiguration;
            return this;
        }

        public UpdateTargetConfigurationInput build() {
            return new UpdateTargetConfigurationInput(this);
        } 

    } 

}
