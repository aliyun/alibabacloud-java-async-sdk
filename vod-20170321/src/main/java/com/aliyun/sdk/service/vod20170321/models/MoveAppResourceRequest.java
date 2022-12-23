// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveAppResourceRequest} extends {@link RequestModel}
 *
 * <p>MoveAppResourceRequest</p>
 */
public class MoveAppResourceRequest extends Request {
    @Query
    @NameInMap("ResourceIds")
    @Validation(required = true)
    private String resourceIds;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("TargetAppId")
    @Validation(required = true)
    private String targetAppId;

    private MoveAppResourceRequest(Builder builder) {
        super(builder);
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.targetAppId = builder.targetAppId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveAppResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return targetAppId
     */
    public String getTargetAppId() {
        return this.targetAppId;
    }

    public static final class Builder extends Request.Builder<MoveAppResourceRequest, Builder> {
        private String resourceIds; 
        private String resourceType; 
        private String targetAppId; 

        private Builder() {
            super();
        } 

        private Builder(MoveAppResourceRequest request) {
            super(request);
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.targetAppId = request.targetAppId;
        } 

        /**
         * The ID of the resource. You can specify a maximum of 20 IDs at a time. Separate them with commas (,).
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   **video**
         * *   **image**
         * *   **attached**
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The ID of the application to which resources are migrated. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder targetAppId(String targetAppId) {
            this.putQueryParameter("TargetAppId", targetAppId);
            this.targetAppId = targetAppId;
            return this;
        }

        @Override
        public MoveAppResourceRequest build() {
            return new MoveAppResourceRequest(this);
        } 

    } 

}
