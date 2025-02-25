// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDomainSpecialBizDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainSpecialBizDetailRequest</p>
 */
public class QueryDomainSpecialBizDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private Long bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainSpecialBizDetailRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainSpecialBizDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public Long getBizId() {
        return this.bizId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryDomainSpecialBizDetailRequest, Builder> {
        private Long bizId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainSpecialBizDetailRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder bizId(Long bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryDomainSpecialBizDetailRequest build() {
            return new QueryDomainSpecialBizDetailRequest(this);
        } 

    } 

}
