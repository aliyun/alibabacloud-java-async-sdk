// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableInstancePublicAccessResponseBody} extends {@link TeaModel}
 *
 * <p>EnableInstancePublicAccessResponseBody</p>
 */
public class EnableInstancePublicAccessResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private EnableInstancePublicAccessResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInstancePublicAccessResponseBody create() {
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
         * The ID of the bastion host whose Internet access is enabled.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableInstancePublicAccessResponseBody build() {
            return new EnableInstancePublicAccessResponseBody(this);
        } 

    } 

}
