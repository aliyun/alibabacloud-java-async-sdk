// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRumAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteRumAppRequest</p>
 */
public class DeleteRumAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppGroup")
    private String appGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealRegionId")
    private String realRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteRumAppRequest(Builder builder) {
        super(builder);
        this.appGroup = builder.appGroup;
        this.appId = builder.appId;
        this.realRegionId = builder.realRegionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRumAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroup
     */
    public String getAppGroup() {
        return this.appGroup;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return realRegionId
     */
    public String getRealRegionId() {
        return this.realRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteRumAppRequest, Builder> {
        private String appGroup; 
        private String appId; 
        private String realRegionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRumAppRequest request) {
            super(request);
            this.appGroup = request.appGroup;
            this.appId = request.appId;
            this.realRegionId = request.realRegionId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The group where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder appGroup(String appGroup) {
            this.putQueryParameter("AppGroup", appGroup);
            this.appGroup = appGroup;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b590lhguqs@28f515462******</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * RealRegionId.
         */
        public Builder realRegionId(String realRegionId) {
            this.putQueryParameter("RealRegionId", realRegionId);
            this.realRegionId = realRegionId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteRumAppRequest build() {
            return new DeleteRumAppRequest(this);
        } 

    } 

}
