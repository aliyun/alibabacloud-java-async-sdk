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
 * {@link DescribeInterAuthStatisticsZoneOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInterAuthStatisticsZoneOverviewResponseBody</p>
 */
public class DescribeInterAuthStatisticsZoneOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInterAuthStatisticsZoneOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInterAuthStatisticsZoneOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInterAuthStatisticsZoneOverviewResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInterAuthStatisticsZoneOverviewResponseBody build() {
            return new DescribeInterAuthStatisticsZoneOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInterAuthStatisticsZoneOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInterAuthStatisticsZoneOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefusedDomainCount")
        private Long refusedDomainCount;

        @com.aliyun.core.annotation.NameInMap("SuddenDropDomainCount")
        private Long suddenDropDomainCount;

        @com.aliyun.core.annotation.NameInMap("SuddenIncreaseDomainCount")
        private Long suddenIncreaseDomainCount;

        private Data(Builder builder) {
            this.refusedDomainCount = builder.refusedDomainCount;
            this.suddenDropDomainCount = builder.suddenDropDomainCount;
            this.suddenIncreaseDomainCount = builder.suddenIncreaseDomainCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return refusedDomainCount
         */
        public Long getRefusedDomainCount() {
            return this.refusedDomainCount;
        }

        /**
         * @return suddenDropDomainCount
         */
        public Long getSuddenDropDomainCount() {
            return this.suddenDropDomainCount;
        }

        /**
         * @return suddenIncreaseDomainCount
         */
        public Long getSuddenIncreaseDomainCount() {
            return this.suddenIncreaseDomainCount;
        }

        public static final class Builder {
            private Long refusedDomainCount; 
            private Long suddenDropDomainCount; 
            private Long suddenIncreaseDomainCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.refusedDomainCount = model.refusedDomainCount;
                this.suddenDropDomainCount = model.suddenDropDomainCount;
                this.suddenIncreaseDomainCount = model.suddenIncreaseDomainCount;
            } 

            /**
             * RefusedDomainCount.
             */
            public Builder refusedDomainCount(Long refusedDomainCount) {
                this.refusedDomainCount = refusedDomainCount;
                return this;
            }

            /**
             * SuddenDropDomainCount.
             */
            public Builder suddenDropDomainCount(Long suddenDropDomainCount) {
                this.suddenDropDomainCount = suddenDropDomainCount;
                return this;
            }

            /**
             * SuddenIncreaseDomainCount.
             */
            public Builder suddenIncreaseDomainCount(Long suddenIncreaseDomainCount) {
                this.suddenIncreaseDomainCount = suddenIncreaseDomainCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
