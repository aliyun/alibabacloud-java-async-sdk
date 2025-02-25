// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRealtimeDeliveryFieldRequest} extends {@link RequestModel}
 *
 * <p>GetRealtimeDeliveryFieldRequest</p>
 */
public class GetRealtimeDeliveryFieldRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    private GetRealtimeDeliveryFieldRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeDeliveryFieldRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    public static final class Builder extends Request.Builder<GetRealtimeDeliveryFieldRequest, Builder> {
        private String businessType; 

        private Builder() {
            super();
        } 

        private Builder(GetRealtimeDeliveryFieldRequest request) {
            super(request);
            this.businessType = request.businessType;
        } 

        /**
         * <p>The log category. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_access_l1</strong> (default): access logs.</li>
         * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
         * <li><strong>dcdn_log_waf</strong>: firewall logs.</li>
         * <li><strong>dcdn_log_ipa</strong>: TCP/UDP proxy logs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_er</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        @Override
        public GetRealtimeDeliveryFieldRequest build() {
            return new GetRealtimeDeliveryFieldRequest(this);
        } 

    } 

}
