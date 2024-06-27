// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartOrStopByPassShuntEventRequest} extends {@link RequestModel}
 *
 * <p>StartOrStopByPassShuntEventRequest</p>
 */
public class StartOrStopByPassShuntEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private StartOrStopByPassShuntEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventId = builder.eventId;
        this.regId = builder.regId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartOrStopByPassShuntEventRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<StartOrStopByPassShuntEventRequest, Builder> {
        private String lang; 
        private Long eventId; 
        private String regId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(StartOrStopByPassShuntEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventId = request.eventId;
            this.regId = request.regId;
            this.status = request.status;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public StartOrStopByPassShuntEventRequest build() {
            return new StartOrStopByPassShuntEventRequest(this);
        } 

    } 

}
