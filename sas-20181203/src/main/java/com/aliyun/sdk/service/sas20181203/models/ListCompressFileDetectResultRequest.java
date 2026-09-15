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
 * {@link ListCompressFileDetectResultRequest} extends {@link RequestModel}
 *
 * <p>ListCompressFileDetectResultRequest</p>
 */
public class ListCompressFileDetectResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKey")
    private String hashKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private ListCompressFileDetectResultRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.hashKey = builder.hashKey;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCompressFileDetectResultRequest create() {
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
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ListCompressFileDetectResultRequest, Builder> {
        private Integer currentPage; 
        private String hashKey; 
        private Integer pageSize; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ListCompressFileDetectResultRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.hashKey = request.hashKey;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The page number of the current page in a paging query. Default value: 1.</p>
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
         * <p>The unique identifier of the file. This parameter is required in practice. If this parameter is not specified, the API returns ServerError(400). The value must be the MD5 or SHA-256 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>0a212417e65c26ff133cfff28f6c****</p>
         */
        public Builder hashKey(String hashKey) {
            this.putQueryParameter("HashKey", hashKey);
            this.hashKey = hashKey;
            return this;
        }

        /**
         * <p>The maximum number of entries per page in a paging query. Default value: 20.</p>
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
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>27.9.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ListCompressFileDetectResultRequest build() {
            return new ListCompressFileDetectResultRequest(this);
        } 

    } 

}
