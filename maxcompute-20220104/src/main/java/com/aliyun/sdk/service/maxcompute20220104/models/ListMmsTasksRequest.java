// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListMmsTasksRequest} extends {@link RequestModel}
 *
 * <p>ListMmsTasksRequest</p>
 */
public class ListMmsTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sorter")
    private Sorter sorter;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dstDbName")
    private String dstDbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dstTableName")
    private String dstTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobId")
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partition")
    private String partition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcDbName")
    private String srcDbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcTableName")
    private String srcTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListMmsTasksRequest(Builder builder) {
        super(builder);
        this.sorter = builder.sorter;
        this.sourceId = builder.sourceId;
        this.dstDbName = builder.dstDbName;
        this.dstTableName = builder.dstTableName;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.partition = builder.partition;
        this.srcDbName = builder.srcDbName;
        this.srcTableName = builder.srcTableName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sorter
     */
    public Sorter getSorter() {
        return this.sorter;
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return dstDbName
     */
    public String getDstDbName() {
        return this.dstDbName;
    }

    /**
     * @return dstTableName
     */
    public String getDstTableName() {
        return this.dstTableName;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return partition
     */
    public String getPartition() {
        return this.partition;
    }

    /**
     * @return srcDbName
     */
    public String getSrcDbName() {
        return this.srcDbName;
    }

    /**
     * @return srcTableName
     */
    public String getSrcTableName() {
        return this.srcTableName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMmsTasksRequest, Builder> {
        private Sorter sorter; 
        private Long sourceId; 
        private String dstDbName; 
        private String dstTableName; 
        private Long jobId; 
        private String jobName; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String partition; 
        private String srcDbName; 
        private String srcTableName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMmsTasksRequest request) {
            super(request);
            this.sorter = request.sorter;
            this.sourceId = request.sourceId;
            this.dstDbName = request.dstDbName;
            this.dstTableName = request.dstTableName;
            this.jobId = request.jobId;
            this.jobName = request.jobName;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.partition = request.partition;
            this.srcDbName = request.srcDbName;
            this.srcTableName = request.srcTableName;
            this.status = request.status;
        } 

        /**
         * sorter.
         */
        public Builder sorter(Sorter sorter) {
            this.putQueryParameter("sorter", sorter);
            this.sorter = sorter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000028</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * dstDbName.
         */
        public Builder dstDbName(String dstDbName) {
            this.putQueryParameter("dstDbName", dstDbName);
            this.dstDbName = dstDbName;
            return this;
        }

        /**
         * dstTableName.
         */
        public Builder dstTableName(String dstTableName) {
            this.putQueryParameter("dstTableName", dstTableName);
            this.dstTableName = dstTableName;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * jobName.
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("jobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * partition.
         */
        public Builder partition(String partition) {
            this.putQueryParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * srcDbName.
         */
        public Builder srcDbName(String srcDbName) {
            this.putQueryParameter("srcDbName", srcDbName);
            this.srcDbName = srcDbName;
            return this;
        }

        /**
         * srcTableName.
         */
        public Builder srcTableName(String srcTableName) {
            this.putQueryParameter("srcTableName", srcTableName);
            this.srcTableName = srcTableName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListMmsTasksRequest build() {
            return new ListMmsTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsTasksRequest} extends {@link TeaModel}
     *
     * <p>ListMmsTasksRequest</p>
     */
    public static class Sorter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Sorter(Builder builder) {
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sorter create() {
            return builder().build();
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

        public static final class Builder {
            private String startTime; 
            private String status; 

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Sorter build() {
                return new Sorter(this);
            } 

        } 

    }
}
