// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Relation} extends {@link TeaModel}
 *
 * <p>Relation</p>
 */
public class Relation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("destination")
    private String destination;

    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private Relation(Builder builder) {
        this.destination = builder.destination;
        this.jobId = builder.jobId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Relation create() {
        return builder().build();
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private String destination; 
        private String jobId; 
        private String source; 

        /**
         * destination.
         */
        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Relation build() {
            return new Relation(this);
        } 

    } 

}
