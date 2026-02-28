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
 * {@link QueryDeviceRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceRequest</p>
 */
public class QueryDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private QueryDeviceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.iotInstanceId = builder.iotInstanceId;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QueryDeviceRequest, Builder> {
        private Integer currentPage; 
        private String iotInstanceId; 
        private String nextToken; 
        private Integer pageSize; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.iotInstanceId = request.iotInstanceId;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
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
         * <p>The token that is used to retrieve the next page of the query results. The first time you perform a query operation, you do not need to configure this parameter. You must specify the token that is obtained from the previous query for the <strong>NextToken</strong> parameter.</p>
         * <p>If the product of the value of the <strong>PageSize</strong> parameter and the value of the <strong>CurrentPage</strong> parameter is greater than 10,000, you must configure the <strong>NextToken</strong> parameter. Otherwise, data cannot be returned.</p>
         * <blockquote>
         * <p>If you configure the <strong>NextToken</strong> parameter, the product of the value of the <strong>PageSize</strong> parameter and the value of the <strong>CurrentPage</strong> parameter must be less than 1,000,000. Otherwise, data cannot be returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm***</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
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
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public QueryDeviceRequest build() {
            return new QueryDeviceRequest(this);
        } 

    } 

}
