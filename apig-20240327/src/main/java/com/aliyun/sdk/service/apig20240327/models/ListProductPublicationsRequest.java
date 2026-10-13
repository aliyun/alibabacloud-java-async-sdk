// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListProductPublicationsRequest} extends {@link RequestModel}
 *
 * <p>ListProductPublicationsRequest</p>
 */
public class ListProductPublicationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("portalName")
    private String portalName;

    private ListProductPublicationsRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portalName = builder.portalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductPublicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return portalName
     */
    public String getPortalName() {
        return this.portalName;
    }

    public static final class Builder extends Request.Builder<ListProductPublicationsRequest, Builder> {
        private String productId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String portalName; 

        private Builder() {
            super();
        } 

        private Builder(ListProductPublicationsRequest request) {
            super(request);
            this.productId = request.productId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.portalName = request.portalName;
        } 

        /**
         * <p>The ID of the API product. This is the primary ID of the API product resource and specifies the API product for which you want to query publication records.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the portal to which the API product is published.</p>
         * 
         * <strong>example:</strong>
         * <p>developer-portal</p>
         */
        public Builder portalName(String portalName) {
            this.putQueryParameter("portalName", portalName);
            this.portalName = portalName;
            return this;
        }

        @Override
        public ListProductPublicationsRequest build() {
            return new ListProductPublicationsRequest(this);
        } 

    } 

}
