// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetRiskListResponseBody} extends {@link TeaModel}
 *
 * <p>GetRiskListResponseBody</p>
 */
public class GetRiskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRiskListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRiskListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
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

        public GetRiskListResponseBody build() {
            return new GetRiskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRiskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetRiskListResponseBody</p>
     */
    public static class RiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("GradeType")
        private String gradeType;

        @com.aliyun.core.annotation.NameInMap("Health")
        private Boolean health;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastAlarmTime")
        private Long lastAlarmTime;

        @com.aliyun.core.annotation.NameInMap("LevelType")
        private Long levelType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RelationList")
        private java.util.List<String> relationList;

        @com.aliyun.core.annotation.NameInMap("ReportTips")
        private String reportTips;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private String reportType;

        @com.aliyun.core.annotation.NameInMap("ReportValue")
        private String reportValue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RiskList(Builder builder) {
            this.createTime = builder.createTime;
            this.gradeType = builder.gradeType;
            this.health = builder.health;
            this.instanceId = builder.instanceId;
            this.lastAlarmTime = builder.lastAlarmTime;
            this.levelType = builder.levelType;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.relationList = builder.relationList;
            this.reportTips = builder.reportTips;
            this.reportType = builder.reportType;
            this.reportValue = builder.reportValue;
            this.status = builder.status;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return gradeType
         */
        public String getGradeType() {
            return this.gradeType;
        }

        /**
         * @return health
         */
        public Boolean getHealth() {
            return this.health;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastAlarmTime
         */
        public Long getLastAlarmTime() {
            return this.lastAlarmTime;
        }

        /**
         * @return levelType
         */
        public Long getLevelType() {
            return this.levelType;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return relationList
         */
        public java.util.List<String> getRelationList() {
            return this.relationList;
        }

        /**
         * @return reportTips
         */
        public String getReportTips() {
            return this.reportTips;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        /**
         * @return reportValue
         */
        public String getReportValue() {
            return this.reportValue;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long createTime; 
            private String gradeType; 
            private Boolean health; 
            private String instanceId; 
            private Long lastAlarmTime; 
            private Long levelType; 
            private Long modifiedTime; 
            private String name; 
            private String owner; 
            private java.util.List<String> relationList; 
            private String reportTips; 
            private String reportType; 
            private String reportValue; 
            private Long status; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(RiskList model) {
                this.createTime = model.createTime;
                this.gradeType = model.gradeType;
                this.health = model.health;
                this.instanceId = model.instanceId;
                this.lastAlarmTime = model.lastAlarmTime;
                this.levelType = model.levelType;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.owner = model.owner;
                this.relationList = model.relationList;
                this.reportTips = model.reportTips;
                this.reportType = model.reportType;
                this.reportValue = model.reportValue;
                this.status = model.status;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * GradeType.
             */
            public Builder gradeType(String gradeType) {
                this.gradeType = gradeType;
                return this;
            }

            /**
             * Health.
             */
            public Builder health(Boolean health) {
                this.health = health;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LastAlarmTime.
             */
            public Builder lastAlarmTime(Long lastAlarmTime) {
                this.lastAlarmTime = lastAlarmTime;
                return this;
            }

            /**
             * LevelType.
             */
            public Builder levelType(Long levelType) {
                this.levelType = levelType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RelationList.
             */
            public Builder relationList(java.util.List<String> relationList) {
                this.relationList = relationList;
                return this;
            }

            /**
             * ReportTips.
             */
            public Builder reportTips(String reportTips) {
                this.reportTips = reportTips;
                return this;
            }

            /**
             * ReportType.
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * ReportValue.
             */
            public Builder reportValue(String reportValue) {
                this.reportValue = reportValue;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RiskList build() {
                return new RiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRiskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetRiskListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskList")
        private java.util.List<RiskList> riskList;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.riskList = builder.riskList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return riskList
         */
        public java.util.List<RiskList> getRiskList() {
            return this.riskList;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<RiskList> riskList; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.riskList = model.riskList;
                this.total = model.total;
            } 

            /**
             * RiskList.
             */
            public Builder riskList(java.util.List<RiskList> riskList) {
                this.riskList = riskList;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
