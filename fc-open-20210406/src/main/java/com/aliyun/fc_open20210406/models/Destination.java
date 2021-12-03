// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Destination} extends {@link TeaModel}
 *
 * <p>Destination</p>
 */
public class Destination extends TeaModel {
    @NameInMap("destination")
    private String destination;


    private Destination(Builder builder) {
        this.destination = builder.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Destination create() {
        return builder().build();
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    public static final class Builder {
        private String destination; 

        /**
         * <p>destination</p>
         */
        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Destination build() {
            return new Destination(this);
        } 

    } 

}
