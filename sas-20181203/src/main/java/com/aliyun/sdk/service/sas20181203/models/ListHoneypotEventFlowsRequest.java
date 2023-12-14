// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotEventFlowsRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotEventFlowsRequest</p>
 */
public class ListHoneypotEventFlowsRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("Dealed")
    private String dealed;

    @Body
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("SecurityEventId")
    private Long securityEventId;

    private ListHoneypotEventFlowsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.securityEventId = builder.securityEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotEventFlowsRequest create() {
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
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
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
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventId
     */
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public static final class Builder extends Request.Builder<ListHoneypotEventFlowsRequest, Builder> {
        private Integer currentPage; 
        private String dealed; 
        private String lang; 
        private Integer pageSize; 
        private String requestId; 
        private Long securityEventId; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotEventFlowsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.securityEventId = request.securityEventId;
        } 

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The status of the event. Valid values:
         * <p>
         * 
         * *   **y**: handled
         * *   **n**: unhandled
         * *   **a**: all statuses
         */
        public Builder dealed(String dealed) {
            this.putBodyParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the alert event. The ID of the management account of the ListHoneypotEvents resource directory.
         * <p>
         * 
         * >  You can call the [ListHoneypotEvents](~~ListHoneypotEvents~~) operation to query the IDs of alert events.
         */
        public Builder securityEventId(Long securityEventId) {
            this.putBodyParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        @Override
        public ListHoneypotEventFlowsRequest build() {
            return new ListHoneypotEventFlowsRequest(this);
        } 

    } 

}
