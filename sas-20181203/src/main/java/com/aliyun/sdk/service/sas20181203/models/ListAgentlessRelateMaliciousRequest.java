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
 * {@link ListAgentlessRelateMaliciousRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessRelateMaliciousRequest</p>
 */
public class ListAgentlessRelateMaliciousRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenario")
    private String scenario;

    private ListAgentlessRelateMaliciousRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.eventId = builder.eventId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessRelateMaliciousRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<ListAgentlessRelateMaliciousRequest, Builder> {
        private Integer currentPage; 
        private Long eventId; 
        private String lang; 
        private String pageSize; 
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessRelateMaliciousRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.eventId = request.eventId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.scenario = request.scenario;
        } 

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>80****</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
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
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Scenario.
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public ListAgentlessRelateMaliciousRequest build() {
            return new ListAgentlessRelateMaliciousRequest(this);
        } 

    } 

}
