// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20190325.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageRequest} extends {@link RequestModel}
 *
 * <p>AddImageRequest</p>
 */
public class AddImageRequest extends Request {
    @Body
    @NameInMap("CategoryId")
    private Integer categoryId;

    @Body
    @NameInMap("Crop")
    private Boolean crop;

    @Body
    @NameInMap("CustomContent")
    private String customContent;

    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("IntAttr")
    private Integer intAttr;

    @Body
    @NameInMap("PicContent")
    @Validation(required = true)
    private String picContent;

    @Body
    @NameInMap("PicName")
    @Validation(required = true)
    private String picName;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    @Body
    @NameInMap("Region")
    private String region;

    @Body
    @NameInMap("StrAttr")
    private String strAttr;

    private AddImageRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.crop = builder.crop;
        this.customContent = builder.customContent;
        this.instanceName = builder.instanceName;
        this.intAttr = builder.intAttr;
        this.picContent = builder.picContent;
        this.picName = builder.picName;
        this.productId = builder.productId;
        this.region = builder.region;
        this.strAttr = builder.strAttr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Integer getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return crop
     */
    public Boolean getCrop() {
        return this.crop;
    }

    /**
     * @return customContent
     */
    public String getCustomContent() {
        return this.customContent;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return intAttr
     */
    public Integer getIntAttr() {
        return this.intAttr;
    }

    /**
     * @return picContent
     */
    public String getPicContent() {
        return this.picContent;
    }

    /**
     * @return picName
     */
    public String getPicName() {
        return this.picName;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return strAttr
     */
    public String getStrAttr() {
        return this.strAttr;
    }

    public static final class Builder extends Request.Builder<AddImageRequest, Builder> {
        private Integer categoryId; 
        private Boolean crop; 
        private String customContent; 
        private String instanceName; 
        private Integer intAttr; 
        private String picContent; 
        private String picName; 
        private String productId; 
        private String region; 
        private String strAttr; 

        private Builder() {
            super();
        } 

        private Builder(AddImageRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.crop = request.crop;
            this.customContent = request.customContent;
            this.instanceName = request.instanceName;
            this.intAttr = request.intAttr;
            this.picContent = request.picContent;
            this.picName = request.picName;
            this.productId = request.productId;
            this.region = request.region;
            this.strAttr = request.strAttr;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Integer categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Crop.
         */
        public Builder crop(Boolean crop) {
            this.putBodyParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * CustomContent.
         */
        public Builder customContent(String customContent) {
            this.putBodyParameter("CustomContent", customContent);
            this.customContent = customContent;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IntAttr.
         */
        public Builder intAttr(Integer intAttr) {
            this.putBodyParameter("IntAttr", intAttr);
            this.intAttr = intAttr;
            return this;
        }

        /**
         * PicContent.
         */
        public Builder picContent(String picContent) {
            this.putBodyParameter("PicContent", picContent);
            this.picContent = picContent;
            return this;
        }

        /**
         * PicName.
         */
        public Builder picName(String picName) {
            this.putBodyParameter("PicName", picName);
            this.picName = picName;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * StrAttr.
         */
        public Builder strAttr(String strAttr) {
            this.putBodyParameter("StrAttr", strAttr);
            this.strAttr = strAttr;
            return this;
        }

        @Override
        public AddImageRequest build() {
            return new AddImageRequest(this);
        } 

    } 

}
