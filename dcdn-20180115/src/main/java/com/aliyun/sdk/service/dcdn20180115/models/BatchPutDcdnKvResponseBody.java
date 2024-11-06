// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchPutDcdnKvResponseBody} extends {@link TeaModel}
 *
 * <p>BatchPutDcdnKvResponseBody</p>
 */
public class BatchPutDcdnKvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailKeys")
    private java.util.List < String > failKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessKeys")
    private java.util.List < String > successKeys;

    private BatchPutDcdnKvResponseBody(Builder builder) {
        this.failKeys = builder.failKeys;
        this.requestId = builder.requestId;
        this.successKeys = builder.successKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchPutDcdnKvResponseBody create() {
        return builder().build();
    }

    /**
     * @return failKeys
     */
    public java.util.List < String > getFailKeys() {
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
    public java.util.List < String > getSuccessKeys() {
        return this.successKeys;
    }

    public static final class Builder {
        private java.util.List < String > failKeys; 
        private String requestId; 
        private java.util.List < String > successKeys; 

        /**
         * <p>The keys that failed to be written.</p>
         */
        public Builder failKeys(java.util.List < String > failKeys) {
            this.failKeys = failKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The keys that were written.</p>
         */
        public Builder successKeys(java.util.List < String > successKeys) {
            this.successKeys = successKeys;
            return this;
        }

        public BatchPutDcdnKvResponseBody build() {
            return new BatchPutDcdnKvResponseBody(this);
        } 

    } 

}
