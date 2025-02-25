// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsReportsRequest} extends {@link RequestModel}
 *
 * <p>QuerySmsReportsRequest</p>
 */
public class QuerySmsReportsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    private QuerySmsReportsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eventId = builder.eventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsReportsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    public static final class Builder extends Request.Builder<QuerySmsReportsRequest, Builder> {
        private String appId; 
        private String eventId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmsReportsRequest request) {
            super(request);
            this.appId = request.appId;
            this.eventId = request.eventId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        @Override
        public QuerySmsReportsRequest build() {
            return new QuerySmsReportsRequest(this);
        } 

    } 

}
