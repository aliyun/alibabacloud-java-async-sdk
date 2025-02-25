// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link SearchImageByNameRequest} extends {@link RequestModel}
 *
 * <p>SearchImageByNameRequest</p>
 */
public class SearchImageByNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(maximum = 88888888)
    private Integer categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistinctProductId")
    private Boolean distinctProductId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Num")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer num;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String picName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(maximum = 499)
    private Integer start;

    private SearchImageByNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.distinctProductId = builder.distinctProductId;
        this.filter = builder.filter;
        this.instanceName = builder.instanceName;
        this.num = builder.num;
        this.picName = builder.picName;
        this.productId = builder.productId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageByNameRequest create() {
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
     * @return categoryId
     */
    public Integer getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return distinctProductId
     */
    public Boolean getDistinctProductId() {
        return this.distinctProductId;
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
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<SearchImageByNameRequest, Builder> {
        private String regionId; 
        private Integer categoryId; 
        private Boolean distinctProductId; 
        private String filter; 
        private String instanceName; 
        private Integer num; 
        private String picName; 
        private String productId; 
        private Integer start; 

        private Builder() {
            super();
        } 

        private Builder(SearchImageByNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.distinctProductId = request.distinctProductId;
            this.filter = request.filter;
            this.instanceName = request.instanceName;
            this.num = request.num;
            this.picName = request.picName;
            this.productId = request.productId;
            this.start = request.start;
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
         * <p>The category of the product. For more information, see <a href="https://help.aliyun.com/document_detail/179184.html">Category references</a>.</p>
         * <ul>
         * <li>For product search: If a category is specified, the specified category prevails. If no category is specified, the system estimates and selects a category. The category selected by the system is included in the response.</li>
         * <li>For generic search: The parameter value is set to 88888888 regardless of whether a category is specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>88888888</p>
         */
        public Builder categoryId(Integer categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * DistinctProductId.
         */
        public Builder distinctProductId(Boolean distinctProductId) {
            this.putBodyParameter("DistinctProductId", distinctProductId);
            this.distinctProductId = distinctProductId;
            return this;
        }

        /**
         * <p>The filter conditions. int_attr supports the following operators: &gt;, &gt;=, &lt;, &lt;=, and =. str_attr supports the following operators: = and !=. You can set the logical operator between conditions to AND or OR.</p>
         * <p>Examples:</p>
         * <ul>
         * <li>int_attr&gt;=100</li>
         * <li>str_attr!=&quot;value1&quot;</li>
         * <li>int_attr=1000 AND str_attr=&quot;value1&quot;</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>int_attr&gt;=100</p>
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demoinstance1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The number of images to return on each page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder num(Integer num) {
            this.putBodyParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * <p>The name of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1.jpg</p>
         */
        public Builder picName(String picName) {
            this.putBodyParameter("PicName", picName);
            this.picName = picName;
            return this;
        }

        /**
         * <p>The ID of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The number of the image to return. Valid values: 0 to 499. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder start(Integer start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public SearchImageByNameRequest build() {
            return new SearchImageByNameRequest(this);
        } 

    } 

}
