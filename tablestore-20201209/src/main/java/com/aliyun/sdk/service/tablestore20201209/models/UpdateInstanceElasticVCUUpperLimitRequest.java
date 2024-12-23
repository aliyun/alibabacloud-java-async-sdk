// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link UpdateInstanceElasticVCUUpperLimitRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceElasticVCUUpperLimitRequest</p>
 */
public class UpdateInstanceElasticVCUUpperLimitRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticVCUUpperLimit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float elasticVCUUpperLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    private UpdateInstanceElasticVCUUpperLimitRequest(Builder builder) {
        super(builder);
        this.elasticVCUUpperLimit = builder.elasticVCUUpperLimit;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceElasticVCUUpperLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticVCUUpperLimit
     */
    public Float getElasticVCUUpperLimit() {
        return this.elasticVCUUpperLimit;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceElasticVCUUpperLimitRequest, Builder> {
        private Float elasticVCUUpperLimit; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceElasticVCUUpperLimitRequest request) {
            super(request);
            this.elasticVCUUpperLimit = request.elasticVCUUpperLimit;
            this.instanceName = request.instanceName;
        } 

        /**
         * <p>The upper limit for the VCUs of the instance.</p>
         * <blockquote>
         * <p> Valid values of the upper limit for the VCUs of an instance: <strong>Number of reserved VCUs+0.1 to 2000</strong>. You can upgrade or downgrade configurations to modify the number of reserved VCUs by increments or decrements of 1. You can dynamically modify the upper limit for the VCUs of an instance by increments or decrements of 0.1</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder elasticVCUUpperLimit(Float elasticVCUUpperLimit) {
            this.putBodyParameter("ElasticVCUUpperLimit", elasticVCUUpperLimit);
            this.elasticVCUUpperLimit = elasticVCUUpperLimit;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workshop-bj-ots1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public UpdateInstanceElasticVCUUpperLimitRequest build() {
            return new UpdateInstanceElasticVCUUpperLimitRequest(this);
        } 

    } 

}
