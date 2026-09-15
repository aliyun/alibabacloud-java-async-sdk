// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListUnknownThreatDetectMachineRequest} extends {@link RequestModel}
 *
 * <p>ListUnknownThreatDetectMachineRequest</p>
 */
public class ListUnknownThreatDetectMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventStatus")
    private Integer eventStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudyMode")
    private String studyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudyTimeEnd")
    private Long studyTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudyTimeStart")
    private Long studyTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListUnknownThreatDetectMachineRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.eventStatus = builder.eventStatus;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.status = builder.status;
        this.studyMode = builder.studyMode;
        this.studyTimeEnd = builder.studyTimeEnd;
        this.studyTimeStart = builder.studyTimeStart;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnknownThreatDetectMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventStatus
     */
    public Integer getEventStatus() {
        return this.eventStatus;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return studyMode
     */
    public String getStudyMode() {
        return this.studyMode;
    }

    /**
     * @return studyTimeEnd
     */
    public Long getStudyTimeEnd() {
        return this.studyTimeEnd;
    }

    /**
     * @return studyTimeStart
     */
    public Long getStudyTimeStart() {
        return this.studyTimeStart;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListUnknownThreatDetectMachineRequest, Builder> {
        private Integer currentPage; 
        private Integer eventStatus; 
        private Integer pageSize; 
        private String remark; 
        private String status; 
        private String studyMode; 
        private Long studyTimeEnd; 
        private Long studyTimeStart; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListUnknownThreatDetectMachineRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.eventStatus = request.eventStatus;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.status = request.status;
            this.studyMode = request.studyMode;
            this.studyTimeEnd = request.studyTimeEnd;
            this.studyTimeStart = request.studyTimeStart;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The page number of the current page when using paging.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EventStatus.
         */
        public Builder eventStatus(Integer eventStatus) {
            this.putQueryParameter("EventStatus", eventStatus);
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * <p>The maximum number of entries per page when using paging.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The server name or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ecs</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The running status of the machine. Valid values:</p>
         * <ul>
         * <li><strong>monitoring</strong>: Warning.</li>
         * <li><strong>blocking</strong>: Blocking.</li>
         * <li><strong>studying</strong>: Learning.</li>
         * <li><strong>study_finish</strong>: Learning completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>studying</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The whitelist mode. Valid values:</p>
         * <ul>
         * <li><strong>hash</strong>: process hash</li>
         * <li><strong>path</strong>: process path</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        public Builder studyMode(String studyMode) {
            this.putQueryParameter("StudyMode", studyMode);
            this.studyMode = studyMode;
            return this;
        }

        /**
         * <p>The end of the model creation time range. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1768891966346</p>
         */
        public Builder studyTimeEnd(Long studyTimeEnd) {
            this.putQueryParameter("StudyTimeEnd", studyTimeEnd);
            this.studyTimeEnd = studyTimeEnd;
            return this;
        }

        /**
         * <p>The start of the model creation time range. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1768891966344</p>
         */
        public Builder studyTimeStart(Long studyTimeStart) {
            this.putQueryParameter("StudyTimeStart", studyTimeStart);
            this.studyTimeStart = studyTimeStart;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>d2d94e8b-bb25-4744-8004-1e08a53c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListUnknownThreatDetectMachineRequest build() {
            return new ListUnknownThreatDetectMachineRequest(this);
        } 

    } 

}
