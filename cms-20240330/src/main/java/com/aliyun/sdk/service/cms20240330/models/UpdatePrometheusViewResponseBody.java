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
 * {@link UpdatePrometheusViewResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrometheusViewResponseBody</p>
 */
public class UpdatePrometheusViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusViewId")
    private String prometheusViewId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdatePrometheusViewResponseBody(Builder builder) {
        this.prometheusViewId = builder.prometheusViewId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusViewResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String prometheusViewId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdatePrometheusViewResponseBody model) {
            this.prometheusViewId = model.prometheusViewId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Prometheus view instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxxxxx</p>
         */
        public Builder prometheusViewId(String prometheusViewId) {
            this.prometheusViewId = prometheusViewId;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>64D964F5-76C7-19A2-9399-457744AB3619</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePrometheusViewResponseBody build() {
            return new UpdatePrometheusViewResponseBody(this);
        } 

    } 

}
