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
 * {@link DescribeVulExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulExportInfoRequest</p>
 */
public class DescribeVulExportInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long exportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private DescribeVulExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulExportInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportId
     */
    public Long getExportId() {
        return this.exportId;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<DescribeVulExportInfoRequest, Builder> {
        private Long exportId; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulExportInfoRequest request) {
            super(request);
            this.exportId = request.exportId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The ID of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14356</p>
         */
        public Builder exportId(Long exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public DescribeVulExportInfoRequest build() {
            return new DescribeVulExportInfoRequest(this);
        } 

    } 

}
