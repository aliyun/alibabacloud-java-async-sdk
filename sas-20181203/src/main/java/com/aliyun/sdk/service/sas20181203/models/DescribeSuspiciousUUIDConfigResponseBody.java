// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspiciousUUIDConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspiciousUUIDConfigResponseBody</p>
 */
public class DescribeSuspiciousUUIDConfigResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UUIDList")
    private java.util.List < String > uUIDList;

    private DescribeSuspiciousUUIDConfigResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
        this.uUIDList = builder.uUIDList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspiciousUUIDConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uUIDList
     */
    public java.util.List < String > getUUIDList() {
        return this.uUIDList;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 
        private java.util.List < String > uUIDList; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * UUIDList.
         */
        public Builder uUIDList(java.util.List < String > uUIDList) {
            this.uUIDList = uUIDList;
            return this;
        }

        public DescribeSuspiciousUUIDConfigResponseBody build() {
            return new DescribeSuspiciousUUIDConfigResponseBody(this);
        } 

    } 

}
