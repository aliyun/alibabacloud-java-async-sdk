// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CatalogConnection} extends {@link TeaModel}
 *
 * <p>CatalogConnection</p>
 */
public class CatalogConnection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JdbcPassword")
    private String jdbcPassword;

    @com.aliyun.core.annotation.NameInMap("JdbcUri")
    private String jdbcUri;

    @com.aliyun.core.annotation.NameInMap("JdbcUserName")
    private String jdbcUserName;

    @com.aliyun.core.annotation.NameInMap("ThriftUri")
    private String thriftUri;

    @com.aliyun.core.annotation.NameInMap("VpcConnectionId")
    private String vpcConnectionId;

    private CatalogConnection(Builder builder) {
        this.jdbcPassword = builder.jdbcPassword;
        this.jdbcUri = builder.jdbcUri;
        this.jdbcUserName = builder.jdbcUserName;
        this.thriftUri = builder.thriftUri;
        this.vpcConnectionId = builder.vpcConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogConnection create() {
        return builder().build();
    }

    /**
     * @return jdbcPassword
     */
    public String getJdbcPassword() {
        return this.jdbcPassword;
    }

    /**
     * @return jdbcUri
     */
    public String getJdbcUri() {
        return this.jdbcUri;
    }

    /**
     * @return jdbcUserName
     */
    public String getJdbcUserName() {
        return this.jdbcUserName;
    }

    /**
     * @return thriftUri
     */
    public String getThriftUri() {
        return this.thriftUri;
    }

    /**
     * @return vpcConnectionId
     */
    public String getVpcConnectionId() {
        return this.vpcConnectionId;
    }

    public static final class Builder {
        private String jdbcPassword; 
        private String jdbcUri; 
        private String jdbcUserName; 
        private String thriftUri; 
        private String vpcConnectionId; 

        /**
         * JdbcPassword.
         */
        public Builder jdbcPassword(String jdbcPassword) {
            this.jdbcPassword = jdbcPassword;
            return this;
        }

        /**
         * JdbcUri.
         */
        public Builder jdbcUri(String jdbcUri) {
            this.jdbcUri = jdbcUri;
            return this;
        }

        /**
         * JdbcUserName.
         */
        public Builder jdbcUserName(String jdbcUserName) {
            this.jdbcUserName = jdbcUserName;
            return this;
        }

        /**
         * ThriftUri.
         */
        public Builder thriftUri(String thriftUri) {
            this.thriftUri = thriftUri;
            return this;
        }

        /**
         * VpcConnectionId.
         */
        public Builder vpcConnectionId(String vpcConnectionId) {
            this.vpcConnectionId = vpcConnectionId;
            return this;
        }

        public CatalogConnection build() {
            return new CatalogConnection(this);
        } 

    } 

}
