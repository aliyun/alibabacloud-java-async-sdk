// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateDcdnSubTaskRequest</p>
 */
public class UpdateDcdnSubTaskRequest extends Request {
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

    private UpdateDcdnSubTaskRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.reportIds = builder.reportIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDcdnSubTaskRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDcdnSubTaskRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String reportIds; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDcdnSubTaskRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.reportIds = request.reportIds;
            this.startTime = request.startTime;
        } 

        /**
         * The domain names that you want to include in the operations report. If you do not specify a domain name, all domain names that belong to your Alibaba Cloud account are included.
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
         * The IDs of the metrics that you want to update. Separate IDs with commas (,). You can call the [DescribeDcdnSubList](~~270075~~) operation to query the IDs.
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
        public UpdateDcdnSubTaskRequest build() {
            return new UpdateDcdnSubTaskRequest(this);
        } 

    } 

}
