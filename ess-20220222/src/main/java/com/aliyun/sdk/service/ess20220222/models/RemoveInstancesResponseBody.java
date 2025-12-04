// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link RemoveInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveInstancesResponseBody</p>
 */
public class RemoveInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IgnoredInstances")
    private java.util.List<IgnoredInstances> ignoredInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private RemoveInstancesResponseBody(Builder builder) {
        this.ignoredInstances = builder.ignoredInstances;
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ignoredInstances
     */
    public java.util.List<IgnoredInstances> getIgnoredInstances() {
        return this.ignoredInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder {
        private java.util.List<IgnoredInstances> ignoredInstances; 
        private String requestId; 
        private String scalingActivityId; 

        private Builder() {
        } 

        private Builder(RemoveInstancesResponseBody model) {
            this.ignoredInstances = model.ignoredInstances;
            this.requestId = model.requestId;
            this.scalingActivityId = model.scalingActivityId;
        } 

        /**
         * IgnoredInstances.
         */
        public Builder ignoredInstances(java.util.List<IgnoredInstances> ignoredInstances) {
            this.ignoredInstances = ignoredInstances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp175o6f6ego3r2j****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public RemoveInstancesResponseBody build() {
            return new RemoveInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveInstancesResponseBody</p>
     */
    public static class IgnoredInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private IgnoredInstances(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IgnoredInstances create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String instanceId; 
            private String message; 

            private Builder() {
            } 

            private Builder(IgnoredInstances model) {
                this.code = model.code;
                this.instanceId = model.instanceId;
                this.message = model.message;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public IgnoredInstances build() {
                return new IgnoredInstances(this);
            } 

        } 

    }
}
