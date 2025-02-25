// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListEdgeContainerAppRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListEdgeContainerAppRecordsRequest</p>
 */
public class ListEdgeContainerAppRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderKey")
    private String orderKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    private ListEdgeContainerAppRecordsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.orderKey = builder.orderKey;
        this.orderType = builder.orderType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeContainerAppRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return orderKey
     */
    public String getOrderKey() {
        return this.orderKey;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    public static final class Builder extends Request.Builder<ListEdgeContainerAppRecordsRequest, Builder> {
        private String appId; 
        private String orderKey; 
        private String orderType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(ListEdgeContainerAppRecordsRequest request) {
            super(request);
            this.appId = request.appId;
            this.orderKey = request.orderKey;
            this.orderType = request.orderType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
        } 

        /**
         * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The sorting field. Valid values:</p>
         * <ul>
         * <li>CreateTime: the time when the domain name was associated.</li>
         * <li>CreateTime: the time when the domain name was last modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder orderKey(String orderKey) {
            this.putQueryParameter("OrderKey", orderKey);
            this.orderKey = orderKey;
            return this;
        }

        /**
         * <p>The order in which you want to sort the query results. Valid values:</p>
         * <ul>
         * <li>ASC: in ascending order.</li>
         * <li>DESC: in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The page number. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Valid values: 1 to 500.</p>
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
         * <p>The keyword that is used for the search.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-1006157458290860032</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public ListEdgeContainerAppRecordsRequest build() {
            return new ListEdgeContainerAppRecordsRequest(this);
        } 

    } 

}
