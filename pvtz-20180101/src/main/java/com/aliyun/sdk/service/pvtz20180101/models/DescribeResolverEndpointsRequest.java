// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverEndpointsRequest} extends {@link RequestModel}
 *
 * <p>DescribeResolverEndpointsRequest</p>
 */
public class DescribeResolverEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 9999999, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcRegionId")
    private String vpcRegionId;

    private DescribeResolverEndpointsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverEndpointsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeResolverEndpointsRequest, Builder> {
        private String keyword; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResolverEndpointsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.vpcRegionId = request.vpcRegionId;
        } 

        /**
         * The keyword used to filter endpoints in %keyword% mode.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The state of the endpoint that you want to query. If you do not specify this parameter, all endpoints are returned. Valid values:
         * <p>
         * 
         * *   SUCCESS: The endpoint works as expected.
         * *   INIT: The endpoint is being created.
         * *   FAILED: The endpoint fails to be created.
         * *   CHANGE_INIT: The endpoint is being modified.
         * *   CHANGE_FAILED: The endpoint fails to be modified.
         * *   EXCEPTION: The endpoint encounters an exception.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VpcRegionId.
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putQueryParameter("VpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public DescribeResolverEndpointsRequest build() {
            return new DescribeResolverEndpointsRequest(this);
        } 

    } 

}
