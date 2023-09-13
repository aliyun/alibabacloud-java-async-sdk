// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveSnapshotJobsRequest} extends {@link RequestModel}
 *
 * <p>ListLiveSnapshotJobsRequest</p>
 */
public class ListLiveSnapshotJobsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SearchKeyWord")
    private String searchKeyWord;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    private ListLiveSnapshotJobsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchKeyWord = builder.searchKeyWord;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveSnapshotJobsRequest create() {
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
     * @return searchKeyWord
     */
    public String getSearchKeyWord() {
        return this.searchKeyWord;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListLiveSnapshotJobsRequest, Builder> {
        private String endTime; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchKeyWord; 
        private String sortBy; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveSnapshotJobsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.searchKeyWord = request.searchKeyWord;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchKeyWord.
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putQueryParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListLiveSnapshotJobsRequest build() {
            return new ListLiveSnapshotJobsRequest(this);
        } 

    } 

}
