// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;relationship&quot;:&quot;and&quot;,&quot;list&quot;:[{&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;hasRightVariable&quot;:true,&quot;fieldType&quot;:&quot;INT&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;leftVariableType&quot;:&quot;NATIVE&quot;,&quot;name&quot;:&quot;DEtest222&quot;,&quot;operatorCode&quot;:&quot;equals&quot;},&quot;right&quot;:{&quot;rightVariableType&quot;:&quot;constant&quot;,&quot;name&quot;:&quot;11&quot;,&quot;functionName&quot;:&quot;&quot;},&quot;operatorCode&quot;:&quot;equals&quot;}]}</p>
         */
        public Builder condition(String condition) {
            this.putQueryParameter("condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>Creation type</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>ip调用次数累计描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Event code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de_ahqhsw7665,de_agbzfi5134</p>
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * <p>Value type</p>
         * 
         * <strong>example:</strong>
         * <p>EARLIEST</p>
         */
        public Builder historyValueType(String historyValueType) {
            this.putQueryParameter("historyValueType", historyValueType);
            this.historyValueType = historyValueType;
            return this;
        }

        /**
         * <p>Accumulative object</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        public Builder object(String object) {
            this.putQueryParameter("object", object);
            this.object = object;
            return this;
        }

        /**
         * <p>Variable return type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Primary object</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder subject(String subject) {
            this.putQueryParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * <p>Time slice type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CURRENT</p>
         */
        public Builder timeType(String timeType) {
            this.putQueryParameter("timeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * <p>Title.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip调用次数累计</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>Number of time units</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder twCount(Integer twCount) {
            this.putQueryParameter("twCount", twCount);
            this.twCount = twCount;
            return this;
        }

        /**
         * <p>Variable type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DISTINCT</p>
         */
        public Builder velocityFC(String velocityFC) {
            this.putQueryParameter("velocityFC", velocityFC);
            this.velocityFC = velocityFC;
            return this;
        }

        /**
         * <p>Time slice unit</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY_1</p>
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
