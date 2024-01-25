// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceListRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceListRequest</p>
 */
public class GetDataSourceListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("DataSourceName")
    private String dataSourceName;

    @Query
    @NameInMap("DataSourceType")
    private Integer dataSourceType;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private GetDataSourceListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceType = builder.dataSourceType;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceListRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceType
     */
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetDataSourceListRequest, Builder> {
        private Integer currentPage; 
        private String dataSourceName; 
        private Integer dataSourceType; 
        private String operaUid; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceType = request.dataSourceType;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
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
         * DataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(Integer dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
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
        public GetDataSourceListRequest build() {
            return new GetDataSourceListRequest(this);
        } 

    } 

}
