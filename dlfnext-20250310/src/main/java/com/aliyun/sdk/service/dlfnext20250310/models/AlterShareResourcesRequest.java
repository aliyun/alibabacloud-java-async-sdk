// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link AlterShareResourcesRequest} extends {@link RequestModel}
 *
 * <p>AlterShareResourcesRequest</p>
 */
public class AlterShareResourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("share")
    private String share;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareResourceList")
    private java.util.List<ShareResource> shareResourceList;

    private AlterShareResourcesRequest(Builder builder) {
        super(builder);
        this.share = builder.share;
        this.catalogId = builder.catalogId;
        this.shareResourceList = builder.shareResourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterShareResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return share
     */
    public String getShare() {
        return this.share;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return shareResourceList
     */
    public java.util.List<ShareResource> getShareResourceList() {
        return this.shareResourceList;
    }

    public static final class Builder extends Request.Builder<AlterShareResourcesRequest, Builder> {
        private String share; 
        private String catalogId; 
        private java.util.List<ShareResource> shareResourceList; 

        private Builder() {
            super();
        } 

        private Builder(AlterShareResourcesRequest request) {
            super(request);
            this.share = request.share;
            this.catalogId = request.catalogId;
            this.shareResourceList = request.shareResourceList;
        } 

        /**
         * share.
         */
        public Builder share(String share) {
            this.putPathParameter("share", share);
            this.share = share;
            return this;
        }

        /**
         * catalogId.
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("catalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * shareResourceList.
         */
        public Builder shareResourceList(java.util.List<ShareResource> shareResourceList) {
            this.putBodyParameter("shareResourceList", shareResourceList);
            this.shareResourceList = shareResourceList;
            return this;
        }

        @Override
        public AlterShareResourcesRequest build() {
            return new AlterShareResourcesRequest(this);
        } 

    } 

}
