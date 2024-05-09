// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEscalationPoliciesResponseBody</p>
 */
public class ListEscalationPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEscalationPoliciesResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEscalationPoliciesResponseBody create() {
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
         * The returned objects.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEscalationPoliciesResponseBody build() {
            return new ListEscalationPoliciesResponseBody(this);
        } 

    } 

    public static class EscalationPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EscalationPolicies(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationPolicies create() {
            return builder().build();
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
            private Long id; 
            private String name; 

            /**
             * The ID of the escalation policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the escalation policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EscalationPolicies build() {
                return new EscalationPolicies(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EscalationPolicies")
        private java.util.List < EscalationPolicies> escalationPolicies;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.escalationPolicies = builder.escalationPolicies;
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
         * @return escalationPolicies
         */
        public java.util.List < EscalationPolicies> getEscalationPolicies() {
            return this.escalationPolicies;
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
            private java.util.List < EscalationPolicies> escalationPolicies; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * The list of escalation policies.
             */
            public Builder escalationPolicies(java.util.List < EscalationPolicies> escalationPolicies) {
                this.escalationPolicies = escalationPolicies;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The total number of returned entries.
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
