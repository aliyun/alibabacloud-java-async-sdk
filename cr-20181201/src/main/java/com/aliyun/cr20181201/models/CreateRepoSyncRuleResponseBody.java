// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoSyncRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRepoSyncRuleResponseBody</p>
 */
public class CreateRepoSyncRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("SyncRuleId")
    private String syncRuleId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;


    private CreateRepoSyncRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.syncRuleId = builder.syncRuleId;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return syncRuleId
     */
    public String getSyncRuleId() {
        return this.syncRuleId;
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

    public static final class Builder {
        private String code; 
        private String syncRuleId; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Synchronous rule ID</p>
         */
        public Builder syncRuleId(String syncRuleId) {
            this.syncRuleId = syncRuleId;
            return this;
        }

        /**
         * <p>Successful</p>
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

        public CreateRepoSyncRuleResponseBody build() {
            return new CreateRepoSyncRuleResponseBody(this);
        } 

    } 

}
