// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ExportReversedDeductionHistoryRequest} extends {@link RequestModel}
 *
 * <p>ExportReversedDeductionHistoryRequest</p>
 */
public class ExportReversedDeductionHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long exportUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private ExportReversedDeductionHistoryRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.exportUid = builder.exportUid;
        this.language = builder.language;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportReversedDeductionHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return exportUid
     */
    public Long getExportUid() {
        return this.exportUid;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ExportReversedDeductionHistoryRequest, Builder> {
        private String endDate; 
        private Long exportUid; 
        private String language; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ExportReversedDeductionHistoryRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.exportUid = request.exportUid;
            this.language = request.language;
            this.startDate = request.startDate;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-01</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder exportUid(Long exportUid) {
            this.putQueryParameter("ExportUid", exportUid);
            this.exportUid = exportUid;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ExportReversedDeductionHistoryRequest build() {
            return new ExportReversedDeductionHistoryRequest(this);
        } 

    } 

}
