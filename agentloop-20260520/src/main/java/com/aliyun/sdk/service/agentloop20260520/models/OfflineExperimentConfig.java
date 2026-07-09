// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link OfflineExperimentConfig} extends {@link TeaModel}
 *
 * <p>OfflineExperimentConfig</p>
 */
public class OfflineExperimentConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private OfflineExperimentConfig(Builder builder) {
        this.desc = builder.desc;
        this.label = builder.label;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineExperimentConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String desc; 
        private String label; 
        private String name; 

        private Builder() {
        } 

        private Builder(OfflineExperimentConfig model) {
            this.desc = model.desc;
            this.label = model.label;
            this.name = model.name;
        } 

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public OfflineExperimentConfig build() {
            return new OfflineExperimentConfig(this);
        } 

    } 

}
