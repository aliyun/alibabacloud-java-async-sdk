// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskLogListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskLogListRequest</p>
 */
public class DescribeTaskLogListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPage")
    private Boolean isPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskLogId")
    private String taskLogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeTaskLogListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.isPage = builder.isPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
        this.taskLogId = builder.taskLogId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskLogListRequest create() {
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
     * @return isPage
     */
    public Boolean getIsPage() {
        return this.isPage;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskLogId
     */
    public String getTaskLogId() {
        return this.taskLogId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeTaskLogListRequest, Builder> {
        private String currentPage; 
        private Boolean isPage; 
        private String lang; 
        private String pageSize; 
        private String taskId; 
        private String taskLogId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskLogListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.isPage = request.isPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
            this.taskLogId = request.taskLogId;
            this.regId = request.regId;
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
         * IsPage.
         */
        public Builder isPage(Boolean isPage) {
            this.putQueryParameter("IsPage", isPage);
            this.isPage = isPage;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskLogId.
         */
        public Builder taskLogId(String taskLogId) {
            this.putQueryParameter("TaskLogId", taskLogId);
            this.taskLogId = taskLogId;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeTaskLogListRequest build() {
            return new DescribeTaskLogListRequest(this);
        } 

    } 

}
