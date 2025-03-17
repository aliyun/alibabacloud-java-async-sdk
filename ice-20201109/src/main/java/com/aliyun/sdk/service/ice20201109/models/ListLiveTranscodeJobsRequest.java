// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListLiveTranscodeJobsRequest} extends {@link RequestModel}
 *
 * <p>ListLiveTranscodeJobsRequest</p>
 */
public class ListLiveTranscodeJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartMode")
    private Integer startMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListLiveTranscodeJobsRequest(Builder builder) {
        super(builder);
        this.keyWord = builder.keyWord;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.startMode = builder.startMode;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveTranscodeJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startMode
     */
    public Integer getStartMode() {
        return this.startMode;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListLiveTranscodeJobsRequest, Builder> {
        private String keyWord; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sortBy; 
        private Integer startMode; 
        private Integer status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveTranscodeJobsRequest request) {
            super(request);
            this.keyWord = request.keyWord;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.startMode = request.startMode;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * <p>The search keyword. You can use the job ID or name as the keyword to search for jobs. If you search for jobs by name, fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>24ecbb5c-4f98-4194-9400-f17102e27fc5</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sorting order. By default, the query results are sorted by creation time in descending order. Valid values:</p>
         * <ul>
         * <li>asc</li>
         * <li>desc</li>
         * </ul>
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
         * <p>The start mode of the transcoding job.</p>
         * <ul>
         * <li>0: The transcoding job immediately starts.</li>
         * <li>1: The transcoding job starts at the scheduled time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startMode(Integer startMode) {
            this.putQueryParameter("StartMode", startMode);
            this.startMode = startMode;
            return this;
        }

        /**
         * <p>The state of the job.</p>
         * <p>0: The job is not started. 1: The job is in progress. 2: The job is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the template used by the transcoding job.</p>
         * <ul>
         * <li>normal</li>
         * <li>narrow-band</li>
         * <li>audio-only</li>
         * <li>origin</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListLiveTranscodeJobsRequest build() {
            return new ListLiveTranscodeJobsRequest(this);
        } 

    } 

}
