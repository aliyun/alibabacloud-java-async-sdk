// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchDeleteDcdnKvResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteDcdnKvResponseBody</p>
 */
public class BatchDeleteDcdnKvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailKeys")
    private java.util.List < String > failKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessKeys")
    private java.util.List < String > successKeys;

    private BatchDeleteDcdnKvResponseBody(Builder builder) {
        this.failKeys = builder.failKeys;
        this.requestId = builder.requestId;
        this.successKeys = builder.successKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDcdnKvResponseBody create() {
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
         * FailKeys.
         */
        public Builder failKeys(java.util.List < String > failKeys) {
            this.failKeys = failKeys;
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
         * SuccessKeys.
         */
        public Builder successKeys(java.util.List < String > successKeys) {
            this.successKeys = successKeys;
            return this;
        }

        public BatchDeleteDcdnKvResponseBody build() {
            return new BatchDeleteDcdnKvResponseBody(this);
        } 

    } 

}
