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
 * {@link ListPortalPublicationsRequest} extends {@link RequestModel}
 *
 * <p>ListPortalPublicationsRequest</p>
 */
public class ListPortalPublicationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("portalId")
    private String portalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    private ListPortalPublicationsRequest(Builder builder) {
        super(builder);
        this.portalId = builder.portalId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productName = builder.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPortalPublicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portalId
     */
    public String getPortalId() {
        return this.portalId;
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
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    public static final class Builder extends Request.Builder<ListPortalPublicationsRequest, Builder> {
        private String portalId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productName; 

        private Builder() {
            super();
        } 

        private Builder(ListPortalPublicationsRequest request) {
            super(request);
            this.portalId = request.portalId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productName = request.productName;
        } 

        /**
         * <p>The portal ID. Specifies the HiMarket developer portal for which to query published API products. You can obtain this ID from the portalId parameter in the CreatePortal response or from a list item in the ListPortals response. This ID is used in the /himarket/v1/portals/{portalId} path to locate the portal, the same path used by the GetPortal, UpdatePortal, and DeletePortal operations.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        public Builder portalId(String portalId) {
            this.putPathParameter("portalId", portalId);
            this.portalId = portalId;
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
         * <p>The page size.</p>
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
         * <p>The API product name. This corresponds to the productName field in the response list items.</p>
         * 
         * <strong>example:</strong>
         * <p>model-service</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("productName", productName);
            this.productName = productName;
            return this;
        }

        @Override
        public ListPortalPublicationsRequest build() {
            return new ListPortalPublicationsRequest(this);
        } 

    } 

}
