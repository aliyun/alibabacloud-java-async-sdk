// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafUsageDataResponseBody</p>
 */
public class DescribeDcdnWafUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("WafUsageData")
    private WafUsageData wafUsageData;

    private DescribeDcdnWafUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.wafUsageData = builder.wafUsageData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return wafUsageData
     */
    public WafUsageData getWafUsageData() {
        return this.wafUsageData;
    }

    public static final class Builder {
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private WafUsageData wafUsageData; 

        /**
         * <p>The operation that you want to perform. Set the value to <strong>DescribeDcdnWafUsageData</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-01T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies how query results are grouped. By default, this parameter is empty. Valid values:</p>
         * <ul>
         * <li>domain: Query results are grouped by accelerated domain name.</li>
         * <li>An empty string: Query results are not grouped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-802B-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z&quot;,</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The number of monitored requests.</p>
         */
        public Builder wafUsageData(WafUsageData wafUsageData) {
            this.wafUsageData = wafUsageData;
            return this;
        }

        public DescribeDcdnWafUsageDataResponseBody build() {
            return new DescribeDcdnWafUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafUsageDataResponseBody</p>
     */
    public static class WafUsageDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessCnt")
        private Long accessCnt;

        @com.aliyun.core.annotation.NameInMap("BlockCnt")
        private Long blockCnt;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ObserveCnt")
        private Long observeCnt;

        @com.aliyun.core.annotation.NameInMap("SecCu")
        private Long secCu;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private WafUsageDataItem(Builder builder) {
            this.accessCnt = builder.accessCnt;
            this.blockCnt = builder.blockCnt;
            this.domain = builder.domain;
            this.observeCnt = builder.observeCnt;
            this.secCu = builder.secCu;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafUsageDataItem create() {
            return builder().build();
        }

        /**
         * @return accessCnt
         */
        public Long getAccessCnt() {
            return this.accessCnt;
        }

        /**
         * @return blockCnt
         */
        public Long getBlockCnt() {
            return this.blockCnt;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return observeCnt
         */
        public Long getObserveCnt() {
            return this.observeCnt;
        }

        /**
         * @return secCu
         */
        public Long getSecCu() {
            return this.secCu;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long accessCnt; 
            private Long blockCnt; 
            private String domain; 
            private Long observeCnt; 
            private Long secCu; 
            private String timeStamp; 

            /**
             * <p>The number of blocked requests.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder accessCnt(Long accessCnt) {
                this.accessCnt = accessCnt;
                return this;
            }

            /**
             * <p>The number of allowed requests.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder blockCnt(Long blockCnt) {
                this.blockCnt = blockCnt;
                return this;
            }

            /**
             * <p>The domain name that you want to query. If you do not specify an accelerated domain name, all accelerated domain names are queried by default.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The end of the time range during which data was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder observeCnt(Long observeCnt) {
                this.observeCnt = observeCnt;
                return this;
            }

            /**
             * <p>The time granularity for a query. Unit: seconds.</p>
             * <p>The time granularity varies with the maximum time range per query. Valid values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day).</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder secCu(Long secCu) {
                this.secCu = secCu;
                return this;
            }

            /**
             * <p>The beginning of the time range during which data was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-30T16:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public WafUsageDataItem build() {
                return new WafUsageDataItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnWafUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafUsageDataResponseBody</p>
     */
    public static class WafUsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WafUsageDataItem")
        private java.util.List < WafUsageDataItem> wafUsageDataItem;

        private WafUsageData(Builder builder) {
            this.wafUsageDataItem = builder.wafUsageDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafUsageData create() {
            return builder().build();
        }

        /**
         * @return wafUsageDataItem
         */
        public java.util.List < WafUsageDataItem> getWafUsageDataItem() {
            return this.wafUsageDataItem;
        }

        public static final class Builder {
            private java.util.List < WafUsageDataItem> wafUsageDataItem; 

            /**
             * WafUsageDataItem.
             */
            public Builder wafUsageDataItem(java.util.List < WafUsageDataItem> wafUsageDataItem) {
                this.wafUsageDataItem = wafUsageDataItem;
                return this;
            }

            public WafUsageData build() {
                return new WafUsageData(this);
            } 

        } 

    }
}
