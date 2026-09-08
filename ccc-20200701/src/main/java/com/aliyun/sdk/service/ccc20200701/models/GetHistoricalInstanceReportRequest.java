// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetHistoricalInstanceReportRequest} extends {@link RequestModel}
 *
 * <p>GetHistoricalInstanceReportRequest</p>
 */
public class GetHistoricalInstanceReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long startTime;

    private GetHistoricalInstanceReportRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.mediaType = builder.mediaType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoricalInstanceReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetHistoricalInstanceReportRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String mediaType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoricalInstanceReportRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.mediaType = request.mediaType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of the Historical Data to retrieve, in UNIX timestamp format with millisecond precision. This parameter is optional. The default value is the current time. The time precision for statistics is hourly, snapped to the next full hour, and the interval is open. For example, if the start time is 11:12:20 and the end time is 11:45:50, the snapped input parameter Time Range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1532707199000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Media Type. The default value is Audio. Other valid values include Chat and Video.</p>
         * 
         * <strong>example:</strong>
         * <p>VIDEO</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The start time of the Historical Data to retrieve, in UNIX timestamp format with millisecond precision. This parameter is optional. The default value is 00:00:00 of the current day. The earliest allowed time is 180 days before the current time. The time precision for statistics is hourly, snapped to the previous full hour, and the interval is closed.</p>
         * 
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetHistoricalInstanceReportRequest build() {
            return new GetHistoricalInstanceReportRequest(this);
        } 

    } 

}
