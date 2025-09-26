// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link VersionWeight} extends {@link TeaModel}
 *
 * <p>VersionWeight</p>
 */
public class VersionWeight extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("weight")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Float weight;

    private VersionWeight(Builder builder) {
        this.version = builder.version;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VersionWeight create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return weight
     */
    public Float getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private String version; 
        private Float weight; 

        private Builder() {
        } 

        private Builder(VersionWeight model) {
            this.version = model.version;
            this.weight = model.weight;
        } 

        /**
         * <p>智能体运行时版本号</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>流量权重比例（0.0-1.0）</p>
         */
        public Builder weight(Float weight) {
            this.weight = weight;
            return this;
        }

        public VersionWeight build() {
            return new VersionWeight(this);
        } 

    } 

}
