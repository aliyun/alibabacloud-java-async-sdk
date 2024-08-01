// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Personalizedtxt2imgModelTrainJobInfoDTO} extends {@link TeaModel}
 *
 * <p>Personalizedtxt2imgModelTrainJobInfoDTO</p>
 */
public class Personalizedtxt2imgModelTrainJobInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private String createUserId;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private java.util.List < String > imageUrl;

    @com.aliyun.core.annotation.NameInMap("InferenceJobList")
    private java.util.List < Personalizedtxt2imgInferenceJobInfoDTO > inferenceJobList;

    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    private Personalizedtxt2imgModelTrainJobInfoDTO(Builder builder) {
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.imageUrl = builder.imageUrl;
        this.inferenceJobList = builder.inferenceJobList;
        this.jobStatus = builder.jobStatus;
        this.name = builder.name;
        this.objectType = builder.objectType;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgModelTrainJobInfoDTO create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return imageUrl
     */
    public java.util.List < String > getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return inferenceJobList
     */
    public java.util.List < Personalizedtxt2imgInferenceJobInfoDTO > getInferenceJobList() {
        return this.inferenceJobList;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder {
        private String createTime; 
        private String createUserId; 
        private java.util.List < String > imageUrl; 
        private java.util.List < Personalizedtxt2imgInferenceJobInfoDTO > inferenceJobList; 
        private String jobStatus; 
        private String name; 
        private String objectType; 
        private String id; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(java.util.List < String > imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * InferenceJobList.
         */
        public Builder inferenceJobList(java.util.List < Personalizedtxt2imgInferenceJobInfoDTO > inferenceJobList) {
            this.inferenceJobList = inferenceJobList;
            return this;
        }

        /**
         * JobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
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
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Personalizedtxt2imgModelTrainJobInfoDTO build() {
            return new Personalizedtxt2imgModelTrainJobInfoDTO(this);
        } 

    } 

}
