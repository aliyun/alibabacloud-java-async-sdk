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
 * {@link DeleteImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageRequest</p>
 */
public class DeleteImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDeleteByFilter")
    private Boolean isDeleteByFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PicName")
    private String picName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    private DeleteImageRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.instanceName = builder.instanceName;
        this.isDeleteByFilter = builder.isDeleteByFilter;
        this.picName = builder.picName;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return isDeleteByFilter
     */
    public Boolean getIsDeleteByFilter() {
        return this.isDeleteByFilter;
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

    public static final class Builder extends Request.Builder<DeleteImageRequest, Builder> {
        private String filter; 
        private String instanceName; 
        private Boolean isDeleteByFilter; 
        private String picName; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageRequest request) {
            super(request);
            this.filter = request.filter;
            this.instanceName = request.instanceName;
            this.isDeleteByFilter = request.isDeleteByFilter;
            this.picName = request.picName;
            this.productId = request.productId;
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
         * IsDeleteByFilter.
         */
        public Builder isDeleteByFilter(Boolean isDeleteByFilter) {
            this.putBodyParameter("IsDeleteByFilter", isDeleteByFilter);
            this.isDeleteByFilter = isDeleteByFilter;
            return this;
        }

        /**
         * <p>The name of the image.</p>
         * <ul>
         * <li>If this parameter is not set, the system deletes all the images that correspond to the specified ProductId parameter.</li>
         * <li>If this parameter is set, the system deletes only the image that is specified by the ProductId and PicName parameters.</li>
         * </ul>
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
         * <p>The ID of the commodity.</p>
         * <blockquote>
         * <p> A commodity may have multiple images.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public DeleteImageRequest build() {
            return new DeleteImageRequest(this);
        } 

    } 

}
