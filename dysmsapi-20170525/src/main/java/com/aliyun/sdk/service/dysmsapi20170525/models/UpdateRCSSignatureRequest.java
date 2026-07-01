// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link UpdateRCSSignatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateRCSSignatureRequest</p>
 */
public class UpdateRCSSignatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundImage")
    private String backgroundImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BubbleColor")
    private String bubbleColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private Long category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Latitude")
    private String latitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logo")
    private String logo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Longitude")
    private String longitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeAddress")
    private String officeAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceEmail")
    private String serviceEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePhone")
    private String servicePhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceTerms")
    private String serviceTerms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceWebsite")
    private String serviceWebsite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    private UpdateRCSSignatureRequest(Builder builder) {
        super(builder);
        this.backgroundImage = builder.backgroundImage;
        this.bubbleColor = builder.bubbleColor;
        this.category = builder.category;
        this.description = builder.description;
        this.latitude = builder.latitude;
        this.logo = builder.logo;
        this.longitude = builder.longitude;
        this.officeAddress = builder.officeAddress;
        this.serviceEmail = builder.serviceEmail;
        this.servicePhone = builder.servicePhone;
        this.serviceTerms = builder.serviceTerms;
        this.serviceWebsite = builder.serviceWebsite;
        this.signName = builder.signName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRCSSignatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backgroundImage
     */
    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    /**
     * @return bubbleColor
     */
    public String getBubbleColor() {
        return this.bubbleColor;
    }

    /**
     * @return category
     */
    public Long getCategory() {
        return this.category;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return logo
     */
    public String getLogo() {
        return this.logo;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return officeAddress
     */
    public String getOfficeAddress() {
        return this.officeAddress;
    }

    /**
     * @return serviceEmail
     */
    public String getServiceEmail() {
        return this.serviceEmail;
    }

    /**
     * @return servicePhone
     */
    public String getServicePhone() {
        return this.servicePhone;
    }

    /**
     * @return serviceTerms
     */
    public String getServiceTerms() {
        return this.serviceTerms;
    }

    /**
     * @return serviceWebsite
     */
    public String getServiceWebsite() {
        return this.serviceWebsite;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    public static final class Builder extends Request.Builder<UpdateRCSSignatureRequest, Builder> {
        private String backgroundImage; 
        private String bubbleColor; 
        private Long category; 
        private String description; 
        private String latitude; 
        private String logo; 
        private String longitude; 
        private String officeAddress; 
        private String serviceEmail; 
        private String servicePhone; 
        private String serviceTerms; 
        private String serviceWebsite; 
        private String signName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRCSSignatureRequest request) {
            super(request);
            this.backgroundImage = request.backgroundImage;
            this.bubbleColor = request.bubbleColor;
            this.category = request.category;
            this.description = request.description;
            this.latitude = request.latitude;
            this.logo = request.logo;
            this.longitude = request.longitude;
            this.officeAddress = request.officeAddress;
            this.serviceEmail = request.serviceEmail;
            this.servicePhone = request.servicePhone;
            this.serviceTerms = request.serviceTerms;
            this.serviceWebsite = request.serviceWebsite;
            this.signName = request.signName;
        } 

        /**
         * <p>背景图片ossKey</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder backgroundImage(String backgroundImage) {
            this.putQueryParameter("BackgroundImage", backgroundImage);
            this.backgroundImage = backgroundImage;
            return this;
        }

        /**
         * <p>气泡颜色</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder bubbleColor(String bubbleColor) {
            this.putQueryParameter("BubbleColor", bubbleColor);
            this.bubbleColor = bubbleColor;
            return this;
        }

        /**
         * <p>行业类型</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder category(Long category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>纬度</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder latitude(String latitude) {
            this.putQueryParameter("Latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * <p>logo图片ossKey</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder logo(String logo) {
            this.putQueryParameter("Logo", logo);
            this.logo = logo;
            return this;
        }

        /**
         * <p>经度</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder longitude(String longitude) {
            this.putQueryParameter("Longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * <p>办公地址</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder officeAddress(String officeAddress) {
            this.putQueryParameter("OfficeAddress", officeAddress);
            this.officeAddress = officeAddress;
            return this;
        }

        /**
         * <p>服务邮箱</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder serviceEmail(String serviceEmail) {
            this.putQueryParameter("ServiceEmail", serviceEmail);
            this.serviceEmail = serviceEmail;
            return this;
        }

        /**
         * <p>服务电话</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder servicePhone(String servicePhone) {
            this.putQueryParameter("ServicePhone", servicePhone);
            this.servicePhone = servicePhone;
            return this;
        }

        /**
         * <p>服务条款URL</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder serviceTerms(String serviceTerms) {
            this.putQueryParameter("ServiceTerms", serviceTerms);
            this.serviceTerms = serviceTerms;
            return this;
        }

        /**
         * <p>服务官网URL</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder serviceWebsite(String serviceWebsite) {
            this.putQueryParameter("ServiceWebsite", serviceWebsite);
            this.serviceWebsite = serviceWebsite;
            return this;
        }

        /**
         * <p>签名名称（用于定位5G签名）</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        @Override
        public UpdateRCSSignatureRequest build() {
            return new UpdateRCSSignatureRequest(this);
        } 

    } 

}
