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
 * {@link ReinitInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ReinitInstancesResponseBody</p>
 */
public class ReinitInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceResponses")
    private java.util.List<InstanceOperateResponse> instanceResponses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReinitInstancesResponseBody(Builder builder) {
        this.instanceResponses = builder.instanceResponses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReinitInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceResponses
     */
    public java.util.List<InstanceOperateResponse> getInstanceResponses() {
        return this.instanceResponses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceOperateResponse> instanceResponses; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReinitInstancesResponseBody model) {
            this.instanceResponses = model.instanceResponses;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceResponses.
         */
        public Builder instanceResponses(java.util.List<InstanceOperateResponse> instanceResponses) {
            this.instanceResponses = instanceResponses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReinitInstancesResponseBody build() {
            return new ReinitInstancesResponseBody(this);
        } 

    } 

}
