// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSharesToExpressSyncResponseBody} extends {@link TeaModel}
 *
 * <p>AddSharesToExpressSyncResponseBody</p>
 */
public class AddSharesToExpressSyncResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MnsFullSyncDelay")
    private Long mnsFullSyncDelay;

    @NameInMap("MnsInnerEndpoint")
    private String mnsInnerEndpoint;

    @NameInMap("MnsPublicEndpoint")
    private String mnsPublicEndpoint;

    @NameInMap("MnsQueues")
    private String mnsQueues;

    @NameInMap("MnsTopic")
    private String mnsTopic;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private String taskId;

    private AddSharesToExpressSyncResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.mnsFullSyncDelay = builder.mnsFullSyncDelay;
        this.mnsInnerEndpoint = builder.mnsInnerEndpoint;
        this.mnsPublicEndpoint = builder.mnsPublicEndpoint;
        this.mnsQueues = builder.mnsQueues;
        this.mnsTopic = builder.mnsTopic;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSharesToExpressSyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return mnsFullSyncDelay
     */
    public Long getMnsFullSyncDelay() {
        return this.mnsFullSyncDelay;
    }

    /**
     * @return mnsInnerEndpoint
     */
    public String getMnsInnerEndpoint() {
        return this.mnsInnerEndpoint;
    }

    /**
     * @return mnsPublicEndpoint
     */
    public String getMnsPublicEndpoint() {
        return this.mnsPublicEndpoint;
    }

    /**
     * @return mnsQueues
     */
    public String getMnsQueues() {
        return this.mnsQueues;
    }

    /**
     * @return mnsTopic
     */
    public String getMnsTopic() {
        return this.mnsTopic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Long mnsFullSyncDelay; 
        private String mnsInnerEndpoint; 
        private String mnsPublicEndpoint; 
        private String mnsQueues; 
        private String mnsTopic; 
        private String requestId; 
        private Boolean success; 
        private String taskId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MnsFullSyncDelay.
         */
        public Builder mnsFullSyncDelay(Long mnsFullSyncDelay) {
            this.mnsFullSyncDelay = mnsFullSyncDelay;
            return this;
        }

        /**
         * MnsInnerEndpoint.
         */
        public Builder mnsInnerEndpoint(String mnsInnerEndpoint) {
            this.mnsInnerEndpoint = mnsInnerEndpoint;
            return this;
        }

        /**
         * MnsPublicEndpoint.
         */
        public Builder mnsPublicEndpoint(String mnsPublicEndpoint) {
            this.mnsPublicEndpoint = mnsPublicEndpoint;
            return this;
        }

        /**
         * MnsQueues.
         */
        public Builder mnsQueues(String mnsQueues) {
            this.mnsQueues = mnsQueues;
            return this;
        }

        /**
         * MnsTopic.
         */
        public Builder mnsTopic(String mnsTopic) {
            this.mnsTopic = mnsTopic;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public AddSharesToExpressSyncResponseBody build() {
            return new AddSharesToExpressSyncResponseBody(this);
        } 

    } 

}
