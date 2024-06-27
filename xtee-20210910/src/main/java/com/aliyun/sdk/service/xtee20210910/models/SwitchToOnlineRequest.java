// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchToOnlineRequest} extends {@link RequestModel}
 *
 * <p>SwitchToOnlineRequest</p>
 */
public class SwitchToOnlineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private SwitchToOnlineRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventId = builder.eventId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchToOnlineRequest create() {
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

    public static final class Builder extends Request.Builder<SwitchToOnlineRequest, Builder> {
        private String lang; 
        private Long eventId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchToOnlineRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventId = request.eventId;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public SwitchToOnlineRequest build() {
            return new SwitchToOnlineRequest(this);
        } 

    } 

}
