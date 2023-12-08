// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSupportObjectSuffixResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportObjectSuffixResponseBody</p>
 */
public class ListSupportObjectSuffixResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < String > data;

    @NameInMap("RequestId")
    private String requestId;

    private ListSupportObjectSuffixResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportObjectSuffixResponseBody create() {
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
         * The returned data.
         */
        public Builder data(java.util.List < String > data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSupportObjectSuffixResponseBody build() {
            return new ListSupportObjectSuffixResponseBody(this);
        } 

    } 

}
