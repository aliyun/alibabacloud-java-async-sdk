// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateResourceShareRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceShareRequest</p>
 */
public class UpdateResourceShareRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowExternalTargets")
    private Boolean allowExternalTargets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceShareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
         * <ul>
         * <li>false: Resources in the resource share can be shared only with accounts in the resource directory.</li>
         * <li>true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowExternalTargets(Boolean allowExternalTargets) {
            this.putQueryParameter("AllowExternalTargets", allowExternalTargets);
            this.allowExternalTargets = allowExternalTargets;
            return this;
        }

        /**
         * <p>The ID of the resource share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-qSkW1HBY****</p>
         */
        public Builder resourceShareId(String resourceShareId) {
            this.putQueryParameter("ResourceShareId", resourceShareId);
            this.resourceShareId = resourceShareId;
            return this;
        }

        /**
         * <p>The new name of the resource share.</p>
         * <p>The name must be 1 to 50 characters in length.</p>
         * <p>The name can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>new</p>
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
