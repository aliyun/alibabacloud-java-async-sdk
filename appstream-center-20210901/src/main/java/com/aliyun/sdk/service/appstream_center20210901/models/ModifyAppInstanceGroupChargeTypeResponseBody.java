// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyAppInstanceGroupChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAppInstanceGroupChargeTypeResponseBody</p>
 */
public class ModifyAppInstanceGroupChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupModel")
    private AppInstanceGroupModel appInstanceGroupModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAppInstanceGroupChargeTypeResponseBody(Builder builder) {
        this.appInstanceGroupModel = builder.appInstanceGroupModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppInstanceGroupChargeTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupModel
     */
    public AppInstanceGroupModel getAppInstanceGroupModel() {
        return this.appInstanceGroupModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppInstanceGroupModel appInstanceGroupModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyAppInstanceGroupChargeTypeResponseBody model) {
            this.appInstanceGroupModel = model.appInstanceGroupModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The task information for the billing method conversion.</p>
         */
        public Builder appInstanceGroupModel(AppInstanceGroupModel appInstanceGroupModel) {
            this.appInstanceGroupModel = appInstanceGroupModel;
            return this;
        }

        /**
         * <p>The unique ID of the request. You can use the ID to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAppInstanceGroupChargeTypeResponseBody build() {
            return new ModifyAppInstanceGroupChargeTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAppInstanceGroupChargeTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupChargeTypeResponseBody</p>
     */
    public static class AppInstanceGroupModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private AppInstanceGroupModel(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceGroupModel create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String taskId; 

            private Builder() {
            } 

            private Builder(AppInstanceGroupModel model) {
                this.taskId = model.taskId;
            } 

            /**
             * <p>The ID of the billing conversion order task, used to associate with the current conversion. It is returned only when a related order task is required and created. It does not indicate that the payment is completed or the new billing method has taken effect.</p>
             * 
             * <strong>example:</strong>
             * <p>task-123</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public AppInstanceGroupModel build() {
                return new AppInstanceGroupModel(this);
            } 

        } 

    }
}
