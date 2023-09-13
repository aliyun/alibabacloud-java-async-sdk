// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveTranscodeJobsRequest} extends {@link RequestModel}
 *
 * <p>ListLiveTranscodeJobsRequest</p>
 */
public class ListLiveTranscodeJobsRequest extends Request {
    @Query
    @NameInMap("KeyWord")
    private String keyWord;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartMode")
    private Integer startMode;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("Type")
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
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * StartMode.
         */
        public Builder startMode(Integer startMode) {
            this.putQueryParameter("StartMode", startMode);
            this.startMode = startMode;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
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
