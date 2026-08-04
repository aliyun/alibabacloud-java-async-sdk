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
 * {@link BatchQueryCreateAccountTraceRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryCreateAccountTraceRequest</p>
 */
public class BatchQueryCreateAccountTraceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceNoList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceNoList;

    private BatchQueryCreateAccountTraceRequest(Builder builder) {
        super(builder);
        this.mpk = builder.mpk;
        this.traceNoList = builder.traceNoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryCreateAccountTraceRequest create() {
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
     * @return traceNoList
     */
    public String getTraceNoList() {
        return this.traceNoList;
    }

    public static final class Builder extends Request.Builder<BatchQueryCreateAccountTraceRequest, Builder> {
        private String mpk; 
        private String traceNoList; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryCreateAccountTraceRequest request) {
            super(request);
            this.mpk = request.mpk;
            this.traceNoList = request.traceNoList;
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
        public Builder traceNoList(String traceNoList) {
            this.putQueryParameter("TraceNoList", traceNoList);
            this.traceNoList = traceNoList;
            return this;
        }

        @Override
        public BatchQueryCreateAccountTraceRequest build() {
            return new BatchQueryCreateAccountTraceRequest(this);
        } 

    } 

}
