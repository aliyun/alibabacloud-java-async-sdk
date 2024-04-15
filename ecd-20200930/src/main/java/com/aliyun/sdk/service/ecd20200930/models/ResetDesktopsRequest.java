// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDesktopsRequest} extends {@link RequestModel}
 *
 * <p>ResetDesktopsRequest</p>
 */
public class ResetDesktopsRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopGroupIds")
    private java.util.List < String > desktopGroupIds;

    @Query
    @NameInMap("DesktopId")
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResetScope")
    private String resetScope;

    @Query
    @NameInMap("ResetType")
    @Validation(required = true)
    private String resetType;

    private ResetDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupIds = builder.desktopGroupIds;
        this.desktopId = builder.desktopId;
        this.imageId = builder.imageId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resetScope = builder.resetScope;
        this.resetType = builder.resetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDesktopsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopGroupIds
     */
    public java.util.List < String > getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resetScope
     */
    public String getResetScope() {
        return this.resetScope;
    }

    /**
     * @return resetType
     */
    public String getResetType() {
        return this.resetType;
    }

    public static final class Builder extends Request.Builder<ResetDesktopsRequest, Builder> {
        private String desktopGroupId; 
        private java.util.List < String > desktopGroupIds; 
        private java.util.List < String > desktopId; 
        private String imageId; 
        private String payType; 
        private String regionId; 
        private String resetScope; 
        private String resetType; 

        private Builder() {
            super();
        } 

        private Builder(ResetDesktopsRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.desktopGroupIds = request.desktopGroupIds;
            this.desktopId = request.desktopId;
            this.imageId = request.imageId;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resetScope = request.resetScope;
            this.resetType = request.resetType;
        } 

        /**
         * The ID of the cloud computer pool. If you specify the `DesktopId` parameter, ignore the `DesktopGroupId` parameter. If you do not specify the `DesktopId` parameter, specify the `DesktopGroupId` parameter in the call to request all IDs of the cloud computers in the specified pool.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The IDs of the cloud computer pools.
         */
        public Builder desktopGroupIds(java.util.List < String > desktopGroupIds) {
            this.putQueryParameter("DesktopGroupIds", desktopGroupIds);
            this.desktopGroupIds = desktopGroupIds;
            return this;
        }

        /**
         * The IDs of the cloud computers. You can specify the IDs of 1 to 100 cloud computers.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The billing method.
         * <p>
         * 
         * > This parameter is available only when you reset cloud computer pools. If you leave this parameter empty, all cloud computers in the specified cloud computer pool are reset, regardless of how the cloud computers are billed.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~436773~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The reset scope. You can configure this parameter to reset the image or cloud computer.
         * <p>
         * 
         * Valid values:
         * 
         * *   ALL (default): resets the image and cloud computer.
         * *   IMAGE: resets only the image.
         */
        public Builder resetScope(String resetScope) {
            this.putQueryParameter("ResetScope", resetScope);
            this.resetScope = resetScope;
            return this;
        }

        /**
         * The disk reset type.
         * <p>
         * 
         * Valid values:
         * 
         * *   0: does not reset disks.
         * *   1: resets only the system disk.
         * *   2: resets only the user disk.
         * *   3: resets the system disk and the user disk.
         */
        public Builder resetType(String resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        @Override
        public ResetDesktopsRequest build() {
            return new ResetDesktopsRequest(this);
        } 

    } 

}
