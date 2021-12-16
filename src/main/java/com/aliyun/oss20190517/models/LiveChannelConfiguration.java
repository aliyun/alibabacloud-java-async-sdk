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

    @NameInMap("Snapshot")
    private LiveChannelSnapshot snapshot;

    @NameInMap("Status")
    private String status;

    @NameInMap("Target")
    private LiveChannelTarget target;


    private LiveChannelConfiguration(Builder builder) {
        this.description = builder.description;
        this.snapshot = builder.snapshot;
        this.status = builder.status;
        this.target = builder.target;
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
    public String getDescription() {
        return this.description;
    }

    /**
     * @return snapshot
     */
    public LiveChannelSnapshot getSnapshot() {
        return this.snapshot;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return target
     */
    public LiveChannelTarget getTarget() {
        return this.target;
    }

    public static final class Builder {
        private String description; 
        private LiveChannelSnapshot snapshot; 
        private String status; 
        private LiveChannelTarget target; 

        /**
         * <p>description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Snapshot.</p>
         */
        public Builder snapshot(LiveChannelSnapshot snapshot) {
            this.snapshot = snapshot;
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

        public LiveChannelConfiguration build() {
            return new LiveChannelConfiguration(this);
        } 

    } 

}
