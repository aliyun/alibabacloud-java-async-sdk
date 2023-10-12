// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryTasksRequest} extends {@link RequestModel}
 *
 * <p>RetryTasksRequest</p>
 */
public class RetryTasksRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RetryTasks")
    @Validation(required = true)
    private java.util.List < RetryTasks> retryTasks;

    private RetryTasksRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.retryTasks = builder.retryTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryTasksRequest create() {
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
     * @return retryTasks
     */
    public java.util.List < RetryTasks> getRetryTasks() {
        return this.retryTasks;
    }

    public static final class Builder extends Request.Builder<RetryTasksRequest, Builder> {
        private String instanceId; 
        private java.util.List < RetryTasks> retryTasks; 

        private Builder() {
            super();
        } 

        private Builder(RetryTasksRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.retryTasks = request.retryTasks;
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
         * RetryTasks.
         */
        public Builder retryTasks(java.util.List < RetryTasks> retryTasks) {
            String retryTasksShrink = shrink(retryTasks, "RetryTasks", "json");
            this.putQueryParameter("RetryTasks", retryTasksShrink);
            this.retryTasks = retryTasks;
            return this;
        }

        @Override
        public RetryTasksRequest build() {
            return new RetryTasksRequest(this);
        } 

    } 

    public static class RetryTasks extends TeaModel {
        @NameInMap("DeviceId")
        @Validation(required = true)
        private String deviceId;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("ScriptId")
        private String scriptId;

        private RetryTasks(Builder builder) {
            this.deviceId = builder.deviceId;
            this.itemName = builder.itemName;
            this.scriptId = builder.scriptId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryTasks create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        public static final class Builder {
            private String deviceId; 
            private String itemName; 
            private String scriptId; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            public RetryTasks build() {
                return new RetryTasks(this);
            } 

        } 

    }
}
