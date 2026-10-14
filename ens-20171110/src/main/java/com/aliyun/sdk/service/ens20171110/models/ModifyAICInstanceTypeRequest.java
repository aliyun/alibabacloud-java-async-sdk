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
         * <p>One or more environment variables to set during instance initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>[object Object]</p>
         */
        public Builder environmentVar(String environmentVar) {
            this.putQueryParameter("EnvironmentVar", environmentVar);
            this.environmentVar = environmentVar;
            return this;
        }

        /**
         * <p>The refresh rate. Unit: Hz. Valid values:</p>
         * <ul>
         * <li>30</li>
         * <li>60</li>
         * <li>120</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder frequency(Long frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The image ID.</p>
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
         * <p>The ID of the instance whose specifications you want to modify.</p>
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
         * <p>The target AIC container instance specifications.</p>
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
         * <p>The resolution. Valid values:</p>
         * <ul>
         * <li>1920*1080</li>
         * <li>1080*1920</li>
         * <li>1280*720</li>
         * <li>720*1280</li>
         * <li>2400*1080</li>
         * <li>1080*2400</li>
         * <li>1920*864</li>
         * <li>864*1920</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>720*1280</p>
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
