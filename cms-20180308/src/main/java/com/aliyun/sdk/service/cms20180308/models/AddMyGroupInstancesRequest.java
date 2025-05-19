// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link AddMyGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>AddMyGroupInstancesRequest</p>
 */
public class AddMyGroupInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    private String instances;

    private AddMyGroupInstancesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMyGroupInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instances
     */
    public String getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<AddMyGroupInstancesRequest, Builder> {
        private Long groupId; 
        private String instances; 

        private Builder() {
            super();
        } 

        private Builder(AddMyGroupInstancesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instances = request.instances;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(String instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public AddMyGroupInstancesRequest build() {
            return new AddMyGroupInstancesRequest(this);
        } 

    } 

}
