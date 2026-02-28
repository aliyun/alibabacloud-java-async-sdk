// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryProductListRequest} extends {@link RequestModel}
 *
 * <p>QueryProductListRequest</p>
 */
public class QueryProductListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunCommodityCode")
    private String aliyunCommodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private QueryProductListRequest(Builder builder) {
        super(builder);
        this.aliyunCommodityCode = builder.aliyunCommodityCode;
        this.currentPage = builder.currentPage;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunCommodityCode
     */
    public String getAliyunCommodityCode() {
        return this.aliyunCommodityCode;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<QueryProductListRequest, Builder> {
        private String aliyunCommodityCode; 
        private Integer currentPage; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryProductListRequest request) {
            super(request);
            this.aliyunCommodityCode = request.aliyunCommodityCode;
            this.currentPage = request.currentPage;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The type of the product. Valid values:</p>
         * <ul>
         * <li><strong>iothub_senior</strong>: A Thing Specification Language (TSL) model is used for the product.</li>
         * <li><strong>iothub</strong>: No TSL model is used for the product.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not configure this parameter, all products are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>iothub_senior</p>
         */
        public Builder aliyunCommodityCode(String aliyunCommodityCode) {
            this.putQueryParameter("AliyunCommodityCode", aliyunCommodityCode);
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the product belongs. You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups">Resource Management</a> console to view the details of the resource group.</p>
         * <blockquote>
         * <p>You can specify a value for this parameter only if you have activated Resource Management.</p>
         * </blockquote>
         * <p>If you leave this parameter empty, the information about all products in the current account is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public QueryProductListRequest build() {
            return new QueryProductListRequest(this);
        } 

    } 

}
