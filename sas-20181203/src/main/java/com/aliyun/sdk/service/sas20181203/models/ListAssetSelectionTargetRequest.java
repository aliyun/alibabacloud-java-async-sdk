// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAssetSelectionTargetRequest} extends {@link RequestModel}
 *
 * <p>ListAssetSelectionTargetRequest</p>
 */
public class ListAssetSelectionTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String selectionKey;

    private ListAssetSelectionTargetRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.selectionKey = builder.selectionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetSelectionTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public static final class Builder extends Request.Builder<ListAssetSelectionTargetRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String selectionKey; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetSelectionTargetRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.selectionKey = request.selectionKey;
        } 

        /**
         * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The globally unique identifier (GUID) of the asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8ccf9b01-2c64-4cba-8122-10115f29****</p>
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        @Override
        public ListAssetSelectionTargetRequest build() {
            return new ListAssetSelectionTargetRequest(this);
        } 

    } 

}
