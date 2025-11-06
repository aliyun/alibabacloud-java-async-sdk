// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody</p>
 */
public class SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
    private String taskNo;

    private SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskNo
     */
    public String getTaskNo() {
        return this.taskNo;
    }

    public static final class Builder {
        private String requestId; 
        private String taskNo; 

        private Builder() {
        } 

        private Builder(SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody model) {
            this.requestId = model.requestId;
            this.taskNo = model.taskNo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C560A803-B975-481D-A66B-A4395EA863A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody build() {
            return new SaveSingleTaskForTransferOutByAuthorizationCodeResponseBody(this);
        } 

    } 

}
