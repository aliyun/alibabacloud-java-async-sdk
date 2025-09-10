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
 * {@link GetPrometheusViewRequest} extends {@link RequestModel}
 *
 * <p>GetPrometheusViewRequest</p>
 */
public class GetPrometheusViewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("prometheusViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prometheusViewId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    private GetPrometheusViewRequest(Builder builder) {
        super(builder);
        this.prometheusViewId = builder.prometheusViewId;
        this.aliyunLang = builder.aliyunLang;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusViewId
     */
    public String getPrometheusViewId() {
        return this.prometheusViewId;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<GetPrometheusViewRequest, Builder> {
        private String prometheusViewId; 
        private String aliyunLang; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrometheusViewRequest request) {
            super(request);
            this.prometheusViewId = request.prometheusViewId;
            this.aliyunLang = request.aliyunLang;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxxxxx</p>
         */
        public Builder prometheusViewId(String prometheusViewId) {
            this.putPathParameter("prometheusViewId", prometheusViewId);
            this.prometheusViewId = prometheusViewId;
            return this;
        }

        /**
         * aliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("aliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public GetPrometheusViewRequest build() {
            return new GetPrometheusViewRequest(this);
        } 

    } 

}
