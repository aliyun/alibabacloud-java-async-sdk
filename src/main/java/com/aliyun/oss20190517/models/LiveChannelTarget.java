// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelTarget} extends {@link TeaModel}
 *
 * <p>LiveChannelTarget</p>
 */
public class LiveChannelTarget extends TeaModel {
    @NameInMap("Type")
    private String type;

    @NameInMap("FragDuration")
    private Long fragDuration;

    @NameInMap("FragCount")
    private Long fragCount;


    private LiveChannelTarget(Builder builder) {
        this.type = builder.type;
        this.fragDuration = builder.fragDuration;
        this.fragCount = builder.fragCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelTarget create() {
        return builder().build();
    }

    /**
     * @return type
     */
    public String type() {
        return this.type;
    }

    /**
     * @return fragDuration
     */
    public Long fragDuration() {
        return this.fragDuration;
    }

    /**
     * @return fragCount
     */
    public Long fragCount() {
        return this.fragCount;
    }

    public static final class Builder {
        private String type; 
        private Long fragDuration; 
        private Long fragCount; 

        /**
         * <p>description</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder fragDuration(Long fragDuration) {
            this.fragDuration = fragDuration;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder fragCount(Long fragCount) {
            this.fragCount = fragCount;
            return this;
        }

        public LiveChannelTarget build() {
            return new LiveChannelTarget(this);
        } 

    } 

}
