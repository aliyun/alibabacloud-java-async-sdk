// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnCallSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOnCallSchedulesResponseBody</p>
 */
public class ListOnCallSchedulesResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private ListOnCallSchedulesResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnCallSchedulesResponseBody create() {
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

        public ListOnCallSchedulesResponseBody build() {
            return new ListOnCallSchedulesResponseBody(this);
        } 

    } 

    public static class OnCallSchedules extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        private OnCallSchedules(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnCallSchedules create() {
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
             * 排班策略描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 排班策略ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 排班策略名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public OnCallSchedules build() {
                return new OnCallSchedules(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("OnCallSchedules")
        private java.util.List < OnCallSchedules> onCallSchedules;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.onCallSchedules = builder.onCallSchedules;
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
         * @return onCallSchedules
         */
        public java.util.List < OnCallSchedules> getOnCallSchedules() {
            return this.onCallSchedules;
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
            private java.util.List < OnCallSchedules> onCallSchedules; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * OnCallSchedules.
             */
            public Builder onCallSchedules(java.util.List < OnCallSchedules> onCallSchedules) {
                this.onCallSchedules = onCallSchedules;
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
