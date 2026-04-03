// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyImageRegistryRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageRegistryRequest</p>
 */
public class ModifyImageRegistryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryHostIp")
    private String registryHostIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransPerHour")
    private Integer transPerHour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ModifyImageRegistryRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.id = builder.id;
        this.password = builder.password;
        this.port = builder.port;
        this.registryHostIp = builder.registryHostIp;
        this.transPerHour = builder.transPerHour;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageRegistryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return registryHostIp
     */
    public String getRegistryHostIp() {
        return this.registryHostIp;
    }

    /**
     * @return transPerHour
     */
    public Integer getTransPerHour() {
        return this.transPerHour;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ModifyImageRegistryRequest, Builder> {
        private String domainName; 
        private Long id; 
        private String password; 
        private Integer port; 
        private String registryHostIp; 
        private Integer transPerHour; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageRegistryRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.id = request.id;
            this.password = request.password;
            this.port = request.port;
            this.registryHostIp = request.registryHostIp;
            this.transPerHour = request.transPerHour;
            this.userName = request.userName;
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
         * <p>The ID of the image repository. You can call the listImageRegistry operation to query the ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>390103286</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * RegistryHostIp.
         */
        public Builder registryHostIp(String registryHostIp) {
            this.putQueryParameter("RegistryHostIp", registryHostIp);
            this.registryHostIp = registryHostIp;
            return this;
        }

        /**
         * <p>The number of images that are scanned per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder transPerHour(Integer transPerHour) {
            this.putBodyParameter("TransPerHour", transPerHour);
            this.transPerHour = transPerHour;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ModifyImageRegistryRequest build() {
            return new ModifyImageRegistryRequest(this);
        } 

    } 

}
