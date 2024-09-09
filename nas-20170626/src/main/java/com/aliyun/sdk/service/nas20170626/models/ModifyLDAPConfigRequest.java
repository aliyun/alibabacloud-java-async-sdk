// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLDAPConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyLDAPConfigRequest</p>
 */
public class ModifyLDAPConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindDN")
    private String bindDN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchBase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchBase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("URI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String URI;

    private ModifyLDAPConfigRequest(Builder builder) {
        super(builder);
        this.bindDN = builder.bindDN;
        this.fileSystemId = builder.fileSystemId;
        this.searchBase = builder.searchBase;
        this.URI = builder.URI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLDAPConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindDN
     */
    public String getBindDN() {
        return this.bindDN;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return searchBase
     */
    public String getSearchBase() {
        return this.searchBase;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    public static final class Builder extends Request.Builder<ModifyLDAPConfigRequest, Builder> {
        private String bindDN; 
        private String fileSystemId; 
        private String searchBase; 
        private String URI; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLDAPConfigRequest request) {
            super(request);
            this.bindDN = request.bindDN;
            this.fileSystemId = request.fileSystemId;
            this.searchBase = request.searchBase;
            this.URI = request.URI;
        } 

        /**
         * The LDAP entry.
         */
        public Builder bindDN(String bindDN) {
            this.putQueryParameter("BindDN", bindDN);
            this.bindDN = bindDN;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The LDAP search base.
         */
        public Builder searchBase(String searchBase) {
            this.putQueryParameter("SearchBase", searchBase);
            this.searchBase = searchBase;
            return this;
        }

        /**
         * The LDAP service address.
         */
        public Builder URI(String URI) {
            this.putQueryParameter("URI", URI);
            this.URI = URI;
            return this;
        }

        @Override
        public ModifyLDAPConfigRequest build() {
            return new ModifyLDAPConfigRequest(this);
        } 

    } 

}
