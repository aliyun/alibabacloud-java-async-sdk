// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageEventOperationPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageEventOperationPageRequest</p>
 */
public class DescribeImageEventOperationPageRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EventKey")
    private String eventKey;

    @Query
    @NameInMap("EventName")
    private String eventName;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeImageEventOperationPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.eventKey = builder.eventKey;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.id = builder.id;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageEventOperationPageRequest create() {
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
     * @return eventKey
     */
    public String getEventKey() {
        return this.eventKey;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<DescribeImageEventOperationPageRequest, Builder> {
        private Integer currentPage; 
        private String eventKey; 
        private String eventName; 
        private String eventType; 
        private Long id; 
        private String lang; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageEventOperationPageRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.eventKey = request.eventKey;
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.id = request.id;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
        } 

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The keyword of the alert item.
         */
        public Builder eventKey(String eventKey) {
            this.putQueryParameter("EventKey", eventKey);
            this.eventKey = eventKey;
            return this;
        }

        /**
         * The name of the alert item.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The alert type.
         * <p>
         * 
         * *   Set the value to **sensitiveFile**.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The ID of the alert handling rule.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeImageEventOperationPageRequest build() {
            return new DescribeImageEventOperationPageRequest(this);
        } 

    } 

}
