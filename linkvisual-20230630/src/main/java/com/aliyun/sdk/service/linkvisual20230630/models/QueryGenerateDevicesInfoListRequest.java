// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGenerateDevicesInfoListRequest} extends {@link RequestModel}
 *
 * <p>QueryGenerateDevicesInfoListRequest</p>
 */
public class QueryGenerateDevicesInfoListRequest extends Request {
    @Query
    @NameInMap("BatchId")
    @Validation(required = true)
    private String batchId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private QueryGenerateDevicesInfoListRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGenerateDevicesInfoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<QueryGenerateDevicesInfoListRequest, Builder> {
        private String batchId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(QueryGenerateDevicesInfoListRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public QueryGenerateDevicesInfoListRequest build() {
            return new QueryGenerateDevicesInfoListRequest(this);
        } 

    } 

}
