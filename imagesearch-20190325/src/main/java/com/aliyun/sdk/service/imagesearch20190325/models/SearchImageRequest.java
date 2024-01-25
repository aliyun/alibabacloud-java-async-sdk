// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20190325.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchImageRequest} extends {@link RequestModel}
 *
 * <p>SearchImageRequest</p>
 */
public class SearchImageRequest extends Request {
    @Body
    @NameInMap("CategoryId")
    private Integer categoryId;

    @Body
    @NameInMap("Crop")
    private Boolean crop;

    @Body
    @NameInMap("Filter")
    private String filter;

    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("Num")
    private Integer num;

    @Body
    @NameInMap("PicContent")
    private String picContent;

    @Body
    @NameInMap("PicName")
    private String picName;

    @Body
    @NameInMap("ProductId")
    private String productId;

    @Body
    @NameInMap("Region")
    private String region;

    @Body
    @NameInMap("Start")
    private Integer start;

    @Body
    @NameInMap("Type")
    private String type;

    private SearchImageRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.crop = builder.crop;
        this.filter = builder.filter;
        this.instanceName = builder.instanceName;
        this.num = builder.num;
        this.picContent = builder.picContent;
        this.picName = builder.picName;
        this.productId = builder.productId;
        this.region = builder.region;
        this.start = builder.start;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageRequest create() {
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
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
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SearchImageRequest, Builder> {
        private Integer categoryId; 
        private Boolean crop; 
        private String filter; 
        private String instanceName; 
        private Integer num; 
        private String picContent; 
        private String picName; 
        private String productId; 
        private String region; 
        private Integer start; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SearchImageRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.crop = request.crop;
            this.filter = request.filter;
            this.instanceName = request.instanceName;
            this.num = request.num;
            this.picContent = request.picContent;
            this.picName = request.picName;
            this.productId = request.productId;
            this.region = request.region;
            this.start = request.start;
            this.type = request.type;
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
         * Filter.
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
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
         * Num.
         */
        public Builder num(Integer num) {
            this.putBodyParameter("Num", num);
            this.num = num;
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
         * Start.
         */
        public Builder start(Integer start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SearchImageRequest build() {
            return new SearchImageRequest(this);
        } 

    } 

}
