// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateCdnSubTaskRequest</p>
 */
public class UpdateCdnSubTaskRequest extends Request {
    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("ReportIds")
    private String reportIds;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    private UpdateCdnSubTaskRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.reportIds = builder.reportIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCdnSubTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return reportIds
     */
    public String getReportIds() {
        return this.reportIds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<UpdateCdnSubTaskRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String reportIds; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCdnSubTaskRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.reportIds = request.reportIds;
            this.startTime = request.startTime;
        } 

        /**
         * The domain name that you want to track. You can specify up to 500 domain names in each request. If you specify multiple domain names, separate them with commas (,). If you do not specify a domain name, operations reports are updated for all domain names in your Alibaba Cloud account.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The IDs of operations reports that you want to update. Separate IDs with commas (,).
         */
        public Builder reportIds(String reportIds) {
            this.putBodyParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        /**
         * The start time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public UpdateCdnSubTaskRequest build() {
            return new UpdateCdnSubTaskRequest(this);
        } 

    } 

}
