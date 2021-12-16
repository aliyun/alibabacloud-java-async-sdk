// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveRecord} extends {@link TeaModel}
 *
 * <p>LiveRecord</p>
 */
public class LiveRecord extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RemoteAddr")
    private String remoteAddr;

    @NameInMap("StartTime")
    private String startTime;


    private LiveRecord(Builder builder) {
        this.endTime = builder.endTime;
        this.remoteAddr = builder.remoteAddr;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveRecord create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return remoteAddr
     */
    public String getRemoteAddr() {
        return this.remoteAddr;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private String remoteAddr; 
        private String startTime; 

        /**
         * <p>description</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder remoteAddr(String remoteAddr) {
            this.remoteAddr = remoteAddr;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public LiveRecord build() {
            return new LiveRecord(this);
        } 

    } 

}
