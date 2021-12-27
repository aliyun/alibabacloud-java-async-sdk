// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    private java.util.List < String > UUIDList;


    private DescribeSuspiciousUUIDConfigResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
        this.UUIDList = builder.UUIDList;
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
     * @return UUIDList
     */
    public java.util.List < String > getUUIDList() {
        return this.UUIDList;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 
        private java.util.List < String > UUIDList; 

        /**
         * <p>Count.</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>UUIDList.</p>
         */
        public Builder UUIDList(java.util.List < String > UUIDList) {
            this.UUIDList = UUIDList;
            return this;
        }

        public DescribeSuspiciousUUIDConfigResponseBody build() {
            return new DescribeSuspiciousUUIDConfigResponseBody(this);
        } 

    } 

}
