// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectorsRequest} extends {@link RequestModel}
 *
 * <p>ListConnectorsRequest</p>
 */
public class ListConnectorsRequest extends Request {
    @Query
    @NameInMap("ConnectorIds")
    private java.util.List < String > connectorIds;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListConnectorsRequest(Builder builder) {
        super(builder);
        this.connectorIds = builder.connectorIds;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectorIds
     */
    public java.util.List < String > getConnectorIds() {
        return this.connectorIds;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListConnectorsRequest, Builder> {
        private java.util.List < String > connectorIds; 
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectorsRequest request) {
            super(request);
            this.connectorIds = request.connectorIds;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
        } 

        /**
         * ConnectorIds.
         */
        public Builder connectorIds(java.util.List < String > connectorIds) {
            String connectorIdsShrink = shrink(connectorIds, "ConnectorIds", "json");
            this.putQueryParameter("ConnectorIds", connectorIdsShrink);
            this.connectorIds = connectorIds;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListConnectorsRequest build() {
            return new ListConnectorsRequest(this);
        } 

    } 

}
