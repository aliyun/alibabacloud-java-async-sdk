// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link SearchPunishEventsRequest} extends {@link RequestModel}
 *
 * <p>SearchPunishEventsRequest</p>
 */
public class SearchPunishEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BussinessCodes")
    private java.util.List<String> bussinessCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseCodes")
    private java.util.List<String> caseCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCodes")
    private java.util.List<String> eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private SearchPunishEventsRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.bussinessCodes = builder.bussinessCodes;
        this.caseCodes = builder.caseCodes;
        this.eventCodes = builder.eventCodes;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPunishEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return bussinessCodes
     */
    public java.util.List<String> getBussinessCodes() {
        return this.bussinessCodes;
    }

    /**
     * @return caseCodes
     */
    public java.util.List<String> getCaseCodes() {
        return this.caseCodes;
    }

    /**
     * @return eventCodes
     */
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<SearchPunishEventsRequest, Builder> {
        private String aliUid; 
        private java.util.List<String> bussinessCodes; 
        private java.util.List<String> caseCodes; 
        private java.util.List<String> eventCodes; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(SearchPunishEventsRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.bussinessCodes = request.bussinessCodes;
            this.caseCodes = request.caseCodes;
            this.eventCodes = request.eventCodes;
            this.resourceId = request.resourceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * BussinessCodes.
         */
        public Builder bussinessCodes(java.util.List<String> bussinessCodes) {
            String bussinessCodesShrink = shrink(bussinessCodes, "BussinessCodes", "json");
            this.putQueryParameter("BussinessCodes", bussinessCodesShrink);
            this.bussinessCodes = bussinessCodes;
            return this;
        }

        /**
         * CaseCodes.
         */
        public Builder caseCodes(java.util.List<String> caseCodes) {
            String caseCodesShrink = shrink(caseCodes, "CaseCodes", "json");
            this.putQueryParameter("CaseCodes", caseCodesShrink);
            this.caseCodes = caseCodes;
            return this;
        }

        /**
         * EventCodes.
         */
        public Builder eventCodes(java.util.List<String> eventCodes) {
            String eventCodesShrink = shrink(eventCodes, "EventCodes", "json");
            this.putQueryParameter("EventCodes", eventCodesShrink);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public SearchPunishEventsRequest build() {
            return new SearchPunishEventsRequest(this);
        } 

    } 

}
