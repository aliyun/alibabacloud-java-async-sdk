// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link KerberosConf} extends {@link TeaModel}
 *
 * <p>KerberosConf</p>
 */
public class KerberosConf extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("kerberosConfId")
    private String kerberosConfId;

    @com.aliyun.core.annotation.NameInMap("keytabs")
    private java.util.List<String> keytabs;

    @com.aliyun.core.annotation.NameInMap("krb5Conf")
    private String krb5Conf;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("networkServiceId")
    private String networkServiceId;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private KerberosConf(Builder builder) {
        this.creator = builder.creator;
        this.enabled = builder.enabled;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.kerberosConfId = builder.kerberosConfId;
        this.keytabs = builder.keytabs;
        this.krb5Conf = builder.krb5Conf;
        this.name = builder.name;
        this.networkServiceId = builder.networkServiceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KerberosConf create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return kerberosConfId
     */
    public String getKerberosConfId() {
        return this.kerberosConfId;
    }

    /**
     * @return keytabs
     */
    public java.util.List<String> getKeytabs() {
        return this.keytabs;
    }

    /**
     * @return krb5Conf
     */
    public String getKrb5Conf() {
        return this.krb5Conf;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkServiceId
     */
    public String getNetworkServiceId() {
        return this.networkServiceId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String creator; 
        private Boolean enabled; 
        private String gmtCreated; 
        private String gmtModified; 
        private String kerberosConfId; 
        private java.util.List<String> keytabs; 
        private String krb5Conf; 
        private String name; 
        private String networkServiceId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(KerberosConf model) {
            this.creator = model.creator;
            this.enabled = model.enabled;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.kerberosConfId = model.kerberosConfId;
            this.keytabs = model.keytabs;
            this.krb5Conf = model.krb5Conf;
            this.name = model.name;
            this.networkServiceId = model.networkServiceId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * gmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * kerberosConfId.
         */
        public Builder kerberosConfId(String kerberosConfId) {
            this.kerberosConfId = kerberosConfId;
            return this;
        }

        /**
         * keytabs.
         */
        public Builder keytabs(java.util.List<String> keytabs) {
            this.keytabs = keytabs;
            return this;
        }

        /**
         * krb5Conf.
         */
        public Builder krb5Conf(String krb5Conf) {
            this.krb5Conf = krb5Conf;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * networkServiceId.
         */
        public Builder networkServiceId(String networkServiceId) {
            this.networkServiceId = networkServiceId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public KerberosConf build() {
            return new KerberosConf(this);
        } 

    } 

}
