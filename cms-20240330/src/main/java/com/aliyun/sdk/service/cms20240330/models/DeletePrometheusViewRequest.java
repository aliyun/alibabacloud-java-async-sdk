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
 * {@link DeletePrometheusViewRequest} extends {@link RequestModel}
 *
 * <p>DeletePrometheusViewRequest</p>
 */
public class DeletePrometheusViewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("prometheusViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prometheusViewId;

    private DeletePrometheusViewRequest(Builder builder) {
        super(builder);
        this.prometheusViewId = builder.prometheusViewId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusViewRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePrometheusViewRequest, Builder> {
        private String prometheusViewId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrometheusViewRequest request) {
            super(request);
            this.prometheusViewId = request.prometheusViewId;
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

        @Override
        public DeletePrometheusViewRequest build() {
            return new DeletePrometheusViewRequest(this);
        } 

    } 

}
