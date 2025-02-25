// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateByPassShuntEventRequest} extends {@link RequestModel}
 *
 * <p>UpdateByPassShuntEventRequest</p>
 */
public class UpdateByPassShuntEventRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private UpdateByPassShuntEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventId = builder.eventId;
        this.eventName = builder.eventName;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateByPassShuntEventRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<UpdateByPassShuntEventRequest, Builder> {
        private String lang; 
        private Long eventId; 
        private String eventName; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateByPassShuntEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventId = request.eventId;
            this.eventName = request.eventName;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public UpdateByPassShuntEventRequest build() {
            return new UpdateByPassShuntEventRequest(this);
        } 

    } 

}
