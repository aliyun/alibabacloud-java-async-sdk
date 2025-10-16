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
 * {@link EnableSdlProtectedAssetRequest} extends {@link RequestModel}
 *
 * <p>EnableSdlProtectedAssetRequest</p>
 */
public class EnableSdlProtectedAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpList")
    private java.util.List<String> ipList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private EnableSdlProtectedAssetRequest(Builder builder) {
        super(builder);
        this.ipList = builder.ipList;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSdlProtectedAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipList
     */
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<EnableSdlProtectedAssetRequest, Builder> {
        private java.util.List<String> ipList; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(EnableSdlProtectedAssetRequest request) {
            super(request);
            this.ipList = request.ipList;
            this.lang = request.lang;
        } 

        /**
         * IpList.
         */
        public Builder ipList(java.util.List<String> ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
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
        public EnableSdlProtectedAssetRequest build() {
            return new EnableSdlProtectedAssetRequest(this);
        } 

    } 

}
