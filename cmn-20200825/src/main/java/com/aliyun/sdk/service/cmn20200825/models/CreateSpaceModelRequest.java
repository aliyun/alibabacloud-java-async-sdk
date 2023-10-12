// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpaceModelRequest} extends {@link RequestModel}
 *
 * <p>CreateSpaceModelRequest</p>
 */
public class CreateSpaceModelRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Sort")
    private java.util.List < Sort> sort;

    @Body
    @NameInMap("SpaceType")
    @Validation(required = true)
    private String spaceType;

    private CreateSpaceModelRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.sort = builder.sort;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpaceModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    public static final class Builder extends Request.Builder<CreateSpaceModelRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private java.util.List < Sort> sort; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSpaceModelRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.sort = request.sort;
            this.spaceType = request.spaceType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * Sort.
         */
        public Builder sort(java.util.List < Sort> sort) {
            String sortShrink = shrink(sort, "Sort", "json");
            this.putBodyParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        /**
         * 物理空间类型
         */
        public Builder spaceType(String spaceType) {
            this.putBodyParameter("SpaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public CreateSpaceModelRequest build() {
            return new CreateSpaceModelRequest(this);
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
