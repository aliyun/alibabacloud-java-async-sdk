// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListDatasourceFeatureViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasourceFeatureViewsResponseBody</p>
 */
public class ListDatasourceFeatureViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureViews")
    private java.util.List<FeatureViews> featureViews;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalUsageStatistics")
    private TotalUsageStatistics totalUsageStatistics;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListDatasourceFeatureViewsResponseBody(Builder builder) {
        this.featureViews = builder.featureViews;
        this.totalCount = builder.totalCount;
        this.totalUsageStatistics = builder.totalUsageStatistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasourceFeatureViewsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureViews
     */
    public java.util.List<FeatureViews> getFeatureViews() {
        return this.featureViews;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalUsageStatistics
     */
    public TotalUsageStatistics getTotalUsageStatistics() {
        return this.totalUsageStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FeatureViews> featureViews; 
        private Long totalCount; 
        private TotalUsageStatistics totalUsageStatistics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDatasourceFeatureViewsResponseBody model) {
            this.featureViews = model.featureViews;
            this.totalCount = model.totalCount;
            this.totalUsageStatistics = model.totalUsageStatistics;
            this.requestId = model.requestId;
        } 

        /**
         * FeatureViews.
         */
        public Builder featureViews(java.util.List<FeatureViews> featureViews) {
            this.featureViews = featureViews;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalUsageStatistics.
         */
        public Builder totalUsageStatistics(TotalUsageStatistics totalUsageStatistics) {
            this.totalUsageStatistics = totalUsageStatistics;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>514F82AF-3C04-5C3D-8F38-A11261BF37B0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDatasourceFeatureViewsResponseBody build() {
            return new ListDatasourceFeatureViewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatasourceFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasourceFeatureViewsResponseBody</p>
     */
    public static class ReadWriteCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("ReadCount")
        private Long readCount;

        @com.aliyun.core.annotation.NameInMap("WriteCount")
        private Long writeCount;

        private ReadWriteCount(Builder builder) {
            this.date = builder.date;
            this.readCount = builder.readCount;
            this.writeCount = builder.writeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadWriteCount create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return readCount
         */
        public Long getReadCount() {
            return this.readCount;
        }

        /**
         * @return writeCount
         */
        public Long getWriteCount() {
            return this.writeCount;
        }

        public static final class Builder {
            private String date; 
            private Long readCount; 
            private Long writeCount; 

            private Builder() {
            } 

            private Builder(ReadWriteCount model) {
                this.date = model.date;
                this.readCount = model.readCount;
                this.writeCount = model.writeCount;
            } 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * ReadCount.
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * WriteCount.
             */
            public Builder writeCount(Long writeCount) {
                this.writeCount = writeCount;
                return this;
            }

            public ReadWriteCount build() {
                return new ReadWriteCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasourceFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasourceFeatureViewsResponseBody</p>
     */
    public static class UsageStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskUsage")
        private Double diskUsage;

        @com.aliyun.core.annotation.NameInMap("MemoryUsage")
        private Double memoryUsage;

        @com.aliyun.core.annotation.NameInMap("ReadWriteCount")
        private java.util.List<ReadWriteCount> readWriteCount;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        private UsageStatistics(Builder builder) {
            this.diskUsage = builder.diskUsage;
            this.memoryUsage = builder.memoryUsage;
            this.readWriteCount = builder.readWriteCount;
            this.rowCount = builder.rowCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageStatistics create() {
            return builder().build();
        }

        /**
         * @return diskUsage
         */
        public Double getDiskUsage() {
            return this.diskUsage;
        }

        /**
         * @return memoryUsage
         */
        public Double getMemoryUsage() {
            return this.memoryUsage;
        }

        /**
         * @return readWriteCount
         */
        public java.util.List<ReadWriteCount> getReadWriteCount() {
            return this.readWriteCount;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
        }

        public static final class Builder {
            private Double diskUsage; 
            private Double memoryUsage; 
            private java.util.List<ReadWriteCount> readWriteCount; 
            private Long rowCount; 

            private Builder() {
            } 

            private Builder(UsageStatistics model) {
                this.diskUsage = model.diskUsage;
                this.memoryUsage = model.memoryUsage;
                this.readWriteCount = model.readWriteCount;
                this.rowCount = model.rowCount;
            } 

            /**
             * DiskUsage.
             */
            public Builder diskUsage(Double diskUsage) {
                this.diskUsage = diskUsage;
                return this;
            }

            /**
             * MemoryUsage.
             */
            public Builder memoryUsage(Double memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * ReadWriteCount.
             */
            public Builder readWriteCount(java.util.List<ReadWriteCount> readWriteCount) {
                this.readWriteCount = readWriteCount;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            public UsageStatistics build() {
                return new UsageStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasourceFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasourceFeatureViewsResponseBody</p>
     */
    public static class FeatureViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("FeatureEntityName")
        private String featureEntityName;

        @com.aliyun.core.annotation.NameInMap("FeatureViewId")
        private String featureViewId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("TTL")
        private Integer TTL;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UsageStatistics")
        private UsageStatistics usageStatistics;

        private FeatureViews(Builder builder) {
            this.config = builder.config;
            this.featureEntityName = builder.featureEntityName;
            this.featureViewId = builder.featureViewId;
            this.name = builder.name;
            this.projectName = builder.projectName;
            this.TTL = builder.TTL;
            this.type = builder.type;
            this.usageStatistics = builder.usageStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureViews create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return featureEntityName
         */
        public String getFeatureEntityName() {
            return this.featureEntityName;
        }

        /**
         * @return featureViewId
         */
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return TTL
         */
        public Integer getTTL() {
            return this.TTL;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usageStatistics
         */
        public UsageStatistics getUsageStatistics() {
            return this.usageStatistics;
        }

        public static final class Builder {
            private String config; 
            private String featureEntityName; 
            private String featureViewId; 
            private String name; 
            private String projectName; 
            private Integer TTL; 
            private String type; 
            private UsageStatistics usageStatistics; 

            private Builder() {
            } 

            private Builder(FeatureViews model) {
                this.config = model.config;
                this.featureEntityName = model.featureEntityName;
                this.featureViewId = model.featureViewId;
                this.name = model.name;
                this.projectName = model.projectName;
                this.TTL = model.TTL;
                this.type = model.type;
                this.usageStatistics = model.usageStatistics;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * FeatureEntityName.
             */
            public Builder featureEntityName(String featureEntityName) {
                this.featureEntityName = featureEntityName;
                return this;
            }

            /**
             * FeatureViewId.
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
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
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * TTL.
             */
            public Builder TTL(Integer TTL) {
                this.TTL = TTL;
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
             * UsageStatistics.
             */
            public Builder usageStatistics(UsageStatistics usageStatistics) {
                this.usageStatistics = usageStatistics;
                return this;
            }

            public FeatureViews build() {
                return new FeatureViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasourceFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasourceFeatureViewsResponseBody</p>
     */
    public static class TotalReadWriteCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("TotalReadCount")
        private Long totalReadCount;

        @com.aliyun.core.annotation.NameInMap("TotalWriteCount")
        private Long totalWriteCount;

        private TotalReadWriteCount(Builder builder) {
            this.date = builder.date;
            this.totalReadCount = builder.totalReadCount;
            this.totalWriteCount = builder.totalWriteCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalReadWriteCount create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return totalReadCount
         */
        public Long getTotalReadCount() {
            return this.totalReadCount;
        }

        /**
         * @return totalWriteCount
         */
        public Long getTotalWriteCount() {
            return this.totalWriteCount;
        }

        public static final class Builder {
            private String date; 
            private Long totalReadCount; 
            private Long totalWriteCount; 

            private Builder() {
            } 

            private Builder(TotalReadWriteCount model) {
                this.date = model.date;
                this.totalReadCount = model.totalReadCount;
                this.totalWriteCount = model.totalWriteCount;
            } 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * TotalReadCount.
             */
            public Builder totalReadCount(Long totalReadCount) {
                this.totalReadCount = totalReadCount;
                return this;
            }

            /**
             * TotalWriteCount.
             */
            public Builder totalWriteCount(Long totalWriteCount) {
                this.totalWriteCount = totalWriteCount;
                return this;
            }

            public TotalReadWriteCount build() {
                return new TotalReadWriteCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatasourceFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatasourceFeatureViewsResponseBody</p>
     */
    public static class TotalUsageStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalDiskUsage")
        private Double totalDiskUsage;

        @com.aliyun.core.annotation.NameInMap("TotalMemoryUsage")
        private Double totalMemoryUsage;

        @com.aliyun.core.annotation.NameInMap("TotalReadWriteCount")
        private java.util.List<TotalReadWriteCount> totalReadWriteCount;

        private TotalUsageStatistics(Builder builder) {
            this.totalDiskUsage = builder.totalDiskUsage;
            this.totalMemoryUsage = builder.totalMemoryUsage;
            this.totalReadWriteCount = builder.totalReadWriteCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalUsageStatistics create() {
            return builder().build();
        }

        /**
         * @return totalDiskUsage
         */
        public Double getTotalDiskUsage() {
            return this.totalDiskUsage;
        }

        /**
         * @return totalMemoryUsage
         */
        public Double getTotalMemoryUsage() {
            return this.totalMemoryUsage;
        }

        /**
         * @return totalReadWriteCount
         */
        public java.util.List<TotalReadWriteCount> getTotalReadWriteCount() {
            return this.totalReadWriteCount;
        }

        public static final class Builder {
            private Double totalDiskUsage; 
            private Double totalMemoryUsage; 
            private java.util.List<TotalReadWriteCount> totalReadWriteCount; 

            private Builder() {
            } 

            private Builder(TotalUsageStatistics model) {
                this.totalDiskUsage = model.totalDiskUsage;
                this.totalMemoryUsage = model.totalMemoryUsage;
                this.totalReadWriteCount = model.totalReadWriteCount;
            } 

            /**
             * TotalDiskUsage.
             */
            public Builder totalDiskUsage(Double totalDiskUsage) {
                this.totalDiskUsage = totalDiskUsage;
                return this;
            }

            /**
             * TotalMemoryUsage.
             */
            public Builder totalMemoryUsage(Double totalMemoryUsage) {
                this.totalMemoryUsage = totalMemoryUsage;
                return this;
            }

            /**
             * TotalReadWriteCount.
             */
            public Builder totalReadWriteCount(java.util.List<TotalReadWriteCount> totalReadWriteCount) {
                this.totalReadWriteCount = totalReadWriteCount;
                return this;
            }

            public TotalUsageStatistics build() {
                return new TotalUsageStatistics(this);
            } 

        } 

    }
}
