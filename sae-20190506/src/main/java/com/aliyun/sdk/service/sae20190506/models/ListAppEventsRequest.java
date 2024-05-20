// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAppEventsRequest</p>
 */
public class ListAppEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectKind")
    private String objectKind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectName")
    private String objectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    private ListAppEventsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.currentPage = builder.currentPage;
        this.eventType = builder.eventType;
        this.namespace = builder.namespace;
        this.objectKind = builder.objectKind;
        this.objectName = builder.objectName;
        this.pageSize = builder.pageSize;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppEventsRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return objectKind
     */
    public String getObjectKind() {
        return this.objectKind;
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<ListAppEventsRequest, Builder> {
        private String appId; 
        private Integer currentPage; 
        private String eventType; 
        private String namespace; 
        private String objectKind; 
        private String objectName; 
        private Integer pageSize; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(ListAppEventsRequest request) {
            super(request);
            this.appId = request.appId;
            this.currentPage = request.currentPage;
            this.eventType = request.eventType;
            this.namespace = request.namespace;
            this.objectKind = request.objectKind;
            this.objectName = request.objectName;
            this.pageSize = request.pageSize;
            this.reason = request.reason;
        } 

        /**
         * The application ID.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The page number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The type of the event. Valid values:
         * <p>
         * 
         * *   **Warning**: an alert.
         * *   **Normal**: a normal event.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The namespace ID.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The type of the object. Valid values:
         * <p>
         * 
         * *   **Deployment**: an application.
         * *   **Pod**: an application instance.
         * *   **Service**: a Server Load Balancer (SLB) instance.
         * *   **HorizontalPodAutoscaler**: an auto scaling policy.
         * *   **CloneSet**: an application.
         */
        public Builder objectKind(String objectKind) {
            this.putQueryParameter("ObjectKind", objectKind);
            this.objectKind = objectKind;
            return this;
        }

        /**
         * The name of the object. Fuzzy search by prefix is supported.
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("ObjectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 0 to 10000.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The cause of the event. Fuzzy search by prefix is supported.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public ListAppEventsRequest build() {
            return new ListAppEventsRequest(this);
        } 

    } 

}
