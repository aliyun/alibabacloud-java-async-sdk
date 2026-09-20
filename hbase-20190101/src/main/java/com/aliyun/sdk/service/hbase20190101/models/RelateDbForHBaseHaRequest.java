// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link RelateDbForHBaseHaRequest} extends {@link RequestModel}
 *
 * <p>RelateDbForHBaseHaRequest</p>
 */
public class RelateDbForHBaseHaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActive")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haActive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveClusterKey")
    private String haActiveClusterKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveDBType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haActiveDBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveHbaseFsDir")
    private String haActiveHbaseFsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveHdfsUri")
    private String haActiveHdfsUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActivePassword")
    private String haActivePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveUser")
    private String haActiveUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveVersion")
    private String haActiveVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaMigrateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haMigrateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandby")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haStandby;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyClusterKey")
    private String haStandbyClusterKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyDBType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haStandbyDBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyHbaseFsDir")
    private String haStandbyHbaseFsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyHdfsUri")
    private String haStandbyHdfsUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyPassword")
    private String haStandbyPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyUser")
    private String haStandbyUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyVersion")
    private String haStandbyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaTables")
    private String haTables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsActiveStandard")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isActiveStandard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsStandbyStandard")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isStandbyStandard;

    private RelateDbForHBaseHaRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.haActive = builder.haActive;
        this.haActiveClusterKey = builder.haActiveClusterKey;
        this.haActiveDBType = builder.haActiveDBType;
        this.haActiveHbaseFsDir = builder.haActiveHbaseFsDir;
        this.haActiveHdfsUri = builder.haActiveHdfsUri;
        this.haActivePassword = builder.haActivePassword;
        this.haActiveUser = builder.haActiveUser;
        this.haActiveVersion = builder.haActiveVersion;
        this.haMigrateType = builder.haMigrateType;
        this.haStandby = builder.haStandby;
        this.haStandbyClusterKey = builder.haStandbyClusterKey;
        this.haStandbyDBType = builder.haStandbyDBType;
        this.haStandbyHbaseFsDir = builder.haStandbyHbaseFsDir;
        this.haStandbyHdfsUri = builder.haStandbyHdfsUri;
        this.haStandbyPassword = builder.haStandbyPassword;
        this.haStandbyUser = builder.haStandbyUser;
        this.haStandbyVersion = builder.haStandbyVersion;
        this.haTables = builder.haTables;
        this.isActiveStandard = builder.isActiveStandard;
        this.isStandbyStandard = builder.isStandbyStandard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RelateDbForHBaseHaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return haActive
     */
    public String getHaActive() {
        return this.haActive;
    }

    /**
     * @return haActiveClusterKey
     */
    public String getHaActiveClusterKey() {
        return this.haActiveClusterKey;
    }

    /**
     * @return haActiveDBType
     */
    public String getHaActiveDBType() {
        return this.haActiveDBType;
    }

    /**
     * @return haActiveHbaseFsDir
     */
    public String getHaActiveHbaseFsDir() {
        return this.haActiveHbaseFsDir;
    }

    /**
     * @return haActiveHdfsUri
     */
    public String getHaActiveHdfsUri() {
        return this.haActiveHdfsUri;
    }

    /**
     * @return haActivePassword
     */
    public String getHaActivePassword() {
        return this.haActivePassword;
    }

    /**
     * @return haActiveUser
     */
    public String getHaActiveUser() {
        return this.haActiveUser;
    }

    /**
     * @return haActiveVersion
     */
    public String getHaActiveVersion() {
        return this.haActiveVersion;
    }

    /**
     * @return haMigrateType
     */
    public String getHaMigrateType() {
        return this.haMigrateType;
    }

    /**
     * @return haStandby
     */
    public String getHaStandby() {
        return this.haStandby;
    }

    /**
     * @return haStandbyClusterKey
     */
    public String getHaStandbyClusterKey() {
        return this.haStandbyClusterKey;
    }

    /**
     * @return haStandbyDBType
     */
    public String getHaStandbyDBType() {
        return this.haStandbyDBType;
    }

    /**
     * @return haStandbyHbaseFsDir
     */
    public String getHaStandbyHbaseFsDir() {
        return this.haStandbyHbaseFsDir;
    }

    /**
     * @return haStandbyHdfsUri
     */
    public String getHaStandbyHdfsUri() {
        return this.haStandbyHdfsUri;
    }

    /**
     * @return haStandbyPassword
     */
    public String getHaStandbyPassword() {
        return this.haStandbyPassword;
    }

    /**
     * @return haStandbyUser
     */
    public String getHaStandbyUser() {
        return this.haStandbyUser;
    }

    /**
     * @return haStandbyVersion
     */
    public String getHaStandbyVersion() {
        return this.haStandbyVersion;
    }

    /**
     * @return haTables
     */
    public String getHaTables() {
        return this.haTables;
    }

    /**
     * @return isActiveStandard
     */
    public Boolean getIsActiveStandard() {
        return this.isActiveStandard;
    }

    /**
     * @return isStandbyStandard
     */
    public Boolean getIsStandbyStandard() {
        return this.isStandbyStandard;
    }

    public static final class Builder extends Request.Builder<RelateDbForHBaseHaRequest, Builder> {
        private String clusterId; 
        private String haActive; 
        private String haActiveClusterKey; 
        private String haActiveDBType; 
        private String haActiveHbaseFsDir; 
        private String haActiveHdfsUri; 
        private String haActivePassword; 
        private String haActiveUser; 
        private String haActiveVersion; 
        private String haMigrateType; 
        private String haStandby; 
        private String haStandbyClusterKey; 
        private String haStandbyDBType; 
        private String haStandbyHbaseFsDir; 
        private String haStandbyHdfsUri; 
        private String haStandbyPassword; 
        private String haStandbyUser; 
        private String haStandbyVersion; 
        private String haTables; 
        private Boolean isActiveStandard; 
        private Boolean isStandbyStandard; 

        private Builder() {
            super();
        } 

        private Builder(RelateDbForHBaseHaRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.haActive = request.haActive;
            this.haActiveClusterKey = request.haActiveClusterKey;
            this.haActiveDBType = request.haActiveDBType;
            this.haActiveHbaseFsDir = request.haActiveHbaseFsDir;
            this.haActiveHdfsUri = request.haActiveHdfsUri;
            this.haActivePassword = request.haActivePassword;
            this.haActiveUser = request.haActiveUser;
            this.haActiveVersion = request.haActiveVersion;
            this.haMigrateType = request.haMigrateType;
            this.haStandby = request.haStandby;
            this.haStandbyClusterKey = request.haStandbyClusterKey;
            this.haStandbyDBType = request.haStandbyDBType;
            this.haStandbyHbaseFsDir = request.haStandbyHbaseFsDir;
            this.haStandbyHdfsUri = request.haStandbyHdfsUri;
            this.haStandbyPassword = request.haStandbyPassword;
            this.haStandbyUser = request.haStandbyUser;
            this.haStandbyVersion = request.haStandbyVersion;
            this.haTables = request.haTables;
            this.isActiveStandard = request.isActiveStandard;
            this.isStandbyStandard = request.isStandbyStandard;
        } 

        /**
         * <p>The ID of the BDS cluster. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bds-t4nj9v2x85******</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The instance ID of the primary instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp1w6krp539******</p>
         */
        public Builder haActive(String haActive) {
            this.putQueryParameter("HaActive", haActive);
            this.haActive = haActive;
            return this;
        }

        /**
         * <p>The ZooKeeper address of the primary instance. This parameter is required when the primary instance is a non-standard instance (IsActiveStandard is set to false).</p>
         * 
         * <strong>example:</strong>
         * <p>hb-t4naqsay5gn******-master1-001.hbase.singapore.rds.aliyuncs.com,hb-t4naqsay5gn******-master3-001.hbase.singapore.rds.aliyuncs.com,hb-t4naqsay5gn******-master2-001.hbase.singapore.rds.aliyuncs.com:2181:/hbase</p>
         */
        public Builder haActiveClusterKey(String haActiveClusterKey) {
            this.putQueryParameter("HaActiveClusterKey", haActiveClusterKey);
            this.haActiveClusterKey = haActiveClusterKey;
            return this;
        }

        /**
         * <p>The cluster type of the primary instance. Valid values: <strong>HBase</strong> and <strong>HBaseue</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase</p>
         */
        public Builder haActiveDBType(String haActiveDBType) {
            this.putQueryParameter("HaActiveDBType", haActiveDBType);
            this.haActiveDBType = haActiveDBType;
            return this;
        }

        /**
         * <p>The HDFS directory of the primary instance. This parameter is required when the primary instance is a non-standard instance (IsActiveStandard is set to false).</p>
         * 
         * <strong>example:</strong>
         * <p>/hbase</p>
         */
        public Builder haActiveHbaseFsDir(String haActiveHbaseFsDir) {
            this.putQueryParameter("HaActiveHbaseFsDir", haActiveHbaseFsDir);
            this.haActiveHbaseFsDir = haActiveHbaseFsDir;
            return this;
        }

        /**
         * <p>The HDFS URI of the primary instance. This parameter is required when the primary instance is a non-standard instance (IsActiveStandard is set to false).</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://hb-t4naqsay5gn******-master1-001.hbase.rds.aliyuncs.com:8020,hb-t4naqsay5gn******-master2-001.hbase.rds.aliyuncs.com:8020</p>
         */
        public Builder haActiveHdfsUri(String haActiveHdfsUri) {
            this.putQueryParameter("HaActiveHdfsUri", haActiveHdfsUri);
            this.haActiveHdfsUri = haActiveHdfsUri;
            return this;
        }

        /**
         * <p>The password that corresponds to the username of the primary instance. This parameter is required when the primary instance is <strong>HBaseue</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder haActivePassword(String haActivePassword) {
            this.putQueryParameter("HaActivePassword", haActivePassword);
            this.haActivePassword = haActivePassword;
            return this;
        }

        /**
         * <p>The username of the primary instance. This parameter is required when the primary instance is <strong>HBaseue</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder haActiveUser(String haActiveUser) {
            this.putQueryParameter("HaActiveUser", haActiveUser);
            this.haActiveUser = haActiveUser;
            return this;
        }

        /**
         * <p>The database engine version of the primary instance. This parameter is required when the primary instance is a non-standard instance (IsActiveStandard is set to false). Valid values:</p>
         * <ul>
         * <li><strong>HBase1x</strong>: HBase 1.x.</li>
         * <li><strong>HBase2x</strong>: HBase 2.x.</li>
         * <li><strong>HBaseUE</strong>: HBaseue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HBase2x</p>
         */
        public Builder haActiveVersion(String haActiveVersion) {
            this.putQueryParameter("HaActiveVersion", haActiveVersion);
            this.haActiveVersion = haActiveVersion;
            return this;
        }

        /**
         * <p>The synchronization type. Valid values:</p>
         * <ul>
         * <li><strong>CLUSTER</strong>: instance-level synchronization.</li>
         * <li><strong>TABLE</strong>: table-level synchronization.</li>
         * <li><strong>SKIP</strong>: no synchronization required.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        public Builder haMigrateType(String haMigrateType) {
            this.putQueryParameter("HaMigrateType", haMigrateType);
            this.haMigrateType = haMigrateType;
            return this;
        }

        /**
         * <p>The ID of the secondary instance cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp1bl7iqzka******</p>
         */
        public Builder haStandby(String haStandby) {
            this.putQueryParameter("HaStandby", haStandby);
            this.haStandby = haStandby;
            return this;
        }

        /**
         * <p>The ZooKeeper address of the secondary instance. This parameter is required when the secondary instance is a non-standard instance (IsStandbyStandard is set to false).</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp1w6krp539******-master1-001.hbase.singapore.rds.aliyuncs.com,hb-bp1w6krp539******-master3-001.hbase.singapore.rds.aliyuncs.com,hb-t4naqsay5gn******-master2-001.hbase.singapore.rds.aliyuncs.com:2181:/hbase</p>
         */
        public Builder haStandbyClusterKey(String haStandbyClusterKey) {
            this.putQueryParameter("HaStandbyClusterKey", haStandbyClusterKey);
            this.haStandbyClusterKey = haStandbyClusterKey;
            return this;
        }

        /**
         * <p>The cluster type of the secondary instance. Valid values: <strong>HBase</strong> and <strong>HBaseue</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase</p>
         */
        public Builder haStandbyDBType(String haStandbyDBType) {
            this.putQueryParameter("HaStandbyDBType", haStandbyDBType);
            this.haStandbyDBType = haStandbyDBType;
            return this;
        }

        /**
         * <p>The HDFS directory of the secondary instance. This parameter is required when the secondary instance is a non-standard instance (IsStandbyStandard is set to false).</p>
         * 
         * <strong>example:</strong>
         * <p>/hbase</p>
         */
        public Builder haStandbyHbaseFsDir(String haStandbyHbaseFsDir) {
            this.putQueryParameter("HaStandbyHbaseFsDir", haStandbyHbaseFsDir);
            this.haStandbyHbaseFsDir = haStandbyHbaseFsDir;
            return this;
        }

        /**
         * <p>The HDFS URI of the secondary instance. This parameter is required when the secondary instance is a non-standard instance (IsStandbyStandard is set to false).</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://hb-bp1w6krp539******-master1-001.hbase.rds.aliyuncs.com:8020,hb-bp1w6krp539******-master2-001.hbase.rds.aliyuncs.com:8020</p>
         */
        public Builder haStandbyHdfsUri(String haStandbyHdfsUri) {
            this.putQueryParameter("HaStandbyHdfsUri", haStandbyHdfsUri);
            this.haStandbyHdfsUri = haStandbyHdfsUri;
            return this;
        }

        /**
         * <p>The password that corresponds to the username of the secondary instance. This parameter is required when the secondary instance is <strong>hbaseue</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder haStandbyPassword(String haStandbyPassword) {
            this.putQueryParameter("HaStandbyPassword", haStandbyPassword);
            this.haStandbyPassword = haStandbyPassword;
            return this;
        }

        /**
         * <p>The username of the secondary instance. This parameter is required when the secondary instance is <strong>hbaseue</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder haStandbyUser(String haStandbyUser) {
            this.putQueryParameter("HaStandbyUser", haStandbyUser);
            this.haStandbyUser = haStandbyUser;
            return this;
        }

        /**
         * <p>The database engine version of the secondary instance. This parameter is required when the secondary instance is a non-standard instance (IsStandbyStandard is set to false). Valid values:</p>
         * <ul>
         * <li><strong>HBase1x</strong>: HBase 1.x.</li>
         * <li><strong>HBase2x</strong>: HBase 2.x.</li>
         * <li><strong>HBaseUE</strong>: HBaseue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HBase2x</p>
         */
        public Builder haStandbyVersion(String haStandbyVersion) {
            this.putQueryParameter("HaStandbyVersion", haStandbyVersion);
            this.haStandbyVersion = haStandbyVersion;
            return this;
        }

        /**
         * <p>The tables to synchronize. This parameter is required when HaMigrateType is set to TABLE. Separate multiple tables with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>test,test1</p>
         */
        public Builder haTables(String haTables) {
            this.putQueryParameter("HaTables", haTables);
            this.haTables = haTables;
            return this;
        }

        /**
         * <p>Specifies whether the primary instance is a standard instance. Set this parameter to <strong>true</strong> for a standard instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isActiveStandard(Boolean isActiveStandard) {
            this.putQueryParameter("IsActiveStandard", isActiveStandard);
            this.isActiveStandard = isActiveStandard;
            return this;
        }

        /**
         * <p>Specifies whether the secondary instance is a standard instance. Set this parameter to <strong>true</strong> for a standard instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isStandbyStandard(Boolean isStandbyStandard) {
            this.putQueryParameter("IsStandbyStandard", isStandbyStandard);
            this.isStandbyStandard = isStandbyStandard;
            return this;
        }

        @Override
        public RelateDbForHBaseHaRequest build() {
            return new RelateDbForHBaseHaRequest(this);
        } 

    } 

}
