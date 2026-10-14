// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListScheduleTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListScheduleTemplatesResponseBody</p>
 */
public class ListScheduleTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ListScheduleTemplatesResponse")
    private ListScheduleTemplatesResponse listScheduleTemplatesResponse;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListScheduleTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.listScheduleTemplatesResponse = builder.listScheduleTemplatesResponse;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduleTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return listScheduleTemplatesResponse
     */
    public ListScheduleTemplatesResponse getListScheduleTemplatesResponse() {
        return this.listScheduleTemplatesResponse;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private ListScheduleTemplatesResponse listScheduleTemplatesResponse; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListScheduleTemplatesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.listScheduleTemplatesResponse = model.listScheduleTemplatesResponse;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The schedule template list response.</p>
         */
        public Builder listScheduleTemplatesResponse(ListScheduleTemplatesResponse listScheduleTemplatesResponse) {
            this.listScheduleTemplatesResponse = listScheduleTemplatesResponse;
            return this;
        }

        /**
         * <p>The error message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListScheduleTemplatesResponseBody build() {
            return new ListScheduleTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleTemplatesResponseBody</p>
     */
    public static class ConditionScheduleParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionName")
        private String conditionName;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FollowScheduleParam")
        private Boolean followScheduleParam;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private Integer nodeStatus;

        @com.aliyun.core.annotation.NameInMap("ScheduleConditionJson")
        private String scheduleConditionJson;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        private ConditionScheduleParamList(Builder builder) {
            this.conditionName = builder.conditionName;
            this.cronExpression = builder.cronExpression;
            this.enable = builder.enable;
            this.followScheduleParam = builder.followScheduleParam;
            this.nodeStatus = builder.nodeStatus;
            this.scheduleConditionJson = builder.scheduleConditionJson;
            this.scheduleTime = builder.scheduleTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionScheduleParamList create() {
            return builder().build();
        }

        /**
         * @return conditionName
         */
        public String getConditionName() {
            return this.conditionName;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return followScheduleParam
         */
        public Boolean getFollowScheduleParam() {
            return this.followScheduleParam;
        }

        /**
         * @return nodeStatus
         */
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return scheduleConditionJson
         */
        public String getScheduleConditionJson() {
            return this.scheduleConditionJson;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public static final class Builder {
            private String conditionName; 
            private String cronExpression; 
            private Boolean enable; 
            private Boolean followScheduleParam; 
            private Integer nodeStatus; 
            private String scheduleConditionJson; 
            private String scheduleTime; 

            private Builder() {
            } 

            private Builder(ConditionScheduleParamList model) {
                this.conditionName = model.conditionName;
                this.cronExpression = model.cronExpression;
                this.enable = model.enable;
                this.followScheduleParam = model.followScheduleParam;
                this.nodeStatus = model.nodeStatus;
                this.scheduleConditionJson = model.scheduleConditionJson;
                this.scheduleTime = model.scheduleTime;
            } 

            /**
             * <p>The name of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>Rerun on failure condition</p>
             */
            public Builder conditionName(String conditionName) {
                this.conditionName = conditionName;
                return this;
            }

            /**
             * <p>The cron expression used after the condition is met.</p>
             * 
             * <strong>example:</strong>
             * <p>0 30 * * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether the condition is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Specifies whether to follow the main schedule parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder followScheduleParam(Boolean followScheduleParam) {
                this.followScheduleParam = followScheduleParam;
                return this;
            }

            /**
             * <p>The node schedule status after the condition is met. Valid values:</p>
             * <ul>
             * <li>1: Normal.</li>
             * <li>2: Paused.</li>
             * <li>3: Dry run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeStatus(Integer nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The conditional expression tree as a JSON character string. The keys are in lower camel case and must be parsed by the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;EXPRESSION_GROUP&quot;,&quot;operator&quot;:&quot;or&quot;}</p>
             */
            public Builder scheduleConditionJson(String scheduleConditionJson) {
                this.scheduleConditionJson = scheduleConditionJson;
                return this;
            }

            /**
             * <p>The schedule time used after the condition is met.</p>
             * 
             * <strong>example:</strong>
             * <p>00:30</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            public ConditionScheduleParamList build() {
                return new ConditionScheduleParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleTemplatesResponseBody</p>
     */
    public static class CustomIntervalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IntervalUnit")
        private String intervalUnit;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private CustomIntervalConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.interval = builder.interval;
            this.intervalUnit = builder.intervalUnit;
            this.schedulePeriod = builder.schedulePeriod;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomIntervalConfig create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return intervalUnit
         */
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        /**
         * @return schedulePeriod
         */
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Integer interval; 
            private String intervalUnit; 
            private String schedulePeriod; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CustomIntervalConfig model) {
                this.endTime = model.endTime;
                this.interval = model.interval;
                this.intervalUnit = model.intervalUnit;
                this.schedulePeriod = model.schedulePeriod;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time of the effective period.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The interval value.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The interval unit.</p>
             * 
             * <strong>example:</strong>
             * <p>MINUTE</p>
             */
            public Builder intervalUnit(String intervalUnit) {
                this.intervalUnit = intervalUnit;
                return this;
            }

            /**
             * <p>The schedule period to which the interval belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>DAY_INTERVAL</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>The start time of the effective period.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CustomIntervalConfig build() {
                return new CustomIntervalConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleTemplatesResponseBody</p>
     */
    public static class CustomIntervalConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IntervalUnit")
        private String intervalUnit;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private String schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private CustomIntervalConfigs(Builder builder) {
            this.endTime = builder.endTime;
            this.interval = builder.interval;
            this.intervalUnit = builder.intervalUnit;
            this.schedulePeriod = builder.schedulePeriod;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomIntervalConfigs create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return intervalUnit
         */
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        /**
         * @return schedulePeriod
         */
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Integer interval; 
            private String intervalUnit; 
            private String schedulePeriod; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CustomIntervalConfigs model) {
                this.endTime = model.endTime;
                this.interval = model.interval;
                this.intervalUnit = model.intervalUnit;
                this.schedulePeriod = model.schedulePeriod;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time of the effective period.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The interval value.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The interval unit.</p>
             * 
             * <strong>example:</strong>
             * <p>MINUTE</p>
             */
            public Builder intervalUnit(String intervalUnit) {
                this.intervalUnit = intervalUnit;
                return this;
            }

            /**
             * <p>The schedule period to which the interval belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>DAY_INTERVAL</p>
             */
            public Builder schedulePeriod(String schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>The start time of the effective period.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CustomIntervalConfigs build() {
                return new CustomIntervalConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleTemplatesResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionScheduleParamList")
        private java.util.List<ConditionScheduleParamList> conditionScheduleParamList;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomCronExpression")
        private Boolean customCronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomIntervalConfig")
        private CustomIntervalConfig customIntervalConfig;

        @com.aliyun.core.annotation.NameInMap("CustomIntervalConfigType")
        private String customIntervalConfigType;

        @com.aliyun.core.annotation.NameInMap("CustomIntervalConfigs")
        private java.util.List<CustomIntervalConfigs> customIntervalConfigs;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private Long gmtModify;

        @com.aliyun.core.annotation.NameInMap("HasReference")
        private Boolean hasReference;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("ModifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("ScheduleIntervalType")
        private String scheduleIntervalType;

        @com.aliyun.core.annotation.NameInMap("ScheduleTemplateDesc")
        private String scheduleTemplateDesc;

        @com.aliyun.core.annotation.NameInMap("ScheduleTemplateId")
        private Long scheduleTemplateId;

        @com.aliyun.core.annotation.NameInMap("ScheduleTemplateName")
        private String scheduleTemplateName;

        @com.aliyun.core.annotation.NameInMap("ScheduleTemplateType")
        private String scheduleTemplateType;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private Integer scheduleType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("ValidEndDate")
        private String validEndDate;

        @com.aliyun.core.annotation.NameInMap("ValidStartDate")
        private String validStartDate;

        private ResultData(Builder builder) {
            this.conditionScheduleParamList = builder.conditionScheduleParamList;
            this.cronExpression = builder.cronExpression;
            this.customCronExpression = builder.customCronExpression;
            this.customIntervalConfig = builder.customIntervalConfig;
            this.customIntervalConfigType = builder.customIntervalConfigType;
            this.customIntervalConfigs = builder.customIntervalConfigs;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.hasReference = builder.hasReference;
            this.modifierId = builder.modifierId;
            this.modifierName = builder.modifierName;
            this.scheduleIntervalType = builder.scheduleIntervalType;
            this.scheduleTemplateDesc = builder.scheduleTemplateDesc;
            this.scheduleTemplateId = builder.scheduleTemplateId;
            this.scheduleTemplateName = builder.scheduleTemplateName;
            this.scheduleTemplateType = builder.scheduleTemplateType;
            this.scheduleType = builder.scheduleType;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.validEndDate = builder.validEndDate;
            this.validStartDate = builder.validStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return conditionScheduleParamList
         */
        public java.util.List<ConditionScheduleParamList> getConditionScheduleParamList() {
            return this.conditionScheduleParamList;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return customCronExpression
         */
        public Boolean getCustomCronExpression() {
            return this.customCronExpression;
        }

        /**
         * @return customIntervalConfig
         */
        public CustomIntervalConfig getCustomIntervalConfig() {
            return this.customIntervalConfig;
        }

        /**
         * @return customIntervalConfigType
         */
        public String getCustomIntervalConfigType() {
            return this.customIntervalConfigType;
        }

        /**
         * @return customIntervalConfigs
         */
        public java.util.List<CustomIntervalConfigs> getCustomIntervalConfigs() {
            return this.customIntervalConfigs;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public Long getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return hasReference
         */
        public Boolean getHasReference() {
            return this.hasReference;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
        }

        /**
         * @return scheduleIntervalType
         */
        public String getScheduleIntervalType() {
            return this.scheduleIntervalType;
        }

        /**
         * @return scheduleTemplateDesc
         */
        public String getScheduleTemplateDesc() {
            return this.scheduleTemplateDesc;
        }

        /**
         * @return scheduleTemplateId
         */
        public Long getScheduleTemplateId() {
            return this.scheduleTemplateId;
        }

        /**
         * @return scheduleTemplateName
         */
        public String getScheduleTemplateName() {
            return this.scheduleTemplateName;
        }

        /**
         * @return scheduleTemplateType
         */
        public String getScheduleTemplateType() {
            return this.scheduleTemplateType;
        }

        /**
         * @return scheduleType
         */
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return validEndDate
         */
        public String getValidEndDate() {
            return this.validEndDate;
        }

        /**
         * @return validStartDate
         */
        public String getValidStartDate() {
            return this.validStartDate;
        }

        public static final class Builder {
            private java.util.List<ConditionScheduleParamList> conditionScheduleParamList; 
            private String cronExpression; 
            private Boolean customCronExpression; 
            private CustomIntervalConfig customIntervalConfig; 
            private String customIntervalConfigType; 
            private java.util.List<CustomIntervalConfigs> customIntervalConfigs; 
            private Long gmtCreate; 
            private Long gmtModify; 
            private Boolean hasReference; 
            private String modifierId; 
            private String modifierName; 
            private String scheduleIntervalType; 
            private String scheduleTemplateDesc; 
            private Long scheduleTemplateId; 
            private String scheduleTemplateName; 
            private String scheduleTemplateType; 
            private Integer scheduleType; 
            private Long tenantId; 
            private String userId; 
            private String userName; 
            private String validEndDate; 
            private String validStartDate; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.conditionScheduleParamList = model.conditionScheduleParamList;
                this.cronExpression = model.cronExpression;
                this.customCronExpression = model.customCronExpression;
                this.customIntervalConfig = model.customIntervalConfig;
                this.customIntervalConfigType = model.customIntervalConfigType;
                this.customIntervalConfigs = model.customIntervalConfigs;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.hasReference = model.hasReference;
                this.modifierId = model.modifierId;
                this.modifierName = model.modifierName;
                this.scheduleIntervalType = model.scheduleIntervalType;
                this.scheduleTemplateDesc = model.scheduleTemplateDesc;
                this.scheduleTemplateId = model.scheduleTemplateId;
                this.scheduleTemplateName = model.scheduleTemplateName;
                this.scheduleTemplateType = model.scheduleTemplateType;
                this.scheduleType = model.scheduleType;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
                this.userName = model.userName;
                this.validEndDate = model.validEndDate;
                this.validStartDate = model.validStartDate;
            } 

            /**
             * <p>The condition-based schedule parameters. This parameter has a value only for condition-based schedule templates.</p>
             */
            public Builder conditionScheduleParamList(java.util.List<ConditionScheduleParamList> conditionScheduleParamList) {
                this.conditionScheduleParamList = conditionScheduleParamList;
                return this;
            }

            /**
             * <p>The cron expression for automatic scheduling. Refer to Linux cron expressions.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 1 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether a custom cron expression is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder customCronExpression(Boolean customCronExpression) {
                this.customCronExpression = customCronExpression;
                return this;
            }

            /**
             * <p>The custom schedule interval configuration. This configuration takes effect only when used together with CustomIntervalConfigType.</p>
             */
            public Builder customIntervalConfig(CustomIntervalConfig customIntervalConfig) {
                this.customIntervalConfig = customIntervalConfig;
                return this;
            }

            /**
             * <p>The type of the custom interval configuration. Valid values: TIME_POINT, TIME_PERIOD, CUSTOM_TIME_POINT, and CUSTOM_TIME_PERIOD.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM_TIME_PERIOD</p>
             */
            public Builder customIntervalConfigType(String customIntervalConfigType) {
                this.customIntervalConfigType = customIntervalConfigType;
                return this;
            }

            /**
             * <p>The custom schedule interval configurations. This parameter is valid only when CustomIntervalConfigType is set to CUSTOM_TIME_PERIOD.</p>
             */
            public Builder customIntervalConfigs(java.util.List<CustomIntervalConfigs> customIntervalConfigs) {
                this.customIntervalConfigs = customIntervalConfigs;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1704153600000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1709516800000</p>
             */
            public Builder gmtModify(Long gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * <p>Specifies whether the schedule template is referenced by a node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasReference(Boolean hasReference) {
                this.hasReference = hasReference;
                return this;
            }

            /**
             * <p>The ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>30001012</p>
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * <p>The name of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Li Si</p>
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * <p>The schedule interval type. Valid values: YEARLY, MONTHLY, WEEKLY, DAILY, HOURLY, and MINUTELY.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder scheduleIntervalType(String scheduleIntervalType) {
                this.scheduleIntervalType = scheduleIntervalType;
                return this;
            }

            /**
             * <p>The description of the schedule template.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduled at 1:00 AM on weekdays</p>
             */
            public Builder scheduleTemplateDesc(String scheduleTemplateDesc) {
                this.scheduleTemplateDesc = scheduleTemplateDesc;
                return this;
            }

            /**
             * <p>The ID of the schedule template, which is used to bind a schedule template when updating a node.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder scheduleTemplateId(Long scheduleTemplateId) {
                this.scheduleTemplateId = scheduleTemplateId;
                return this;
            }

            /**
             * <p>The name of the schedule template.</p>
             * 
             * <strong>example:</strong>
             * <p>1:00 AM every day</p>
             */
            public Builder scheduleTemplateName(String scheduleTemplateName) {
                this.scheduleTemplateName = scheduleTemplateName;
                return this;
            }

            /**
             * <p>The templatetype. Valid values: BASE_SCHEDULE_TEMPLATE: basic scheduling template, CONDITION_SCHEDULE_TEMPLATE: conditional scheduling template.</p>
             * 
             * <strong>example:</strong>
             * <p>BASE_SCHEDULE_TEMPLATE</p>
             */
            public Builder scheduleTemplateType(String scheduleTemplateType) {
                this.scheduleTemplateType = scheduleTemplateType;
                return this;
            }

            /**
             * <p>The schedule type. Valid values: normal scheduling, dry run scheduling, and paused scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scheduleType(Integer scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the schedule template belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The end date of the effective period, in the yyyy-MM-dd format.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-01-01</p>
             */
            public Builder validEndDate(String validEndDate) {
                this.validEndDate = validEndDate;
                return this;
            }

            /**
             * <p>The start date of the effective period, in the yyyy-MM-dd format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01</p>
             */
            public Builder validStartDate(String validStartDate) {
                this.validStartDate = validStartDate;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleTemplatesResponseBody</p>
     */
    public static class ListScheduleTemplatesResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("ResultData")
        private java.util.List<ResultData> resultData;

        private ListScheduleTemplatesResponse(Builder builder) {
            this.count = builder.count;
            this.resultData = builder.resultData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListScheduleTemplatesResponse create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return resultData
         */
        public java.util.List<ResultData> getResultData() {
            return this.resultData;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<ResultData> resultData; 

            private Builder() {
            } 

            private Builder(ListScheduleTemplatesResponse model) {
                this.count = model.count;
                this.resultData = model.resultData;
            } 

            /**
             * <p>The total number of schedule templates that meet the specified conditions. This number is not limited by pagination.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The schedule templates.</p>
             */
            public Builder resultData(java.util.List<ResultData> resultData) {
                this.resultData = resultData;
                return this;
            }

            public ListScheduleTemplatesResponse build() {
                return new ListScheduleTemplatesResponse(this);
            } 

        } 

    }
}
