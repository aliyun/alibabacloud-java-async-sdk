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
 * {@link SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody</p>
 */
public class SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
    private String taskNo;

    private SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody create() {
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

        private Builder(SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody model) {
            this.requestId = model.requestId;
            this.taskNo = model.taskNo;
        } 

        /**
         * <p>Unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Job number.</p>
         * 
         * <strong>example:</strong>
         * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody build() {
            return new SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody(this);
        } 

    } 

}
