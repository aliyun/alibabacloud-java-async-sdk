// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchDatabaseRequest} extends {@link RequestModel}
 *
 * <p>SearchDatabaseRequest</p>
 */
public class SearchDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRange")
    private String searchRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchTarget")
    private String searchTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private SearchDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.searchRange = builder.searchRange;
        this.searchTarget = builder.searchTarget;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDatabaseRequest create() {
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
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
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

    /**
     * @return searchRange
     */
    public String getSearchRange() {
        return this.searchRange;
    }

    /**
     * @return searchTarget
     */
    public String getSearchTarget() {
        return this.searchTarget;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SearchDatabaseRequest, Builder> {
        private String regionId; 
        private String dbType; 
        private String envType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private String searchRange; 
        private String searchTarget; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SearchDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbType = request.dbType;
            this.envType = request.envType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.searchRange = request.searchRange;
            this.searchTarget = request.searchTarget;
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
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The environment type of the database. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
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
         * <p>The keyword that is used to search for databases.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The query range based on permissions. Valid values:</p>
         * <ul>
         * <li><strong>HAS_PERMSSION</strong>: searches for databases on which the current user has permissions.</li>
         * <li><strong>OWNER</strong>: searches for databases owned by the current user.</li>
         * <li><strong>MY_FOCUS</strong>: searches for databases that the current user follows.</li>
         * <li><strong>UNKNOWN</strong>: searches for all databases.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HAS_PERMSSION</p>
         */
        public Builder searchRange(String searchRange) {
            this.putQueryParameter("SearchRange", searchRange);
            this.searchRange = searchRange;
            return this;
        }

        /**
         * <p>The category of the database. Valid values:</p>
         * <ul>
         * <li><strong>DB</strong>: single database or logical database.</li>
         * <li><strong>SINGLE_DB</strong>: single database.</li>
         * <li><strong>LOGIC_DB</strong>: logical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_DB</p>
         */
        public Builder searchTarget(String searchTarget) {
            this.putQueryParameter("SearchTarget", searchTarget);
            this.searchTarget = searchTarget;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SearchDatabaseRequest build() {
            return new SearchDatabaseRequest(this);
        } 

    } 

}
