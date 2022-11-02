// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePortRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcePortRequest</p>
 */
public class DescribeResourcePortRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ResourceInstanceId")
    @Validation(required = true)
    private String resourceInstanceId;

    private DescribeResourcePortRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceInstanceId = builder.resourceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePortRequest create() {
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
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeResourcePortRequest, Builder> {
        private String instanceId; 
        private String resourceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcePortRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceInstanceId = request.resourceInstanceId;
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
         * 资源的实例ID
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.putQueryParameter("ResourceInstanceId", resourceInstanceId);
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        @Override
        public DescribeResourcePortRequest build() {
            return new DescribeResourcePortRequest(this);
        } 

    } 

}
