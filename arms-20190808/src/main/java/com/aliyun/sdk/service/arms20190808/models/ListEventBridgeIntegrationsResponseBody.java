// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListEventBridgeIntegrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventBridgeIntegrationsResponseBody</p>
 */
public class ListEventBridgeIntegrationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEventBridgeIntegrationsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventBridgeIntegrationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageBean pageBean; 
        private String requestId; 

        /**
         * <p>The information about EventBridge integrations that is returned on each page.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2B289756-E791-5842-BCBD-AD414C******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEventBridgeIntegrationsResponseBody build() {
            return new ListEventBridgeIntegrationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventBridgeIntegrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventBridgeIntegrationsResponseBody</p>
     */
    public static class EventBridgeIntegrations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EventBridgeIntegrations(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBridgeIntegrations create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 

            /**
             * <p>The description of the EventBridge integration.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the EventBridge integration.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the EventBridge integration.</p>
             * 
             * <strong>example:</strong>
             * <p>EventBridge_Test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventBridgeIntegrations build() {
                return new EventBridgeIntegrations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventBridgeIntegrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventBridgeIntegrationsResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventBridgeIntegrations")
        private java.util.List<EventBridgeIntegrations> eventBridgeIntegrations;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.eventBridgeIntegrations = builder.eventBridgeIntegrations;
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return eventBridgeIntegrations
         */
        public java.util.List<EventBridgeIntegrations> getEventBridgeIntegrations() {
            return this.eventBridgeIntegrations;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<EventBridgeIntegrations> eventBridgeIntegrations; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * <p>The EventBridge integrations.</p>
             */
            public Builder eventBridgeIntegrations(java.util.List<EventBridgeIntegrations> eventBridgeIntegrations) {
                this.eventBridgeIntegrations = eventBridgeIntegrations;
                return this;
            }

            /**
             * <p>The number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of EventBridge integrations that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
