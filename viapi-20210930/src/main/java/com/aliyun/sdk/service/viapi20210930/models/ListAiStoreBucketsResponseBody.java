// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAiStoreBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAiStoreBucketsResponseBody</p>
 */
public class ListAiStoreBucketsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < String > data;

    @NameInMap("RequestId")
    private String requestId;

    private ListAiStoreBucketsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiStoreBucketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < String > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < String > data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAiStoreBucketsResponseBody build() {
            return new ListAiStoreBucketsResponseBody(this);
        } 

    } 

}
