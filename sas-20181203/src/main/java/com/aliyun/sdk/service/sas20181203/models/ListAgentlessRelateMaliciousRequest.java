// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessRelateMaliciousRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessRelateMaliciousRequest</p>
 */
public class ListAgentlessRelateMaliciousRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("EventId")
    private Long eventId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    private ListAgentlessRelateMaliciousRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.eventId = builder.eventId;
        this.pageSize = builder.pageSize;
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
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListAgentlessRelateMaliciousRequest, Builder> {
        private Integer currentPage; 
        private Long eventId; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessRelateMaliciousRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.eventId = request.eventId;
            this.pageSize = request.pageSize;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListAgentlessRelateMaliciousRequest build() {
            return new ListAgentlessRelateMaliciousRequest(this);
        } 

    } 

}
