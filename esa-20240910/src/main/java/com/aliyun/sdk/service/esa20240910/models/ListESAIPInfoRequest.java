// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListESAIPInfoRequest} extends {@link RequestModel}
 *
 * <p>ListESAIPInfoRequest</p>
 */
public class ListESAIPInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VipInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vipInfo;

    private ListESAIPInfoRequest(Builder builder) {
        super(builder);
        this.vipInfo = builder.vipInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListESAIPInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vipInfo
     */
    public String getVipInfo() {
        return this.vipInfo;
    }

    public static final class Builder extends Request.Builder<ListESAIPInfoRequest, Builder> {
        private String vipInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListESAIPInfoRequest request) {
            super(request);
            this.vipInfo = request.vipInfo;
        } 

        /**
         * <p>You can enter IPv4 or IPv6 addresses. Separate multiple IP addresses with commas (,). You can enter up to 20 IP addresses at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.0.24,2408:8740:41FF:2:23::7FE,0.0.0.0,abcd</p>
         */
        public Builder vipInfo(String vipInfo) {
            this.putQueryParameter("VipInfo", vipInfo);
            this.vipInfo = vipInfo;
            return this;
        }

        @Override
        public ListESAIPInfoRequest build() {
            return new ListESAIPInfoRequest(this);
        } 

    } 

}
