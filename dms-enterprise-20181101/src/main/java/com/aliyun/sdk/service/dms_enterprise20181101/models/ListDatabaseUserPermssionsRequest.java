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
 * {@link ListDatabaseUserPermssionsRequest} extends {@link RequestModel}
 *
 * <p>ListDatabaseUserPermssionsRequest</p>
 */
public class ListDatabaseUserPermssionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbId;

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
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListDatabaseUserPermssionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.permType = builder.permType;
        this.tid = builder.tid;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseUserPermssionsRequest create() {
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
     * @return dbId
     */
    public String getDbId() {
        return this.dbId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListDatabaseUserPermssionsRequest, Builder> {
        private String regionId; 
        private String dbId; 
        private Boolean logic; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String permType; 
        private Long tid; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListDatabaseUserPermssionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.logic = request.logic;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.permType = request.permType;
            this.tid = request.tid;
            this.userName = request.userName;
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
         * <p>The ID of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the permission. Valid values:</p>
         * <ul>
         * <li>DATABASE: permissions on databases</li>
         * <li>TABLE: permissions on tables</li>
         * <li>COLUMN: permissions on fields</li>
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
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
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

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>search_user_name</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListDatabaseUserPermssionsRequest build() {
            return new ListDatabaseUserPermssionsRequest(this);
        } 

    } 

}
