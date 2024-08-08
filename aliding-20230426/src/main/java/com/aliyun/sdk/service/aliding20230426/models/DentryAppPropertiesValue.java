// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DentryAppPropertiesValue} extends {@link TeaModel}
 *
 * <p>DentryAppPropertiesValue</p>
 */
public class DentryAppPropertiesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private DentryAppPropertiesValue(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DentryAppPropertiesValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String name; 
        private String value; 
        private String visibility; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public DentryAppPropertiesValue build() {
            return new DentryAppPropertiesValue(this);
        } 

    } 

}
