// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPublishBatchRequest} extends {@link RequestModel}
 *
 * <p>ListPublishBatchRequest</p>
 */
public class ListPublishBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchName")
    private String batchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeVersion;

    private ListPublishBatchRequest(Builder builder) {
        super(builder);
        this.batchName = builder.batchName;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.upgradeVersion = builder.upgradeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchName
     */
    public String getBatchName() {
        return this.batchName;
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
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

    public static final class Builder extends Request.Builder<ListPublishBatchRequest, Builder> {
        private String batchName; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String upgradeVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListPublishBatchRequest request) {
            super(request);
            this.batchName = request.batchName;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.upgradeVersion = request.upgradeVersion;
        } 

        /**
         * <p>The name of the release batch.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder batchName(String batchName) {
            this.putQueryParameter("BatchName", batchName);
            this.batchName = batchName;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The destination version of the Security Center agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.9</p>
         */
        public Builder upgradeVersion(String upgradeVersion) {
            this.putQueryParameter("UpgradeVersion", upgradeVersion);
            this.upgradeVersion = upgradeVersion;
            return this;
        }

        @Override
        public ListPublishBatchRequest build() {
            return new ListPublishBatchRequest(this);
        } 

    } 

}
