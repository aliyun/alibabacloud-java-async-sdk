// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPropertyScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPropertyScheduleConfigResponseBody</p>
 */
public class GetPropertyScheduleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PropertyScheduleConfig")
    private PropertyScheduleConfig propertyScheduleConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPropertyScheduleConfigResponseBody(Builder builder) {
        this.propertyScheduleConfig = builder.propertyScheduleConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPropertyScheduleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return propertyScheduleConfig
     */
    public PropertyScheduleConfig getPropertyScheduleConfig() {
        return this.propertyScheduleConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PropertyScheduleConfig propertyScheduleConfig; 
        private String requestId; 

        /**
         * <p>The configurations for the collection frequency of asset fingerprints.</p>
         */
        public Builder propertyScheduleConfig(PropertyScheduleConfig propertyScheduleConfig) {
            this.propertyScheduleConfig = propertyScheduleConfig;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B37C9052-A73E-4707-A024-92477028****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPropertyScheduleConfigResponseBody build() {
            return new GetPropertyScheduleConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPropertyScheduleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertyScheduleConfigResponseBody</p>
     */
    public static class PropertyScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextScheduleTime")
        private Long nextScheduleTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PropertyScheduleConfig(Builder builder) {
            this.nextScheduleTime = builder.nextScheduleTime;
            this.scheduleTime = builder.scheduleTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return nextScheduleTime
         */
        public Long getNextScheduleTime() {
            return this.nextScheduleTime;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long nextScheduleTime; 
            private String scheduleTime; 
            private String type; 

            /**
             * <p>The timestamp when the next collection of asset fingerprints starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1671630647018</p>
             */
            public Builder nextScheduleTime(Long nextScheduleTime) {
                this.nextScheduleTime = nextScheduleTime;
                return this;
            }

            /**
             * <p>The collection frequency of asset fingerprints. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.</li>
             * <li><strong>1</strong>: collects asset fingerprints once an hour.</li>
             * <li><strong>3</strong>: collects asset fingerprints once every 3 hours.</li>
             * <li><strong>12</strong>: collects asset fingerprints once every 12 hours.</li>
             * <li><strong>24</strong>: collects asset fingerprints once a day.</li>
             * <li><strong>168</strong>: collects asset fingerprints once every 7 days.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The type of the asset fingerprints. Valid values:</p>
             * <ul>
             * <li><strong>scheduler_port_period</strong>: listening port</li>
             * <li><strong>scheduler_process_period</strong>: running process</li>
             * <li><strong>scheduler_account_period</strong>: account</li>
             * <li><strong>scheduler_software_period</strong>: software</li>
             * <li><strong>scheduler_cron_period</strong>: scheduled task</li>
             * <li><strong>scheduler_sca_period</strong>: middleware</li>
             * <li><strong>scheduler_autorun_period</strong>: startup item</li>
             * <li><strong>scheduler_lkm_period</strong>: kernel module</li>
             * <li><strong>scheduler_sca_proxy_period</strong>: website</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>scheduler_account_period</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PropertyScheduleConfig build() {
                return new PropertyScheduleConfig(this);
            } 

        } 

    }
}
