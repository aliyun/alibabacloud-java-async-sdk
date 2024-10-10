// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMatchedMaliciousNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMatchedMaliciousNamesResponseBody</p>
 */
public class DescribeMatchedMaliciousNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMatchedMaliciousNamesResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMatchedMaliciousNamesResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7CD1BE6-97A2-5524-A529-B55C63E55D59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMatchedMaliciousNamesResponseBody build() {
            return new DescribeMatchedMaliciousNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMatchedMaliciousNamesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMatchedMaliciousNamesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Data(Builder builder) {
            this.displayName = builder.displayName;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String displayName; 
            private String key; 

            /**
             * <p>The display name of the malicious image sample type.</p>
             * 
             * <strong>example:</strong>
             * <p>displayname</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The key of the malicious image sample type.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
