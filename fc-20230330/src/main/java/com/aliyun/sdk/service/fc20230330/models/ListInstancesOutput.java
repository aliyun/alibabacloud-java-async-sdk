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
 * {@link ListInstancesOutput} extends {@link TeaModel}
 *
 * <p>ListInstancesOutput</p>
 */
public class ListInstancesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<InstanceInfo> instances;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListInstancesOutput(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<InstanceInfo> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceInfo> instances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstancesOutput model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * instances.
         */
        public Builder instances(java.util.List<InstanceInfo> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesOutput build() {
            return new ListInstancesOutput(this);
        } 

    } 

}
