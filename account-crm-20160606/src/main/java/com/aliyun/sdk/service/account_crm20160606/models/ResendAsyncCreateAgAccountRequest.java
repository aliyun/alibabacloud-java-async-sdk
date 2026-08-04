// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link ResendAsyncCreateAgAccountRequest} extends {@link RequestModel}
 *
 * <p>ResendAsyncCreateAgAccountRequest</p>
 */
public class ResendAsyncCreateAgAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceNo;

    private ResendAsyncCreateAgAccountRequest(Builder builder) {
        super(builder);
        this.mpk = builder.mpk;
        this.traceNo = builder.traceNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResendAsyncCreateAgAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return traceNo
     */
    public String getTraceNo() {
        return this.traceNo;
    }

    public static final class Builder extends Request.Builder<ResendAsyncCreateAgAccountRequest, Builder> {
        private String mpk; 
        private String traceNo; 

        private Builder() {
            super();
        } 

        private Builder(ResendAsyncCreateAgAccountRequest request) {
            super(request);
            this.mpk = request.mpk;
            this.traceNo = request.traceNo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder traceNo(String traceNo) {
            this.putQueryParameter("TraceNo", traceNo);
            this.traceNo = traceNo;
            return this;
        }

        @Override
        public ResendAsyncCreateAgAccountRequest build() {
            return new ResendAsyncCreateAgAccountRequest(this);
        } 

    } 

}
