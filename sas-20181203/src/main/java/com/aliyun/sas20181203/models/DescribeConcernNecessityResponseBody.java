// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeConcernNecessityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConcernNecessityResponseBody</p>
 */
public class DescribeConcernNecessityResponseBody extends TeaModel {
    @NameInMap("ConcernNecessity")
    private java.util.List < String > concernNecessity;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeConcernNecessityResponseBody(Builder builder) {
        this.concernNecessity = builder.concernNecessity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConcernNecessityResponseBody create() {
        return builder().build();
    }

    /**
     * @return concernNecessity
     */
    public java.util.List < String > getConcernNecessity() {
        return this.concernNecessity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > concernNecessity; 
        private String requestId; 

        /**
         * <p>ConcernNecessity.</p>
         */
        public Builder concernNecessity(java.util.List < String > concernNecessity) {
            this.concernNecessity = concernNecessity;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConcernNecessityResponseBody build() {
            return new DescribeConcernNecessityResponseBody(this);
        } 

    } 

}
