// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreFullDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreFullDetailsRequest</p>
 */
public class DescribeRestoreFullDetailsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RestoreRecordId")
    @Validation(required = true)
    private String restoreRecordId;

    private DescribeRestoreFullDetailsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.restoreRecordId = builder.restoreRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreFullDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return restoreRecordId
     */
    public String getRestoreRecordId() {
        return this.restoreRecordId;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreFullDetailsRequest, Builder> {
        private String clusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String restoreRecordId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreFullDetailsRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.restoreRecordId = response.restoreRecordId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * RestoreRecordId.
         */
        public Builder restoreRecordId(String restoreRecordId) {
            this.putQueryParameter("RestoreRecordId", restoreRecordId);
            this.restoreRecordId = restoreRecordId;
            return this;
        }

        @Override
        public DescribeRestoreFullDetailsRequest build() {
            return new DescribeRestoreFullDetailsRequest(this);
        } 

    } 

}
