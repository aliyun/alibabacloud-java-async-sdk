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

    private DescribeExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
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

    public static final class Builder extends Request.Builder<DescribeExportInfoRequest, Builder> {
        private Long exportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExportInfoRequest request) {
            super(request);
            this.exportId = request.exportId;
        } 

        /**
         * <p>The ID of the export task.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ExportRecord~~">ExportRecord</a> operation to query the IDs of export tasks.</p>
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

        @Override
        public DescribeExportInfoRequest build() {
            return new DescribeExportInfoRequest(this);
        } 

    } 

}
