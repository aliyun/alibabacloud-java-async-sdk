// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLivePrivateLineAvailGAResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePrivateLineAvailGAResponseBody</p>
 */
public class DescribeLivePrivateLineAvailGAResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePrivateLineAvailGAs")
    private LivePrivateLineAvailGAs livePrivateLineAvailGAs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLivePrivateLineAvailGAResponseBody(Builder builder) {
        this.livePrivateLineAvailGAs = builder.livePrivateLineAvailGAs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLivePrivateLineAvailGAResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return livePrivateLineAvailGAs
     */
    public LivePrivateLineAvailGAs getLivePrivateLineAvailGAs() {
        return this.livePrivateLineAvailGAs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LivePrivateLineAvailGAs livePrivateLineAvailGAs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLivePrivateLineAvailGAResponseBody model) {
            this.livePrivateLineAvailGAs = model.livePrivateLineAvailGAs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The GA instance configuration details.</p>
         */
        public Builder livePrivateLineAvailGAs(LivePrivateLineAvailGAs livePrivateLineAvailGAs) {
            this.livePrivateLineAvailGAs = livePrivateLineAvailGAs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C4865B85-664B-19D3-BB16-C62FB83C8226</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLivePrivateLineAvailGAResponseBody build() {
            return new DescribeLivePrivateLineAvailGAResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLivePrivateLineAvailGAResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePrivateLineAvailGAResponseBody</p>
     */
    public static class LivePrivateLineAvailGA extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerationArea")
        private String accelerationArea;

        @com.aliyun.core.annotation.NameInMap("AccelerationType")
        private String accelerationType;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BindingStatus")
        private String bindingStatus;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("VideoCenter")
        private String videoCenter;

        private LivePrivateLineAvailGA(Builder builder) {
            this.accelerationArea = builder.accelerationArea;
            this.accelerationType = builder.accelerationType;
            this.appName = builder.appName;
            this.bindingStatus = builder.bindingStatus;
            this.domainName = builder.domainName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.streamName = builder.streamName;
            this.uid = builder.uid;
            this.videoCenter = builder.videoCenter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePrivateLineAvailGA create() {
            return builder().build();
        }

        /**
         * @return accelerationArea
         */
        public String getAccelerationArea() {
            return this.accelerationArea;
        }

        /**
         * @return accelerationType
         */
        public String getAccelerationType() {
            return this.accelerationType;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return bindingStatus
         */
        public String getBindingStatus() {
            return this.bindingStatus;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return videoCenter
         */
        public String getVideoCenter() {
            return this.videoCenter;
        }

        public static final class Builder {
            private String accelerationArea; 
            private String accelerationType; 
            private String appName; 
            private String bindingStatus; 
            private String domainName; 
            private String ip; 
            private String instanceId; 
            private String status; 
            private String streamName; 
            private String uid; 
            private String videoCenter; 

            private Builder() {
            } 

            private Builder(LivePrivateLineAvailGA model) {
                this.accelerationArea = model.accelerationArea;
                this.accelerationType = model.accelerationType;
                this.appName = model.appName;
                this.bindingStatus = model.bindingStatus;
                this.domainName = model.domainName;
                this.ip = model.ip;
                this.instanceId = model.instanceId;
                this.status = model.status;
                this.streamName = model.streamName;
                this.uid = model.uid;
                this.videoCenter = model.videoCenter;
            } 

            /**
             * <p>The acceleration channel.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder accelerationArea(String accelerationArea) {
                this.accelerationArea = accelerationArea;
                return this;
            }

            /**
             * <p>The acceleration type. Valid values:</p>
             * <ul>
             * <li>play: streaming acceleration</li>
             * <li>publish: stream ingest acceleration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>play</p>
             */
            public Builder accelerationType(String accelerationType) {
                this.accelerationType = accelerationType;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>live</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>Indicates whether the GA instance is bound to an acceleration circuit. Valid values:</p>
             * <ul>
             * <li>yes</li>
             * <li>no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
             */
            public Builder bindingStatus(String bindingStatus) {
                this.bindingStatus = bindingStatus;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The accelerated IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1iovsdpf01ym9su****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the GA instance. Valid values:</p>
             * <ul>
             * <li>active: The GA instance is available.</li>
             * <li>inactive: The GA instance is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>testStream</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The user ID (UID).</p>
             * 
             * <strong>example:</strong>
             * <p>1833220971116****</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The live center.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder videoCenter(String videoCenter) {
                this.videoCenter = videoCenter;
                return this;
            }

            public LivePrivateLineAvailGA build() {
                return new LivePrivateLineAvailGA(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLivePrivateLineAvailGAResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePrivateLineAvailGAResponseBody</p>
     */
    public static class LivePrivateLineAvailGAs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LivePrivateLineAvailGA")
        private java.util.List<LivePrivateLineAvailGA> livePrivateLineAvailGA;

        private LivePrivateLineAvailGAs(Builder builder) {
            this.livePrivateLineAvailGA = builder.livePrivateLineAvailGA;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePrivateLineAvailGAs create() {
            return builder().build();
        }

        /**
         * @return livePrivateLineAvailGA
         */
        public java.util.List<LivePrivateLineAvailGA> getLivePrivateLineAvailGA() {
            return this.livePrivateLineAvailGA;
        }

        public static final class Builder {
            private java.util.List<LivePrivateLineAvailGA> livePrivateLineAvailGA; 

            private Builder() {
            } 

            private Builder(LivePrivateLineAvailGAs model) {
                this.livePrivateLineAvailGA = model.livePrivateLineAvailGA;
            } 

            /**
             * LivePrivateLineAvailGA.
             */
            public Builder livePrivateLineAvailGA(java.util.List<LivePrivateLineAvailGA> livePrivateLineAvailGA) {
                this.livePrivateLineAvailGA = livePrivateLineAvailGA;
                return this;
            }

            public LivePrivateLineAvailGAs build() {
                return new LivePrivateLineAvailGAs(this);
            } 

        } 

    }
}
