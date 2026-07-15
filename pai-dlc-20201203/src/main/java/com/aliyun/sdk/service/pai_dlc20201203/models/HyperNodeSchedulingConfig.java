// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link HyperNodeSchedulingConfig} extends {@link TeaModel}
 *
 * <p>HyperNodeSchedulingConfig</p>
 */
public class HyperNodeSchedulingConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MinAvailable")
    private Integer minAvailable;

    @com.aliyun.core.annotation.NameInMap("QualityPolicy")
    private String qualityPolicy;

    private HyperNodeSchedulingConfig(Builder builder) {
        this.minAvailable = builder.minAvailable;
        this.qualityPolicy = builder.qualityPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HyperNodeSchedulingConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return minAvailable
     */
    public Integer getMinAvailable() {
        return this.minAvailable;
    }

    /**
     * @return qualityPolicy
     */
    public String getQualityPolicy() {
        return this.qualityPolicy;
    }

    public static final class Builder {
        private Integer minAvailable; 
        private String qualityPolicy; 

        private Builder() {
        } 

        private Builder(HyperNodeSchedulingConfig model) {
            this.minAvailable = model.minAvailable;
            this.qualityPolicy = model.qualityPolicy;
        } 

        /**
         * MinAvailable.
         */
        public Builder minAvailable(Integer minAvailable) {
            this.minAvailable = minAvailable;
            return this;
        }

        /**
         * QualityPolicy.
         */
        public Builder qualityPolicy(String qualityPolicy) {
            this.qualityPolicy = qualityPolicy;
            return this;
        }

        public HyperNodeSchedulingConfig build() {
            return new HyperNodeSchedulingConfig(this);
        } 

    } 

}
