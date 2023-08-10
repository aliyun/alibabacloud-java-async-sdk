// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ABTestScene} extends {@link TeaModel}
 *
 * <p>ABTestScene</p>
 */
public class ABTestScene extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("status")
    private Integer status;

    @NameInMap("values")
    private java.util.List < String > values;

    private ABTestScene(Builder builder) {
        this.name = builder.name;
        this.status = builder.status;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ABTestScene create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return values
     */
    public java.util.List < String > getValues() {
        return this.values;
    }

    public static final class Builder {
        private String name; 
        private Integer status; 
        private java.util.List < String > values; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * values.
         */
        public Builder values(java.util.List < String > values) {
            this.values = values;
            return this;
        }

        public ABTestScene build() {
            return new ABTestScene(this);
        } 

    } 

}
