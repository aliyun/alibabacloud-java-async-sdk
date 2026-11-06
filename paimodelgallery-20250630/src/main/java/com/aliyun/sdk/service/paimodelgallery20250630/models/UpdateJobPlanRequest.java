// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link UpdateJobPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobPlanRequest</p>
 */
public class UpdateJobPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobPlanId")
    private String jobPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobPlanCurrentStep")
    private String jobPlanCurrentStep;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private UpdateJobPlanRequest(Builder builder) {
        super(builder);
        this.jobPlanId = builder.jobPlanId;
        this.jobPlanCurrentStep = builder.jobPlanCurrentStep;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobPlanId
     */
    public String getJobPlanId() {
        return this.jobPlanId;
    }

    /**
     * @return jobPlanCurrentStep
     */
    public String getJobPlanCurrentStep() {
        return this.jobPlanCurrentStep;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<UpdateJobPlanRequest, Builder> {
        private String jobPlanId; 
        private String jobPlanCurrentStep; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobPlanRequest request) {
            super(request);
            this.jobPlanId = request.jobPlanId;
            this.jobPlanCurrentStep = request.jobPlanCurrentStep;
            this.tag = request.tag;
        } 

        /**
         * JobPlanId.
         */
        public Builder jobPlanId(String jobPlanId) {
            this.putPathParameter("JobPlanId", jobPlanId);
            this.jobPlanId = jobPlanId;
            return this;
        }

        /**
         * JobPlanCurrentStep.
         */
        public Builder jobPlanCurrentStep(String jobPlanCurrentStep) {
            this.putBodyParameter("JobPlanCurrentStep", jobPlanCurrentStep);
            this.jobPlanCurrentStep = jobPlanCurrentStep;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public UpdateJobPlanRequest build() {
            return new UpdateJobPlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateJobPlanRequest} extends {@link TeaModel}
     *
     * <p>UpdateJobPlanRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
