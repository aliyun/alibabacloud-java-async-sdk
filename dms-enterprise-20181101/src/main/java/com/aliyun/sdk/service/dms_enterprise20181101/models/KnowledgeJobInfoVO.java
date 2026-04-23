// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link KnowledgeJobInfoVO} extends {@link TeaModel}
 *
 * <p>KnowledgeJobInfoVO</p>
 */
public class KnowledgeJobInfoVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private Integer jobId;

    @com.aliyun.core.annotation.NameInMap("KnowledgeCnt")
    private Integer knowledgeCnt;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("ShowJobId")
    private String showJobId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Supplement")
    private String supplement;

    @com.aliyun.core.annotation.NameInMap("TableCnt")
    private Integer tableCnt;

    private KnowledgeJobInfoVO(Builder builder) {
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.jobId = builder.jobId;
        this.knowledgeCnt = builder.knowledgeCnt;
        this.progress = builder.progress;
        this.showJobId = builder.showJobId;
        this.status = builder.status;
        this.supplement = builder.supplement;
        this.tableCnt = builder.tableCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeJobInfoVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobId
     */
    public Integer getJobId() {
        return this.jobId;
    }

    /**
     * @return knowledgeCnt
     */
    public Integer getKnowledgeCnt() {
        return this.knowledgeCnt;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return showJobId
     */
    public String getShowJobId() {
        return this.showJobId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supplement
     */
    public String getSupplement() {
        return this.supplement;
    }

    /**
     * @return tableCnt
     */
    public Integer getTableCnt() {
        return this.tableCnt;
    }

    public static final class Builder {
        private String createTime; 
        private String creator; 
        private String description; 
        private String endTime; 
        private Integer jobId; 
        private Integer knowledgeCnt; 
        private Integer progress; 
        private String showJobId; 
        private String status; 
        private String supplement; 
        private Integer tableCnt; 

        private Builder() {
        } 

        private Builder(KnowledgeJobInfoVO model) {
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.description = model.description;
            this.endTime = model.endTime;
            this.jobId = model.jobId;
            this.knowledgeCnt = model.knowledgeCnt;
            this.progress = model.progress;
            this.showJobId = model.showJobId;
            this.status = model.status;
            this.supplement = model.supplement;
            this.tableCnt = model.tableCnt;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(Integer jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * KnowledgeCnt.
         */
        public Builder knowledgeCnt(Integer knowledgeCnt) {
            this.knowledgeCnt = knowledgeCnt;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * ShowJobId.
         */
        public Builder showJobId(String showJobId) {
            this.showJobId = showJobId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Supplement.
         */
        public Builder supplement(String supplement) {
            this.supplement = supplement;
            return this;
        }

        /**
         * TableCnt.
         */
        public Builder tableCnt(Integer tableCnt) {
            this.tableCnt = tableCnt;
            return this;
        }

        public KnowledgeJobInfoVO build() {
            return new KnowledgeJobInfoVO(this);
        } 

    } 

}
