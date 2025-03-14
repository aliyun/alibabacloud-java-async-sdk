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
 * {@link DescribeWarningExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeWarningExportInfoRequest</p>
 */
public class DescribeWarningExportInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long exportId;

    private DescribeWarningExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarningExportInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeWarningExportInfoRequest, Builder> {
        private Long exportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWarningExportInfoRequest request) {
            super(request);
            this.exportId = request.exportId;
        } 

        /**
         * <p>The ID of the export task.</p>
         * <blockquote>
         * <p> You can can call the <a href="~~ExportWarning~~">ExportWarning</a> operation to query the IDs of export tasks.</p>
         * </blockquote>
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
        public DescribeWarningExportInfoRequest build() {
            return new DescribeWarningExportInfoRequest(this);
        } 

    } 

}
