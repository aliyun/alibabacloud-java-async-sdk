// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPropertyScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPropertyScheduleConfigResponseBody</p>
 */
public class GetPropertyScheduleConfigResponseBody extends TeaModel {
    @NameInMap("PropertyScheduleConfig")
    private PropertyScheduleConfig propertyScheduleConfig;

    @NameInMap("RequestId")
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
         * The configurations for the collection frequency of asset fingerprints.
         */
        public Builder propertyScheduleConfig(PropertyScheduleConfig propertyScheduleConfig) {
            this.propertyScheduleConfig = propertyScheduleConfig;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPropertyScheduleConfigResponseBody build() {
            return new GetPropertyScheduleConfigResponseBody(this);
        } 

    } 

    public static class PropertyScheduleConfig extends TeaModel {
        @NameInMap("NextScheduleTime")
        private Long nextScheduleTime;

        @NameInMap("ScheduleTime")
        private String scheduleTime;

        @NameInMap("Type")
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
             * The timestamp when the next collection of asset fingerprints starts. Unit: milliseconds.
             */
            public Builder nextScheduleTime(Long nextScheduleTime) {
                this.nextScheduleTime = nextScheduleTime;
                return this;
            }

            /**
             * The collection frequency of asset fingerprints. Valid values:
             * <p>
             * 
             * *   **0**: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.
             * *   **1**: collects asset fingerprints once an hour.
             * *   **3**: collects asset fingerprints once every 3 hours.
             * *   **12**: collects asset fingerprints once every 12 hours.
             * *   **24**: collects asset fingerprints once a day.
             * *   **168**: collects asset fingerprints once every 7 days.
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * The type of the asset fingerprints. Valid values:
             * <p>
             * 
             * *   **scheduler_port_period**: listening port
             * *   **scheduler_process_period**: running process
             * *   **scheduler_account_period**: account
             * *   **scheduler_software_period**: software
             * *   **scheduler_cron_period**: scheduled task
             * *   **scheduler_sca_period**: middleware
             * *   **scheduler_autorun_period**: startup item
             * *   **scheduler_lkm_period**: kernel module
             * *   **scheduler_sca_proxy_period**: website
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
