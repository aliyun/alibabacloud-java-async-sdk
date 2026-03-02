// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeployPipelineInfo} extends {@link TeaModel}
 *
 * <p>DeployPipelineInfo</p>
 */
public class DeployPipelineInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deployInstanceInfos")
    private java.util.List<DeployInstanceInfo> deployInstanceInfos;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DeployPipelineInfo(Builder builder) {
        this.deployInstanceInfos = builder.deployInstanceInfos;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployPipelineInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployInstanceInfos
     */
    public java.util.List<DeployInstanceInfo> getDeployInstanceInfos() {
        return this.deployInstanceInfos;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private java.util.List<DeployInstanceInfo> deployInstanceInfos; 
        private String id; 
        private String name; 

        private Builder() {
        } 

        private Builder(DeployPipelineInfo model) {
            this.deployInstanceInfos = model.deployInstanceInfos;
            this.id = model.id;
            this.name = model.name;
        } 

        /**
         * deployInstanceInfos.
         */
        public Builder deployInstanceInfos(java.util.List<DeployInstanceInfo> deployInstanceInfos) {
            this.deployInstanceInfos = deployInstanceInfos;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public DeployPipelineInfo build() {
            return new DeployPipelineInfo(this);
        } 

    } 

}
