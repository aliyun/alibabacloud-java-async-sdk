// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeParentInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeParentInstanceRequest</p>
 */
public class DescribeParentInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthStatus")
    private Integer authStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckStatus")
    private Integer checkStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterStatus")
    private String clusterStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberAccount")
    private Long memberAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private Long resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    private DescribeParentInstanceRequest(Builder builder) {
        super(builder);
        this.authStatus = builder.authStatus;
        this.checkStatus = builder.checkStatus;
        this.clusterStatus = builder.clusterStatus;
        this.currentPage = builder.currentPage;
        this.dbName = builder.dbName;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.memberAccount = builder.memberAccount;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.serviceRegionId = builder.serviceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParentInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authStatus
     */
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return checkStatus
     */
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    /**
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberAccount
     */
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public Long getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeParentInstanceRequest, Builder> {
        private Integer authStatus; 
        private Integer checkStatus; 
        private String clusterStatus; 
        private Integer currentPage; 
        private String dbName; 
        private String engineType; 
        private String instanceId; 
        private String lang; 
        private Long memberAccount; 
        private Integer pageSize; 
        private Long resourceType; 
        private String serviceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParentInstanceRequest request) {
            super(request);
            this.authStatus = request.authStatus;
            this.checkStatus = request.checkStatus;
            this.clusterStatus = request.clusterStatus;
            this.currentPage = request.currentPage;
            this.dbName = request.dbName;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.memberAccount = request.memberAccount;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.serviceRegionId = request.serviceRegionId;
        } 

        /**
         * <p>Authorization status of the data asset instance.</p>
         * <ul>
         * <li><strong>0</strong>: Unauthorized</li>
         * <li><strong>1</strong>: Authorized</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder authStatus(Integer authStatus) {
            this.putQueryParameter("AuthStatus", authStatus);
            this.authStatus = authStatus;
            return this;
        }

        /**
         * <p>Connection status of the instance or the database under the instance. Values:</p>
         * <ul>
         * <li><strong>-3</strong>: Database not created</li>
         * <li><strong>-2</strong>: Released</li>
         * <li><strong>-1</strong>: Not connected</li>
         * <li><strong>2</strong>: Connectivity test in progress</li>
         * <li><strong>3</strong>: Connected</li>
         * <li><strong>4</strong>: Connection failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder checkStatus(Integer checkStatus) {
            this.putQueryParameter("CheckStatus", checkStatus);
            this.checkStatus = checkStatus;
            return this;
        }

        /**
         * <p>Instance status.</p>
         * <ul>
         * <li><strong>Running</strong>: Running</li>
         * <li><strong>Released</strong>: Released</li>
         * <li><strong>DatabaseNotCreated</strong>: Database not created</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder clusterStatus(String clusterStatus) {
            this.putQueryParameter("ClusterStatus", clusterStatus);
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * <p>When performing a paginated query, set the current page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Database name.</p>
         * 
         * <strong>example:</strong>
         * <p>db_**t</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>Engine type. Values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>MariaDB</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The instance ID to which the data in the data asset table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-*******xx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Language type for request and response messages. Values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Default, Simplified Chinese</li>
         * <li><strong>en_us</strong>: English (US)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Member account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        public Builder memberAccount(Long memberAccount) {
            this.putQueryParameter("MemberAccount", memberAccount);
            this.memberAccount = memberAccount;
            return this;
        }

        /**
         * <p>When performing a paginated query, set the number of rows per page. Default value: 10.</p>
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
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: OSS</li>
         * <li><strong>3</strong>: ADB-MYSQL</li>
         * <li><strong>4</strong>: TableStore</li>
         * <li><strong>5</strong>: RDS</li>
         * <li><strong>6</strong>: SelfDB</li>
         * <li><strong>7</strong>: PolarDB-X</li>
         * <li><strong>8</strong>: PolarDB</li>
         * <li><strong>9</strong>: ADB-PG</li>
         * <li><strong>10</strong>: OceanBase</li>
         * <li><strong>11</strong>: MongoDB</li>
         * <li><strong>25</strong>: Redis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder resourceType(Long resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The region where the asset is located. Values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing)</li>
         * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
         * <li><strong>cn-huhehaote</strong>: China (Hohhot)</li>
         * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
         * <li><strong>cn-hongkong</strong>:  China (Hong Kong)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        @Override
        public DescribeParentInstanceRequest build() {
            return new DescribeParentInstanceRequest(this);
        } 

    } 

}
