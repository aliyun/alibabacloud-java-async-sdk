// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddInstallCodeRequest} extends {@link RequestModel}
 *
 * <p>AddInstallCodeRequest</p>
 */
public class AddInstallCodeRequest extends Request {
    @Query
    @NameInMap("ExpiredDate")
    private Long expiredDate;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("OnlyImage")
    private Boolean onlyImage;

    @Query
    @NameInMap("Os")
    private String os;

    @Query
    @NameInMap("VendorName")
    private String vendorName;

    private AddInstallCodeRequest(Builder builder) {
        super(builder);
        this.expiredDate = builder.expiredDate;
        this.groupId = builder.groupId;
        this.onlyImage = builder.onlyImage;
        this.os = builder.os;
        this.vendorName = builder.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInstallCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiredDate
     */
    public Long getExpiredDate() {
        return this.expiredDate;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return onlyImage
     */
    public Boolean getOnlyImage() {
        return this.onlyImage;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return vendorName
     */
    public String getVendorName() {
        return this.vendorName;
    }

    public static final class Builder extends Request.Builder<AddInstallCodeRequest, Builder> {
        private Long expiredDate; 
        private Long groupId; 
        private Boolean onlyImage; 
        private String os; 
        private String vendorName; 

        private Builder() {
            super();
        } 

        private Builder(AddInstallCodeRequest request) {
            super(request);
            this.expiredDate = request.expiredDate;
            this.groupId = request.groupId;
            this.onlyImage = request.onlyImage;
            this.os = request.os;
            this.vendorName = request.vendorName;
        } 

        /**
         * 6134
         */
        public Builder expiredDate(Long expiredDate) {
            this.putQueryParameter("ExpiredDate", expiredDate);
            this.expiredDate = expiredDate;
            return this;
        }

        /**
         * Specifies whether to create an image. Default value: **false**. Valid values:
         * <p>
         * 
         * *   **false**: does not create an image.
         * *   **true**: creates an image.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The operating system of the instance. Default value: **linux**. Valid values:
         * <p>
         * 
         * *   **linux**
         * *   **windows**
         * *   **windows-2003**
         */
        public Builder onlyImage(Boolean onlyImage) {
            this.putQueryParameter("OnlyImage", onlyImage);
            this.onlyImage = onlyImage;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * The ID of the asset group to which the you want to add the asset.
         * <p>
         * 
         * >  You can call the [DescribeAllGroups](~~describeallgroups~~) operation to query the IDs of asset groups.
         */
        public Builder vendorName(String vendorName) {
            this.putQueryParameter("VendorName", vendorName);
            this.vendorName = vendorName;
            return this;
        }

        @Override
        public AddInstallCodeRequest build() {
            return new AddInstallCodeRequest(this);
        } 

    } 

}
