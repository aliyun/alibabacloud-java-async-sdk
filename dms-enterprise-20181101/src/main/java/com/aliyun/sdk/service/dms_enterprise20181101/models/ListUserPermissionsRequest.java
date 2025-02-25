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
 * {@link ListUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ListUserPermissionsRequest</p>
 */
public class ListUserPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logic")
    private Boolean logic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ListUserPermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseName = builder.databaseName;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.logic = builder.logic;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.permType = builder.permType;
        this.searchKey = builder.searchKey;
        this.tid = builder.tid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserPermissionsRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
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
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
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
     * @return permType
     */
    public String getPermType() {
        return this.permType;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListUserPermissionsRequest, Builder> {
        private String regionId; 
        private String databaseName; 
        private String dbType; 
        private String envType; 
        private Boolean logic; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String permType; 
        private String searchKey; 
        private Long tid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserPermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseName = request.databaseName;
            this.dbType = request.dbType;
            this.envType = request.envType;
            this.logic = request.logic;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.permType = request.permType;
            this.searchKey = request.searchKey;
            this.tid = request.tid;
            this.userId = request.userId;
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
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db_name</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li>product: production environment</li>
         * <li>dev: development environment</li>
         * <li>pre: staging environment</li>
         * <li>test: test environment</li>
         * <li>sit: SIT environment</li>
         * <li>uat: user acceptance testing (UAT) environment</li>
         * <li>pet: stress testing environment</li>
         * <li>stag: STAG environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li>true: The database is a logical database.</li>
         * <li>false: The database is a physical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
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
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The permissions on a specific type of resources that you want to query. Valid values:</p>
         * <ul>
         * <li>DATABASE: permissions on databases</li>
         * <li>TABLE: permissions on tables</li>
         * <li>COLUMN: permissions on fields</li>
         * <li>INSTANCE: permissions on instances</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        public Builder permType(String permType) {
            this.putQueryParameter("PermType", permType);
            this.permType = permType;
            return this;
        }

        /**
         * <p>The keyword used in the query. For example, if you want to query permissions on an instance, you can specify the endpoint of the instance, such as rm-bp144d5ky4l4r****.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp144d5ky4l4r****</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a> topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The ID of the user. You can call the <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> or <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> operation to query the ID of the user.</p>
         * <blockquote>
         * <p> The user ID is different from the ID of your Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListUserPermissionsRequest build() {
            return new ListUserPermissionsRequest(this);
        } 

    } 

}
