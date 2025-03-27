// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListCitiesByProvinceRequest} extends {@link RequestModel}
 *
 * <p>ListCitiesByProvinceRequest</p>
 */
public class ListCitiesByProvinceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Province")
    @com.aliyun.core.annotation.Validation(required = true)
    private String province;

    private ListCitiesByProvinceRequest(Builder builder) {
        super(builder);
        this.province = builder.province;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCitiesByProvinceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    public static final class Builder extends Request.Builder<ListCitiesByProvinceRequest, Builder> {
        private String province; 

        private Builder() {
            super();
        } 

        private Builder(ListCitiesByProvinceRequest request) {
            super(request);
            this.province = request.province;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder province(String province) {
            this.putBodyParameter("Province", province);
            this.province = province;
            return this;
        }

        @Override
        public ListCitiesByProvinceRequest build() {
            return new ListCitiesByProvinceRequest(this);
        } 

    } 

}
