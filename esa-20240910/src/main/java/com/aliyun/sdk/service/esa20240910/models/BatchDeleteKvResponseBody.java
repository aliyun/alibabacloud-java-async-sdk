// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link BatchDeleteKvResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteKvResponseBody</p>
 */
public class BatchDeleteKvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailKeys")
    private java.util.List<String> failKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessKeys")
    private java.util.List<String> successKeys;

    private BatchDeleteKvResponseBody(Builder builder) {
        this.failKeys = builder.failKeys;
        this.requestId = builder.requestId;
        this.successKeys = builder.successKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteKvResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failKeys
     */
    public java.util.List<String> getFailKeys() {
        return this.failKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successKeys
     */
    public java.util.List<String> getSuccessKeys() {
        return this.successKeys;
    }

    public static final class Builder {
        private java.util.List<String> failKeys; 
        private String requestId; 
        private java.util.List<String> successKeys; 

        private Builder() {
        } 

        private Builder(BatchDeleteKvResponseBody model) {
            this.failKeys = model.failKeys;
            this.requestId = model.requestId;
            this.successKeys = model.successKeys;
        } 

        /**
         * <p>The keys that failed to be deleted.</p>
         */
        public Builder failKeys(java.util.List<String> failKeys) {
            this.failKeys = failKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The keys that are deleted.</p>
         */
        public Builder successKeys(java.util.List<String> successKeys) {
            this.successKeys = successKeys;
            return this;
        }

        public BatchDeleteKvResponseBody build() {
            return new BatchDeleteKvResponseBody(this);
        } 

    } 

}
