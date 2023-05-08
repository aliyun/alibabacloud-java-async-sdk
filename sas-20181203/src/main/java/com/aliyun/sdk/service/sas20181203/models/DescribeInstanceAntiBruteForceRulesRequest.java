// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAntiBruteForceRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAntiBruteForceRulesRequest</p>
 */
public class DescribeInstanceAntiBruteForceRulesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private DescribeInstanceAntiBruteForceRulesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAntiBruteForceRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceAntiBruteForceRulesRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceAntiBruteForceRulesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.uuidList = request.uuidList;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * UuidList.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public DescribeInstanceAntiBruteForceRulesRequest build() {
            return new DescribeInstanceAntiBruteForceRulesRequest(this);
        } 

    } 

}
