// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeProcessListRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessListRequest</p>
 */
public class DescribeProcessListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 30)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunningTime")
    private Integer runningTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowFull")
    private Boolean showFull;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DescribeProcessListRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.keyword = builder.keyword;
        this.order = builder.order;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.runningTime = builder.runningTime;
        this.showFull = builder.showFull;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return runningTime
     */
    public Integer getRunningTime() {
        return this.runningTime;
    }

    /**
     * @return showFull
     */
    public Boolean getShowFull() {
        return this.showFull;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<DescribeProcessListRequest, Builder> {
        private String DBClusterId; 
        private String keyword; 
        private String order; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer runningTime; 
        private Boolean showFull; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProcessListRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.keyword = request.keyword;
            this.order = request.order;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.runningTime = request.runningTime;
            this.showFull = request.showFull;
            this.user = request.user;
        } 

        /**
         * <p>The cluster ID of the AnalyticDB for MySQL Data Lakehouse Edition.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to view details of all AnalyticDB for MySQL Data Lakehouse Edition clusters in the destination region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-xxxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Filter keyword. Currently, only <strong>SELECT</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>Sort by the specified field in JSON format, <code>[{&quot;Field&quot;:&quot;Time&quot;,&quot;Type&quot;:&quot;Desc&quot; },{ &quot;Field&quot;:&quot;User&quot;, &quot;Type&quot;:&quot;Asc&quot; }]</code>. Values:</p>
         * <ul>
         * <li><p><strong>Field</strong>: The name of the field to sort by. Supports Time, User, Host, and DB fields.</p>
         * </li>
         * <li><p><strong>Type</strong>: Sort type. <strong>Desc</strong> for descending order, <strong>Asc</strong> for ascending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;Field&quot;:&quot;Time&quot;,&quot;Type&quot;:&quot;Desc&quot; },  { &quot;Field&quot;:&quot;User&quot;, &quot;Type&quot;:&quot;Asc&quot; }]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Page number. Must be a positive integer. Default value: <strong>1</strong>.</p>
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
         * <p>Number of records per page. Values:</p>
         * <ul>
         * <li><p><strong>30</strong> (Default value)</p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Filter by running time. Displays queries that have run longer than the specified time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder runningTime(Integer runningTime) {
            this.putQueryParameter("RunningTime", runningTime);
            this.runningTime = runningTime;
            return this;
        }

        /**
         * <p>Specifies whether to display the full SQL statement. Values:</p>
         * <ul>
         * <li><p><strong>True</strong>: Displays the full SQL statement.</p>
         * </li>
         * <li><p><strong>False</strong>: Displays only the first 100 characters of the SQL statement.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Default value: False.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder showFull(Boolean showFull) {
            this.putQueryParameter("ShowFull", showFull);
            this.showFull = showFull;
            return this;
        }

        /**
         * <p>The database account.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DescribeProcessListRequest build() {
            return new DescribeProcessListRequest(this);
        } 

    } 

}
