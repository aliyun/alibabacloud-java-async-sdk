// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListConnectorsRequest} extends {@link RequestModel}
 *
 * <p>ListConnectorsRequest</p>
 */
public class ListConnectorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorIds")
    private java.util.List<String> connectorIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchStatus")
    private String switchStatus;

    private ListConnectorsRequest(Builder builder) {
        super(builder);
        this.connectorIds = builder.connectorIds;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.switchStatus = builder.switchStatus;
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
    public java.util.List<String> getConnectorIds() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return this.switchStatus;
    }

    public static final class Builder extends Request.Builder<ListConnectorsRequest, Builder> {
        private java.util.List<String> connectorIds; 
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 
        private String status; 
        private String switchStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectorsRequest request) {
            super(request);
            this.connectorIds = request.connectorIds;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.switchStatus = request.switchStatus;
        } 

        /**
         * <p>An array of up to 100 ConnectorIDs.</p>
         */
        public Builder connectorIds(java.util.List<String> connectorIds) {
            this.putQueryParameter("ConnectorIds", connectorIds);
            this.connectorIds = connectorIds;
            return this;
        }

        /**
         * <p>The number of the page to return. Valid values: 1 to 10,000.</p>
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
         * <p>The name of the connector. The name must be 1 to 128 characters long and can contain letters, Chinese characters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>connector_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 1,000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The connection status of the connector. Valid values:</p>
         * <ul>
         * <li><p><strong>Online</strong></p>
         * </li>
         * <li><p><strong>Offline</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The state of the connector instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong></p>
         * </li>
         * <li><p><strong>Disabled</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder switchStatus(String switchStatus) {
            this.putQueryParameter("SwitchStatus", switchStatus);
            this.switchStatus = switchStatus;
            return this;
        }

        @Override
        public ListConnectorsRequest build() {
            return new ListConnectorsRequest(this);
        } 

    } 

}
