// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetricDefinition} extends {@link TeaModel}
 *
 * <p>MetricDefinition</p>
 */
public class MetricDefinition extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @NameInMap("Regex")
    @Validation(required = true)
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

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Regex.
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
