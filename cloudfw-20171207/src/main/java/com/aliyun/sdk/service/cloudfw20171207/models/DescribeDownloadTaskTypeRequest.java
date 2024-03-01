// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadTaskTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadTaskTypeRequest</p>
 */
public class DescribeDownloadTaskTypeRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    private DescribeDownloadTaskTypeRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadTaskTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeDownloadTaskTypeRequest, Builder> {
        private String currentPage; 
        private String lang; 
        private String pageSize; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadTaskTypeRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.taskType = request.taskType;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeDownloadTaskTypeRequest build() {
            return new DescribeDownloadTaskTypeRequest(this);
        } 

    } 

}
