// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetClusterInspectReportDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterInspectReportDetailResponseBody</p>
 */
public class GetClusterInspectReportDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checkItemResults")
    private java.util.List<CheckItemResults> checkItemResults;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("reportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("summary")
    private Summary summary;

    private GetClusterInspectReportDetailResponseBody(Builder builder) {
        this.checkItemResults = builder.checkItemResults;
        this.endTime = builder.endTime;
        this.nextToken = builder.nextToken;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterInspectReportDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkItemResults
     */
    public java.util.List<CheckItemResults> getCheckItemResults() {
        return this.checkItemResults;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private java.util.List<CheckItemResults> checkItemResults; 
        private String endTime; 
        private String nextToken; 
        private String reportId; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private Summary summary; 

        private Builder() {
        } 

        private Builder(GetClusterInspectReportDetailResponseBody model) {
            this.checkItemResults = model.checkItemResults;
            this.endTime = model.endTime;
            this.nextToken = model.nextToken;
            this.reportId = model.reportId;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.summary = model.summary;
        } 

        /**
         * <p>The results.</p>
         */
        public Builder checkItemResults(java.util.List<CheckItemResults> checkItemResults) {
            this.checkItemResults = checkItemResults;
            return this;
        }

        /**
         * <p>The completion time of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-18T19:41:12.778433+08:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The token that is used to display the returned tags on multiple pages.</p>
         * 
         * <strong>example:</strong>
         * <p>AK8uQQrxgFK8sbARvnCj6w9R3kPme4I3</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>782df89346054a0000562063a****</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49511F2D-D56A-5C24-B9AE-C8491E09B***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-18T19:40:16.778333+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the inspection report. Valid values:</p>
         * <ul>
         * <li>completed: The inspection report is generated.</li>
         * <li>running: The inspection report is generating.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Overview of inspection reports.</p>
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        public GetClusterInspectReportDetailResponseBody build() {
            return new GetClusterInspectReportDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterInspectReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterInspectReportDetailResponseBody</p>
     */
    public static class CheckItemResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("checkItemUid")
        private String checkItemUid;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fix")
        private String fix;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("targets")
        private java.util.List<String> targets;

        private CheckItemResults(Builder builder) {
            this.category = builder.category;
            this.checkItemUid = builder.checkItemUid;
            this.description = builder.description;
            this.fix = builder.fix;
            this.level = builder.level;
            this.name = builder.name;
            this.result = builder.result;
            this.targetType = builder.targetType;
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItemResults create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return checkItemUid
         */
        public String getCheckItemUid() {
            return this.checkItemUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fix
         */
        public String getFix() {
            return this.fix;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return targets
         */
        public java.util.List<String> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private String category; 
            private String checkItemUid; 
            private String description; 
            private String fix; 
            private String level; 
            private String name; 
            private String result; 
            private String targetType; 
            private java.util.List<String> targets; 

            private Builder() {
            } 

            private Builder(CheckItemResults model) {
                this.category = model.category;
                this.checkItemUid = model.checkItemUid;
                this.description = model.description;
                this.fix = model.fix;
                this.level = model.level;
                this.name = model.name;
                this.result = model.result;
                this.targetType = model.targetType;
                this.targets = model.targets;
            } 

            /**
             * <p>The category of the inspection item. Valid values:</p>
             * <ul>
             * <li>security: Security compliance</li>
             * <li>performance: Performance efficiency</li>
             * <li>stability: Business stability</li>
             * <li>limitation: Service limits</li>
             * <li>cost: Cost optimization</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stability</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The unique identifier of the inspection item.</p>
             * 
             * <strong>example:</strong>
             * <p>APIServerClbInstanceStatus</p>
             */
            public Builder checkItemUid(String checkItemUid) {
                this.checkItemUid = checkItemUid;
                return this;
            }

            /**
             * <p>The description of the inspection item.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The fixing suggestion.</p>
             */
            public Builder fix(String fix) {
                this.fix = fix;
                return this;
            }

            /**
             * <p>The level of the inspection item. Valid values:</p>
             * <ul>
             * <li>advice: Suggestions</li>
             * <li>warning: Low severity</li>
             * <li>error: Medium severity</li>
             * <li>critical: High severity</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>critical</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The name of the inspection item.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The inspection results. Valid values:</p>
             * <ul>
             * <li>true: The inspection item is abnormal.</li>
             * <li>false: The inspection item is normal.</li>
             * <li>disable: The inspection item is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The resource type of the inspection object.</p>
             * 
             * <strong>example:</strong>
             * <p>CLB</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The inspection objects.</p>
             */
            public Builder targets(java.util.List<String> targets) {
                this.targets = targets;
                return this;
            }

            public CheckItemResults build() {
                return new CheckItemResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClusterInspectReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterInspectReportDetailResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adviceCount")
        private Integer adviceCount;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("errorCount")
        private Integer errorCount;

        @com.aliyun.core.annotation.NameInMap("normalCount")
        private Integer normalCount;

        @com.aliyun.core.annotation.NameInMap("warnCount")
        private Integer warnCount;

        private Summary(Builder builder) {
            this.adviceCount = builder.adviceCount;
            this.code = builder.code;
            this.errorCount = builder.errorCount;
            this.normalCount = builder.normalCount;
            this.warnCount = builder.warnCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return adviceCount
         */
        public Integer getAdviceCount() {
            return this.adviceCount;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return errorCount
         */
        public Integer getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return normalCount
         */
        public Integer getNormalCount() {
            return this.normalCount;
        }

        /**
         * @return warnCount
         */
        public Integer getWarnCount() {
            return this.warnCount;
        }

        public static final class Builder {
            private Integer adviceCount; 
            private String code; 
            private Integer errorCount; 
            private Integer normalCount; 
            private Integer warnCount; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.adviceCount = model.adviceCount;
                this.code = model.code;
                this.errorCount = model.errorCount;
                this.normalCount = model.normalCount;
                this.warnCount = model.warnCount;
            } 

            /**
             * <p>The number of check items whose inspection result is advice.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder adviceCount(Integer adviceCount) {
                this.adviceCount = adviceCount;
                return this;
            }

            /**
             * <p>Check the status code of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>warning</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The number of check items whose inspection result is error.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorCount(Integer errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * <p>The number of check items whose inspection result is normal.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder normalCount(Integer normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * <p>The number of check items whose inspection result is warning.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder warnCount(Integer warnCount) {
                this.warnCount = warnCount;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
}
