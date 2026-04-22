// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInterAuthStatisticsHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInterAuthStatisticsHistoryResponseBody</p>
 */
public class DescribeInterAuthStatisticsHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInterAuthStatisticsHistoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInterAuthStatisticsHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInterAuthStatisticsHistoryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInterAuthStatisticsHistoryResponseBody build() {
            return new DescribeInterAuthStatisticsHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInterAuthStatisticsHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInterAuthStatisticsHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Qtype")
        private String qtype;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private Long ratio;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private Data(Builder builder) {
            this.count = builder.count;
            this.domainName = builder.domainName;
            this.protocol = builder.protocol;
            this.qtype = builder.qtype;
            this.ratio = builder.ratio;
            this.timestamp = builder.timestamp;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return qtype
         */
        public String getQtype() {
            return this.qtype;
        }

        /**
         * @return ratio
         */
        public Long getRatio() {
            return this.ratio;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private Long count; 
            private String domainName; 
            private String protocol; 
            private String qtype; 
            private Long ratio; 
            private Long timestamp; 
            private String zoneName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.domainName = model.domainName;
                this.protocol = model.protocol;
                this.qtype = model.qtype;
                this.ratio = model.ratio;
                this.timestamp = model.timestamp;
                this.zoneName = model.zoneName;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Qtype.
             */
            public Builder qtype(String qtype) {
                this.qtype = qtype;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(Long ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * ZoneName.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
