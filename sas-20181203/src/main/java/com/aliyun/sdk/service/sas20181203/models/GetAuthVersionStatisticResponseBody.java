// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthVersionStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthVersionStatisticResponseBody</p>
 */
public class GetAuthVersionStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Statistics")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(java.util.List < Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        public GetAuthVersionStatisticResponseBody build() {
            return new GetAuthVersionStatisticResponseBody(this);
        } 

    } 

    public static class Statistics extends TeaModel {
        @NameInMap("AuthVersion")
        private Integer authVersion;

        @NameInMap("Count")
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
             * AuthVersion.
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * Count.
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
