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
 * {@link BatchQueryModifyLoginEmailTraceRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryModifyLoginEmailTraceRequest</p>
 */
public class BatchQueryModifyLoginEmailTraceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceNoList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceNoList;

    private BatchQueryModifyLoginEmailTraceRequest(Builder builder) {
        super(builder);
        this.mpk = builder.mpk;
        this.traceNoList = builder.traceNoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryModifyLoginEmailTraceRequest create() {
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

    public static final class Builder extends Request.Builder<BatchQueryModifyLoginEmailTraceRequest, Builder> {
        private String mpk; 
        private String traceNoList; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryModifyLoginEmailTraceRequest request) {
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
        public BatchQueryModifyLoginEmailTraceRequest build() {
            return new BatchQueryModifyLoginEmailTraceRequest(this);
        } 

    } 

}
