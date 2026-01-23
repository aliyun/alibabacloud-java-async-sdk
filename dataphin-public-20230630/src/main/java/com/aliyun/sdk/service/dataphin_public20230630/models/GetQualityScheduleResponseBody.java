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
 * {@link GetQualityScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityScheduleResponseBody</p>
 */
public class GetQualityScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QualityScheduleInfo")
    private QualityScheduleInfo qualityScheduleInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityScheduleResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.qualityScheduleInfo = builder.qualityScheduleInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityScheduleResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return qualityScheduleInfo
     */
    public QualityScheduleInfo getQualityScheduleInfo() {
        return this.qualityScheduleInfo;
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
        private String message; 
        private QualityScheduleInfo qualityScheduleInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityScheduleResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.qualityScheduleInfo = model.qualityScheduleInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * QualityScheduleInfo.
         */
        public Builder qualityScheduleInfo(QualityScheduleInfo qualityScheduleInfo) {
            this.qualityScheduleInfo = qualityScheduleInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityScheduleResponseBody build() {
            return new GetQualityScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityScheduleResponseBody</p>
     */
    public static class QualityScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsRefByRule")
        private Boolean isRefByRule;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PartitionExpression")
        private String partitionExpression;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("PeriodScheduleIntervalType")
        private String periodScheduleIntervalType;

        @com.aliyun.core.annotation.NameInMap("PeriodScheduleParamList")
        private java.util.List<String> periodScheduleParamList;

        @com.aliyun.core.annotation.NameInMap("StaticTaskTriggerType")
        private String staticTaskTriggerType;

        @com.aliyun.core.annotation.NameInMap("TriggerNodeList")
        private java.util.List<String> triggerNodeList;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValidatePartitionType")
        private String validatePartitionType;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        private Long watchId;

        private QualityScheduleInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.cronExpression = builder.cronExpression;
            this.id = builder.id;
            this.isRefByRule = builder.isRefByRule;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.partitionExpression = builder.partitionExpression;
            this.partitionType = builder.partitionType;
            this.periodScheduleIntervalType = builder.periodScheduleIntervalType;
            this.periodScheduleParamList = builder.periodScheduleParamList;
            this.staticTaskTriggerType = builder.staticTaskTriggerType;
            this.triggerNodeList = builder.triggerNodeList;
            this.triggerType = builder.triggerType;
            this.type = builder.type;
            this.validatePartitionType = builder.validatePartitionType;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityScheduleInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isRefByRule
         */
        public Boolean getIsRefByRule() {
            return this.isRefByRule;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionExpression
         */
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return periodScheduleIntervalType
         */
        public String getPeriodScheduleIntervalType() {
            return this.periodScheduleIntervalType;
        }

        /**
         * @return periodScheduleParamList
         */
        public java.util.List<String> getPeriodScheduleParamList() {
            return this.periodScheduleParamList;
        }

        /**
         * @return staticTaskTriggerType
         */
        public String getStaticTaskTriggerType() {
            return this.staticTaskTriggerType;
        }

        /**
         * @return triggerNodeList
         */
        public java.util.List<String> getTriggerNodeList() {
            return this.triggerNodeList;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return validatePartitionType
         */
        public String getValidatePartitionType() {
            return this.validatePartitionType;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String cronExpression; 
            private Long id; 
            private Boolean isRefByRule; 
            private String modifier; 
            private String modifyTime; 
            private String name; 
            private String partitionExpression; 
            private String partitionType; 
            private String periodScheduleIntervalType; 
            private java.util.List<String> periodScheduleParamList; 
            private String staticTaskTriggerType; 
            private java.util.List<String> triggerNodeList; 
            private String triggerType; 
            private String type; 
            private String validatePartitionType; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(QualityScheduleInfo model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.cronExpression = model.cronExpression;
                this.id = model.id;
                this.isRefByRule = model.isRefByRule;
                this.modifier = model.modifier;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.partitionExpression = model.partitionExpression;
                this.partitionType = model.partitionType;
                this.periodScheduleIntervalType = model.periodScheduleIntervalType;
                this.periodScheduleParamList = model.periodScheduleParamList;
                this.staticTaskTriggerType = model.staticTaskTriggerType;
                this.triggerNodeList = model.triggerNodeList;
                this.triggerType = model.triggerType;
                this.type = model.type;
                this.validatePartitionType = model.validatePartitionType;
                this.watchId = model.watchId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsRefByRule.
             */
            public Builder isRefByRule(Boolean isRefByRule) {
                this.isRefByRule = isRefByRule;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PartitionExpression.
             */
            public Builder partitionExpression(String partitionExpression) {
                this.partitionExpression = partitionExpression;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * PeriodScheduleIntervalType.
             */
            public Builder periodScheduleIntervalType(String periodScheduleIntervalType) {
                this.periodScheduleIntervalType = periodScheduleIntervalType;
                return this;
            }

            /**
             * PeriodScheduleParamList.
             */
            public Builder periodScheduleParamList(java.util.List<String> periodScheduleParamList) {
                this.periodScheduleParamList = periodScheduleParamList;
                return this;
            }

            /**
             * StaticTaskTriggerType.
             */
            public Builder staticTaskTriggerType(String staticTaskTriggerType) {
                this.staticTaskTriggerType = staticTaskTriggerType;
                return this;
            }

            /**
             * TriggerNodeList.
             */
            public Builder triggerNodeList(java.util.List<String> triggerNodeList) {
                this.triggerNodeList = triggerNodeList;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ValidatePartitionType.
             */
            public Builder validatePartitionType(String validatePartitionType) {
                this.validatePartitionType = validatePartitionType;
                return this;
            }

            /**
             * WatchId.
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public QualityScheduleInfo build() {
                return new QualityScheduleInfo(this);
            } 

        } 

    }
}
