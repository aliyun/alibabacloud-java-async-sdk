// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSDGDeploymentStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSDGDeploymentStatusRequest</p>
 */
public class DescribeSDGDeploymentStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    private DescribeSDGDeploymentStatusRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGDeploymentStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<DescribeSDGDeploymentStatusRequest, Builder> {
        private String pageNumber; 
        private String pageSize; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSDGDeploymentStatusRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.SDGId = request.SDGId;
        } 

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the SDG.
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public DescribeSDGDeploymentStatusRequest build() {
            return new DescribeSDGDeploymentStatusRequest(this);
        } 

    } 

}
