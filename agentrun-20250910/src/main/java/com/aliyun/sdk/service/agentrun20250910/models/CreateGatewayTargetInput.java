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
 * {@link CreateGatewayTargetInput} extends {@link TeaModel}
 *
 * <p>CreateGatewayTargetInput</p>
 */
public class CreateGatewayTargetInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("targetConfiguration")
    private TargetConfiguration targetConfiguration;

    private CreateGatewayTargetInput(Builder builder) {
        this.domainId = builder.domainId;
        this.name = builder.name;
        this.targetConfiguration = builder.targetConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayTargetInput create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return targetConfiguration
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    public static final class Builder {
        private String domainId; 
        private String name; 
        private TargetConfiguration targetConfiguration; 

        private Builder() {
        } 

        private Builder(CreateGatewayTargetInput model) {
            this.domainId = model.domainId;
            this.name = model.name;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * targetConfiguration.
         */
        public Builder targetConfiguration(TargetConfiguration targetConfiguration) {
            this.targetConfiguration = targetConfiguration;
            return this;
        }

        public CreateGatewayTargetInput build() {
            return new CreateGatewayTargetInput(this);
        } 

    } 

}
