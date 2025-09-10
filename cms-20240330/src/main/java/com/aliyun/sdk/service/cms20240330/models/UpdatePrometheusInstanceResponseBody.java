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
 * {@link UpdatePrometheusInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrometheusInstanceResponseBody</p>
 */
public class UpdatePrometheusInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    private String prometheusInstanceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdatePrometheusInstanceResponseBody(Builder builder) {
        this.prometheusInstanceId = builder.prometheusInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusInstanceResponseBody create() {
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

        private Builder(UpdatePrometheusInstanceResponseBody model) {
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
         * <p>1E92F783-E057-58F1-BD5C-92DED088E7A5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePrometheusInstanceResponseBody build() {
            return new UpdatePrometheusInstanceResponseBody(this);
        } 

    } 

}
