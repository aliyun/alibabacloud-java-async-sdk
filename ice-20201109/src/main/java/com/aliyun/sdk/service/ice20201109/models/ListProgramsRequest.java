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
 * {@link ListProgramsRequest} extends {@link RequestModel}
 *
 * <p>ListProgramsRequest</p>
 */
public class ListProgramsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramName")
    private String programName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private ListProgramsRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.programName = builder.programName;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProgramsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return programName
     */
    public String getProgramName() {
        return this.programName;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListProgramsRequest, Builder> {
        private String channelName; 
        private String pageNo; 
        private String pageSize; 
        private String programName; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListProgramsRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.programName = request.programName;
            this.sortBy = request.sortBy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProgramName.
         */
        public Builder programName(String programName) {
            this.putQueryParameter("ProgramName", programName);
            this.programName = programName;
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

        @Override
        public ListProgramsRequest build() {
            return new ListProgramsRequest(this);
        } 

    } 

}
