// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeVulExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulExportInfoRequest</p>
 */
public class DescribeVulExportInfoRequest extends Request {
    @Query
    @NameInMap("ExportId")
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

    /**
     * @return exportId
     */
    public Long getExportId() {
        return this.exportId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Long exportId; 

        /**
         * <p>ExportId.</p>
         */
        public Builder exportId(Long exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        public DescribeVulExportInfoRequest build() {
            return new DescribeVulExportInfoRequest(this);
        } 

    } 

}
