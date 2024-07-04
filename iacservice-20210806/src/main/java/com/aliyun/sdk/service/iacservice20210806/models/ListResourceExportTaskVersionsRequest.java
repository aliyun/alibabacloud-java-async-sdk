// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceExportTaskVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceExportTaskVersionsRequest</p>
 */
public class ListResourceExportTaskVersionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListResourceExportTaskVersionsRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceExportTaskVersionsRequest create() {
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
     * @return exportVersion
     */
    public String getExportVersion() {
        return this.exportVersion;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListResourceExportTaskVersionsRequest, Builder> {
        private String exportTaskId; 
        private String exportVersion; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceExportTaskVersionsRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
            this.exportVersion = request.exportVersion;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * exportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putPathParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * exportVersion.
         */
        public Builder exportVersion(String exportVersion) {
            this.putQueryParameter("exportVersion", exportVersion);
            this.exportVersion = exportVersion;
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListResourceExportTaskVersionsRequest build() {
            return new ListResourceExportTaskVersionsRequest(this);
        } 

    } 

}
