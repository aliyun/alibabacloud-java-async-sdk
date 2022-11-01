// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCardSmsTemplateReportRequest} extends {@link RequestModel}
 *
 * <p>QueryCardSmsTemplateReportRequest</p>
 */
public class QueryCardSmsTemplateReportRequest extends Request {
    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("TemplateCodes")
    @Validation(required = true)
    private java.util.List < String > templateCodes;

    private QueryCardSmsTemplateReportRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.templateCodes = builder.templateCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsTemplateReportRequest create() {
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return templateCodes
     */
    public java.util.List < String > getTemplateCodes() {
        return this.templateCodes;
    }

    public static final class Builder extends Request.Builder<QueryCardSmsTemplateReportRequest, Builder> {
        private String endDate; 
        private String startDate; 
        private java.util.List < String > templateCodes; 

        private Builder() {
            super();
        } 

        private Builder(QueryCardSmsTemplateReportRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.templateCodes = request.templateCodes;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TemplateCodes.
         */
        public Builder templateCodes(java.util.List < String > templateCodes) {
            this.putQueryParameter("TemplateCodes", templateCodes);
            this.templateCodes = templateCodes;
            return this;
        }

        @Override
        public QueryCardSmsTemplateReportRequest build() {
            return new QueryCardSmsTemplateReportRequest(this);
        } 

    } 

}
