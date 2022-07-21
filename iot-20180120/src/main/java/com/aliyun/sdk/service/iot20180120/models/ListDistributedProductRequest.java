// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDistributedProductRequest} extends {@link RequestModel}
 *
 * <p>ListDistributedProductRequest</p>
 */
public class ListDistributedProductRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @Query
    @NameInMap("TargetInstanceId")
    private String targetInstanceId;

    @Query
    @NameInMap("TargetUid")
    private String targetUid;

    private ListDistributedProductRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDistributedProductRequest create() {
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<ListDistributedProductRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String productKey; 
        private String sourceInstanceId; 
        private String targetInstanceId; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(ListDistributedProductRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.sourceInstanceId = request.sourceInstanceId;
            this.targetInstanceId = request.targetInstanceId;
            this.targetUid = request.targetUid;
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * SourceInstanceId.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * TargetUid.
         */
        public Builder targetUid(String targetUid) {
            this.putQueryParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public ListDistributedProductRequest build() {
            return new ListDistributedProductRequest(this);
        } 

    } 

}
