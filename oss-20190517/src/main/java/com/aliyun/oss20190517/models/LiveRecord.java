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
    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RemoteAddr")
    private String remoteAddr;


    private LiveRecord(Builder builder) {
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.remoteAddr = builder.remoteAddr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveRecord create() {
        return builder().build();
    }

    /**
     * @return startTime
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * @return endTime
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * @return remoteAddr
     */
    public String remoteAddr() {
        return this.remoteAddr;
    }

    public static final class Builder {
        private String startTime; 
        private String endTime; 
        private String remoteAddr; 

        /**
         * <p>description</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

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

        public LiveRecord build() {
            return new LiveRecord(this);
        } 

    } 

}
