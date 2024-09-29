// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IllustrationTask} extends {@link TeaModel}
 *
 * <p>IllustrationTask</p>
 */
public class IllustrationTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("illustrationIds")
    private java.util.List < Long > illustrationIds;

    @com.aliyun.core.annotation.NameInMap("illustrationTaskId")
    private Long illustrationTaskId;

    @com.aliyun.core.annotation.NameInMap("taskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("textId")
    private Long textId;

    private IllustrationTask(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.illustrationIds = builder.illustrationIds;
        this.illustrationTaskId = builder.illustrationTaskId;
        this.taskStatus = builder.taskStatus;
        this.textId = builder.textId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IllustrationTask create() {
        return builder().build();
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return illustrationIds
     */
    public java.util.List < Long > getIllustrationIds() {
        return this.illustrationIds;
    }

    /**
     * @return illustrationTaskId
     */
    public Long getIllustrationTaskId() {
        return this.illustrationTaskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return textId
     */
    public Long getTextId() {
        return this.textId;
    }

    public static final class Builder {
        private String gmtCreate; 
        private String gmtModified; 
        private java.util.List < Long > illustrationIds; 
        private Long illustrationTaskId; 
        private String taskStatus; 
        private Long textId; 

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * illustrationIds.
         */
        public Builder illustrationIds(java.util.List < Long > illustrationIds) {
            this.illustrationIds = illustrationIds;
            return this;
        }

        /**
         * illustrationTaskId.
         */
        public Builder illustrationTaskId(Long illustrationTaskId) {
            this.illustrationTaskId = illustrationTaskId;
            return this;
        }

        /**
         * taskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * textId.
         */
        public Builder textId(Long textId) {
            this.textId = textId;
            return this;
        }

        public IllustrationTask build() {
            return new IllustrationTask(this);
        } 

    } 

}
