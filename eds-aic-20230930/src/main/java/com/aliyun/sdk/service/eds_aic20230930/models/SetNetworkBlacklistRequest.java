// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link SetNetworkBlacklistRequest} extends {@link RequestModel}
 *
 * <p>SetNetworkBlacklistRequest</p>
 */
public class SetNetworkBlacklistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainBlacklist")
    private java.util.List<String> domainBlacklist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpBlacklist")
    private java.util.List<String> ipBlacklist;

    private SetNetworkBlacklistRequest(Builder builder) {
        super(builder);
        this.domainBlacklist = builder.domainBlacklist;
        this.ipBlacklist = builder.ipBlacklist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetNetworkBlacklistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainBlacklist
     */
    public java.util.List<String> getDomainBlacklist() {
        return this.domainBlacklist;
    }

    /**
     * @return ipBlacklist
     */
    public java.util.List<String> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public static final class Builder extends Request.Builder<SetNetworkBlacklistRequest, Builder> {
        private java.util.List<String> domainBlacklist; 
        private java.util.List<String> ipBlacklist; 

        private Builder() {
            super();
        } 

        private Builder(SetNetworkBlacklistRequest request) {
            super(request);
            this.domainBlacklist = request.domainBlacklist;
            this.ipBlacklist = request.ipBlacklist;
        } 

        /**
         * DomainBlacklist.
         */
        public Builder domainBlacklist(java.util.List<String> domainBlacklist) {
            this.putQueryParameter("DomainBlacklist", domainBlacklist);
            this.domainBlacklist = domainBlacklist;
            return this;
        }

        /**
         * IpBlacklist.
         */
        public Builder ipBlacklist(java.util.List<String> ipBlacklist) {
            this.putQueryParameter("IpBlacklist", ipBlacklist);
            this.ipBlacklist = ipBlacklist;
            return this;
        }

        @Override
        public SetNetworkBlacklistRequest build() {
            return new SetNetworkBlacklistRequest(this);
        } 

    } 

}
