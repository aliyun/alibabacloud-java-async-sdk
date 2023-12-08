// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetObjectScanEventRequest} extends {@link RequestModel}
 *
 * <p>GetObjectScanEventRequest</p>
 */
public class GetObjectScanEventRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private GetObjectScanEventRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectScanEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetObjectScanEventRequest, Builder> {
        private String eventId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetObjectScanEventRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.lang = request.lang;
        } 

        /**
         * The ID of the alert event.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The language of the content in the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public GetObjectScanEventRequest build() {
            return new GetObjectScanEventRequest(this);
        } 

    } 

}
