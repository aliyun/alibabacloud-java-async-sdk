// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDNSSLBStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetDNSSLBStatusResponseBody</p>
 */
public class SetDNSSLBStatusResponseBody extends TeaModel {
    @NameInMap("Open")
    private Boolean open;

    @NameInMap("RecordCount")
    private Long recordCount;

    @NameInMap("RequestId")
    private String requestId;

    private SetDNSSLBStatusResponseBody(Builder builder) {
        this.open = builder.open;
        this.recordCount = builder.recordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDNSSLBStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return open
     */
    public Boolean getOpen() {
        return this.open;
    }

    /**
     * @return recordCount
     */
    public Long getRecordCount() {
        return this.recordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean open; 
        private Long recordCount; 
        private String requestId; 

        /**
         * Indicates whether weighted round-robin is enabled for the subdomain name.
         */
        public Builder open(Boolean open) {
            this.open = open;
            return this;
        }

        /**
         * The number of A records that are matched.
         */
        public Builder recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetDNSSLBStatusResponseBody build() {
            return new SetDNSSLBStatusResponseBody(this);
        } 

    } 

}
