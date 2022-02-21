// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretAsrDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSecretAsrDetailRequest</p>
 */
public class GetSecretAsrDetailRequest extends Request {
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

    private GetSecretAsrDetailRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.callTime = builder.callTime;
        this.poolKey = builder.poolKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretAsrDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetSecretAsrDetailRequest, Builder> {
        private String callId; 
        private String callTime; 
        private String poolKey; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretAsrDetailRequest response) {
            super(response);
            this.callId = response.callId;
            this.callTime = response.callTime;
            this.poolKey = response.poolKey;
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

        @Override
        public GetSecretAsrDetailRequest build() {
            return new GetSecretAsrDetailRequest(this);
        } 

    } 

}
