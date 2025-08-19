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
 * {@link PutScalingConfigOutput} extends {@link TeaModel}
 *
 * <p>PutScalingConfigOutput</p>
 */
public class PutScalingConfigOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("residentConfig")
    private ResidentConfig residentConfig;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private PutScalingConfigOutput(Builder builder) {
        this.functionName = builder.functionName;
        this.qualifier = builder.qualifier;
        this.residentConfig = builder.residentConfig;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutScalingConfigOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
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
        private String functionName; 
        private String qualifier; 
        private ResidentConfig residentConfig; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(PutScalingConfigOutput model) {
            this.functionName = model.functionName;
            this.qualifier = model.qualifier;
            this.residentConfig = model.residentConfig;
            this.resourceType = model.resourceType;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
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

        public PutScalingConfigOutput build() {
            return new PutScalingConfigOutput(this);
        } 

    } 

}
