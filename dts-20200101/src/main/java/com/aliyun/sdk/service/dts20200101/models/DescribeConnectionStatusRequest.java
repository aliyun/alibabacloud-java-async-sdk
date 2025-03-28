// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeConnectionStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeConnectionStatusRequest</p>
 */
public class DescribeConnectionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointArchitecture")
    private String destinationEndpointArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointDatabaseName")
    private String destinationEndpointDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointEngineName")
    private String destinationEndpointEngineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointIP")
    private String destinationEndpointIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationEndpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointOracleSID")
    private String destinationEndpointOracleSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointPassword")
    private String destinationEndpointPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointPort")
    private String destinationEndpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointRegion")
    private String destinationEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointUserName")
    private String destinationEndpointUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointArchitecture")
    private String sourceEndpointArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
    private String sourceEndpointInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceEndpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointOracleSID")
    private String sourceEndpointOracleSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPort")
    private String sourceEndpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    private DescribeConnectionStatusRequest(Builder builder) {
        super(builder);
        this.destinationEndpointArchitecture = builder.destinationEndpointArchitecture;
        this.destinationEndpointDatabaseName = builder.destinationEndpointDatabaseName;
        this.destinationEndpointEngineName = builder.destinationEndpointEngineName;
        this.destinationEndpointIP = builder.destinationEndpointIP;
        this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
        this.destinationEndpointInstanceType = builder.destinationEndpointInstanceType;
        this.destinationEndpointOracleSID = builder.destinationEndpointOracleSID;
        this.destinationEndpointPassword = builder.destinationEndpointPassword;
        this.destinationEndpointPort = builder.destinationEndpointPort;
        this.destinationEndpointRegion = builder.destinationEndpointRegion;
        this.destinationEndpointUserName = builder.destinationEndpointUserName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceEndpointArchitecture = builder.sourceEndpointArchitecture;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointEngineName = builder.sourceEndpointEngineName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConnectionStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpointArchitecture
     */
    public String getDestinationEndpointArchitecture() {
        return this.destinationEndpointArchitecture;
    }

    /**
     * @return destinationEndpointDatabaseName
     */
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    /**
     * @return destinationEndpointEngineName
     */
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    /**
     * @return destinationEndpointIP
     */
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    /**
     * @return destinationEndpointInstanceID
     */
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    /**
     * @return destinationEndpointInstanceType
     */
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    /**
     * @return destinationEndpointOracleSID
     */
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    /**
     * @return destinationEndpointPassword
     */
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    /**
     * @return destinationEndpointPort
     */
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    /**
     * @return destinationEndpointRegion
     */
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    /**
     * @return destinationEndpointUserName
     */
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceEndpointArchitecture
     */
    public String getSourceEndpointArchitecture() {
        return this.sourceEndpointArchitecture;
    }

    /**
     * @return sourceEndpointDatabaseName
     */
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    /**
     * @return sourceEndpointEngineName
     */
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    /**
     * @return sourceEndpointIP
     */
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    /**
     * @return sourceEndpointInstanceID
     */
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    /**
     * @return sourceEndpointInstanceType
     */
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    /**
     * @return sourceEndpointOracleSID
     */
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    /**
     * @return sourceEndpointPassword
     */
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    /**
     * @return sourceEndpointPort
     */
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public static final class Builder extends Request.Builder<DescribeConnectionStatusRequest, Builder> {
        private String destinationEndpointArchitecture; 
        private String destinationEndpointDatabaseName; 
        private String destinationEndpointEngineName; 
        private String destinationEndpointIP; 
        private String destinationEndpointInstanceID; 
        private String destinationEndpointInstanceType; 
        private String destinationEndpointOracleSID; 
        private String destinationEndpointPassword; 
        private String destinationEndpointPort; 
        private String destinationEndpointRegion; 
        private String destinationEndpointUserName; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceEndpointArchitecture; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointEngineName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointPassword; 
        private String sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointUserName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConnectionStatusRequest request) {
            super(request);
            this.destinationEndpointArchitecture = request.destinationEndpointArchitecture;
            this.destinationEndpointDatabaseName = request.destinationEndpointDatabaseName;
            this.destinationEndpointEngineName = request.destinationEndpointEngineName;
            this.destinationEndpointIP = request.destinationEndpointIP;
            this.destinationEndpointInstanceID = request.destinationEndpointInstanceID;
            this.destinationEndpointInstanceType = request.destinationEndpointInstanceType;
            this.destinationEndpointOracleSID = request.destinationEndpointOracleSID;
            this.destinationEndpointPassword = request.destinationEndpointPassword;
            this.destinationEndpointPort = request.destinationEndpointPort;
            this.destinationEndpointRegion = request.destinationEndpointRegion;
            this.destinationEndpointUserName = request.destinationEndpointUserName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceEndpointArchitecture = request.sourceEndpointArchitecture;
            this.sourceEndpointDatabaseName = request.sourceEndpointDatabaseName;
            this.sourceEndpointEngineName = request.sourceEndpointEngineName;
            this.sourceEndpointIP = request.sourceEndpointIP;
            this.sourceEndpointInstanceID = request.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = request.sourceEndpointInstanceType;
            this.sourceEndpointOracleSID = request.sourceEndpointOracleSID;
            this.sourceEndpointPassword = request.sourceEndpointPassword;
            this.sourceEndpointPort = request.sourceEndpointPort;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.sourceEndpointUserName = request.sourceEndpointUserName;
        } 

        /**
         * <p>You must specify this parameter only if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>Oracle</strong>. Valid values:</p>
         * <ul>
         * <li><strong>SID</strong>: non-RAC architecture</li>
         * <li><strong>RAC</strong>: Real Application Cluster (RAC) architecture</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is optional. The data type of this parameter is String.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SID</p>
         */
        public Builder destinationEndpointArchitecture(String destinationEndpointArchitecture) {
            this.putQueryParameter("DestinationEndpointArchitecture", destinationEndpointArchitecture);
            this.destinationEndpointArchitecture = destinationEndpointArchitecture;
            return this;
        }

        /**
         * <p>The name of the destination database or the authentication database.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You must specify this parameter if the <strong>DestinationEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong>, <strong>DRDS</strong>, or <strong>MongoDB</strong>. You must also specify this parameter if the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>.</li>
         * <li>If the <strong>DestinationEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the destination database. If the DestinationEndpointEngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
         * <li>If the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>, specify the name of the destination database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        public Builder destinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
            this.putQueryParameter("DestinationEndpointDatabaseName", destinationEndpointDatabaseName);
            this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
            return this;
        }

        /**
         * <p>The engine type of the destination database. Valid values: <strong>MySQL</strong>, <strong>DRDS</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>PPAS</strong>, <strong>MongoDB</strong>, and <strong>Redis</strong>.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>DRDS</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            this.putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * <p>The endpoint of the destination database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        public Builder destinationEndpointIP(String destinationEndpointIP) {
            this.putQueryParameter("DestinationEndpointIP", destinationEndpointIP);
            this.destinationEndpointIP = destinationEndpointIP;
            return this;
        }

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.putQueryParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }

        /**
         * <p>The instance type of the destination database. Valid values:</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><strong>ECS</strong>: self-managed database that is hosted on Elastic Compute Service (ECS)</li>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
         * <li><strong>DRDS</strong>: PolarDB-X instance</li>
         * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
         * <li><strong>Redis</strong>: ApsaraDB for Redis instance</li>
         * <li><strong>PetaData</strong>: HybridDB for MySQL instance</li>
         * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster</li>
         * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster</li>
         * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL cluster V3.0 or V2.0</li>
         * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDB_o</p>
         */
        public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
            this.putQueryParameter("DestinationEndpointInstanceType", destinationEndpointInstanceType);
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }

        /**
         * <p>You must specify this parameter only if the <strong>DestinationEndpointEngineName</strong> parameter is set to <strong>Oracle</strong>. Valid values:</p>
         * <ul>
         * <li><strong>SID</strong>: non-RAC architecture</li>
         * <li><strong>RAC</strong>: RAC architecture</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is optional. The data type of this parameter is String.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SID</p>
         */
        public Builder destinationEndpointOracleSID(String destinationEndpointOracleSID) {
            this.putQueryParameter("DestinationEndpointOracleSID", destinationEndpointOracleSID);
            this.destinationEndpointOracleSID = destinationEndpointOracleSID;
            return this;
        }

        /**
         * <p>The password of the destination database account.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        public Builder destinationEndpointPassword(String destinationEndpointPassword) {
            this.putQueryParameter("DestinationEndpointPassword", destinationEndpointPassword);
            this.destinationEndpointPassword = destinationEndpointPassword;
            return this;
        }

        /**
         * <p>The service port number of the source database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder destinationEndpointPort(String destinationEndpointPort) {
            this.putQueryParameter("DestinationEndpointPort", destinationEndpointPort);
            this.destinationEndpointPort = destinationEndpointPort;
            return this;
        }

        /**
         * <p>The ID of the region where the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            this.putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }

        /**
         * <p>The database account of the destination database.</p>
         * <blockquote>
         * <p> The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a> and <a href="https://help.aliyun.com/document_detail/130744.html">Overview of data synchronization scenarios</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder destinationEndpointUserName(String destinationEndpointUserName) {
            this.putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }

        /**
         * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>You must specify this parameter only if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>Oracle</strong>. Valid values:</p>
         * <ul>
         * <li><strong>SID</strong>: non-RAC architecture</li>
         * <li><strong>RAC</strong>: RAC architecture</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SID</p>
         */
        public Builder sourceEndpointArchitecture(String sourceEndpointArchitecture) {
            this.putQueryParameter("SourceEndpointArchitecture", sourceEndpointArchitecture);
            this.sourceEndpointArchitecture = sourceEndpointArchitecture;
            return this;
        }

        /**
         * <p>The name of the source database or the authentication database.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You must specify this parameter if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>. You must also specify this parameter if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>.</li>
         * <li>If the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the source database. If the SourceEndpointEngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
         * <li>If the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>, specify the name of the source database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * <p>The engine type of the source database. Valid values: <strong>MySQL</strong>, <strong>TiDB</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>Oracle</strong>, <strong>MongoDB</strong>, and <strong>Redis</strong>.</p>
         * <blockquote>
         * <p> Default value: <strong>MySQL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * <p>The endpoint of the source database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1imrtn6fq7h****</p>
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
         * <li><strong>ECS</strong>: self-managed database that is hosted on ECS</li>
         * <li><strong>Express</strong>: self-managed database that is connected over Express Connect</li>
         * <li><strong>dg</strong>: self-managed database that is connected over Database Gateway</li>
         * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
         * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster</li>
         * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * <p>The password of the source database account.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * <p>The service port number of the source database.</p>
         * <blockquote>
         * <p> You must specify this parameter only if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder sourceEndpointPort(String sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * <p>The ID of the region where the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * <p>The database account of the source database.</p>
         * <blockquote>
         * <p> The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a> and <a href="https://help.aliyun.com/document_detail/130744.html">Overview of data synchronization scenarios</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        @Override
        public DescribeConnectionStatusRequest build() {
            return new DescribeConnectionStatusRequest(this);
        } 

    } 

}
