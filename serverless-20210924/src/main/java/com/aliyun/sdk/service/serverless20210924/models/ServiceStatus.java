// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceStatus} extends {@link TeaModel}
 *
 * <p>ServiceStatus</p>
 */
public class ServiceStatus extends TeaModel {
    @NameInMap("message")
    private String message;

    @NameInMap("observedGeneration")
    private Integer observedGeneration;

    @NameInMap("observedTime")
    private String observedTime;

    @NameInMap("output")
    private java.util.Map < String, ? > output;

    @NameInMap("phase")
    private String phase;

    private ServiceStatus(Builder builder) {
        this.message = builder.message;
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
        this.output = builder.output;
        this.phase = builder.phase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceStatus create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return observedGeneration
     */
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * @return observedTime
     */
    public String getObservedTime() {
        return this.observedTime;
    }

    /**
     * @return output
     */
    public java.util.Map < String, ? > getOutput() {
        return this.output;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    public static final class Builder {
        private String message; 
        private Integer observedGeneration; 
        private String observedTime; 
        private java.util.Map < String, ? > output; 
        private String phase; 

        /**
         * A human-readable message indicating details about why the Service is in this condition
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The most recent generation observed
         */
        public Builder observedGeneration(Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * Time when the last update of the status is observed
         */
        public Builder observedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }

        /**
         * Details of current state of the Service
         */
        public Builder output(java.util.Map < String, ? > output) {
            this.output = output;
            return this;
        }

        /**
         * A simple, high-level summary of where the Service is in its lifecycle
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        public ServiceStatus build() {
            return new ServiceStatus(this);
        } 

    } 

}
