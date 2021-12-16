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
    @NameInMap("DestBucket")
    private String destBucket;

    @NameInMap("Interval")
    private Long interval;

    @NameInMap("NotifyTopic")
    private String notifyTopic;

    @NameInMap("RoleName")
    private String roleName;


    private LiveChannelSnapshot(Builder builder) {
        this.destBucket = builder.destBucket;
        this.interval = builder.interval;
        this.notifyTopic = builder.notifyTopic;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannelSnapshot create() {
        return builder().build();
    }

    /**
     * @return destBucket
     */
    public String getDestBucket() {
        return this.destBucket;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return notifyTopic
     */
    public String getNotifyTopic() {
        return this.notifyTopic;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder {
        private String destBucket; 
        private Long interval; 
        private String notifyTopic; 
        private String roleName; 

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
        public Builder interval(Long interval) {
            this.interval = interval;
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
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public LiveChannelSnapshot build() {
            return new LiveChannelSnapshot(this);
        } 

    } 

}
