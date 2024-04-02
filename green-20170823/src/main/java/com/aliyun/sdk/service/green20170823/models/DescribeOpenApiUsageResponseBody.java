// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpenApiUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenApiUsageResponseBody</p>
 */
public class DescribeOpenApiUsageResponseBody extends TeaModel {
    @NameInMap("OpenApiUsageList")
    private java.util.List < OpenApiUsageList> openApiUsageList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOpenApiUsageResponseBody(Builder builder) {
        this.openApiUsageList = builder.openApiUsageList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenApiUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return openApiUsageList
     */
    public java.util.List < OpenApiUsageList> getOpenApiUsageList() {
        return this.openApiUsageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OpenApiUsageList> openApiUsageList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * OpenApiUsageList.
         */
        public Builder openApiUsageList(java.util.List < OpenApiUsageList> openApiUsageList) {
            this.openApiUsageList = openApiUsageList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOpenApiUsageResponseBody build() {
            return new DescribeOpenApiUsageResponseBody(this);
        } 

    } 

    public static class OpenApiUsageList extends TeaModel {
        @NameInMap("BlockCount")
        private Integer blockCount;

        @NameInMap("BlockDuration")
        private Integer blockDuration;

        @NameInMap("Date")
        private String date;

        @NameInMap("InnerTotalCount")
        private Integer innerTotalCount;

        @NameInMap("OuterTotalCount")
        private Integer outerTotalCount;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("PassDuration")
        private Integer passDuration;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ReviewCount")
        private Integer reviewCount;

        @NameInMap("ReviewDuration")
        private Integer reviewDuration;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalDuration")
        private Integer totalDuration;

        private OpenApiUsageList(Builder builder) {
            this.blockCount = builder.blockCount;
            this.blockDuration = builder.blockDuration;
            this.date = builder.date;
            this.innerTotalCount = builder.innerTotalCount;
            this.outerTotalCount = builder.outerTotalCount;
            this.passCount = builder.passCount;
            this.passDuration = builder.passDuration;
            this.resourceType = builder.resourceType;
            this.reviewCount = builder.reviewCount;
            this.reviewDuration = builder.reviewDuration;
            this.scene = builder.scene;
            this.totalCount = builder.totalCount;
            this.totalDuration = builder.totalDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenApiUsageList create() {
            return builder().build();
        }

        /**
         * @return blockCount
         */
        public Integer getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return blockDuration
         */
        public Integer getBlockDuration() {
            return this.blockDuration;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return innerTotalCount
         */
        public Integer getInnerTotalCount() {
            return this.innerTotalCount;
        }

        /**
         * @return outerTotalCount
         */
        public Integer getOuterTotalCount() {
            return this.outerTotalCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return passDuration
         */
        public Integer getPassDuration() {
            return this.passDuration;
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
         * @return reviewDuration
         */
        public Integer getReviewDuration() {
            return this.reviewDuration;
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

        /**
         * @return totalDuration
         */
        public Integer getTotalDuration() {
            return this.totalDuration;
        }

        public static final class Builder {
            private Integer blockCount; 
            private Integer blockDuration; 
            private String date; 
            private Integer innerTotalCount; 
            private Integer outerTotalCount; 
            private Integer passCount; 
            private Integer passDuration; 
            private String resourceType; 
            private Integer reviewCount; 
            private Integer reviewDuration; 
            private String scene; 
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
             * BlockDuration.
             */
            public Builder blockDuration(Integer blockDuration) {
                this.blockDuration = blockDuration;
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
             * InnerTotalCount.
             */
            public Builder innerTotalCount(Integer innerTotalCount) {
                this.innerTotalCount = innerTotalCount;
                return this;
            }

            /**
             * OuterTotalCount.
             */
            public Builder outerTotalCount(Integer outerTotalCount) {
                this.outerTotalCount = outerTotalCount;
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
             * PassDuration.
             */
            public Builder passDuration(Integer passDuration) {
                this.passDuration = passDuration;
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
             * ReviewDuration.
             */
            public Builder reviewDuration(Integer reviewDuration) {
                this.reviewDuration = reviewDuration;
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

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Integer totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            public OpenApiUsageList build() {
                return new OpenApiUsageList(this);
            } 

        } 

    }
}
