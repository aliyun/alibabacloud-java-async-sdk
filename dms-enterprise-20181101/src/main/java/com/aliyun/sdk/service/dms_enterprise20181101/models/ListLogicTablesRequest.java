// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListLogicTablesRequest} extends {@link RequestModel}
 *
 * <p>ListLogicTablesRequest</p>
 */
public class ListLogicTablesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnGuid")
    private Boolean returnGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchName")
    private String searchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ListLogicTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseId = builder.databaseId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.returnGuid = builder.returnGuid;
        this.searchName = builder.searchName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogicTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
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
     * @return returnGuid
     */
    public Boolean getReturnGuid() {
        return this.returnGuid;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListLogicTablesRequest, Builder> {
        private String regionId; 
        private String databaseId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean returnGuid; 
        private String searchName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListLogicTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseId = request.databaseId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.returnGuid = request.returnGuid;
            this.searchName = request.searchName;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the logical database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>Specifies whether to return the GUID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder returnGuid(Boolean returnGuid) {
            this.putQueryParameter("ReturnGuid", returnGuid);
            this.returnGuid = returnGuid;
            return this;
        }

        /**
         * <p>The keyword that is used to search for the logical tables. Prefix match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListLogicTablesRequest build() {
            return new ListLogicTablesRequest(this);
        } 

    } 

}
