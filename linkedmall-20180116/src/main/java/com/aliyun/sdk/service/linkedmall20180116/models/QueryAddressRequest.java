// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAddressRequest} extends {@link RequestModel}
 *
 * <p>QueryAddressRequest</p>
 */
public class QueryAddressRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("DivisionCode")
    private String divisionCode;

    @Query
    @NameInMap("Ip")
    private String ip;

    private QueryAddressRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.divisionCode = builder.divisionCode;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAddressRequest create() {
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
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder extends Request.Builder<QueryAddressRequest, Builder> {
        private String bizId; 
        private String divisionCode; 
        private String ip; 

        private Builder() {
            super();
        } 

        private Builder(QueryAddressRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.divisionCode = request.divisionCode;
            this.ip = request.ip;
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
         * DivisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.putQueryParameter("DivisionCode", divisionCode);
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        @Override
        public QueryAddressRequest build() {
            return new QueryAddressRequest(this);
        } 

    } 

}
