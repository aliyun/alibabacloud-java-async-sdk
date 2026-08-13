// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RetryDirectoryFailedSourcesRequest} extends {@link RequestModel}
 *
 * <p>RetryDirectoryFailedSourcesRequest</p>
 */
public class RetryDirectoryFailedSourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private RetryDirectoryFailedSourcesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryDirectoryFailedSourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RetryDirectoryFailedSourcesRequest, Builder> {
        private String directoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RetryDirectoryFailedSourcesRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目录 ID（递归包含子目录下的失败资源）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public RetryDirectoryFailedSourcesRequest build() {
            return new RetryDirectoryFailedSourcesRequest(this);
        } 

    } 

}
