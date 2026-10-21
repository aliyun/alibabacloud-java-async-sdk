// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateVendorRequest} extends {@link RequestModel}
 *
 * <p>UpdateVendorRequest</p>
 */
public class UpdateVendorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorId")
    private String vendorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorName")
    private String vendorName;

    private UpdateVendorRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.vendorId = builder.vendorId;
        this.vendorName = builder.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVendorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return vendorId
     */
    public String getVendorId() {
        return this.vendorId;
    }

    /**
     * @return vendorName
     */
    public String getVendorName() {
        return this.vendorName;
    }

    public static final class Builder extends Request.Builder<UpdateVendorRequest, Builder> {
        private String lang; 
        private String regionId; 
        private Long roleFor; 
        private String vendorId; 
        private String vendorName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVendorRequest request) {
            super(request);
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorId = request.vendorId;
            this.vendorName = request.vendorName;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region of the Data Management center for threat analysis. Select the region based on where your asset is located. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: The asset is in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: The asset is outside China.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID of the member. This parameter allows an administrator to switch to the perspective of a member.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The ID of the vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>vd-qlsw5eocx94w9</p>
         */
        public Builder vendorId(String vendorId) {
            this.putBodyParameter("VendorId", vendorId);
            this.vendorId = vendorId;
            return this;
        }

        /**
         * <p>The name of the vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder vendorName(String vendorName) {
            this.putBodyParameter("VendorName", vendorName);
            this.vendorName = vendorName;
            return this;
        }

        @Override
        public UpdateVendorRequest build() {
            return new UpdateVendorRequest(this);
        } 

    } 

}
