// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScheduledTasksRequest} extends {@link RequestModel}
 *
 * <p>ListScheduledTasksRequest</p>
 */
public class ListScheduledTasksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListScheduledTasksRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListScheduledTasksRequest, Builder> {
        private String appGroupIdentity; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduledTasksRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * The application name.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The scheduled task type. Valid values:
         * <p>
         * 
         * *   wipe: data cleaning.
         * *   fork: reindexing.
         * *   check-status: application status check.
         * *   index: reindexing.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListScheduledTasksRequest build() {
            return new ListScheduledTasksRequest(this);
        } 

    } 

}
