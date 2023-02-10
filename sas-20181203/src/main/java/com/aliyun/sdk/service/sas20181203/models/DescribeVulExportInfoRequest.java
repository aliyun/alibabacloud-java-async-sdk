// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulExportInfoRequest</p>
 */
public class DescribeVulExportInfoRequest extends Request {
    @Query
    @NameInMap("ExportId")
    @Validation(required = true)
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
         * The ID of the task.
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
