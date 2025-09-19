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
 * {@link DescribeWhiteListProcessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListProcessResponseBody</p>
 */
public class DescribeWhiteListProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Processes")
    private java.util.List<Processes> processes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWhiteListProcessResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.processes = builder.processes;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListProcessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return processes
     */
    public java.util.List<Processes> getProcesses() {
        return this.processes;
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
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List<Processes> processes; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeWhiteListProcessResponseBody model) {
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.processes = model.processes;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The information about the processes.</p>
         */
        public Builder processes(java.util.List<Processes> processes) {
            this.processes = processes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D81DD78E-E006-5C65-A171-C8CB09XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWhiteListProcessResponseBody build() {
            return new DescribeWhiteListProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWhiteListProcessResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteListProcessResponseBody</p>
     */
    public static class Processes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private Integer processId;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessType")
        private Integer processType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Processes(Builder builder) {
            this.filePath = builder.filePath;
            this.id = builder.id;
            this.level = builder.level;
            this.md5 = builder.md5;
            this.processId = builder.processId;
            this.processName = builder.processName;
            this.processType = builder.processType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processes create() {
            return builder().build();
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return processId
         */
        public Integer getProcessId() {
            return this.processId;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return processType
         */
        public Integer getProcessType() {
            return this.processType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String filePath; 
            private Long id; 
            private Integer level; 
            private String md5; 
            private Integer processId; 
            private String processName; 
            private Integer processType; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Processes model) {
                this.filePath = model.filePath;
                this.id = model.id;
                this.level = model.level;
                this.md5 = model.md5;
                this.processId = model.processId;
                this.processName = model.processName;
                this.processType = model.processType;
                this.status = model.status;
            } 

            /**
             * <p>The path to the process startup file.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/bash1</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The primary key of the process information.</p>
             * 
             * <strong>example:</strong>
             * <p>2100019</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The trust score of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The MD5 hash value of the process startup file.</p>
             * 
             * <strong>example:</strong>
             * <p>a28e8eba54ece1f3748d80e57dc89400</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The ID of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>53090</p>
             */
            public Builder processId(Integer processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The name of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>vim</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The type of the process. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: trusted</li>
             * <li><strong>2</strong>: suspicious</li>
             * <li><strong>3</strong>: malicious</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder processType(Integer processType) {
                this.processType = processType;
                return this;
            }

            /**
             * <p>Indicates whether the process is trusted. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: no</li>
             * <li><strong>2</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Processes build() {
                return new Processes(this);
            } 

        } 

    }
}
