// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEscalationPoliciesResponseBody</p>
 */
public class ListEscalationPoliciesResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
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
         * 分页对象
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

        public ListEscalationPoliciesResponseBody build() {
            return new ListEscalationPoliciesResponseBody(this);
        } 

    } 

    public static class EscalationPolicies extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
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

            public EscalationPolicies build() {
                return new EscalationPolicies(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("EscalationPolicies")
        private java.util.List < EscalationPolicies> escalationPolicies;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
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
             * EscalationPolicies.
             */
            public Builder escalationPolicies(java.util.List < EscalationPolicies> escalationPolicies) {
                this.escalationPolicies = escalationPolicies;
                return this;
            }

            /**
             * 页数
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * 每页展示数目
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * 总数
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
