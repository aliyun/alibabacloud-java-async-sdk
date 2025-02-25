// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateResourceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceInstanceResponseBody</p>
 */
public class UpdateResourceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private UpdateResourceInstanceResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceInstanceResponseBody create() {
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

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 
        private String resourceId; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-i-asdasdasd</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-asdasdasd</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public UpdateResourceInstanceResponseBody build() {
            return new UpdateResourceInstanceResponseBody(this);
        } 

    } 

}
