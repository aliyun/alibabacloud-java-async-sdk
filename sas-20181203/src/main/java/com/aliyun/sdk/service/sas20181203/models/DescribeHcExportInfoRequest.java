// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHcExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeHcExportInfoRequest</p>
 */
public class DescribeHcExportInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    private Long exportId;

    private DescribeHcExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHcExportInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeHcExportInfoRequest, Builder> {
        private Long exportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHcExportInfoRequest request) {
            super(request);
            this.exportId = request.exportId;
        } 

        /**
         * The ID of the export task.
         * <p>
         * 
         * >  You can call the [ExportWarning](~~ExportWarning~~) operation to query the IDs of export tasks.
         */
        public Builder exportId(Long exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        @Override
        public DescribeHcExportInfoRequest build() {
            return new DescribeHcExportInfoRequest(this);
        } 

    } 

}
