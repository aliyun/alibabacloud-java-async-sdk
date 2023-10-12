// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SpaceModel} extends {@link TeaModel}
 *
 * <p>SpaceModel</p>
 */
public class SpaceModel extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Instance")
    private String instance;

    @NameInMap("OperateType")
    private String operateType;

    @NameInMap("Sort")
    private Sort sort;

    @NameInMap("SpaceId")
    private String spaceId;

    @NameInMap("SpaceModel")
    private SpaceModelSpaceModel spaceModel;

    @NameInMap("SpaceModelId")
    private String spaceModelId;

    @NameInMap("SpaceModelName")
    private String spaceModelName;

    @NameInMap("SpaceType")
    private String spaceType;

    @NameInMap("Status")
    private String status;

    private SpaceModel(Builder builder) {
        this.createTime = builder.createTime;
        this.instance = builder.instance;
        this.operateType = builder.operateType;
        this.sort = builder.sort;
        this.spaceId = builder.spaceId;
        this.spaceModel = builder.spaceModel;
        this.spaceModelId = builder.spaceModelId;
        this.spaceModelName = builder.spaceModelName;
        this.spaceType = builder.spaceType;
        this.status = builder.status;
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
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return sort
     */
    public Sort getSort() {
        return this.sort;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return spaceModel
     */
    public SpaceModelSpaceModel getSpaceModel() {
        return this.spaceModel;
    }

    /**
     * @return spaceModelId
     */
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    /**
     * @return spaceModelName
     */
    public String getSpaceModelName() {
        return this.spaceModelName;
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

    public static final class Builder {
        private String createTime; 
        private String instance; 
        private String operateType; 
        private Sort sort; 
        private String spaceId; 
        private SpaceModelSpaceModel spaceModel; 
        private String spaceModelId; 
        private String spaceModelName; 
        private String spaceType; 
        private String status; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Instance.
         */
        public Builder instance(String instance) {
            this.instance = instance;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.operateType = operateType;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(Sort sort) {
            this.sort = sort;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * SpaceModel.
         */
        public Builder spaceModel(SpaceModelSpaceModel spaceModel) {
            this.spaceModel = spaceModel;
            return this;
        }

        /**
         * SpaceModelId.
         */
        public Builder spaceModelId(String spaceModelId) {
            this.spaceModelId = spaceModelId;
            return this;
        }

        /**
         * SpaceModelName.
         */
        public Builder spaceModelName(String spaceModelName) {
            this.spaceModelName = spaceModelName;
            return this;
        }

        /**
         * SpaceType.
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

        public SpaceModel build() {
            return new SpaceModel(this);
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
    public static class SpaceModelSort extends TeaModel {
        @NameInMap("Level")
        private Long level;

        @NameInMap("LevleName")
        private String levleName;

        private SpaceModelSort(Builder builder) {
            this.level = builder.level;
            this.levleName = builder.levleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpaceModelSort create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return levleName
         */
        public String getLevleName() {
            return this.levleName;
        }

        public static final class Builder {
            private Long level; 
            private String levleName; 

            /**
             * Level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * LevleName.
             */
            public Builder levleName(String levleName) {
                this.levleName = levleName;
                return this;
            }

            public SpaceModelSort build() {
                return new SpaceModelSort(this);
            } 

        } 

    }
    public static class SpaceModelSpaceModel extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Sort")
        private SpaceModelSort sort;

        @NameInMap("SpaceModelId")
        private String spaceModelId;

        @NameInMap("SpaceType")
        private String spaceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private SpaceModelSpaceModel(Builder builder) {
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

        public static SpaceModelSpaceModel create() {
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
        public SpaceModelSort getSort() {
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
            private SpaceModelSort sort; 
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
             * Sort.
             */
            public Builder sort(SpaceModelSort sort) {
                this.sort = sort;
                return this;
            }

            /**
             * SpaceModelId.
             */
            public Builder spaceModelId(String spaceModelId) {
                this.spaceModelId = spaceModelId;
                return this;
            }

            /**
             * SpaceType.
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

            public SpaceModelSpaceModel build() {
                return new SpaceModelSpaceModel(this);
            } 

        } 

    }
}
