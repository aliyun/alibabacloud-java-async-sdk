// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeDriverRequest} extends {@link RequestModel}
 *
 * <p>QueryEdgeDriverRequest</p>
 */
public class QueryEdgeDriverRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("DriverName")
    private String driverName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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

        private Builder(QueryEdgeDriverRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.driverName = response.driverName;
            this.iotInstanceId = response.iotInstanceId;
            this.pageSize = response.pageSize;
            this.type = response.type;
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
         * DriverName.
         */
        public Builder driverName(String driverName) {
            this.putQueryParameter("DriverName", driverName);
            this.driverName = driverName;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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

        /**
         * Type.
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
