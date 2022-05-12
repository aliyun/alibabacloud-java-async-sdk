// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAppEventsRequest</p>
 */
public class ListAppEventsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("ObjectKind")
    private String objectKind;

    @Query
    @NameInMap("ObjectName")
    private String objectName;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Reason")
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
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
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ObjectKind.
         */
        public Builder objectKind(String objectKind) {
            this.putQueryParameter("ObjectKind", objectKind);
            this.objectKind = objectKind;
            return this;
        }

        /**
         * ObjectName.
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("ObjectName", objectName);
            this.objectName = objectName;
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
         * Reason.
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
