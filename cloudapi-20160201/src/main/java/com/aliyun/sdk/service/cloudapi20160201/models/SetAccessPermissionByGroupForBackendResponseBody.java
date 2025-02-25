// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccessPermissionByGroupForBackendResponseBody} extends {@link TeaModel}
 *
 * <p>SetAccessPermissionByGroupForBackendResponseBody</p>
 */
public class SetAccessPermissionByGroupForBackendResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private SetAccessPermissionByGroupForBackendResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccessPermissionByGroupForBackendResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetAccessPermissionByGroupForBackendResponseBody build() {
            return new SetAccessPermissionByGroupForBackendResponseBody(this);
        } 

    } 

}
