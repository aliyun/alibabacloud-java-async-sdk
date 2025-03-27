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
 * {@link GetBillDetailFileListRequest} extends {@link RequestModel}
 *
 * <p>GetBillDetailFileListRequest</p>
 */
public class GetBillDetailFileListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillMonth")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billMonth;

    private GetBillDetailFileListRequest(Builder builder) {
        super(builder);
        this.billMonth = builder.billMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBillDetailFileListRequest create() {
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

    public static final class Builder extends Request.Builder<GetBillDetailFileListRequest, Builder> {
        private String billMonth; 

        private Builder() {
            super();
        } 

        private Builder(GetBillDetailFileListRequest request) {
            super(request);
            this.billMonth = request.billMonth;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202502</p>
         */
        public Builder billMonth(String billMonth) {
            this.putQueryParameter("BillMonth", billMonth);
            this.billMonth = billMonth;
            return this;
        }

        @Override
        public GetBillDetailFileListRequest build() {
            return new GetBillDetailFileListRequest(this);
        } 

    } 

}
