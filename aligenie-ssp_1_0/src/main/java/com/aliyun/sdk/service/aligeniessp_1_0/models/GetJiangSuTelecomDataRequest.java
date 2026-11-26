// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetJiangSuTelecomDataRequest} extends {@link RequestModel}
 *
 * <p>GetJiangSuTelecomDataRequest</p>
 */
public class GetJiangSuTelecomDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    private String date;

    private GetJiangSuTelecomDataRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJiangSuTelecomDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    public static final class Builder extends Request.Builder<GetJiangSuTelecomDataRequest, Builder> {
        private String date; 

        private Builder() {
            super();
        } 

        private Builder(GetJiangSuTelecomDataRequest request) {
            super(request);
            this.date = request.date;
        } 

        /**
         * <p>Date in the format yyyy-MM-dd. This refers to the data timestamp when the data becomes available, not the date when the data was generated. Data is always produced on a T+1 basis.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-09</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        @Override
        public GetJiangSuTelecomDataRequest build() {
            return new GetJiangSuTelecomDataRequest(this);
        } 

    } 

}
