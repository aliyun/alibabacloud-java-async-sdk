// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Dimension} extends {@link TeaModel}
 *
 * <p>Dimension</p>
 */
public class Dimension extends TeaModel {
    @NameInMap("Label")
    private String label;

    @NameInMap("Value")
    private String value;

    private Dimension(Builder builder) {
        this.label = builder.label;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Dimension create() {
        return builder().build();
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String label; 
        private String value; 

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Dimension build() {
            return new Dimension(this);
        } 

    } 

}
