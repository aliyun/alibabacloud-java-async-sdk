// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListDetectConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDetectConfigsResponseBody</p>
 */
public class ListDetectConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detectConfigs")
    private java.util.List<DetectConfigs> detectConfigs;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListDetectConfigsResponseBody(Builder builder) {
        this.detectConfigs = builder.detectConfigs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDetectConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectConfigs
     */
    public java.util.List<DetectConfigs> getDetectConfigs() {
        return this.detectConfigs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DetectConfigs> detectConfigs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDetectConfigsResponseBody model) {
            this.detectConfigs = model.detectConfigs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of drift detection configurations</p>
         */
        public Builder detectConfigs(java.util.List<DetectConfigs> detectConfigs) {
            this.detectConfigs = detectConfigs;
            return this;
        }

        /**
         * <p>Maximum number of records to retrieve in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Paging nextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>30BaZ9ekYWXJdqshYecA++coNg7qT1Zbm3RfLyFIZeY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79284133-D4BA-56B3-954C-D538256F7EAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>82</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDetectConfigsResponseBody build() {
            return new ListDetectConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDetectConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDetectConfigsResponseBody</p>
     */
    public static class AlarmConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AlarmConfigs(Builder builder) {
            this.address = builder.address;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmConfigs create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private String type; 

            private Builder() {
            } 

            private Builder(AlarmConfigs model) {
                this.address = model.address;
                this.type = model.type;
            } 

            /**
             * <p>Alerting address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx">https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Alerting method. Currently only <code>cms</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AlarmConfigs build() {
                return new AlarmConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDetectConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDetectConfigsResponseBody</p>
     */
    public static class DetectConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmConfigs")
        private java.util.List<AlarmConfigs> alarmConfigs;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("detectConfigId")
        private String detectConfigId;

        @com.aliyun.core.annotation.NameInMap("detectConfigName")
        private String detectConfigName;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private DetectConfigs(Builder builder) {
            this.alarmConfigs = builder.alarmConfigs;
            this.createTime = builder.createTime;
            this.cronExpression = builder.cronExpression;
            this.description = builder.description;
            this.detectConfigId = builder.detectConfigId;
            this.detectConfigName = builder.detectConfigName;
            this.enabled = builder.enabled;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectConfigs create() {
            return builder().build();
        }

        /**
         * @return alarmConfigs
         */
        public java.util.List<AlarmConfigs> getAlarmConfigs() {
            return this.alarmConfigs;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detectConfigId
         */
        public String getDetectConfigId() {
            return this.detectConfigId;
        }

        /**
         * @return detectConfigName
         */
        public String getDetectConfigName() {
            return this.detectConfigName;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private java.util.List<AlarmConfigs> alarmConfigs; 
            private String createTime; 
            private String cronExpression; 
            private String description; 
            private String detectConfigId; 
            private String detectConfigName; 
            private Boolean enabled; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(DetectConfigs model) {
                this.alarmConfigs = model.alarmConfigs;
                this.createTime = model.createTime;
                this.cronExpression = model.cronExpression;
                this.description = model.description;
                this.detectConfigId = model.detectConfigId;
                this.detectConfigName = model.detectConfigName;
                this.enabled = model.enabled;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>List of alerting addresses</p>
             */
            public Builder alarmConfigs(java.util.List<AlarmConfigs> alarmConfigs) {
                this.alarmConfigs = alarmConfigs;
                return this;
            }

            /**
             * <p>Creation Time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T02:30:04Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Cron expression (UTC+8). Required when the trigger type is Cron.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 ? * 1</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Drift detection configuration ID</p>
             * 
             * <strong>example:</strong>
             * <p>dc-xxxx</p>
             */
            public Builder detectConfigId(String detectConfigId) {
                this.detectConfigId = detectConfigId;
                return this;
            }

            /**
             * <p>Name of the drift detection configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder detectConfigName(String detectConfigName) {
                this.detectConfigName = detectConfigName;
                return this;
            }

            /**
             * <p>Whether drift detection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Trigger type  </p>
             * <ul>
             * <li>Manual: Execute manually  </li>
             * <li>Cron: Trigger on schedule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Cron</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public DetectConfigs build() {
                return new DetectConfigs(this);
            } 

        } 

    }
}
