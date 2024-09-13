// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordMinutesUrlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRecordMinutesUrlResponseBody</p>
 */
public class QueryRecordMinutesUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("recordMinutesUrls")
    private java.util.List < RecordMinutesUrls> recordMinutesUrls;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private QueryRecordMinutesUrlResponseBody(Builder builder) {
        this.recordMinutesUrls = builder.recordMinutesUrls;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordMinutesUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordMinutesUrls
     */
    public java.util.List < RecordMinutesUrls> getRecordMinutesUrls() {
        return this.recordMinutesUrls;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List < RecordMinutesUrls> recordMinutesUrls; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * recordMinutesUrls.
         */
        public Builder recordMinutesUrls(java.util.List < RecordMinutesUrls> recordMinutesUrls) {
            this.recordMinutesUrls = recordMinutesUrls;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public QueryRecordMinutesUrlResponseBody build() {
            return new QueryRecordMinutesUrlResponseBody(this);
        } 

    } 

    public static class RecordMinutesUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordMinutesUrl")
        private String recordMinutesUrl;

        private RecordMinutesUrls(Builder builder) {
            this.recordMinutesUrl = builder.recordMinutesUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordMinutesUrls create() {
            return builder().build();
        }

        /**
         * @return recordMinutesUrl
         */
        public String getRecordMinutesUrl() {
            return this.recordMinutesUrl;
        }

        public static final class Builder {
            private String recordMinutesUrl; 

            /**
             * RecordMinutesUrl.
             */
            public Builder recordMinutesUrl(String recordMinutesUrl) {
                this.recordMinutesUrl = recordMinutesUrl;
                return this;
            }

            public RecordMinutesUrls build() {
                return new RecordMinutesUrls(this);
            } 

        } 

    }
}
