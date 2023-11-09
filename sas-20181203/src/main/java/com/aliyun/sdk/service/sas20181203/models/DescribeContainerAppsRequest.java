// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerAppsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerAppsRequest</p>
 */
public class DescribeContainerAppsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private DescribeContainerAppsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.fieldValue = builder.fieldValue;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerAppsRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeContainerAppsRequest, Builder> {
        private String clusterId; 
        private Integer currentPage; 
        private String fieldValue; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerAppsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.fieldValue = request.fieldValue;
            this.pageSize = request.pageSize;
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * FieldValue.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
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
        public DescribeContainerAppsRequest build() {
            return new DescribeContainerAppsRequest(this);
        } 

    } 

}
