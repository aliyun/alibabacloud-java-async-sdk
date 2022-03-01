// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeExportInfoRequest</p>
 */
public class DescribeExportInfoRequest extends Request {
    @Query
    @NameInMap("ExportId")
    @Validation(required = true)
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

        private Builder(DescribeExportInfoRequest response) {
            super(response);
            this.exportId = response.exportId;
        } 

        /**
         * ExportId.
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
