// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetPrometheusUserSettingRequest} extends {@link RequestModel}
 *
 * <p>GetPrometheusUserSettingRequest</p>
 */
public class GetPrometheusUserSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    private GetPrometheusUserSettingRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusUserSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public static final class Builder extends Request.Builder<GetPrometheusUserSettingRequest, Builder> {
        private String aliyunLang; 

        private Builder() {
            super();
        } 

        private Builder(GetPrometheusUserSettingRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
        } 

        /**
         * aliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("aliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        @Override
        public GetPrometheusUserSettingRequest build() {
            return new GetPrometheusUserSettingRequest(this);
        } 

    } 

}
