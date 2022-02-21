// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetClusterADDomainRequest} extends {@link RequestModel}
 *
 * <p>SetClusterADDomainRequest</p>
 */
public class SetClusterADDomainRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DomainAdmin")
    private String domainAdmin;

    @Query
    @NameInMap("DomainDelete")
    private Boolean domainDelete;

    @Query
    @NameInMap("DomainDnsIp")
    @Validation(required = true)
    private String domainDnsIp;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("DomainPassword")
    @Validation(required = true)
    private String domainPassword;

    private SetClusterADDomainRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.domainAdmin = builder.domainAdmin;
        this.domainDelete = builder.domainDelete;
        this.domainDnsIp = builder.domainDnsIp;
        this.domainName = builder.domainName;
        this.domainPassword = builder.domainPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClusterADDomainRequest create() {
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
     * @return domainAdmin
     */
    public String getDomainAdmin() {
        return this.domainAdmin;
    }

    /**
     * @return domainDelete
     */
    public Boolean getDomainDelete() {
        return this.domainDelete;
    }

    /**
     * @return domainDnsIp
     */
    public String getDomainDnsIp() {
        return this.domainDnsIp;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainPassword
     */
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public static final class Builder extends Request.Builder<SetClusterADDomainRequest, Builder> {
        private String clusterId; 
        private String domainAdmin; 
        private Boolean domainDelete; 
        private String domainDnsIp; 
        private String domainName; 
        private String domainPassword; 

        private Builder() {
            super();
        } 

        private Builder(SetClusterADDomainRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.domainAdmin = response.domainAdmin;
            this.domainDelete = response.domainDelete;
            this.domainDnsIp = response.domainDnsIp;
            this.domainName = response.domainName;
            this.domainPassword = response.domainPassword;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DomainAdmin.
         */
        public Builder domainAdmin(String domainAdmin) {
            this.putQueryParameter("DomainAdmin", domainAdmin);
            this.domainAdmin = domainAdmin;
            return this;
        }

        /**
         * DomainDelete.
         */
        public Builder domainDelete(Boolean domainDelete) {
            this.putQueryParameter("DomainDelete", domainDelete);
            this.domainDelete = domainDelete;
            return this;
        }

        /**
         * DomainDnsIp.
         */
        public Builder domainDnsIp(String domainDnsIp) {
            this.putQueryParameter("DomainDnsIp", domainDnsIp);
            this.domainDnsIp = domainDnsIp;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainPassword.
         */
        public Builder domainPassword(String domainPassword) {
            this.putQueryParameter("DomainPassword", domainPassword);
            this.domainPassword = domainPassword;
            return this;
        }

        @Override
        public SetClusterADDomainRequest build() {
            return new SetClusterADDomainRequest(this);
        } 

    } 

}
