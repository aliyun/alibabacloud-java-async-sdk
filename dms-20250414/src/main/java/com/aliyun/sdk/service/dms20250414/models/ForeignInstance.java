// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ForeignInstance} extends {@link TeaModel}
 *
 * <p>ForeignInstance</p>
 */
public class ForeignInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataLinkName")
    private String dataLinkName;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("InstanceSource")
    private String instanceSource;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, String> properties;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("Sid")
    private String sid;

    private ForeignInstance(Builder builder) {
        this.dataLinkName = builder.dataLinkName;
        this.host = builder.host;
        this.instanceSource = builder.instanceSource;
        this.instanceType = builder.instanceType;
        this.port = builder.port;
        this.properties = builder.properties;
        this.regionId = builder.regionId;
        this.sid = builder.sid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForeignInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataLinkName
     */
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceSource
     */
    public String getInstanceSource() {
        return this.instanceSource;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    public static final class Builder {
        private String dataLinkName; 
        private String host; 
        private String instanceSource; 
        private String instanceType; 
        private Integer port; 
        private java.util.Map<String, String> properties; 
        private String regionId; 
        private String sid; 

        private Builder() {
        } 

        private Builder(ForeignInstance model) {
            this.dataLinkName = model.dataLinkName;
            this.host = model.host;
            this.instanceSource = model.instanceSource;
            this.instanceType = model.instanceType;
            this.port = model.port;
            this.properties = model.properties;
            this.regionId = model.regionId;
            this.sid = model.sid;
        } 

        /**
         * <p>The name of the data link.</p>
         * 
         * <strong>example:</strong>
         * <p>dbl_mysql_2337</p>
         */
        public Builder dataLinkName(String dataLinkName) {
            this.dataLinkName = dataLinkName;
            return this;
        }

        /**
         * <p>The endpoint that is used to connect to the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The source of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC_OWN:</strong> a self-managed database instance that is deployed on the Internet.</li>
         * <li><strong>RDS</strong>: an ApsaraDB RDS instance.</li>
         * <li><strong>ECS_OWN</strong>: a self-managed database that is hosted on an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>VPC_IDC</strong>: a self-managed database instance that is deployed in the data center over a virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The port number that is used to connect to the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>7890</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The information of the properties.</p>
         */
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The system identifier (SID) of the database.</p>
         * <blockquote>
         * <p> The SID uniquely identifies an Oracle database. After a database is created, a SID is generated for the database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HXE</p>
         */
        public Builder sid(String sid) {
            this.sid = sid;
            return this;
        }

        public ForeignInstance build() {
            return new ForeignInstance(this);
        } 

    } 

}
