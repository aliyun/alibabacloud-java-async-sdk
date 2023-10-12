// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpaceModelResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpaceModelResponseBody</p>
 */
public class GetSpaceModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceModel")
    private SpaceModel spaceModel;

    private GetSpaceModelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spaceModel = builder.spaceModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpaceModelResponseBody create() {
        return builder().build();
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
    public SpaceModel getSpaceModel() {
        return this.spaceModel;
    }

    public static final class Builder {
        private String requestId; 
        private SpaceModel spaceModel; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 物理空间模型
         */
        public Builder spaceModel(SpaceModel spaceModel) {
            this.spaceModel = spaceModel;
            return this;
        }

        public GetSpaceModelResponseBody build() {
            return new GetSpaceModelResponseBody(this);
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
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 模型实例
             */
            public Builder sort(java.util.List < Sort> sort) {
                this.sort = sort;
                return this;
            }

            /**
             * 物理空间模型id
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
             * 模型状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 更新时间
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
