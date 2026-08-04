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
 * {@link BatchQueryAgAccountRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryAgAccountRequest</p>
 */
public class BatchQueryAgAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pkList;

    private BatchQueryAgAccountRequest(Builder builder) {
        super(builder);
        this.mpk = builder.mpk;
        this.pkList = builder.pkList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryAgAccountRequest create() {
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
     * @return pkList
     */
    public String getPkList() {
        return this.pkList;
    }

    public static final class Builder extends Request.Builder<BatchQueryAgAccountRequest, Builder> {
        private String mpk; 
        private String pkList; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryAgAccountRequest request) {
            super(request);
            this.mpk = request.mpk;
            this.pkList = request.pkList;
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
        public Builder pkList(String pkList) {
            this.putQueryParameter("PkList", pkList);
            this.pkList = pkList;
            return this;
        }

        @Override
        public BatchQueryAgAccountRequest build() {
            return new BatchQueryAgAccountRequest(this);
        } 

    } 

}
