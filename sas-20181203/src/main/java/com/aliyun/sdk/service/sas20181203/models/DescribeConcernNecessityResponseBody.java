// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * The priorities to fix the vulnerabilities. Valid values:
         * <p>
         * 
         * *   asap: high
         * *   later: medium
         * *   nntf: low
         */
        public Builder concernNecessity(java.util.List < String > concernNecessity) {
            this.concernNecessity = concernNecessity;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
