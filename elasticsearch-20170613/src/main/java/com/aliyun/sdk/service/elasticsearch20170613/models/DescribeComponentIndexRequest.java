// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentIndexRequest} extends {@link RequestModel}
 *
 * <p>DescribeComponentIndexRequest</p>
 */
public class DescribeComponentIndexRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("name")
    private String name;

    private DescribeComponentIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentIndexRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeComponentIndexRequest, Builder> {
        private String instanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComponentIndexRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.name = response.name;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeComponentIndexRequest build() {
            return new DescribeComponentIndexRequest(this);
        } 

    } 

}
