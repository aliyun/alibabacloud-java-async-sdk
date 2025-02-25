// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBizTypeImageLibRequest} extends {@link RequestModel}
 *
 * <p>UpdateBizTypeImageLibRequest</p>
 */
public class UpdateBizTypeImageLibRequest extends Request {
    @Query
    @NameInMap("BizTypeName")
    @Validation(required = true)
    private String bizTypeName;

    @Query
    @NameInMap("Black")
    private String black;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Review")
    private String review;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Query
    @NameInMap("White")
    private String white;

    private UpdateBizTypeImageLibRequest(Builder builder) {
        super(builder);
        this.bizTypeName = builder.bizTypeName;
        this.black = builder.black;
        this.resourceType = builder.resourceType;
        this.review = builder.review;
        this.scene = builder.scene;
        this.white = builder.white;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizTypeImageLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypeName
     */
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    /**
     * @return black
     */
    public String getBlack() {
        return this.black;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return review
     */
    public String getReview() {
        return this.review;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return white
     */
    public String getWhite() {
        return this.white;
    }

    public static final class Builder extends Request.Builder<UpdateBizTypeImageLibRequest, Builder> {
        private String bizTypeName; 
        private String black; 
        private String resourceType; 
        private String review; 
        private String scene; 
        private String white; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBizTypeImageLibRequest request) {
            super(request);
            this.bizTypeName = request.bizTypeName;
            this.black = request.black;
            this.resourceType = request.resourceType;
            this.review = request.review;
            this.scene = request.scene;
            this.white = request.white;
        } 

        /**
         * BizTypeName.
         */
        public Builder bizTypeName(String bizTypeName) {
            this.putQueryParameter("BizTypeName", bizTypeName);
            this.bizTypeName = bizTypeName;
            return this;
        }

        /**
         * Black.
         */
        public Builder black(String black) {
            this.putQueryParameter("Black", black);
            this.black = black;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Review.
         */
        public Builder review(String review) {
            this.putQueryParameter("Review", review);
            this.review = review;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * White.
         */
        public Builder white(String white) {
            this.putQueryParameter("White", white);
            this.white = white;
            return this;
        }

        @Override
        public UpdateBizTypeImageLibRequest build() {
            return new UpdateBizTypeImageLibRequest(this);
        } 

    } 

}
