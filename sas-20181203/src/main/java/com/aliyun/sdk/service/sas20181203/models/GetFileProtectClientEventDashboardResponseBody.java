// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFileProtectClientEventDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectClientEventDashboardResponseBody</p>
 */
public class GetFileProtectClientEventDashboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileProtectClientEventDashboardResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectClientEventDashboardResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFileProtectClientEventDashboardResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectClientEventDashboardResponseBody build() {
            return new GetFileProtectClientEventDashboardResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileProtectClientEventDashboardResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectClientEventDashboardResponseBody</p>
     */
    public static class FilePathStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        private FilePathStats(Builder builder) {
            this.key = builder.key;
            this.num = builder.num;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilePathStats create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        public static final class Builder {
            private String key; 
            private Long num; 

            private Builder() {
            } 

            private Builder(FilePathStats model) {
                this.key = model.key;
                this.num = model.num;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Num.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            public FilePathStats build() {
                return new FilePathStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileProtectClientEventDashboardResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectClientEventDashboardResponseBody</p>
     */
    public static class FileTypeStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        private FileTypeStats(Builder builder) {
            this.key = builder.key;
            this.num = builder.num;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileTypeStats create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        public static final class Builder {
            private String key; 
            private Long num; 

            private Builder() {
            } 

            private Builder(FileTypeStats model) {
                this.key = model.key;
                this.num = model.num;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Num.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            public FileTypeStats build() {
                return new FileTypeStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileProtectClientEventDashboardResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectClientEventDashboardResponseBody</p>
     */
    public static class ProcessNameStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        private ProcessNameStats(Builder builder) {
            this.key = builder.key;
            this.num = builder.num;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessNameStats create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        public static final class Builder {
            private String key; 
            private Long num; 

            private Builder() {
            } 

            private Builder(ProcessNameStats model) {
                this.key = model.key;
                this.num = model.num;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Num.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            public ProcessNameStats build() {
                return new ProcessNameStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileProtectClientEventDashboardResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectClientEventDashboardResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilePathStats")
        private java.util.List<FilePathStats> filePathStats;

        @com.aliyun.core.annotation.NameInMap("FileTypeStats")
        private java.util.List<FileTypeStats> fileTypeStats;

        @com.aliyun.core.annotation.NameInMap("OneDayFileChangeCount")
        private Integer oneDayFileChangeCount;

        @com.aliyun.core.annotation.NameInMap("ProcessNameStats")
        private java.util.List<ProcessNameStats> processNameStats;

        @com.aliyun.core.annotation.NameInMap("RecentFileChangeCount")
        private Integer recentFileChangeCount;

        @com.aliyun.core.annotation.NameInMap("ServerCount")
        private Integer serverCount;

        private Data(Builder builder) {
            this.filePathStats = builder.filePathStats;
            this.fileTypeStats = builder.fileTypeStats;
            this.oneDayFileChangeCount = builder.oneDayFileChangeCount;
            this.processNameStats = builder.processNameStats;
            this.recentFileChangeCount = builder.recentFileChangeCount;
            this.serverCount = builder.serverCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return filePathStats
         */
        public java.util.List<FilePathStats> getFilePathStats() {
            return this.filePathStats;
        }

        /**
         * @return fileTypeStats
         */
        public java.util.List<FileTypeStats> getFileTypeStats() {
            return this.fileTypeStats;
        }

        /**
         * @return oneDayFileChangeCount
         */
        public Integer getOneDayFileChangeCount() {
            return this.oneDayFileChangeCount;
        }

        /**
         * @return processNameStats
         */
        public java.util.List<ProcessNameStats> getProcessNameStats() {
            return this.processNameStats;
        }

        /**
         * @return recentFileChangeCount
         */
        public Integer getRecentFileChangeCount() {
            return this.recentFileChangeCount;
        }

        /**
         * @return serverCount
         */
        public Integer getServerCount() {
            return this.serverCount;
        }

        public static final class Builder {
            private java.util.List<FilePathStats> filePathStats; 
            private java.util.List<FileTypeStats> fileTypeStats; 
            private Integer oneDayFileChangeCount; 
            private java.util.List<ProcessNameStats> processNameStats; 
            private Integer recentFileChangeCount; 
            private Integer serverCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.filePathStats = model.filePathStats;
                this.fileTypeStats = model.fileTypeStats;
                this.oneDayFileChangeCount = model.oneDayFileChangeCount;
                this.processNameStats = model.processNameStats;
                this.recentFileChangeCount = model.recentFileChangeCount;
                this.serverCount = model.serverCount;
            } 

            /**
             * FilePathStats.
             */
            public Builder filePathStats(java.util.List<FilePathStats> filePathStats) {
                this.filePathStats = filePathStats;
                return this;
            }

            /**
             * FileTypeStats.
             */
            public Builder fileTypeStats(java.util.List<FileTypeStats> fileTypeStats) {
                this.fileTypeStats = fileTypeStats;
                return this;
            }

            /**
             * OneDayFileChangeCount.
             */
            public Builder oneDayFileChangeCount(Integer oneDayFileChangeCount) {
                this.oneDayFileChangeCount = oneDayFileChangeCount;
                return this;
            }

            /**
             * ProcessNameStats.
             */
            public Builder processNameStats(java.util.List<ProcessNameStats> processNameStats) {
                this.processNameStats = processNameStats;
                return this;
            }

            /**
             * RecentFileChangeCount.
             */
            public Builder recentFileChangeCount(Integer recentFileChangeCount) {
                this.recentFileChangeCount = recentFileChangeCount;
                return this;
            }

            /**
             * ServerCount.
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
