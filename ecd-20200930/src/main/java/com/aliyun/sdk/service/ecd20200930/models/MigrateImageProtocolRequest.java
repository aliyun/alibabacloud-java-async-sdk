// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateImageProtocolRequest} extends {@link RequestModel}
 *
 * <p>MigrateImageProtocolRequest</p>
 */
public class MigrateImageProtocolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProtocolType")
    private String targetProtocolType;

    private MigrateImageProtocolRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
        this.targetProtocolType = builder.targetProtocolType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateImageProtocolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public java.util.List < String > getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetProtocolType
     */
    public String getTargetProtocolType() {
        return this.targetProtocolType;
    }

    public static final class Builder extends Request.Builder<MigrateImageProtocolRequest, Builder> {
        private java.util.List < String > imageId; 
        private String regionId; 
        private String targetProtocolType; 

        private Builder() {
            super();
        } 

        private Builder(MigrateImageProtocolRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.regionId = request.regionId;
            this.targetProtocolType = request.targetProtocolType;
        } 

        /**
         * The image IDs.
         */
        public Builder imageId(java.util.List < String > imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The protocol to which you want to update the image protocols. Set the value to ASP.
         */
        public Builder targetProtocolType(String targetProtocolType) {
            this.putQueryParameter("TargetProtocolType", targetProtocolType);
            this.targetProtocolType = targetProtocolType;
            return this;
        }

        @Override
        public MigrateImageProtocolRequest build() {
            return new MigrateImageProtocolRequest(this);
        } 

    } 

}
