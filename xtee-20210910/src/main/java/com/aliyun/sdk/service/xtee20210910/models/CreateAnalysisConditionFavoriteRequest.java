// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAnalysisConditionFavoriteRequest} extends {@link RequestModel}
 *
 * <p>CreateAnalysisConditionFavoriteRequest</p>
 */
public class CreateAnalysisConditionFavoriteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventBeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldName")
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateAnalysisConditionFavoriteRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.condition = builder.condition;
        this.eventBeginTime = builder.eventBeginTime;
        this.eventCodes = builder.eventCodes;
        this.eventEndTime = builder.eventEndTime;
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.name = builder.name;
        this.regId = builder.regId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnalysisConditionFavoriteRequest create() {
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
     * @return eventBeginTime
     */
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return eventEndTime
     */
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAnalysisConditionFavoriteRequest, Builder> {
        private String lang; 
        private String condition; 
        private Long eventBeginTime; 
        private String eventCodes; 
        private Long eventEndTime; 
        private String fieldName; 
        private String fieldValue; 
        private String name; 
        private String regId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnalysisConditionFavoriteRequest request) {
            super(request);
            this.lang = request.lang;
            this.condition = request.condition;
            this.eventBeginTime = request.eventBeginTime;
            this.eventCodes = request.eventCodes;
            this.eventEndTime = request.eventEndTime;
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.name = request.name;
            this.regId = request.regId;
            this.type = request.type;
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
         * eventBeginTime.
         */
        public Builder eventBeginTime(Long eventBeginTime) {
            this.putQueryParameter("eventBeginTime", eventBeginTime);
            this.eventBeginTime = eventBeginTime;
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
         * eventEndTime.
         */
        public Builder eventEndTime(Long eventEndTime) {
            this.putQueryParameter("eventEndTime", eventEndTime);
            this.eventEndTime = eventEndTime;
            return this;
        }

        /**
         * fieldName.
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("fieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * fieldValue.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("fieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
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
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateAnalysisConditionFavoriteRequest build() {
            return new CreateAnalysisConditionFavoriteRequest(this);
        } 

    } 

}
