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
 * {@link ListHoneypotEventFlowsRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotEventFlowsRequest</p>
 */
public class ListHoneypotEventFlowsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventId")
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Dealed.
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityEventId.
         */
        public Builder securityEventId(Long securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        @Override
        public ListHoneypotEventFlowsRequest build() {
            return new ListHoneypotEventFlowsRequest(this);
        } 

    } 

}
