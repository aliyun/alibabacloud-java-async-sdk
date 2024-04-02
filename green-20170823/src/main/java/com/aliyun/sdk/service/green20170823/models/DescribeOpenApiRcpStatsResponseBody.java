// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpenApiRcpStatsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenApiRcpStatsResponseBody</p>
 */
public class DescribeOpenApiRcpStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatList")
    private java.util.List < StatList> statList;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOpenApiRcpStatsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statList = builder.statList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenApiRcpStatsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statList
     */
    public java.util.List < StatList> getStatList() {
        return this.statList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StatList> statList; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatList.
         */
        public Builder statList(java.util.List < StatList> statList) {
            this.statList = statList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOpenApiRcpStatsResponseBody build() {
            return new DescribeOpenApiRcpStatsResponseBody(this);
        } 

    } 

    public static class StatList extends TeaModel {
        @NameInMap("BlockCount")
        private Integer blockCount;

        @NameInMap("Date")
        private String date;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ReviewCount")
        private Integer reviewCount;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalDuration")
        private Integer totalDuration;

        private StatList(Builder builder) {
            this.blockCount = builder.blockCount;
            this.date = builder.date;
            this.passCount = builder.passCount;
            this.resourceType = builder.resourceType;
            this.reviewCount = builder.reviewCount;
            this.totalCount = builder.totalCount;
            this.totalDuration = builder.totalDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatList create() {
            return builder().build();
        }

        /**
         * @return blockCount
         */
        public Integer getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return reviewCount
         */
        public Integer getReviewCount() {
            return this.reviewCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalDuration
         */
        public Integer getTotalDuration() {
            return this.totalDuration;
        }

        public static final class Builder {
            private Integer blockCount; 
            private String date; 
            private Integer passCount; 
            private String resourceType; 
            private Integer reviewCount; 
            private Integer totalCount; 
            private Integer totalDuration; 

            /**
             * BlockCount.
             */
            public Builder blockCount(Integer blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * PassCount.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ReviewCount.
             */
            public Builder reviewCount(Integer reviewCount) {
                this.reviewCount = reviewCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Integer totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            public StatList build() {
                return new StatList(this);
            } 

        } 

    }
}
