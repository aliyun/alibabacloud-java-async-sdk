// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssIncrementStatsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssIncrementStatsResponseBody</p>
 */
public class DescribeOssIncrementStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatList")
    private java.util.List < StatList> statList;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOssIncrementStatsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statList = builder.statList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssIncrementStatsResponseBody create() {
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

        public DescribeOssIncrementStatsResponseBody build() {
            return new DescribeOssIncrementStatsResponseBody(this);
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

        @NameInMap("Scene")
        private String scene;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private StatList(Builder builder) {
            this.blockCount = builder.blockCount;
            this.date = builder.date;
            this.passCount = builder.passCount;
            this.resourceType = builder.resourceType;
            this.reviewCount = builder.reviewCount;
            this.scene = builder.scene;
            this.totalCount = builder.totalCount;
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
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer blockCount; 
            private String date; 
            private Integer passCount; 
            private String resourceType; 
            private Integer reviewCount; 
            private String scene; 
            private Integer totalCount; 

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
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public StatList build() {
                return new StatList(this);
            } 

        } 

    }
}
