// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("InstanceSource")
    private String instanceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceState")
    private String instanceState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    private String netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.instanceSource = builder.instanceSource;
        this.instanceState = builder.instanceState;
        this.netType = builder.netType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
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
     * @return instanceSource
     */
    public String getInstanceSource() {
        return this.instanceSource;
    }

    /**
     * @return instanceState
     */
    public String getInstanceState() {
        return this.instanceState;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String regionId; 
        private String dbType; 
        private String envType; 
        private String instanceSource; 
        private String instanceState; 
        private String netType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbType = request.dbType;
            this.envType = request.envType;
            this.instanceSource = request.instanceSource;
            this.instanceState = request.instanceState;
            this.netType = request.netType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
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
         * <p>MySQL</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The type of the environment to which the database instance belongs. Valid values:</p>
         * <ul>
         * <li><strong>product:</strong> production environment</li>
         * <li><strong>dev</strong>: development environment</li>
         * <li><strong>pre</strong>: pre-release environment</li>
         * <li><strong>test</strong>: test environment</li>
         * <li><strong>sit</strong>: system integration testing (SIT) environment</li>
         * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
         * <li><strong>pet</strong>: stress testing environment</li>
         * <li><strong>stag:</strong> staging environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The source of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC_OWN</strong>: a self-managed database instance that is deployed on the Internet</li>
         * <li><strong>RDS</strong>: an ApsaraDB RDS instance</li>
         * <li><strong>ECS_OWN</strong>: a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</li>
         * <li><strong>VPC_IDC</strong>: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceSource(String instanceSource) {
            this.putQueryParameter("InstanceSource", instanceSource);
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * <p>The status of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong></li>
         * <li><strong>DISABLE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder instanceState(String instanceState) {
            this.putQueryParameter("InstanceState", instanceState);
            this.instanceState = instanceState;
            return this;
        }

        /**
         * <p>The network type of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC:</strong> classic network</li>
         * <li><strong>VPC:</strong> VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
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
         * <p>The number of entries to return on each page. The number cannot exceed 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The keyword that is used to search for database instances.</p>
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
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
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
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
