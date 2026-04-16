// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link MetricDefRespDTO} extends {@link TeaModel}
 *
 * <p>MetricDefRespDTO</p>
 */
public class MetricDefRespDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("sortable")
    private Boolean sortable;

    @com.aliyun.core.annotation.NameInMap("unit")
    private String unit;

    private MetricDefRespDTO(Builder builder) {
        this.key = builder.key;
        this.label = builder.label;
        this.sortable = builder.sortable;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricDefRespDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return sortable
     */
    public Boolean getSortable() {
        return this.sortable;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder {
        private String key; 
        private String label; 
        private Boolean sortable; 
        private String unit; 

        private Builder() {
        } 

        private Builder(MetricDefRespDTO model) {
            this.key = model.key;
            this.label = model.label;
            this.sortable = model.sortable;
            this.unit = model.unit;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
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
         * sortable.
         */
        public Builder sortable(Boolean sortable) {
            this.sortable = sortable;
            return this;
        }

        /**
         * unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public MetricDefRespDTO build() {
            return new MetricDefRespDTO(this);
        } 

    } 

}
