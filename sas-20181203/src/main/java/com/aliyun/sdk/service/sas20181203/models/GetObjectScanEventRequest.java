// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetObjectScanEventRequest} extends {@link RequestModel}
 *
 * <p>GetObjectScanEventRequest</p>
 */
public class GetObjectScanEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
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
         * <p>The ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>81****</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The language of the content in the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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

        @Override
        public GetObjectScanEventRequest build() {
            return new GetObjectScanEventRequest(this);
        } 

    } 

}
