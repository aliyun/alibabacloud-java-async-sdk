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
 * {@link CreatePrometheusInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrometheusInstanceResponseBody</p>
 */
public class CreatePrometheusInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    private String prometheusInstanceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePrometheusInstanceResponseBody(Builder builder) {
        this.prometheusInstanceId = builder.prometheusInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusInstanceResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String prometheusInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePrometheusInstanceResponseBody model) {
            this.prometheusInstanceId = model.prometheusInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * prometheusInstanceId.
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-BE6E-5F82-A484-CE9C2196C7DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePrometheusInstanceResponseBody build() {
            return new CreatePrometheusInstanceResponseBody(this);
        } 

    } 

}
