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
 * {@link ListHistoricalSkillGroupReportRequest} extends {@link RequestModel}
 *
 * <p>ListHistoricalSkillGroupReportRequest</p>
 */
public class ListHistoricalSkillGroupReportRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
    private String skillGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SummarizeByInstanceId")
    private Boolean summarizeByInstanceId;

    private ListHistoricalSkillGroupReportRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.mediaType = builder.mediaType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroupIdList = builder.skillGroupIdList;
        this.startTime = builder.startTime;
        this.summarizeByInstanceId = builder.summarizeByInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHistoricalSkillGroupReportRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return skillGroupIdList
     */
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return summarizeByInstanceId
     */
    public Boolean getSummarizeByInstanceId() {
        return this.summarizeByInstanceId;
    }

    public static final class Builder extends Request.Builder<ListHistoricalSkillGroupReportRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String mediaType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroupIdList; 
        private Long startTime; 
        private Boolean summarizeByInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListHistoricalSkillGroupReportRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.mediaType = request.mediaType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillGroupIdList = request.skillGroupIdList;
            this.startTime = request.startTime;
            this.summarizeByInstanceId = request.summarizeByInstanceId;
        } 

        /**
         * <p>The end time of the historical data to retrieve. Specify a UNIX timestamp in milliseconds. This parameter is optional. Default value: the current time. The statistical time precision is in hours. The end time is rounded up to the nearest hour, and the interval is open. For example, if the start time is 11:12:20 and the end time is 11:45:50, the aligned time range is [11:00:00, 12:00:00), which means greater than or equal to 11:00:00 and less than 12:00:00.</p>
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
         * <p>The instance ID.</p>
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
         * <p>The media type. Default value: Audio. Valid values: Audio, Chat, and Video.</p>
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
         * <p>The page number. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of skill group IDs to query. The value is a character string in the JSON array format, where each array element is a skill group ID. This parameter is optional. Default value: empty. An empty value indicates that all skill groups in the current paging are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;skillgroup1@ccc-test&quot;, &quot;skillgroup2@ccc-test2&quot;]</p>
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putBodyParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        /**
         * <p>The start time of the historical data to retrieve. Specify a UNIX timestamp in milliseconds. This parameter is optional. Default value: 00:00:00 on the current day. The earliest allowed time is 180 days before the current time. The statistical time precision is in hours. The start time is rounded down to the nearest hour, and the interval is closed.</p>
         * 
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Specifies whether to aggregate data by instance ID.</p>
         */
        public Builder summarizeByInstanceId(Boolean summarizeByInstanceId) {
            this.putQueryParameter("SummarizeByInstanceId", summarizeByInstanceId);
            this.summarizeByInstanceId = summarizeByInstanceId;
            return this;
        }

        @Override
        public ListHistoricalSkillGroupReportRequest build() {
            return new ListHistoricalSkillGroupReportRequest(this);
        } 

    } 

}
