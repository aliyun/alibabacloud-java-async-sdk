// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DomainSpecialBizCancelRequest} extends {@link RequestModel}
 *
 * <p>DomainSpecialBizCancelRequest</p>
 */
public class DomainSpecialBizCancelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private DomainSpecialBizCancelRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainSpecialBizCancelRequest create() {
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

    public static final class Builder extends Request.Builder<DomainSpecialBizCancelRequest, Builder> {
        private Long bizId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DomainSpecialBizCancelRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The business ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3666</p>
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
        public DomainSpecialBizCancelRequest build() {
            return new DomainSpecialBizCancelRequest(this);
        } 

    } 

}
