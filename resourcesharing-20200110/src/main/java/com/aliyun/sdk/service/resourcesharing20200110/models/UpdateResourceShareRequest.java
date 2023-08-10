// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceShareRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceShareRequest</p>
 */
public class UpdateResourceShareRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AllowExternalTargets")
    private Boolean allowExternalTargets;

    @Query
    @NameInMap("ResourceShareId")
    @Validation(required = true)
    private String resourceShareId;

    @Query
    @NameInMap("ResourceShareName")
    @Validation(required = true)
    private String resourceShareName;

    private UpdateResourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allowExternalTargets = builder.allowExternalTargets;
        this.resourceShareId = builder.resourceShareId;
        this.resourceShareName = builder.resourceShareName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceShareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return allowExternalTargets
     */
    public Boolean getAllowExternalTargets() {
        return this.allowExternalTargets;
    }

    /**
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    /**
     * @return resourceShareName
     */
    public String getResourceShareName() {
        return this.resourceShareName;
    }

    public static final class Builder extends Request.Builder<UpdateResourceShareRequest, Builder> {
        private String regionId; 
        private Boolean allowExternalTargets; 
        private String resourceShareId; 
        private String resourceShareName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allowExternalTargets = request.allowExternalTargets;
            this.resourceShareId = request.resourceShareId;
            this.resourceShareName = request.resourceShareName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:
         * <p>
         * 
         * *   false: Resources in the resource share can be shared only with accounts in the resource directory.
         * *   true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.
         */
        public Builder allowExternalTargets(Boolean allowExternalTargets) {
            this.putQueryParameter("AllowExternalTargets", allowExternalTargets);
            this.allowExternalTargets = allowExternalTargets;
            return this;
        }

        /**
         * The ID of the resource share.
         */
        public Builder resourceShareId(String resourceShareId) {
            this.putQueryParameter("ResourceShareId", resourceShareId);
            this.resourceShareId = resourceShareId;
            return this;
        }

        /**
         * The new name of the resource share.
         * <p>
         * 
         * The name must be 1 to 50 characters in length.
         * 
         * The name can contain letters, digits, periods (.), underscores (\_), and hyphens (-).
         */
        public Builder resourceShareName(String resourceShareName) {
            this.putQueryParameter("ResourceShareName", resourceShareName);
            this.resourceShareName = resourceShareName;
            return this;
        }

        @Override
        public UpdateResourceShareRequest build() {
            return new UpdateResourceShareRequest(this);
        } 

    } 

}
