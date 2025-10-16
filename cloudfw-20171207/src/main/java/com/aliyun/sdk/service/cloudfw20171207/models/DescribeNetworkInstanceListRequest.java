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
 * {@link DescribeNetworkInstanceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkInstanceListRequest</p>
 */
public class DescribeNetworkInstanceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectType")
    private String connectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeNetworkInstanceListRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.connectType = builder.connectType;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInstanceListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return connectType
     */
    public String getConnectType() {
        return this.connectType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInstanceListRequest, Builder> {
        private String cenId; 
        private String connectType; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInstanceListRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.connectType = request.connectType;
            this.lang = request.lang;
        } 

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeNetworkInstanceListRequest build() {
            return new DescribeNetworkInstanceListRequest(this);
        } 

    } 

}
