// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIJobsRequest} extends {@link RequestModel}
 *
 * <p>QueryAIJobsRequest</p>
 */
public class QueryAIJobsRequest extends Request {
    @Query
    @NameInMap("ActionId")
    @Validation(required = true)
    private String actionId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private QueryAIJobsRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.currentPage = builder.currentPage;
        this.iotId = builder.iotId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAIJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public String getActionId() {
        return this.actionId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryAIJobsRequest, Builder> {
        private String actionId; 
        private Integer currentPage; 
        private String iotId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryAIJobsRequest response) {
            super(response);
            this.actionId = response.actionId;
            this.currentPage = response.currentPage;
            this.iotId = response.iotId;
            this.pageSize = response.pageSize;
        } 

        /**
         * ActionId.
         */
        public Builder actionId(String actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
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

        @Override
        public QueryAIJobsRequest build() {
            return new QueryAIJobsRequest(this);
        } 

    } 

}
