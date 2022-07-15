// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDemosResponseBody} extends {@link TeaModel}
 *
 * <p>ListDemosResponseBody</p>
 */
public class ListDemosResponseBody extends TeaModel {
    @NameInMap("Demos")
    private java.util.List < Demos> demos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDemosResponseBody(Builder builder) {
        this.demos = builder.demos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDemosResponseBody create() {
        return builder().build();
    }

    /**
     * @return demos
     */
    public java.util.List < Demos> getDemos() {
        return this.demos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Demos> demos; 
        private String requestId; 
        private Long totalCount; 

        /**
         * 样例列表
         */
        public Builder demos(java.util.List < Demos> demos) {
            this.demos = demos;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDemosResponseBody build() {
            return new ListDemosResponseBody(this);
        } 

    } 

    public static class Demos extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        @NameInMap("DemoDescription")
        private String demoDescription;

        @NameInMap("DemoName")
        private String demoName;

        @NameInMap("DemoUrl")
        private String demoUrl;

        @NameInMap("Order")
        private Long order;

        @NameInMap("Size")
        private Long size;

        private Demos(Builder builder) {
            this.categories = builder.categories;
            this.demoDescription = builder.demoDescription;
            this.demoName = builder.demoName;
            this.demoUrl = builder.demoUrl;
            this.order = builder.order;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Demos create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        /**
         * @return demoDescription
         */
        public String getDemoDescription() {
            return this.demoDescription;
        }

        /**
         * @return demoName
         */
        public String getDemoName() {
            return this.demoName;
        }

        /**
         * @return demoUrl
         */
        public String getDemoUrl() {
            return this.demoUrl;
        }

        /**
         * @return order
         */
        public Long getOrder() {
            return this.order;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private java.util.List < String > categories; 
            private String demoDescription; 
            private String demoName; 
            private String demoUrl; 
            private Long order; 
            private Long size; 

            /**
             * 所在目录
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * 样例描述
             */
            public Builder demoDescription(String demoDescription) {
                this.demoDescription = demoDescription;
                return this;
            }

            /**
             * 样例名称
             */
            public Builder demoName(String demoName) {
                this.demoName = demoName;
                return this;
            }

            /**
             * 样例地址
             */
            public Builder demoUrl(String demoUrl) {
                this.demoUrl = demoUrl;
                return this;
            }

            /**
             * 序号
             */
            public Builder order(Long order) {
                this.order = order;
                return this;
            }

            /**
             * 大小
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Demos build() {
                return new Demos(this);
            } 

        } 

    }
}
