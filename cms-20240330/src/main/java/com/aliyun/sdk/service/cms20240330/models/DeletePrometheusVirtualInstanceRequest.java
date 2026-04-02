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
 * {@link DeletePrometheusVirtualInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeletePrometheusVirtualInstanceRequest</p>
 */
public class DeletePrometheusVirtualInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    private String prometheusInstanceId;

    private DeletePrometheusVirtualInstanceRequest(Builder builder) {
        super(builder);
        this.prometheusInstanceId = builder.prometheusInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusVirtualInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePrometheusVirtualInstanceRequest, Builder> {
        private String prometheusInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrometheusVirtualInstanceRequest request) {
            super(request);
            this.prometheusInstanceId = request.prometheusInstanceId;
        } 

        /**
         * prometheusInstanceId.
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.putPathParameter("prometheusInstanceId", prometheusInstanceId);
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }

        @Override
        public DeletePrometheusVirtualInstanceRequest build() {
            return new DeletePrometheusVirtualInstanceRequest(this);
        } 

    } 

}
