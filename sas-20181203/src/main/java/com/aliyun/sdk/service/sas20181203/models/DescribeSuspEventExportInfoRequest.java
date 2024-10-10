// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSuspEventExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventExportInfoRequest</p>
 */
public class DescribeSuspEventExportInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    private Integer exportId;

    private DescribeSuspEventExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventExportInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportId
     */
    public Integer getExportId() {
        return this.exportId;
    }

    public static final class Builder extends Request.Builder<DescribeSuspEventExportInfoRequest, Builder> {
        private Integer exportId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventExportInfoRequest request) {
            super(request);
            this.exportId = request.exportId;
        } 

        /**
         * <p>The ID of the export task.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ExportSuspEvents~~">ExportSuspEvents</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder exportId(Integer exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        @Override
        public DescribeSuspEventExportInfoRequest build() {
            return new DescribeSuspEventExportInfoRequest(this);
        } 

    } 

}
