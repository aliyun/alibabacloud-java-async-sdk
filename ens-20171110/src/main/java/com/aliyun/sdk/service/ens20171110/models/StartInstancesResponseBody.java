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
 * {@link StartInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>StartInstancesResponseBody</p>
 */
public class StartInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceResponses")
    private java.util.List<InstanceOperateResponse> instanceResponses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartInstancesResponseBody(Builder builder) {
        this.instanceResponses = builder.instanceResponses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstancesResponseBody create() {
        return builder().build();
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

        public StartInstancesResponseBody build() {
            return new StartInstancesResponseBody(this);
        } 

    } 

}
