// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListDataCheckColumnResultsRequest} extends {@link RequestModel}
 *
 * <p>ListDataCheckColumnResultsRequest</p>
 */
public class ListDataCheckColumnResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resultId;

    private ListDataCheckColumnResultsRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.resultId = builder.resultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCheckColumnResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resultId
     */
    public String getResultId() {
        return this.resultId;
    }

    public static final class Builder extends Request.Builder<ListDataCheckColumnResultsRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private String resultId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCheckColumnResultsRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.resultId = request.resultId;
        } 

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The validation result ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001</p>
         */
        public Builder resultId(String resultId) {
            this.putQueryParameter("resultId", resultId);
            this.resultId = resultId;
            return this;
        }

        @Override
        public ListDataCheckColumnResultsRequest build() {
            return new ListDataCheckColumnResultsRequest(this);
        } 

    } 

}
