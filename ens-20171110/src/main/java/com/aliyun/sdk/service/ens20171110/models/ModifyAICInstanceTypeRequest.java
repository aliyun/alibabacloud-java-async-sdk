// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ModifyAICInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAICInstanceTypeRequest</p>
 */
public class ModifyAICInstanceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentVar")
    private String environmentVar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private Long frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    private ModifyAICInstanceTypeRequest(Builder builder) {
        super(builder);
        this.environmentVar = builder.environmentVar;
        this.frequency = builder.frequency;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.resolution = builder.resolution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAICInstanceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentVar
     */
    public String getEnvironmentVar() {
        return this.environmentVar;
    }

    /**
     * @return frequency
     */
    public Long getFrequency() {
        return this.frequency;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    public static final class Builder extends Request.Builder<ModifyAICInstanceTypeRequest, Builder> {
        private String environmentVar; 
        private Long frequency; 
        private String imageId; 
        private String instanceId; 
        private String instanceType; 
        private String resolution; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAICInstanceTypeRequest request) {
            super(request);
            this.environmentVar = request.environmentVar;
            this.frequency = request.frequency;
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.resolution = request.resolution;
        } 

        /**
         * EnvironmentVar.
         */
        public Builder environmentVar(String environmentVar) {
            this.putQueryParameter("EnvironmentVar", environmentVar);
            this.environmentVar = environmentVar;
            return this;
        }

        /**
         * Frequency.
         */
        public Builder frequency(Long frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImage ID</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-xxxx-0</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aic.cf52r.c1.np</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Resolution.
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        @Override
        public ModifyAICInstanceTypeRequest build() {
            return new ModifyAICInstanceTypeRequest(this);
        } 

    } 

}
