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
 * {@link DeletePrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeletePrometheusInstanceRequest</p>
 */
public class DeletePrometheusInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prometheusInstanceId;

    private DeletePrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.prometheusInstanceId = builder.prometheusInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePrometheusInstanceRequest, Builder> {
        private String prometheusInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrometheusInstanceRequest request) {
            super(request);
            this.prometheusInstanceId = request.prometheusInstanceId;
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

        @Override
        public DeletePrometheusInstanceRequest build() {
            return new DeletePrometheusInstanceRequest(this);
        } 

    } 

}
