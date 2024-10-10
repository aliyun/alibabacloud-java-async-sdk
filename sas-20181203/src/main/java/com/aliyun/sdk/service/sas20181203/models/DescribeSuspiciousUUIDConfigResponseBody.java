// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSuspiciousUUIDConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspiciousUUIDConfigResponseBody</p>
 */
public class DescribeSuspiciousUUIDConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UUIDList")
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
         * <p>The total number of servers on which proactive defense of the specified type takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6044DC07-86F1-5DDA-A611-EC578EA4EEE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The UUIDs of servers on which proactive defense of the specified type takes effect.</p>
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
