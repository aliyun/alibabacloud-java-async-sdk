// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustVariableRequest} extends {@link RequestModel}
 *
 * <p>CreateCustVariableRequest</p>
 */
public class CreateCustVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("historyValueType")
    private String historyValueType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("object")
    private String object;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outputs")
    private String outputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("twCount")
    private Integer twCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("velocityFC")
    @com.aliyun.core.annotation.Validation(required = true)
    private String velocityFC;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("velocityTW")
    @com.aliyun.core.annotation.Validation(required = true)
    private String velocityTW;

    private CreateCustVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.condition = builder.condition;
        this.createType = builder.createType;
        this.description = builder.description;
        this.eventCodes = builder.eventCodes;
        this.historyValueType = builder.historyValueType;
        this.object = builder.object;
        this.outputs = builder.outputs;
        this.regId = builder.regId;
        this.subject = builder.subject;
        this.timeType = builder.timeType;
        this.title = builder.title;
        this.twCount = builder.twCount;
        this.velocityFC = builder.velocityFC;
        this.velocityTW = builder.velocityTW;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustVariableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return historyValueType
     */
    public String getHistoryValueType() {
        return this.historyValueType;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return timeType
     */
    public String getTimeType() {
        return this.timeType;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return twCount
     */
    public Integer getTwCount() {
        return this.twCount;
    }

    /**
     * @return velocityFC
     */
    public String getVelocityFC() {
        return this.velocityFC;
    }

    /**
     * @return velocityTW
     */
    public String getVelocityTW() {
        return this.velocityTW;
    }

    public static final class Builder extends Request.Builder<CreateCustVariableRequest, Builder> {
        private String lang; 
        private String condition; 
        private String createType; 
        private String description; 
        private String eventCodes; 
        private String historyValueType; 
        private String object; 
        private String outputs; 
        private String regId; 
        private String subject; 
        private String timeType; 
        private String title; 
        private Integer twCount; 
        private String velocityFC; 
        private String velocityTW; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.condition = request.condition;
            this.createType = request.createType;
            this.description = request.description;
            this.eventCodes = request.eventCodes;
            this.historyValueType = request.historyValueType;
            this.object = request.object;
            this.outputs = request.outputs;
            this.regId = request.regId;
            this.subject = request.subject;
            this.timeType = request.timeType;
            this.title = request.title;
            this.twCount = request.twCount;
            this.velocityFC = request.velocityFC;
            this.velocityTW = request.velocityTW;
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
         * condition.
         */
        public Builder condition(String condition) {
            this.putQueryParameter("condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * eventCodes.
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * historyValueType.
         */
        public Builder historyValueType(String historyValueType) {
            this.putQueryParameter("historyValueType", historyValueType);
            this.historyValueType = historyValueType;
            return this;
        }

        /**
         * object.
         */
        public Builder object(String object) {
            this.putQueryParameter("object", object);
            this.object = object;
            return this;
        }

        /**
         * outputs.
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * subject.
         */
        public Builder subject(String subject) {
            this.putQueryParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * timeType.
         */
        public Builder timeType(String timeType) {
            this.putQueryParameter("timeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * twCount.
         */
        public Builder twCount(Integer twCount) {
            this.putQueryParameter("twCount", twCount);
            this.twCount = twCount;
            return this;
        }

        /**
         * velocityFC.
         */
        public Builder velocityFC(String velocityFC) {
            this.putQueryParameter("velocityFC", velocityFC);
            this.velocityFC = velocityFC;
            return this;
        }

        /**
         * velocityTW.
         */
        public Builder velocityTW(String velocityTW) {
            this.putQueryParameter("velocityTW", velocityTW);
            this.velocityTW = velocityTW;
            return this;
        }

        @Override
        public CreateCustVariableRequest build() {
            return new CreateCustVariableRequest(this);
        } 

    } 

}
