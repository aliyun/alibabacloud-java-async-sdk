// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStacksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStacksResponseBody</p>
 */
public class DescribeStacksResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stacks")
    private Stacks stacks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeStacksResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stacks = builder.stacks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStacksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stacks
     */
    public Stacks getStacks() {
        return this.stacks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Stacks stacks; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Stacks.
         */
        public Builder stacks(Stacks stacks) {
            this.stacks = stacks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStacksResponseBody build() {
            return new DescribeStacksResponseBody(this);
        } 

    } 

    public static class Stack extends TeaModel {
        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("LatestStack")
        private Boolean latestStack;

        @NameInMap("RecommendedStack")
        private Boolean recommendedStack;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VersionCode")
        private Integer versionCode;

        private Stack(Builder builder) {
            this.categoryName = builder.categoryName;
            this.createTime = builder.createTime;
            this.latestStack = builder.latestStack;
            this.recommendedStack = builder.recommendedStack;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.updateTime = builder.updateTime;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stack create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return latestStack
         */
        public Boolean getLatestStack() {
            return this.latestStack;
        }

        /**
         * @return recommendedStack
         */
        public Boolean getRecommendedStack() {
            return this.recommendedStack;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionCode
         */
        public Integer getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String categoryName; 
            private Long createTime; 
            private Boolean latestStack; 
            private Boolean recommendedStack; 
            private String stackId; 
            private String stackName; 
            private Long updateTime; 
            private Integer versionCode; 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LatestStack.
             */
            public Builder latestStack(Boolean latestStack) {
                this.latestStack = latestStack;
                return this;
            }

            /**
             * RecommendedStack.
             */
            public Builder recommendedStack(Boolean recommendedStack) {
                this.recommendedStack = recommendedStack;
                return this;
            }

            /**
             * StackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * StackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(Integer versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public Stack build() {
                return new Stack(this);
            } 

        } 

    }
    public static class Stacks extends TeaModel {
        @NameInMap("Stack")
        private java.util.List < Stack> stack;

        private Stacks(Builder builder) {
            this.stack = builder.stack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stacks create() {
            return builder().build();
        }

        /**
         * @return stack
         */
        public java.util.List < Stack> getStack() {
            return this.stack;
        }

        public static final class Builder {
            private java.util.List < Stack> stack; 

            /**
             * Stack.
             */
            public Builder stack(java.util.List < Stack> stack) {
                this.stack = stack;
                return this;
            }

            public Stacks build() {
                return new Stacks(this);
            } 

        } 

    }
}
