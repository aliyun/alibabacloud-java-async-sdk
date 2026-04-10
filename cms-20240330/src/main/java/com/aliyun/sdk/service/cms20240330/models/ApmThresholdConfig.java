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
 * {@link ApmThresholdConfig} extends {@link TeaModel}
 *
 * <p>ApmThresholdConfig</p>
 */
public class ApmThresholdConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("severity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String severity;

    @com.aliyun.core.annotation.NameInMap("threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float threshold;

    private ApmThresholdConfig(Builder builder) {
        this.severity = builder.severity;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApmThresholdConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String severity; 
        private Float threshold; 

        private Builder() {
        } 

        private Builder(ApmThresholdConfig model) {
            this.severity = model.severity;
            this.threshold = model.threshold;
        } 

        /**
         * <p>告警等级</p>
         * <p>This parameter is required.</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>阈值</p>
         * <p>This parameter is required.</p>
         */
        public Builder threshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }

        public ApmThresholdConfig build() {
            return new ApmThresholdConfig(this);
        } 

    } 

}
