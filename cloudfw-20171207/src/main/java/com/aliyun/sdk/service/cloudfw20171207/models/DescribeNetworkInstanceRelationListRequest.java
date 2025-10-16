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
 * {@link DescribeNetworkInstanceRelationListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkInstanceRelationListRequest</p>
 */
public class DescribeNetworkInstanceRelationListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectType")
    private String connectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallConfigureStatus")
    private String firewallConfigureStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeNetworkInstanceRelationListRequest(Builder builder) {
        super(builder);
        this.connectType = builder.connectType;
        this.firewallConfigureStatus = builder.firewallConfigureStatus;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInstanceRelationListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectType
     */
    public String getConnectType() {
        return this.connectType;
    }

    /**
     * @return firewallConfigureStatus
     */
    public String getFirewallConfigureStatus() {
        return this.firewallConfigureStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInstanceRelationListRequest, Builder> {
        private String connectType; 
        private String firewallConfigureStatus; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInstanceRelationListRequest request) {
            super(request);
            this.connectType = request.connectType;
            this.firewallConfigureStatus = request.firewallConfigureStatus;
            this.lang = request.lang;
        } 

        /**
         * ConnectType.
         */
        public Builder connectType(String connectType) {
            this.putQueryParameter("ConnectType", connectType);
            this.connectType = connectType;
            return this;
        }

        /**
         * FirewallConfigureStatus.
         */
        public Builder firewallConfigureStatus(String firewallConfigureStatus) {
            this.putQueryParameter("FirewallConfigureStatus", firewallConfigureStatus);
            this.firewallConfigureStatus = firewallConfigureStatus;
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
        public DescribeNetworkInstanceRelationListRequest build() {
            return new DescribeNetworkInstanceRelationListRequest(this);
        } 

    } 

}
