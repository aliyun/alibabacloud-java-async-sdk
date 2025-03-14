// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetLocalDefaultRegionRequest} extends {@link RequestModel}
 *
 * <p>GetLocalDefaultRegionRequest</p>
 */
public class GetLocalDefaultRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private GetLocalDefaultRegionRequest(Builder builder) {
        super(builder);
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLocalDefaultRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<GetLocalDefaultRegionRequest, Builder> {
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(GetLocalDefaultRegionRequest request) {
            super(request);
            this.vendor = request.vendor;
        } 

        /**
         * <p>The cloud service provider. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud.</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud.</li>
         * <li><strong>Azure</strong>: Microsoft Azure.</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public GetLocalDefaultRegionRequest build() {
            return new GetLocalDefaultRegionRequest(this);
        } 

    } 

}
