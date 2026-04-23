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
 * {@link KnowledgeSubJobInfoVO} extends {@link TeaModel}
 *
 * <p>KnowledgeSubJobInfoVO</p>
 */
public class KnowledgeSubJobInfoVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubJobId")
    private Integer subJobId;

    private KnowledgeSubJobInfoVO(Builder builder) {
        this.errMessage = builder.errMessage;
        this.jobType = builder.jobType;
        this.name = builder.name;
        this.progress = builder.progress;
        this.status = builder.status;
        this.subJobId = builder.subJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeSubJobInfoVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subJobId
     */
    public Integer getSubJobId() {
        return this.subJobId;
    }

    public static final class Builder {
        private String errMessage; 
        private String jobType; 
        private String name; 
        private Integer progress; 
        private String status; 
        private Integer subJobId; 

        private Builder() {
        } 

        private Builder(KnowledgeSubJobInfoVO model) {
            this.errMessage = model.errMessage;
            this.jobType = model.jobType;
            this.name = model.name;
            this.progress = model.progress;
            this.status = model.status;
            this.subJobId = model.subJobId;
        } 

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubJobId.
         */
        public Builder subJobId(Integer subJobId) {
            this.subJobId = subJobId;
            return this;
        }

        public KnowledgeSubJobInfoVO build() {
            return new KnowledgeSubJobInfoVO(this);
        } 

    } 

}
