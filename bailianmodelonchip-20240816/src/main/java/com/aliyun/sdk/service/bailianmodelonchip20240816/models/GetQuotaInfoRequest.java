// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link GetQuotaInfoRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaInfoRequest</p>
 */
public class GetQuotaInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    private GetQuotaInfoRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<GetQuotaInfoRequest, Builder> {
        private Long recordId; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaInfoRequest request) {
            super(request);
            this.recordId = request.recordId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder recordId(Long recordId) {
            this.putBodyParameter("recordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public GetQuotaInfoRequest build() {
            return new GetQuotaInfoRequest(this);
        } 

    } 

}
