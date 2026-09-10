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
 * {@link AlertRuleRcaConfig} extends {@link TeaModel}
 *
 * <p>AlertRuleRcaConfig</p>
 */
public class AlertRuleRcaConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.NameInMap("enableRca")
    private Boolean enableRca;

    private AlertRuleRcaConfig(Builder builder) {
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.enableRca = builder.enableRca;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleRcaConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return enableRca
     */
    public Boolean getEnableRca() {
        return this.enableRca;
    }

    public static final class Builder {
        private String digitalEmployeeName; 
        private Boolean enableRca; 

        private Builder() {
        } 

        private Builder(AlertRuleRcaConfig model) {
            this.digitalEmployeeName = model.digitalEmployeeName;
            this.enableRca = model.enableRca;
        } 

        /**
         * <p>The digital employee name.</p>
         * 
         * <strong>example:</strong>
         * <p>O&amp;M Assistant</p>
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>Indicates whether RCA is enabled.</p>
         */
        public Builder enableRca(Boolean enableRca) {
            this.enableRca = enableRca;
            return this;
        }

        public AlertRuleRcaConfig build() {
            return new AlertRuleRcaConfig(this);
        } 

    } 

}
