// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpaceModelSortResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpaceModelSortResponseBody</p>
 */
public class GetSpaceModelSortResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceModel")
    private java.util.List < SpaceModel> spaceModel;

    private GetSpaceModelSortResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spaceModel = builder.spaceModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpaceModelSortResponseBody create() {
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
    public java.util.List < SpaceModel> getSpaceModel() {
        return this.spaceModel;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SpaceModel> spaceModel; 

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

        public GetSpaceModelSortResponseBody build() {
            return new GetSpaceModelSortResponseBody(this);
        } 

    } 

    public static class SpaceModel extends TeaModel {
        @NameInMap("Level")
        private Long level;

        @NameInMap("LevelName")
        private String levelName;

        private SpaceModel(Builder builder) {
            this.level = builder.level;
            this.levelName = builder.levelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpaceModel create() {
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

            public SpaceModel build() {
                return new SpaceModel(this);
            } 

        } 

    }
}
