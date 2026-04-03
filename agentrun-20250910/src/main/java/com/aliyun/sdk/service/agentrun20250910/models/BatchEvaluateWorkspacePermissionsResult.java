// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BatchEvaluateWorkspacePermissionsResult} extends {@link TeaModel}
 *
 * <p>BatchEvaluateWorkspacePermissionsResult</p>
 */
public class BatchEvaluateWorkspacePermissionsResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private BatchEvaluateWorkspacePermissionsOutput data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BatchEvaluateWorkspacePermissionsResult(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEvaluateWorkspacePermissionsResult create() {
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
     * @return data
     */
    public BatchEvaluateWorkspacePermissionsOutput getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private BatchEvaluateWorkspacePermissionsOutput data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchEvaluateWorkspacePermissionsResult model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>OK 表示成功</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(BatchEvaluateWorkspacePermissionsOutput data) {
            this.data = data;
            return this;
        }

        /**
         * <p>与响应头 x-funagent-request-id 对应</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchEvaluateWorkspacePermissionsResult build() {
            return new BatchEvaluateWorkspacePermissionsResult(this);
        } 

    } 

}
