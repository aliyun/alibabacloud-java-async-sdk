// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetCommissionDetailFileListRequest} extends {@link RequestModel}
 *
 * <p>GetCommissionDetailFileListRequest</p>
 */
public class GetCommissionDetailFileListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillMonth")
    private String billMonth;

    private GetCommissionDetailFileListRequest(Builder builder) {
        super(builder);
        this.billMonth = builder.billMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommissionDetailFileListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billMonth
     */
    public String getBillMonth() {
        return this.billMonth;
    }

    public static final class Builder extends Request.Builder<GetCommissionDetailFileListRequest, Builder> {
        private String billMonth; 

        private Builder() {
            super();
        } 

        private Builder(GetCommissionDetailFileListRequest request) {
            super(request);
            this.billMonth = request.billMonth;
        } 

        /**
         * BillMonth.
         */
        public Builder billMonth(String billMonth) {
            this.putQueryParameter("BillMonth", billMonth);
            this.billMonth = billMonth;
            return this;
        }

        @Override
        public GetCommissionDetailFileListRequest build() {
            return new GetCommissionDetailFileListRequest(this);
        } 

    } 

}
