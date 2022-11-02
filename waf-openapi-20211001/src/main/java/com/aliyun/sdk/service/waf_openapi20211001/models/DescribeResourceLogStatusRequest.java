// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceLogStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceLogStatusRequest</p>
 */
public class DescribeResourceLogStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Resources")
    @Validation(required = true)
    private String resources;

    private DescribeResourceLogStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceLogStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<DescribeResourceLogStatusRequest, Builder> {
        private String instanceId; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceLogStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resources = request.resources;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public DescribeResourceLogStatusRequest build() {
            return new DescribeResourceLogStatusRequest(this);
        } 

    } 

}
