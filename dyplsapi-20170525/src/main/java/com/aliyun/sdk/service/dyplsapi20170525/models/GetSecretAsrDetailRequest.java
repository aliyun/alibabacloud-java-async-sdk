// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretAsrDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSecretAsrDetailRequest</p>
 */
public class GetSecretAsrDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetSecretAsrDetailRequest request) {
            super(request);
            this.callId = request.callId;
            this.callTime = request.callTime;
            this.poolKey = request.poolKey;
        } 

        /**
         * The ID of the call record.
         * <p>
         * 
         * You can log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view **Call Record ID** on the **Call Record Query** page.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * The call initiation time in the call record.
         * <p>
         * 
         * You can log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account). View **Call Initiated At** on the **Call Record Query** page, or view the call_time field in the Call Detail Record (CDR) receipt.
         */
        public Builder callTime(String callTime) {
            this.putQueryParameter("CallTime", callTime);
            this.callTime = callTime;
            return this;
        }

        /**
         * The key of the phone number pool.
         * <p>
         * 
         * You can log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.
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
