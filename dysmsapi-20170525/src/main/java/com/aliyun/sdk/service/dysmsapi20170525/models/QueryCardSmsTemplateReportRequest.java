// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCardSmsTemplateReportRequest} extends {@link RequestModel}
 *
 * <p>QueryCardSmsTemplateReportRequest</p>
 */
public class QueryCardSmsTemplateReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCodes")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * The array of message templates.
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
