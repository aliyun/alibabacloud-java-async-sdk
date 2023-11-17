// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarRecordsRequest</p>
 */
public class DescribeSoarRecordsRequest extends Request {
    @Query
    @NameInMap("EndMillis")
    private Long endMillis;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    @Query
    @NameInMap("StartMillis")
    private Long startMillis;

    @Query
    @NameInMap("TaskStatus")
    private String taskStatus;

    @Query
    @NameInMap("TaskflowMd5")
    private String taskflowMd5;

    @Query
    @NameInMap("TriggerUser")
    private String triggerUser;

    private DescribeSoarRecordsRequest(Builder builder) {
        super(builder);
        this.endMillis = builder.endMillis;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.playbookUuid = builder.playbookUuid;
        this.startMillis = builder.startMillis;
        this.taskStatus = builder.taskStatus;
        this.taskflowMd5 = builder.taskflowMd5;
        this.triggerUser = builder.triggerUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endMillis
     */
    public Long getEndMillis() {
        return this.endMillis;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return startMillis
     */
    public Long getStartMillis() {
        return this.startMillis;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskflowMd5
     */
    public String getTaskflowMd5() {
        return this.taskflowMd5;
    }

    /**
     * @return triggerUser
     */
    public String getTriggerUser() {
        return this.triggerUser;
    }

    public static final class Builder extends Request.Builder<DescribeSoarRecordsRequest, Builder> {
        private Long endMillis; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String playbookUuid; 
        private Long startMillis; 
        private String taskStatus; 
        private String taskflowMd5; 
        private String triggerUser; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarRecordsRequest request) {
            super(request);
            this.endMillis = request.endMillis;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.playbookUuid = request.playbookUuid;
            this.startMillis = request.startMillis;
            this.taskStatus = request.taskStatus;
            this.taskflowMd5 = request.taskflowMd5;
            this.triggerUser = request.triggerUser;
        } 

        /**
         * EndMillis.
         */
        public Builder endMillis(Long endMillis) {
            this.putQueryParameter("EndMillis", endMillis);
            this.endMillis = endMillis;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * StartMillis.
         */
        public Builder startMillis(Long startMillis) {
            this.putQueryParameter("StartMillis", startMillis);
            this.startMillis = startMillis;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskflowMd5.
         */
        public Builder taskflowMd5(String taskflowMd5) {
            this.putQueryParameter("TaskflowMd5", taskflowMd5);
            this.taskflowMd5 = taskflowMd5;
            return this;
        }

        /**
         * TriggerUser.
         */
        public Builder triggerUser(String triggerUser) {
            this.putQueryParameter("TriggerUser", triggerUser);
            this.triggerUser = triggerUser;
            return this;
        }

        @Override
        public DescribeSoarRecordsRequest build() {
            return new DescribeSoarRecordsRequest(this);
        } 

    } 

}
