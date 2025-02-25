// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimilarIncidentStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetSimilarIncidentStatisticsRequest</p>
 */
public class GetSimilarIncidentStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("events")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > events;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long incidentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentTitle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incidentTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long relatedServiceId;

    private GetSimilarIncidentStatisticsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.createTime = builder.createTime;
        this.events = builder.events;
        this.incidentId = builder.incidentId;
        this.incidentTitle = builder.incidentTitle;
        this.relatedServiceId = builder.relatedServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSimilarIncidentStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return events
     */
    public java.util.List < String > getEvents() {
        return this.events;
    }

    /**
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return incidentTitle
     */
    public String getIncidentTitle() {
        return this.incidentTitle;
    }

    /**
     * @return relatedServiceId
     */
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public static final class Builder extends Request.Builder<GetSimilarIncidentStatisticsRequest, Builder> {
        private String clientToken; 
        private String createTime; 
        private java.util.List < String > events; 
        private Long incidentId; 
        private String incidentTitle; 
        private Long relatedServiceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSimilarIncidentStatisticsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.createTime = request.createTime;
            this.events = request.events;
            this.incidentId = request.incidentId;
            this.incidentTitle = request.incidentTitle;
            this.relatedServiceId = request.relatedServiceId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.putBodyParameter("createTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * events.
         */
        public Builder events(java.util.List < String > events) {
            this.putBodyParameter("events", events);
            this.events = events;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        /**
         * incidentTitle.
         */
        public Builder incidentTitle(String incidentTitle) {
            this.putBodyParameter("incidentTitle", incidentTitle);
            this.incidentTitle = incidentTitle;
            return this;
        }

        /**
         * relatedServiceId.
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        @Override
        public GetSimilarIncidentStatisticsRequest build() {
            return new GetSimilarIncidentStatisticsRequest(this);
        } 

    } 

}
