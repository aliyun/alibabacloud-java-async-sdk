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
 * {@link FlowEndpointRoutingConfig} extends {@link TeaModel}
 *
 * <p>FlowEndpointRoutingConfig</p>
 */
public class FlowEndpointRoutingConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("weight")
    private Integer weight;

    private FlowEndpointRoutingConfig(Builder builder) {
        this.version = builder.version;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlowEndpointRoutingConfig create() {
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
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private String version; 
        private Integer weight; 

        private Builder() {
        } 

        private Builder(FlowEndpointRoutingConfig model) {
            this.version = model.version;
            this.weight = model.weight;
        } 

        /**
         * <p>目标工作流版本号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>该版本在流量分配中的权重，0-100</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public FlowEndpointRoutingConfig build() {
            return new FlowEndpointRoutingConfig(this);
        } 

    } 

}
