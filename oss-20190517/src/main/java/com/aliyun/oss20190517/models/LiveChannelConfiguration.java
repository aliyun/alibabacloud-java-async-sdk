// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelConfiguration} extends {@link TeaModel}
 *
 * <p>LiveChannelConfiguration</p>
 */
public class LiveChannelConfiguration extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Status")
    private String status;

    @NameInMap("Target")
    private LiveChannelTarget target;

    @NameInMap("Snapshot")
    private LiveChannelSnapshot snapshot;


    private LiveChannelConfiguration(Builder builder) {
        this.description = builder.description;
        this.status = builder.status;
        this.target = builder.target;
        this.snapshot = builder.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelConfiguration create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String description() {
        return this.description;
    }

    /**
     * @return status
     */
    public String status() {
        return this.status;
    }

    /**
     * @return target
     */
    public LiveChannelTarget target() {
        return this.target;
    }

    /**
     * @return snapshot
     */
    public LiveChannelSnapshot snapshot() {
        return this.snapshot;
    }

    public static final class Builder {
        private String description; 
        private String status; 
        private LiveChannelTarget target; 
        private LiveChannelSnapshot snapshot; 

        /**
         * <p>description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Target.</p>
         */
        public Builder target(LiveChannelTarget target) {
            this.target = target;
            return this;
        }

        /**
         * <p>Snapshot.</p>
         */
        public Builder snapshot(LiveChannelSnapshot snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public LiveChannelConfiguration build() {
            return new LiveChannelConfiguration(this);
        } 

    } 

}
