// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretAsrInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSecretAsrInfoRequest</p>
 */
public class GetSecretAsrInfoRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("CallTime")
    @Validation(required = true)
    private String callTime;

    @Query
    @NameInMap("PoolKey")
    @Validation(required = true)
    private String poolKey;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    private GetSecretAsrInfoRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.callTime = builder.callTime;
        this.poolKey = builder.poolKey;
        this.prodCode = builder.prodCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretAsrInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return callTime
     */
    public String getCallTime() {
        return this.callTime;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    public static final class Builder extends Request.Builder<GetSecretAsrInfoRequest, Builder> {
        private String callId; 
        private String callTime; 
        private String poolKey; 
        private String prodCode; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretAsrInfoRequest request) {
            super(request);
            this.callId = request.callId;
            this.callTime = request.callTime;
            this.poolKey = request.poolKey;
            this.prodCode = request.prodCode;
        } 

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * CallTime.
         */
        public Builder callTime(String callTime) {
            this.putQueryParameter("CallTime", callTime);
            this.callTime = callTime;
            return this;
        }

        /**
         * PoolKey.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        @Override
        public GetSecretAsrInfoRequest build() {
            return new GetSecretAsrInfoRequest(this);
        } 

    } 

}
