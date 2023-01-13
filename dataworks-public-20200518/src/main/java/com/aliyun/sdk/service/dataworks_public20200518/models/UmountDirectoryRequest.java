// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UmountDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UmountDirectoryRequest</p>
 */
public class UmountDirectoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TargetId")
    private String targetId;

    @Body
    @NameInMap("TargetType")
    private String targetType;

    private UmountDirectoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UmountDirectoryRequest create() {
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<UmountDirectoryRequest, Builder> {
        private String regionId; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(UmountDirectoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
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
         * TargetId.
         */
        public Builder targetId(String targetId) {
            this.putBodyParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public UmountDirectoryRequest build() {
            return new UmountDirectoryRequest(this);
        } 

    } 

}
