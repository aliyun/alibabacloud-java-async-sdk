// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventBridgeIntegrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventBridgeIntegrationsResponseBody</p>
 */
public class ListEventBridgeIntegrationsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
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
         * PageBean.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEventBridgeIntegrationsResponseBody build() {
            return new ListEventBridgeIntegrationsResponseBody(this);
        } 

    } 

    public static class EventBridgeIntegrations extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
    public static class PageBean extends TeaModel {
        @NameInMap("EventBridgeIntegrations")
        private java.util.List < EventBridgeIntegrations> eventBridgeIntegrations;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
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
        public java.util.List < EventBridgeIntegrations> getEventBridgeIntegrations() {
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
            private java.util.List < EventBridgeIntegrations> eventBridgeIntegrations; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * EventBridgeIntegrations.
             */
            public Builder eventBridgeIntegrations(java.util.List < EventBridgeIntegrations> eventBridgeIntegrations) {
                this.eventBridgeIntegrations = eventBridgeIntegrations;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
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
