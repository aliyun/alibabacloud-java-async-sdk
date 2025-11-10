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
 * {@link CreatePrometheusViewResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrometheusViewResponseBody</p>
 */
public class CreatePrometheusViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusViewId")
    private String prometheusViewId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePrometheusViewResponseBody(Builder builder) {
        this.prometheusViewId = builder.prometheusViewId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusViewResponseBody create() {
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

        private Builder(CreatePrometheusViewResponseBody model) {
            this.prometheusViewId = model.prometheusViewId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Prometheus view ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cd5237f7dbd574cf9bbd648ff9efb16cd</p>
         */
        public Builder prometheusViewId(String prometheusViewId) {
            this.prometheusViewId = prometheusViewId;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePrometheusViewResponseBody build() {
            return new CreatePrometheusViewResponseBody(this);
        } 

    } 

}
