// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSaasDataUnitUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetSaasDataUnitUsageResponseBody</p>
 */
public class GetSaasDataUnitUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Distribution")
    private java.util.List<Distribution> distribution;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private Summary summary;

    @com.aliyun.core.annotation.NameInMap("TimeSeries")
    private java.util.List<TimeSeries> timeSeries;

    @com.aliyun.core.annotation.NameInMap("Warnings")
    private java.util.List<Warnings> warnings;

    private GetSaasDataUnitUsageResponseBody(Builder builder) {
        this.distribution = builder.distribution;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.startTime = builder.startTime;
        this.summary = builder.summary;
        this.timeSeries = builder.timeSeries;
        this.warnings = builder.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSaasDataUnitUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return distribution
     */
    public java.util.List<Distribution> getDistribution() {
        return this.distribution;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    /**
     * @return timeSeries
     */
    public java.util.List<TimeSeries> getTimeSeries() {
        return this.timeSeries;
    }

    /**
     * @return warnings
     */
    public java.util.List<Warnings> getWarnings() {
        return this.warnings;
    }

    public static final class Builder {
        private java.util.List<Distribution> distribution; 
        private String endTime; 
        private String requestId; 
        private String serviceId; 
        private String startTime; 
        private Summary summary; 
        private java.util.List<TimeSeries> timeSeries; 
        private java.util.List<Warnings> warnings; 

        private Builder() {
        } 

        private Builder(GetSaasDataUnitUsageResponseBody model) {
            this.distribution = model.distribution;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.startTime = model.startTime;
            this.summary = model.summary;
            this.timeSeries = model.timeSeries;
            this.warnings = model.warnings;
        } 

        /**
         * <p>The usage distribution. The items are sorted in descending order of DataUnit. Items with unknown amounts are placed at the end. Items with the same value are sorted in ascending order of scenario code, project ID, and name. The items are grouped by scenario and project ID. If the project ID is missing but the name is present, the items are grouped by name. Records with both missing are considered unassociated projects. The sum of all items in the complete result equals the summary. Missing or blank log scenarios are classified as other. Scenarios with values but no configured mapping retain the original values as codes and display names, and are normally included in the total. If there are no records for other, no empty row is created.</p>
         */
        public Builder distribution(java.util.List<Distribution> distribution) {
            this.distribution = distribution;
            return this;
        }

        /**
         * <p>The actual end time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-20T02:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mock_req_success</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SaaS service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-example</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The actual start time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-20T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The usage summary.</p>
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The time trend. The items are sorted in ascending order of the UTC bucket start time. For a complete query, zero buckets are filled. If the amount is unknown, the value is null and is not replaced with zero.</p>
         */
        public Builder timeSeries(java.util.List<TimeSeries> timeSeries) {
            this.timeSeries = timeSeries;
            return this;
        }

        /**
         * <p>The product notices.</p>
         */
        public Builder warnings(java.util.List<Warnings> warnings) {
            this.warnings = warnings;
            return this;
        }

        public GetSaasDataUnitUsageResponseBody build() {
            return new GetSaasDataUnitUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSaasDataUnitUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSaasDataUnitUsageResponseBody</p>
     */
    public static class Distribution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("UsageScene")
        private String usageScene;

        @com.aliyun.core.annotation.NameInMap("UsageSceneName")
        private String usageSceneName;

        private Distribution(Builder builder) {
            this.dataUnit = builder.dataUnit;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.usageScene = builder.usageScene;
            this.usageSceneName = builder.usageSceneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Distribution create() {
            return builder().build();
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return usageScene
         */
        public String getUsageScene() {
            return this.usageScene;
        }

        /**
         * @return usageSceneName
         */
        public String getUsageSceneName() {
            return this.usageSceneName;
        }

        public static final class Builder {
            private String dataUnit; 
            private String projectId; 
            private String projectName; 
            private String usageScene; 
            private String usageSceneName; 

            private Builder() {
            } 

            private Builder(Distribution model) {
                this.dataUnit = model.dataUnit;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.usageScene = model.usageScene;
                this.usageSceneName = model.usageSceneName;
            } 

            /**
             * <p>The exact non-negative decimal string. Floating-point or exponential formats are not used. If the amount is incomplete, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>2.82</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The project attribution at the time of the call. If missing, the value is null, which does not affect the total amount.</p>
             * 
             * <strong>example:</strong>
             * <p>project-1</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name. For the same scenario and project ID, the latest non-empty name snapshot within the query range is used. If multiple snapshots exist in the same second, the one with the maximum lexicographical value is used. If missing, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>Scenario remake</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The usage scenario code.</p>
             * 
             * <strong>example:</strong>
             * <p>drama_game_oneshot</p>
             */
            public Builder usageScene(String usageScene) {
                this.usageScene = usageScene;
                return this;
            }

            /**
             * <p>The display name of the usage scenario. This field is supplemented by a dictionary that maps original Meta values to Chinese names, and is not an SLS field. UsageScene always retains the original log value. If no Chinese name is available, the original value is used as the name. Blank values are classified as other. Different codes with the same Chinese name are not merged.</p>
             * 
             * <strong>example:</strong>
             * <p>游戏生成</p>
             */
            public Builder usageSceneName(String usageSceneName) {
                this.usageSceneName = usageSceneName;
                return this;
            }

            public Distribution build() {
                return new Distribution(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSaasDataUnitUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSaasDataUnitUsageResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataUnit")
        private String dataUnit;

        private Summary(Builder builder) {
            this.dataUnit = builder.dataUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        public static final class Builder {
            private String dataUnit; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.dataUnit = model.dataUnit;
            } 

            /**
             * <p>The exact non-negative decimal string. Floating-point or exponential formats are not used. If the amount is incomplete, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>2.82</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSaasDataUnitUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSaasDataUnitUsageResponseBody</p>
     */
    public static class Scenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("UsageScene")
        private String usageScene;

        private Scenes(Builder builder) {
            this.dataUnit = builder.dataUnit;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.usageScene = builder.usageScene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return usageScene
         */
        public String getUsageScene() {
            return this.usageScene;
        }

        public static final class Builder {
            private String dataUnit; 
            private String projectId; 
            private String projectName; 
            private String usageScene; 

            private Builder() {
            } 

            private Builder(Scenes model) {
                this.dataUnit = model.dataUnit;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.usageScene = model.usageScene;
            } 

            /**
             * <p>The exact non-negative decimal string. Floating-point or exponential formats are not used. If the amount is incomplete, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>2.82</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The project attribution at the time of the call. If missing, the value is null, which does not affect the total amount.</p>
             * 
             * <strong>example:</strong>
             * <p>project-1</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name. For the same scenario and project ID, the latest non-empty name snapshot within the query range is used. If multiple snapshots exist in the same second, the one with the maximum lexicographical value is used. If missing, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>Scenario remake</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The usage scenario code.</p>
             * 
             * <strong>example:</strong>
             * <p>game_translation</p>
             */
            public Builder usageScene(String usageScene) {
                this.usageScene = usageScene;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSaasDataUnitUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSaasDataUnitUsageResponseBody</p>
     */
    public static class TimeSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("Scenes")
        private java.util.List<Scenes> scenes;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private TimeSeries(Builder builder) {
            this.dataUnit = builder.dataUnit;
            this.scenes = builder.scenes;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSeries create() {
            return builder().build();
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return scenes
         */
        public java.util.List<Scenes> getScenes() {
            return this.scenes;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String dataUnit; 
            private java.util.List<Scenes> scenes; 
            private String time; 

            private Builder() {
            } 

            private Builder(TimeSeries model) {
                this.dataUnit = model.dataUnit;
                this.scenes = model.scenes;
                this.time = model.time;
            } 

            /**
             * <p>The exact non-negative decimal string. Floating-point or exponential formats are not used. If the amount is incomplete, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>2.82</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>The scenario usage within the bucket.</p>
             */
            public Builder scenes(java.util.List<Scenes> scenes) {
                this.scenes = scenes;
                return this;
            }

            /**
             * <p>The start time of the UTC bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-20T00:00:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public TimeSeries build() {
                return new TimeSeries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSaasDataUnitUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSaasDataUnitUsageResponseBody</p>
     */
    public static class Warnings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Warnings(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warnings create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Warnings model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The notice code. Valid values include DATA_INCOMPLETE and DATA_UNIT_PENDING.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_INCOMPLETE</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The content of the product notice.</p>
             * 
             * <strong>example:</strong>
             * <p>Some usage data is not ready yet</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Warnings build() {
                return new Warnings(this);
            } 

        } 

    }
}
