// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link BatchQueryDepartmentRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryDepartmentRequest</p>
 */
public class BatchQueryDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modified_time_greater_or_equal_than")
    private String modifiedTimeGreaterOrEqualThan;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_dept_id")
    private String outDeptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page_token")
    private String pageToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private BatchQueryDepartmentRequest(Builder builder) {
        super(builder);
        this.modifiedTimeGreaterOrEqualThan = builder.modifiedTimeGreaterOrEqualThan;
        this.outDeptId = builder.outDeptId;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryDepartmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifiedTimeGreaterOrEqualThan
     */
    public String getModifiedTimeGreaterOrEqualThan() {
        return this.modifiedTimeGreaterOrEqualThan;
    }

    /**
     * @return outDeptId
     */
    public String getOutDeptId() {
        return this.outDeptId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<BatchQueryDepartmentRequest, Builder> {
        private String modifiedTimeGreaterOrEqualThan; 
        private String outDeptId; 
        private Integer pageSize; 
        private String pageToken; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryDepartmentRequest request) {
            super(request);
            this.modifiedTimeGreaterOrEqualThan = request.modifiedTimeGreaterOrEqualThan;
            this.outDeptId = request.outDeptId;
            this.pageSize = request.pageSize;
            this.pageToken = request.pageToken;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * modified_time_greater_or_equal_than.
         */
        public Builder modifiedTimeGreaterOrEqualThan(String modifiedTimeGreaterOrEqualThan) {
            this.putBodyParameter("modified_time_greater_or_equal_than", modifiedTimeGreaterOrEqualThan);
            this.modifiedTimeGreaterOrEqualThan = modifiedTimeGreaterOrEqualThan;
            return this;
        }

        /**
         * out_dept_id.
         */
        public Builder outDeptId(String outDeptId) {
            this.putBodyParameter("out_dept_id", outDeptId);
            this.outDeptId = outDeptId;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * page_token.
         */
        public Builder pageToken(String pageToken) {
            this.putBodyParameter("page_token", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public BatchQueryDepartmentRequest build() {
            return new BatchQueryDepartmentRequest(this);
        } 

    } 

}
