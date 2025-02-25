// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpenNLUHighRecallRequest} extends {@link RequestModel}
 *
 * <p>GetOpenNLUHighRecallRequest</p>
 */
public class GetOpenNLUHighRecallRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Examples")
    private String examples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sentence")
    private String sentence;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    private GetOpenNLUHighRecallRequest(Builder builder) {
        super(builder);
        this.examples = builder.examples;
        this.labels = builder.labels;
        this.sentence = builder.sentence;
        this.serviceCode = builder.serviceCode;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenNLUHighRecallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return examples
     */
    public String getExamples() {
        return this.examples;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return sentence
     */
    public String getSentence() {
        return this.sentence;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return task
     */
    public String getTask() {
        return this.task;
    }

    public static final class Builder extends Request.Builder<GetOpenNLUHighRecallRequest, Builder> {
        private String examples; 
        private String labels; 
        private String sentence; 
        private String serviceCode; 
        private String task; 

        private Builder() {
            super();
        } 

        private Builder(GetOpenNLUHighRecallRequest request) {
            super(request);
            this.examples = request.examples;
            this.labels = request.labels;
            this.sentence = request.sentence;
            this.serviceCode = request.serviceCode;
            this.task = request.task;
        } 

        /**
         * Examples.
         */
        public Builder examples(String examples) {
            this.putBodyParameter("Examples", examples);
            this.examples = examples;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Sentence.
         */
        public Builder sentence(String sentence) {
            this.putBodyParameter("Sentence", sentence);
            this.sentence = sentence;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(String task) {
            this.putBodyParameter("Task", task);
            this.task = task;
            return this;
        }

        @Override
        public GetOpenNLUHighRecallRequest build() {
            return new GetOpenNLUHighRecallRequest(this);
        } 

    } 

}
