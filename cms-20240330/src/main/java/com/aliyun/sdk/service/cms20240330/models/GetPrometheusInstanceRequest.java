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
 * {@link GetPrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetPrometheusInstanceRequest</p>
 */
public class GetPrometheusInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prometheusInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    private GetPrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.prometheusInstanceId = builder.prometheusInstanceId;
        this.aliyunLang = builder.aliyunLang;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusInstanceId
     */
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
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

    public static final class Builder extends Request.Builder<GetPrometheusInstanceRequest, Builder> {
        private String prometheusInstanceId; 
        private String aliyunLang; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrometheusInstanceRequest request) {
            super(request);
            this.prometheusInstanceId = request.prometheusInstanceId;
            this.aliyunLang = request.aliyunLang;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-abc123</p>
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.putPathParameter("prometheusInstanceId", prometheusInstanceId);
            this.prometheusInstanceId = prometheusInstanceId;
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
        public GetPrometheusInstanceRequest build() {
            return new GetPrometheusInstanceRequest(this);
        } 

    } 

}
