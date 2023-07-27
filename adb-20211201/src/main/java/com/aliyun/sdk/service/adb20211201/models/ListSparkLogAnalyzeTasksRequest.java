// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkLogAnalyzeTasksRequest} extends {@link RequestModel}
 *
 * <p>ListSparkLogAnalyzeTasksRequest</p>
 */
public class ListSparkLogAnalyzeTasksRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, minimum = 1)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    private ListSparkLogAnalyzeTasksRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkLogAnalyzeTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListSparkLogAnalyzeTasksRequest, Builder> {
        private String DBClusterId; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSparkLogAnalyzeTasksRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListSparkLogAnalyzeTasksRequest build() {
            return new ListSparkLogAnalyzeTasksRequest(this);
        } 

    } 

}
