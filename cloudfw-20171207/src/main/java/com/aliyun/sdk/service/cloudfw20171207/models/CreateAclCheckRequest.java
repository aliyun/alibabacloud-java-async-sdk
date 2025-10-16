// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateAclCheckRequest} extends {@link RequestModel}
 *
 * <p>CreateAclCheckRequest</p>
 */
public class CreateAclCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckNames")
    private java.util.List<String> checkNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private CreateAclCheckRequest(Builder builder) {
        super(builder);
        this.aclType = builder.aclType;
        this.checkNames = builder.checkNames;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAclCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return checkNames
     */
    public java.util.List<String> getCheckNames() {
        return this.checkNames;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<CreateAclCheckRequest, Builder> {
        private String aclType; 
        private java.util.List<String> checkNames; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CreateAclCheckRequest request) {
            super(request);
            this.aclType = request.aclType;
            this.checkNames = request.checkNames;
            this.lang = request.lang;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * CheckNames.
         */
        public Builder checkNames(java.util.List<String> checkNames) {
            this.putQueryParameter("CheckNames", checkNames);
            this.checkNames = checkNames;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public CreateAclCheckRequest build() {
            return new CreateAclCheckRequest(this);
        } 

    } 

}
