// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchTableRequest} extends {@link RequestModel}
 *
 * <p>SearchTableRequest</p>
 */
public class SearchTableRequest extends Request {
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
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnGuid")
    private Boolean returnGuid;

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

    private SearchTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.returnGuid = builder.returnGuid;
        this.searchKey = builder.searchKey;
        this.searchRange = builder.searchRange;
        this.searchTarget = builder.searchTarget;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTableRequest create() {
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
     * @return returnGuid
     */
    public Boolean getReturnGuid() {
        return this.returnGuid;
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

    public static final class Builder extends Request.Builder<SearchTableRequest, Builder> {
        private String regionId; 
        private String dbType; 
        private String envType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean returnGuid; 
        private String searchKey; 
        private String searchRange; 
        private String searchTarget; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SearchTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbType = request.dbType;
            this.envType = request.envType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.returnGuid = request.returnGuid;
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
         * <p>The type of database. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>DRDS</strong></li>
         * <li><strong>OceanBase</strong></li>
         * <li><strong>Mongo</strong></li>
         * <li><strong>Redis</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The type of the environment to which databases belong. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PRODUCT</p>
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
         * <p>Specifies whether to return the GUID of each table.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder returnGuid(Boolean returnGuid) {
            this.putQueryParameter("ReturnGuid", returnGuid);
            this.returnGuid = returnGuid;
            return this;
        }

        /**
         * <p>The keyword that is used to query tables.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The scope of tables that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>HAS_PERMSSION</strong>: the tables on which the current account has permissions.</li>
         * <li><strong>OWNER</strong>: the tables owned by the current account.</li>
         * <li><strong>MY_FOCUS</strong>: the tables that the current account follows.</li>
         * <li><strong>UNKNOWN</strong>: all tables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        public Builder searchRange(String searchRange) {
            this.putQueryParameter("SearchRange", searchRange);
            this.searchRange = searchRange;
            return this;
        }

        /**
         * <p>The type of table that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>TABLE</strong>: physical and logical tables</li>
         * <li><strong>SINGLE_TABLE</strong>: physical tables</li>
         * <li><strong>LOGIC_TABLE</strong>: logical tables</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOGIC_TABLE</p>
         */
        public Builder searchTarget(String searchTarget) {
            this.putQueryParameter("SearchTarget", searchTarget);
            this.searchTarget = searchTarget;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SearchTableRequest build() {
            return new SearchTableRequest(this);
        } 

    } 

}
