// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnoseReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnoseReportRequest</p>
 */
public class DescribeDiagnoseReportRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ReportId")
    @Validation(required = true)
    private String reportId;

    @Query
    @NameInMap("lang")
    private String lang;

    private DescribeDiagnoseReportRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.reportId = builder.reportId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnoseReportRequest, Builder> {
        private String instanceId; 
        private String reportId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnoseReportRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.reportId = response.reportId;
            this.lang = response.lang;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.putPathParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeDiagnoseReportRequest build() {
            return new DescribeDiagnoseReportRequest(this);
        } 

    } 

}
