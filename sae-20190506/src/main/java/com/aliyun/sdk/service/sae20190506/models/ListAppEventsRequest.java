// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li><p><strong>Warning</strong>: An event that indicates a potential problem.</p>
         * </li>
         * <li><p><strong>Normal</strong>: An event that indicates a routine operation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The ID of the region where the namespace is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The object kind. Valid values:</p>
         * <ul>
         * <li><p><strong>Deployment</strong>: The application.</p>
         * </li>
         * <li><p><strong>Pod</strong>: The application instance.</p>
         * </li>
         * <li><p><strong>Service</strong>: The Server Load Balancer (SLB) instance.</p>
         * </li>
         * <li><p><strong>HorizontalPodAutoscaler</strong>: The auto scaling policy.</p>
         * </li>
         * <li><p><strong>CloneSet</strong>: The application.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pod</p>
         */
        public Builder objectKind(String objectKind) {
            this.putQueryParameter("ObjectKind", objectKind);
            this.objectKind = objectKind;
            return this;
        }

        /**
         * <p>The name of the object. Prefix matching is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>errew-b86bf540-b4dc-47d8-a42f-b4997c14bd8f-5595cbddd6-x****</p>
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("ObjectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * <p>The number of entries to return per page. The value must be an integer from 0 to 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The reason for the event. Prefix matching is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
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
