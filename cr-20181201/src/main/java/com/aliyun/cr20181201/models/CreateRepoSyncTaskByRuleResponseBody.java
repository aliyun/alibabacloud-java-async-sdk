// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoSyncTaskByRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRepoSyncTaskByRuleResponseBody</p>
 */
public class CreateRepoSyncTaskByRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SyncTaskId")
    private String syncTaskId;


    private CreateRepoSyncTaskByRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.syncTaskId = builder.syncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncTaskByRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private String syncTaskId; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>
Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Synchronous task ID</p>
         */
        public Builder syncTaskId(String syncTaskId) {
            this.syncTaskId = syncTaskId;
            return this;
        }

        public CreateRepoSyncTaskByRuleResponseBody build() {
            return new CreateRepoSyncTaskByRuleResponseBody(this);
        } 

    } 

}
