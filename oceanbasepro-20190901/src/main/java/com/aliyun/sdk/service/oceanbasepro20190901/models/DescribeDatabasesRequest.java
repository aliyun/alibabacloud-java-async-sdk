// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabasesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabasesRequest</p>
 */
public class DescribeDatabasesRequest extends Request {
    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SearchKey")
    private String searchKey;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("WithTables")
    private Boolean withTables;

    private DescribeDatabasesRequest(Builder builder) {
        super(builder);
        this.databaseName = builder.databaseName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.searchKey = builder.searchKey;
        this.tenantId = builder.tenantId;
        this.withTables = builder.withTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabasesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return withTables
     */
    public Boolean getWithTables() {
        return this.withTables;
    }

    public static final class Builder extends Request.Builder<DescribeDatabasesRequest, Builder> {
        private String databaseName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String searchKey; 
        private String tenantId; 
        private Boolean withTables; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatabasesRequest response) {
            super(response);
            this.databaseName = response.databaseName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.searchKey = response.searchKey;
            this.tenantId = response.tenantId;
            this.withTables = response.withTables;
        } 

        /**
         * ?????????????????? ??????????????????????????????????????? test???mysql???
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * ???????????????????????? ????????????1 ????????????1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * ??????????????????????????????????????? ????????????100 ????????????10
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ?????????????????????????????????
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ??????????????????????????????????????? Oracle????????????true???MySQL????????????false???
         */
        public Builder withTables(Boolean withTables) {
            this.putBodyParameter("WithTables", withTables);
            this.withTables = withTables;
            return this;
        }

        @Override
        public DescribeDatabasesRequest build() {
            return new DescribeDatabasesRequest(this);
        } 

    } 

}
