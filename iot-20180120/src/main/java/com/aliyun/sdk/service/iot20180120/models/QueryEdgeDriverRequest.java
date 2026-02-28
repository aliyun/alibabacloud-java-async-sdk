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
 * {@link QueryEdgeDriverRequest} extends {@link RequestModel}
 *
 * <p>QueryEdgeDriverRequest</p>
 */
public class QueryEdgeDriverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverName")
    private String driverName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private QueryEdgeDriverRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.driverName = builder.driverName;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeDriverRequest create() {
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
     * @return driverName
     */
    public String getDriverName() {
        return this.driverName;
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
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryEdgeDriverRequest, Builder> {
        private Integer currentPage; 
        private String driverName; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(QueryEdgeDriverRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.driverName = request.driverName;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * <p>The number of the page to return. Default value: 1. If you specify a value smaller than 1, pages start from page 1.</p>
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
         * <p>The name of the driver whose information is to be queried. If you want to query information about drivers with a specific name, set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MyledDriver</p>
         */
        public Builder driverName(String driverName) {
            this.putQueryParameter("DriverName", driverName);
            this.driverName = driverName;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for public instances. However, this parameter is required for the instances that you have purchased.</p>
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
         * <p>The number of entries to return on each page. Maximum value: 30. Default value: 10. If you specify a value smaller than 1, a maximum of 10 entries are displayed on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the driver whose information is to be queried. Valid values:</p>
         * <ul>
         * <li>0: official driver</li>
         * <li>1: custom driver</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryEdgeDriverRequest build() {
            return new QueryEdgeDriverRequest(this);
        } 

    } 

}
