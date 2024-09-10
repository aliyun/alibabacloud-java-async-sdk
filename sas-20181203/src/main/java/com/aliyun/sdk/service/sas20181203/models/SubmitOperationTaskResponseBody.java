// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * OperateCode.
         */
        public Builder operateCode(String operateCode) {
            this.operateCode = operateCode;
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
         * RootTaskId.
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
