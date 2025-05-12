// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CheckInstanceSupportRequest} extends {@link RequestModel}
 *
 * <p>CheckInstanceSupportRequest</p>
 */
public class CheckInstanceSupportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<String> instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    private CheckInstanceSupportRequest(Builder builder) {
        super(builder);
        this.instances = builder.instances;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceSupportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<CheckInstanceSupportRequest, Builder> {
        private java.util.List<String> instances; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CheckInstanceSupportRequest request) {
            super(request);
            this.instances = request.instances;
            this.region = request.region;
        } 

        /**
         * instances.
         */
        public Builder instances(java.util.List<String> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public CheckInstanceSupportRequest build() {
            return new CheckInstanceSupportRequest(this);
        } 

    } 

}
