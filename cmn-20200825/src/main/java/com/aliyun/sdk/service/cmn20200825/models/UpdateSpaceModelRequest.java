// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSpaceModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateSpaceModelRequest</p>
 */
public class UpdateSpaceModelRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Sort")
    private java.util.List < Sort> sort;

    @Body
    @NameInMap("SpaceModelId")
    @Validation(required = true)
    private String spaceModelId;

    @Body
    @NameInMap("SpaceType")
    private String spaceType;

    private UpdateSpaceModelRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sort = builder.sort;
        this.spaceModelId = builder.spaceModelId;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSpaceModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpdateSpaceModelRequest, Builder> {
        private String instanceId; 
        private java.util.List < Sort> sort; 
        private String spaceModelId; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSpaceModelRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sort = request.sort;
            this.spaceModelId = request.spaceModelId;
            this.spaceType = request.spaceType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 层级
         */
        public Builder sort(java.util.List < Sort> sort) {
            String sortShrink = shrink(sort, "Sort", "json");
            this.putBodyParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        /**
         * SpaceModelId.
         */
        public Builder spaceModelId(String spaceModelId) {
            this.putBodyParameter("SpaceModelId", spaceModelId);
            this.spaceModelId = spaceModelId;
            return this;
        }

        /**
         * SpaceType.
         */
        public Builder spaceType(String spaceType) {
            this.putBodyParameter("SpaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public UpdateSpaceModelRequest build() {
            return new UpdateSpaceModelRequest(this);
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
}
