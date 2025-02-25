// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDcdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateDcdnSubTaskRequest</p>
 */
public class UpdateDcdnSubTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportIds")
    private String reportIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The domain names that you want to include in the operations report. If you do not specify a domain name, all domain names that belong to your Alibaba Cloud account are included.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-17T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The IDs of the metrics that you want to update. Separate IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/270075.html">DescribeDcdnSubList</a> operation to query the IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>2,4,6</p>
         */
        public Builder reportIds(String reportIds) {
            this.putBodyParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        /**
         * <p>The start time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-17T00:00:00Z</p>
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
