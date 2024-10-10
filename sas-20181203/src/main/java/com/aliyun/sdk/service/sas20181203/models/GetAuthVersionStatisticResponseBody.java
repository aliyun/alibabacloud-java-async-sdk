// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAuthVersionStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthVersionStatisticResponseBody</p>
 */
public class GetAuthVersionStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    private java.util.List < Statistics> statistics;

    private GetAuthVersionStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthVersionStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public java.util.List < Statistics> getStatistics() {
        return this.statistics;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Statistics> statistics; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2CA2BDF6-F3BD-51A4-BAAC-30B02F7A3FBB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics about the numbers of assets protected by each edition of Security Center.</p>
         */
        public Builder statistics(java.util.List < Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        public GetAuthVersionStatisticResponseBody build() {
            return new GetAuthVersionStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthVersionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthVersionStatisticResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private Statistics(Builder builder) {
            this.authVersion = builder.authVersion;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private Integer authVersion; 
            private Integer count; 

            /**
             * <p>The edition of Security Center. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic edition (Unauthorized)</li>
             * <li><strong>6</strong>: Anti-virus edition</li>
             * <li><strong>5</strong>: Advanced edition</li>
             * <li><strong>3</strong>: Enterprise edition</li>
             * <li><strong>7</strong>: Ultimate edition</li>
             * <li><strong>10</strong>: Value-added Plan edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>The number of authorized servers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
