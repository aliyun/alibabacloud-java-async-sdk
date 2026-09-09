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
 * {@link ListMmsJobsRequest} extends {@link RequestModel}
 *
 * <p>ListMmsJobsRequest</p>
 */
public class ListMmsJobsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcDbName")
    private String srcDbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcTableName")
    private String srcTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("stopped")
    private Long stopped;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timerId")
    private Long timerId;

    private ListMmsJobsRequest(Builder builder) {
        super(builder);
        this.sorter = builder.sorter;
        this.sourceId = builder.sourceId;
        this.dstDbName = builder.dstDbName;
        this.dstTableName = builder.dstTableName;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.srcDbName = builder.srcDbName;
        this.srcTableName = builder.srcTableName;
        this.status = builder.status;
        this.stopped = builder.stopped;
        this.timerId = builder.timerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsJobsRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return stopped
     */
    public Long getStopped() {
        return this.stopped;
    }

    /**
     * @return timerId
     */
    public Long getTimerId() {
        return this.timerId;
    }

    public static final class Builder extends Request.Builder<ListMmsJobsRequest, Builder> {
        private Sorter sorter; 
        private Long sourceId; 
        private String dstDbName; 
        private String dstTableName; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String srcDbName; 
        private String srcTableName; 
        private String status; 
        private Long stopped; 
        private Long timerId; 

        private Builder() {
            super();
        } 

        private Builder(ListMmsJobsRequest request) {
            super(request);
            this.sorter = request.sorter;
            this.sourceId = request.sourceId;
            this.dstDbName = request.dstDbName;
            this.dstTableName = request.dstTableName;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.srcDbName = request.srcDbName;
            this.srcTableName = request.srcTableName;
            this.status = request.status;
            this.stopped = request.stopped;
            this.timerId = request.timerId;
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
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000002</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The destination MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        public Builder dstDbName(String dstDbName) {
            this.putQueryParameter("dstDbName", dstDbName);
            this.dstDbName = dstDbName;
            return this;
        }

        /**
         * <p>The destination MaxCompute table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table_1</p>
         */
        public Builder dstTableName(String dstTableName) {
            this.putQueryParameter("dstTableName", dstTableName);
            this.dstTableName = dstTableName;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of items to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db_1</p>
         */
        public Builder srcDbName(String srcDbName) {
            this.putQueryParameter("srcDbName", srcDbName);
            this.srcDbName = srcDbName;
            return this;
        }

        /**
         * <p>The name of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table_1</p>
         */
        public Builder srcTableName(String srcTableName) {
            this.putQueryParameter("srcTableName", srcTableName);
            this.srcTableName = srcTableName;
            return this;
        }

        /**
         * <p>The status of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>DOING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the job is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder stopped(Long stopped) {
            this.putQueryParameter("stopped", stopped);
            this.stopped = stopped;
            return this;
        }

        /**
         * <p>The timer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timerId(Long timerId) {
            this.putQueryParameter("timerId", timerId);
            this.timerId = timerId;
            return this;
        }

        @Override
        public ListMmsJobsRequest build() {
            return new ListMmsJobsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsJobsRequest} extends {@link TeaModel}
     *
     * <p>ListMmsJobsRequest</p>
     */
    public static class Sorter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Sorter(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sorter create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            private Builder() {
            } 

            private Builder(Sorter model) {
                this.status = model.status;
            } 

            /**
             * <p>Sorting by status</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
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
