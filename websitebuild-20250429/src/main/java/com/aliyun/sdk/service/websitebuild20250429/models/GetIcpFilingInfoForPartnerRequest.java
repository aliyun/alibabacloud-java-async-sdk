// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetIcpFilingInfoForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GetIcpFilingInfoForPartnerRequest</p>
 */
public class GetIcpFilingInfoForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    private GetIcpFilingInfoForPartnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIcpFilingInfoForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<GetIcpFilingInfoForPartnerRequest, Builder> {
        private String bizId; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(GetIcpFilingInfoForPartnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.domain = request.domain;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public GetIcpFilingInfoForPartnerRequest build() {
            return new GetIcpFilingInfoForPartnerRequest(this);
        } 

    } 

}
