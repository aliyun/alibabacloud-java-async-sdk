// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateRepoSyncRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRepoSyncRuleResponseBody</p>
 */
public class CreateRepoSyncRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncRuleId")
    private String syncRuleId;

    private CreateRepoSyncRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.syncRuleId = builder.syncRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoSyncRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return syncRuleId
     */
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private String syncRuleId; 

        private Builder() {
        } 

        private Builder(CreateRepoSyncRuleResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.syncRuleId = model.syncRuleId;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F8A0BA6-7F06-4BAE-B147-10BD6A25****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the synchronization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>crsr-gk5p2ns1kzns****</p>
         */
        public Builder syncRuleId(String syncRuleId) {
            this.syncRuleId = syncRuleId;
            return this;
        }

        public CreateRepoSyncRuleResponseBody build() {
            return new CreateRepoSyncRuleResponseBody(this);
        } 

    } 

}
