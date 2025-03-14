// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link SubmitOperationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitOperationTaskResponseBody</p>
 */
public class SubmitOperationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperateCode")
    private String operateCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootTaskId")
    private String rootTaskId;

    private SubmitOperationTaskResponseBody(Builder builder) {
        this.operateCode = builder.operateCode;
        this.requestId = builder.requestId;
        this.rootTaskId = builder.rootTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitOperationTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operateCode
     */
    public String getOperateCode() {
        return this.operateCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootTaskId
     */
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public static final class Builder {
        private String operateCode; 
        private String requestId; 
        private String rootTaskId; 

        private Builder() {
        } 

        private Builder(SubmitOperationTaskResponseBody model) {
            this.operateCode = model.operateCode;
            this.requestId = model.requestId;
            this.rootTaskId = model.rootTaskId;
        } 

        /**
         * <p>The handling result code. Valid values:</p>
         * <ul>
         * <li>Insufficient authorization: AuthorizationExhaust</li>
         * <li>Unauthorized: ActionTrialUnauthorized</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AuthorizationExhaust</p>
         */
        public Builder operateCode(String operateCode) {
            this.operateCode = operateCode;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The main task ID that is returned when the task is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>89f5d7813bd59dd237580a8664b3xxxx</p>
         */
        public Builder rootTaskId(String rootTaskId) {
            this.rootTaskId = rootTaskId;
            return this;
        }

        public SubmitOperationTaskResponseBody build() {
            return new SubmitOperationTaskResponseBody(this);
        } 

    } 

}
