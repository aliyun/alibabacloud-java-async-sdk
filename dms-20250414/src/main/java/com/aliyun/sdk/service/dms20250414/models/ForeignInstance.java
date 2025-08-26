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
         * DataLinkName.
         */
        public Builder dataLinkName(String dataLinkName) {
            this.dataLinkName = dataLinkName;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * InstanceSource.
         */
        public Builder instanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Sid.
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
