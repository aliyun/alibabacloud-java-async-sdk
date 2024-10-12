// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Personalizedtxt2imgInferenceJobInfoDTO} extends {@link TeaModel}
 *
 * <p>Personalizedtxt2imgInferenceJobInfoDTO</p>
 */
public class Personalizedtxt2imgInferenceJobInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createUserId")
    private String createUserId;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("jobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("resultImageUrl")
    private java.util.List < String > resultImageUrl;

    private Personalizedtxt2imgInferenceJobInfoDTO(Builder builder) {
        this.createUserId = builder.createUserId;
        this.id = builder.id;
        this.jobStatus = builder.jobStatus;
        this.modelId = builder.modelId;
        this.resultImageUrl = builder.resultImageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgInferenceJobInfoDTO create() {
        return builder().build();
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return resultImageUrl
     */
    public java.util.List < String > getResultImageUrl() {
        return this.resultImageUrl;
    }

    public static final class Builder {
        private String createUserId; 
        private String id; 
        private String jobStatus; 
        private String modelId; 
        private java.util.List < String > resultImageUrl; 

        /**
         * createUserId.
         */
        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * jobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * resultImageUrl.
         */
        public Builder resultImageUrl(java.util.List < String > resultImageUrl) {
            this.resultImageUrl = resultImageUrl;
            return this;
        }

        public Personalizedtxt2imgInferenceJobInfoDTO build() {
            return new Personalizedtxt2imgInferenceJobInfoDTO(this);
        } 

    } 

}
