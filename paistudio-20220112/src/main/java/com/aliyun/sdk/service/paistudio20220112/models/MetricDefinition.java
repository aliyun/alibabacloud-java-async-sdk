// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link MetricDefinition} extends {@link TeaModel}
 *
 * <p>MetricDefinition</p>
 */
public class MetricDefinition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Regex")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regex;

    private MetricDefinition(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.regex = builder.regex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricDefinition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regex
     */
    public String getRegex() {
        return this.regex;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String regex; 

        private Builder() {
        } 

        private Builder(MetricDefinition model) {
            this.description = model.description;
            this.name = model.name;
            this.regex = model.regex;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>train:oob_score</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.<em>train:oob_score=([-+]?[0-9]</em>\.?[0-9]+(?:[eE][-+]?[0-9]+)?).*</p>
         */
        public Builder regex(String regex) {
            this.regex = regex;
            return this;
        }

        public MetricDefinition build() {
            return new MetricDefinition(this);
        } 

    } 

}
