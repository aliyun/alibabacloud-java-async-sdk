// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveByPassOrShuntEventRequest} extends {@link RequestModel}
 *
 * <p>SaveByPassOrShuntEventRequest</p>
 */
public class SaveByPassOrShuntEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private SaveByPassOrShuntEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventId = builder.eventId;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveByPassOrShuntEventRequest create() {
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
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<SaveByPassOrShuntEventRequest, Builder> {
        private String lang; 
        private Long eventId; 
        private String eventName; 
        private String eventType; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(SaveByPassOrShuntEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventId = request.eventId;
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.regId = request.regId;
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
         * eventId.
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("eventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * eventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("eventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * eventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("eventType", eventType);
            this.eventType = eventType;
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

        @Override
        public SaveByPassOrShuntEventRequest build() {
            return new SaveByPassOrShuntEventRequest(this);
        } 

    } 

}
