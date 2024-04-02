// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizTypeTextLibRequest} extends {@link RequestModel}
 *
 * <p>DescribeBizTypeTextLibRequest</p>
 */
public class DescribeBizTypeTextLibRequest extends Request {
    @Query
    @NameInMap("BizTypeName")
    @Validation(required = true)
    private String bizTypeName;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    private DescribeBizTypeTextLibRequest(Builder builder) {
        super(builder);
        this.bizTypeName = builder.bizTypeName;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizTypeTextLibRequest create() {
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<DescribeBizTypeTextLibRequest, Builder> {
        private String bizTypeName; 
        private String resourceType; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBizTypeTextLibRequest request) {
            super(request);
            this.bizTypeName = request.bizTypeName;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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

        @Override
        public DescribeBizTypeTextLibRequest build() {
            return new DescribeBizTypeTextLibRequest(this);
        } 

    } 

}
