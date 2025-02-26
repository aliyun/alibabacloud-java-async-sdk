// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Destination} extends {@link TeaModel}
 *
 * <p>Destination</p>
 */
public class Destination extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("destination")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
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
         * destination.
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
