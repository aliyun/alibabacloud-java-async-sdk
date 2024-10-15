// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MetaStoreConf} extends {@link TeaModel}
 *
 * <p>MetaStoreConf</p>
 */
public class MetaStoreConf extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbPassword")
    private String dbPassword;

    @com.aliyun.core.annotation.NameInMap("DbUrl")
    private String dbUrl;

    @com.aliyun.core.annotation.NameInMap("DbUserName")
    private String dbUserName;

    private MetaStoreConf(Builder builder) {
        this.dbPassword = builder.dbPassword;
        this.dbUrl = builder.dbUrl;
        this.dbUserName = builder.dbUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaStoreConf create() {
        return builder().build();
    }

    /**
     * @return dbPassword
     */
    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * @return dbUrl
     */
    public String getDbUrl() {
        return this.dbUrl;
    }

    /**
     * @return dbUserName
     */
    public String getDbUserName() {
        return this.dbUserName;
    }

    public static final class Builder {
        private String dbPassword; 
        private String dbUrl; 
        private String dbUserName; 

        /**
         * DbPassword.
         */
        public Builder dbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }

        /**
         * DbUrl.
         */
        public Builder dbUrl(String dbUrl) {
            this.dbUrl = dbUrl;
            return this;
        }

        /**
         * DbUserName.
         */
        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            return this;
        }

        public MetaStoreConf build() {
            return new MetaStoreConf(this);
        } 

    } 

}
