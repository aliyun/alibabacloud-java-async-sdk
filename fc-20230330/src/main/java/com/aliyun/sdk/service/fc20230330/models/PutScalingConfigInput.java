// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link PutScalingConfigInput} extends {@link TeaModel}
 *
 * <p>PutScalingConfigInput</p>
 */
public class PutScalingConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("residentConfig")
    private ResidentConfig residentConfig;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private PutScalingConfigInput(Builder builder) {
        this.residentConfig = builder.residentConfig;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutScalingConfigInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return residentConfig
     */
    public ResidentConfig getResidentConfig() {
        return this.residentConfig;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private ResidentConfig residentConfig; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(PutScalingConfigInput model) {
            this.residentConfig = model.residentConfig;
            this.resourceType = model.resourceType;
        } 

        /**
         * residentConfig.
         */
        public Builder residentConfig(ResidentConfig residentConfig) {
            this.residentConfig = residentConfig;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public PutScalingConfigInput build() {
            return new PutScalingConfigInput(this);
        } 

    } 

}
