// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannelSnapshot} extends {@link TeaModel}
 *
 * <p>LiveChannelSnapshot</p>
 */
public class LiveChannelSnapshot extends TeaModel {
    @NameInMap("RoleName")
    private String roleName;

    @NameInMap("DestBucket")
    private String destBucket;

    @NameInMap("NotifyTopic")
    private String notifyTopic;

    @NameInMap("Interval")
    private Long interval;


    private LiveChannelSnapshot(Builder builder) {
        this.roleName = builder.roleName;
        this.destBucket = builder.destBucket;
        this.notifyTopic = builder.notifyTopic;
        this.interval = builder.interval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelSnapshot create() {
        return builder().build();
    }

    /**
     * @return roleName
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * @return destBucket
     */
    public String destBucket() {
        return this.destBucket;
    }

    /**
     * @return notifyTopic
     */
    public String notifyTopic() {
        return this.notifyTopic;
    }

    /**
     * @return interval
     */
    public Long interval() {
        return this.interval;
    }

    public static final class Builder {
        private String roleName; 
        private String destBucket; 
        private String notifyTopic; 
        private Long interval; 

        /**
         * <p>description</p>
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder destBucket(String destBucket) {
            this.destBucket = destBucket;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder notifyTopic(String notifyTopic) {
            this.notifyTopic = notifyTopic;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        public LiveChannelSnapshot build() {
            return new LiveChannelSnapshot(this);
        } 

    } 

}
