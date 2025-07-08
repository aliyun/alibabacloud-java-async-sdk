// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link BatchDeleteTaskNewResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteTaskNewResponseBody</p>
 */
public class BatchDeleteTaskNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailList")
    private java.util.List<String> failList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessList")
    private java.util.List<String> successList;

    private BatchDeleteTaskNewResponseBody(Builder builder) {
        this.failList = builder.failList;
        this.requestId = builder.requestId;
        this.successList = builder.successList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteTaskNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failList
     */
    public java.util.List<String> getFailList() {
        return this.failList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successList
     */
    public java.util.List<String> getSuccessList() {
        return this.successList;
    }

    public static final class Builder {
        private java.util.List<String> failList; 
        private String requestId; 
        private java.util.List<String> successList; 

        private Builder() {
        } 

        private Builder(BatchDeleteTaskNewResponseBody model) {
            this.failList = model.failList;
            this.requestId = model.requestId;
            this.successList = model.successList;
        } 

        /**
         * FailList.
         */
        public Builder failList(java.util.List<String> failList) {
            this.failList = failList;
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
         * SuccessList.
         */
        public Builder successList(java.util.List<String> successList) {
            this.successList = successList;
            return this;
        }

        public BatchDeleteTaskNewResponseBody build() {
            return new BatchDeleteTaskNewResponseBody(this);
        } 

    } 

}
