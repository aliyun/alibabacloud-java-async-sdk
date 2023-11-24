// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobHistoryRequest</p>
 */
public class DescribeJobHistoryRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("State")
    private String state;

    private DescribeJobHistoryRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobHistoryRequest create() {
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
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<DescribeJobHistoryRequest, Builder> {
        private String appId; 
        private Long currentPage; 
        private Long pageSize; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobHistoryRequest request) {
            super(request);
            this.appId = request.appId;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.state = request.state;
        } 

        /**
         * The ID of the job template.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 0 to 10000.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of the job. Valid values:
         * <p>
         * 
         * *   **0**: The job is not executed.
         * *   **1**: The job is executed.
         * *   **2**: The job fails to be executed.
         * *   **3**: The job is being executed.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public DescribeJobHistoryRequest build() {
            return new DescribeJobHistoryRequest(this);
        } 

    } 

}
