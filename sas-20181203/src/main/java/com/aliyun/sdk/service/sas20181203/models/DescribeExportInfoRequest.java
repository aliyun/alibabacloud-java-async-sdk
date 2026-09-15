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
 * {@link DescribeExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeExportInfoRequest</p>
 */
public class DescribeExportInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long exportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private DescribeExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeExportInfoRequest, Builder> {
        private Long exportId; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExportInfoRequest request) {
            super(request);
            this.exportId = request.exportId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The ID of the export task.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~ExportRecord~~">ExportRecord</a> operation to initiate an export.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder exportId(Long exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        /**
         * <p>The ID of the member account in the resource directory.</p>
         * <blockquote>
         * <p>You can obtain this parameter by invoking the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16670360956*****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public DescribeExportInfoRequest build() {
            return new DescribeExportInfoRequest(this);
        } 

    } 

}
