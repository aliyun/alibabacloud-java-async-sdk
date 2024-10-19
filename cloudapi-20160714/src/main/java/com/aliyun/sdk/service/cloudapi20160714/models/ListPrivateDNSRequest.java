// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPrivateDNSRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateDNSRequest</p>
 */
public class ListPrivateDNSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetDomain")
    private String intranetDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListPrivateDNSRequest(Builder builder) {
        super(builder);
        this.intranetDomain = builder.intranetDomain;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateDNSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intranetDomain
     */
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPrivateDNSRequest, Builder> {
        private String intranetDomain; 
        private String securityToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateDNSRequest request) {
            super(request);
            this.intranetDomain = request.intranetDomain;
            this.securityToken = request.securityToken;
            this.type = request.type;
        } 

        /**
         * IntranetDomain.
         */
        public Builder intranetDomain(String intranetDomain) {
            this.putQueryParameter("IntranetDomain", intranetDomain);
            this.intranetDomain = intranetDomain;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPrivateDNSRequest build() {
            return new ListPrivateDNSRequest(this);
        } 

    } 

}
