// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetInspectionReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetInspectionReportResponseBody</p>
 */
public class GetInspectionReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MarkdownText")
    private String markdownText;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetInspectionReportResponseBody(Builder builder) {
        this.data = builder.data;
        this.markdownText = builder.markdownText;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInspectionReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return markdownText
     */
    public String getMarkdownText() {
        return this.markdownText;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String markdownText; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(GetInspectionReportResponseBody model) {
            this.data = model.data;
            this.markdownText = model.markdownText;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MarkdownText.
         */
        public Builder markdownText(String markdownText) {
            this.markdownText = markdownText;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetInspectionReportResponseBody build() {
            return new GetInspectionReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInspectionReportResponseBody</p>
     */
    public static class ItemsData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ItemsData(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsData create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ItemsData model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ItemsData build() {
                return new ItemsData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInspectionReportResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<ItemsData> data;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Items(Builder builder) {
            this.data = builder.data;
            this.level = builder.level;
            this.message = builder.message;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<ItemsData> getData() {
            return this.data;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<ItemsData> data; 
            private String level; 
            private String message; 
            private String name; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.data = model.data;
                this.level = model.level;
                this.message = model.message;
                this.name = model.name;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<ItemsData> data) {
                this.data = data;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInspectionReportResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private DataData(Builder builder) {
            this.group = builder.group;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String group; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.group = model.group;
                this.items = model.items;
            } 

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInspectionReportResponseBody</p>
     */
    public static class LevelSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private Long error;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Normal")
        private Long normal;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private Long warning;

        private LevelSummary(Builder builder) {
            this.error = builder.error;
            this.failed = builder.failed;
            this.normal = builder.normal;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelSummary create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Long getError() {
            return this.error;
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return normal
         */
        public Long getNormal() {
            return this.normal;
        }

        /**
         * @return warning
         */
        public Long getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private Long error; 
            private Long failed; 
            private Long normal; 
            private Long warning; 

            private Builder() {
            } 

            private Builder(LevelSummary model) {
                this.error = model.error;
                this.failed = model.failed;
                this.normal = model.normal;
                this.warning = model.warning;
            } 

            /**
             * Error.
             */
            public Builder error(Long error) {
                this.error = error;
                return this;
            }

            /**
             * Failed.
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Normal.
             */
            public Builder normal(Long normal) {
                this.normal = normal;
                return this;
            }

            /**
             * Warning.
             */
            public Builder warning(Long warning) {
                this.warning = warning;
                return this;
            }

            public LevelSummary build() {
                return new LevelSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInspectionReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("InstanceDesc")
        private String instanceDesc;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LevelSummary")
        private LevelSummary levelSummary;

        @com.aliyun.core.annotation.NameInMap("MarkdownText")
        private String markdownText;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.data = builder.data;
            this.endTime = builder.endTime;
            this.engineType = builder.engineType;
            this.instanceDesc = builder.instanceDesc;
            this.instanceId = builder.instanceId;
            this.levelSummary = builder.levelSummary;
            this.markdownText = builder.markdownText;
            this.region = builder.region;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return instanceDesc
         */
        public String getInstanceDesc() {
            return this.instanceDesc;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return levelSummary
         */
        public LevelSummary getLevelSummary() {
            return this.levelSummary;
        }

        /**
         * @return markdownText
         */
        public String getMarkdownText() {
            return this.markdownText;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private String endTime; 
            private String engineType; 
            private String instanceDesc; 
            private String instanceId; 
            private LevelSummary levelSummary; 
            private String markdownText; 
            private String region; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.endTime = model.endTime;
                this.engineType = model.engineType;
                this.instanceDesc = model.instanceDesc;
                this.instanceId = model.instanceId;
                this.levelSummary = model.levelSummary;
                this.markdownText = model.markdownText;
                this.region = model.region;
                this.startTime = model.startTime;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * InstanceDesc.
             */
            public Builder instanceDesc(String instanceDesc) {
                this.instanceDesc = instanceDesc;
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
             * LevelSummary.
             */
            public Builder levelSummary(LevelSummary levelSummary) {
                this.levelSummary = levelSummary;
                return this;
            }

            /**
             * MarkdownText.
             */
            public Builder markdownText(String markdownText) {
                this.markdownText = markdownText;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
