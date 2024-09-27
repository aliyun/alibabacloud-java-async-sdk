// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDNSSLBStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetDNSSLBStatusResponseBody</p>
 */
public class SetDNSSLBStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Open")
    private Boolean open;

    @com.aliyun.core.annotation.NameInMap("RecordCount")
    private Long recordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether weighted round-robin is enabled for the subdomain name.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder open(Boolean open) {
            this.open = open;
            return this;
        }

        /**
         * <p>The number of A records that are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
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
