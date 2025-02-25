// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceExportTasksRequest} extends {@link RequestModel}
 *
 * <p>ListResourceExportTasksRequest</p>
 */
public class ListResourceExportTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private ListResourceExportTasksRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceExportTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListResourceExportTasksRequest, Builder> {
        private String exportTaskId; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceExportTasksRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * exportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putQueryParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public ListResourceExportTasksRequest build() {
            return new ListResourceExportTasksRequest(this);
        } 

    } 

}
