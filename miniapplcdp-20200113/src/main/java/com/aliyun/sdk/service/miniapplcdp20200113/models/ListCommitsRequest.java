// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommitsRequest} extends {@link RequestModel}
 *
 * <p>ListCommitsRequest</p>
 */
public class ListCommitsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("CommitLog")
    private String commitLog;

    @Query
    @NameInMap("CustomParentId")
    private String customParentId;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Source")
    private String source;

    private ListCommitsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.commitLog = builder.commitLog;
        this.customParentId = builder.customParentId;
        this.moduleId = builder.moduleId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommitsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return commitLog
     */
    public String getCommitLog() {
        return this.commitLog;
    }

    /**
     * @return customParentId
     */
    public String getCustomParentId() {
        return this.customParentId;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListCommitsRequest, Builder> {
        private String appId; 
        private String commitLog; 
        private String customParentId; 
        private String moduleId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListCommitsRequest request) {
            super(request);
            this.appId = request.appId;
            this.commitLog = request.commitLog;
            this.customParentId = request.customParentId;
            this.moduleId = request.moduleId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CommitLog.
         */
        public Builder commitLog(String commitLog) {
            this.putQueryParameter("CommitLog", commitLog);
            this.commitLog = commitLog;
            return this;
        }

        /**
         * CustomParentId.
         */
        public Builder customParentId(String customParentId) {
            this.putQueryParameter("CustomParentId", customParentId);
            this.customParentId = customParentId;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListCommitsRequest build() {
            return new ListCommitsRequest(this);
        } 

    } 

}
