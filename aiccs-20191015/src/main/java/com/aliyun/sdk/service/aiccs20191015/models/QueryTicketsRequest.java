// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTicketsRequest} extends {@link RequestModel}
 *
 * <p>QueryTicketsRequest</p>
 */
public class QueryTicketsRequest extends Request {
    @Body
    @NameInMap("CaseId")
    @Validation(minimum = 1)
    private Long caseId;

    @Body
    @NameInMap("CaseStatus")
    @Validation()
    private Integer caseStatus;

    @Body
    @NameInMap("CaseType")
    @Validation(minimum = 1)
    private Integer caseType;

    @Body
    @NameInMap("ChannelId")
    private String channelId;

    @Body
    @NameInMap("ChannelType")
    @Validation()
    private Integer channelType;

    @Body
    @NameInMap("CurrentPage")
    @Validation(maximum = 5000)
    private Integer currentPage;

    @Body
    @NameInMap("DealId")
    @Validation()
    private Long dealId;

    @Body
    @NameInMap("Extra")
    private java.util.Map < String, ? > extra;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("SrType")
    @Validation(minimum = 1)
    private Long srType;

    @Body
    @NameInMap("TaskStatus")
    @Validation()
    private Integer taskStatus;

    @Body
    @NameInMap("TouchId")
    @Validation()
    private Long touchId;

    private QueryTicketsRequest(Builder builder) {
        super(builder);
        this.caseId = builder.caseId;
        this.caseStatus = builder.caseStatus;
        this.caseType = builder.caseType;
        this.channelId = builder.channelId;
        this.channelType = builder.channelType;
        this.currentPage = builder.currentPage;
        this.dealId = builder.dealId;
        this.extra = builder.extra;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.srType = builder.srType;
        this.taskStatus = builder.taskStatus;
        this.touchId = builder.touchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTicketsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caseId
     */
    public Long getCaseId() {
        return this.caseId;
    }

    /**
     * @return caseStatus
     */
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    /**
     * @return caseType
     */
    public Integer getCaseType() {
        return this.caseType;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return channelType
     */
    public Integer getChannelType() {
        return this.channelType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealId
     */
    public Long getDealId() {
        return this.dealId;
    }

    /**
     * @return extra
     */
    public java.util.Map < String, ? > getExtra() {
        return this.extra;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return srType
     */
    public Long getSrType() {
        return this.srType;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return touchId
     */
    public Long getTouchId() {
        return this.touchId;
    }

    public static final class Builder extends Request.Builder<QueryTicketsRequest, Builder> {
        private Long caseId; 
        private Integer caseStatus; 
        private Integer caseType; 
        private String channelId; 
        private Integer channelType; 
        private Integer currentPage; 
        private Long dealId; 
        private java.util.Map < String, ? > extra; 
        private String instanceId; 
        private Integer pageSize; 
        private Long srType; 
        private Integer taskStatus; 
        private Long touchId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTicketsRequest response) {
            super(response);
            this.caseId = response.caseId;
            this.caseStatus = response.caseStatus;
            this.caseType = response.caseType;
            this.channelId = response.channelId;
            this.channelType = response.channelType;
            this.currentPage = response.currentPage;
            this.dealId = response.dealId;
            this.extra = response.extra;
            this.instanceId = response.instanceId;
            this.pageSize = response.pageSize;
            this.srType = response.srType;
            this.taskStatus = response.taskStatus;
            this.touchId = response.touchId;
        } 

        /**
         * CaseId.
         */
        public Builder caseId(Long caseId) {
            this.putBodyParameter("CaseId", caseId);
            this.caseId = caseId;
            return this;
        }

        /**
         * CaseStatus.
         */
        public Builder caseStatus(Integer caseStatus) {
            this.putBodyParameter("CaseStatus", caseStatus);
            this.caseStatus = caseStatus;
            return this;
        }

        /**
         * CaseType.
         */
        public Builder caseType(Integer caseType) {
            this.putBodyParameter("CaseType", caseType);
            this.caseType = caseType;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ChannelType.
         */
        public Builder channelType(Integer channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DealId.
         */
        public Builder dealId(Long dealId) {
            this.putBodyParameter("DealId", dealId);
            this.dealId = dealId;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(java.util.Map < String, ? > extra) {
            this.putBodyParameter("Extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SrType.
         */
        public Builder srType(Long srType) {
            this.putBodyParameter("SrType", srType);
            this.srType = srType;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.putBodyParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TouchId.
         */
        public Builder touchId(Long touchId) {
            this.putBodyParameter("TouchId", touchId);
            this.touchId = touchId;
            return this;
        }

        @Override
        public QueryTicketsRequest build() {
            return new QueryTicketsRequest(this);
        } 

    } 

}
