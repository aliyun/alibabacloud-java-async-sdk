// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpaceModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSpaceModelsResponseBody</p>
 */
public class ListSpaceModelsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceModel")
    private java.util.List < SpaceModel> spaceModel;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListSpaceModelsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.spaceModel = builder.spaceModel;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpaceModelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaceModel
     */
    public java.util.List < SpaceModel> getSpaceModel() {
        return this.spaceModel;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < SpaceModel> spaceModel; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * SpaceModel.
         */
        public Builder spaceModel(java.util.List < SpaceModel> spaceModel) {
            this.spaceModel = spaceModel;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSpaceModelsResponseBody build() {
            return new ListSpaceModelsResponseBody(this);
        } 

    } 

    public static class Sort extends TeaModel {
        @NameInMap("Level")
        private Long level;

        @NameInMap("LevelName")
        private String levelName;

        private Sort(Builder builder) {
            this.level = builder.level;
            this.levelName = builder.levelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sort create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        public static final class Builder {
            private Long level; 
            private String levelName; 

            /**
             * Level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * LevelName.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            public Sort build() {
                return new Sort(this);
            } 

        } 

    }
    public static class SpaceModel extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Sort")
        private java.util.List < Sort> sort;

        @NameInMap("SpaceModelId")
        private String spaceModelId;

        @NameInMap("SpaceType")
        private String spaceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private SpaceModel(Builder builder) {
            this.createTime = builder.createTime;
            this.sort = builder.sort;
            this.spaceModelId = builder.spaceModelId;
            this.spaceType = builder.spaceType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpaceModel create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return sort
         */
        public java.util.List < Sort> getSort() {
            return this.sort;
        }

        /**
         * @return spaceModelId
         */
        public String getSpaceModelId() {
            return this.spaceModelId;
        }

        /**
         * @return spaceType
         */
        public String getSpaceType() {
            return this.spaceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List < Sort> sort; 
            private String spaceModelId; 
            private String spaceType; 
            private String status; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 层级
             */
            public Builder sort(java.util.List < Sort> sort) {
                this.sort = sort;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder spaceModelId(String spaceModelId) {
                this.spaceModelId = spaceModelId;
                return this;
            }

            /**
             * 物理空间类型
             */
            public Builder spaceType(String spaceType) {
                this.spaceType = spaceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SpaceModel build() {
                return new SpaceModel(this);
            } 

        } 

    }
}
