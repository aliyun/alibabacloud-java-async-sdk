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
         * <p>The search keyword. You can search by job ID or name. Fuzzy match is supported for job names.</p>
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
         * <p>The sort order based on CreateTime. Default value: desc. Valid values:</p>
         * <ul>
         * <li>asc: Ascending order.</li>
         * <li>desc: Descending order.</li>
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
         * <p>The start mode. Valid values:</p>
         * <ul>
         * <li>0: Starts immediately.</li>
         * <li>1: Starts at a scheduled time.</li>
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
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>0: Not started.</li>
         * <li>1: Running.</li>
         * <li>2: Stopped.</li>
         * </ul>
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
         * <p>The template type corresponding to the transcoding job. Valid values:</p>
         * <ul>
         * <li>normal: Standard template.</li>
         * <li>narrow-band: Narrowband HD template.</li>
         * <li>audio-only: Audio-only template.</li>
         * <li>origin: Original quality template.</li>
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
