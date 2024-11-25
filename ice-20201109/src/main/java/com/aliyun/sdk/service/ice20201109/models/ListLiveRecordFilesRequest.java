// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListLiveRecordFilesRequest} extends {@link RequestModel}
 *
 * <p>ListLiveRecordFilesRequest</p>
 */
public class ListLiveRecordFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private java.util.List < String > jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFormat")
    private String recordFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ListLiveRecordFilesRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.jobIds = builder.jobIds;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.recordFormat = builder.recordFormat;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRecordFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobIds
     */
    public java.util.List < String > getJobIds() {
        return this.jobIds;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recordFormat
     */
    public String getRecordFormat() {
        return this.recordFormat;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListLiveRecordFilesRequest, Builder> {
        private String endTime; 
        private java.util.List < String > jobIds; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String recordFormat; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveRecordFilesRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.jobIds = request.jobIds;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.recordFormat = request.recordFormat;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. The maximum time range to query is four days. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-22T08:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of job IDs.</p>
         */
        public Builder jobIds(java.util.List < String > jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The page number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 5 to 30. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The format of the recording file. Valid values:</p>
         * <p>M3U8, FLV, and MP4</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        public Builder recordFormat(String recordFormat) {
            this.putQueryParameter("RecordFormat", recordFormat);
            this.recordFormat = recordFormat;
            return this;
        }

        /**
         * <p>The sorting order of the index files by creation time. Valid values:</p>
         * <p>asc: The query results are displayed in ascending order. This is the default value.</p>
         * <p>desc: The query results are displayed in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-21T08:00:01Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListLiveRecordFilesRequest build() {
            return new ListLiveRecordFilesRequest(this);
        } 

    } 

}
