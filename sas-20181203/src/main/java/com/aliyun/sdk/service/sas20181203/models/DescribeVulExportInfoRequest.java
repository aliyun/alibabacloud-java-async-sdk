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

    private DescribeVulExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
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

    public static final class Builder extends Request.Builder<DescribeVulExportInfoRequest, Builder> {
        private Long exportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulExportInfoRequest request) {
            super(request);
            this.exportId = request.exportId;
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

        @Override
        public DescribeVulExportInfoRequest build() {
            return new DescribeVulExportInfoRequest(this);
        } 

    } 

}
