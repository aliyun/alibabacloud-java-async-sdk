// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackMenuResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackMenuResponseBody</p>
 */
public class DescribeBackMenuResponseBody extends TeaModel {
    @NameInMap("List")
    private List list;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeBackMenuResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackMenuResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private List list; 
        private String requestId; 
        private Boolean success; 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackMenuResponseBody build() {
            return new DescribeBackMenuResponseBody(this);
        } 

    } 

    public static class ListList extends TeaModel {
        @NameInMap("MenuName")
        private String menuName;

        @NameInMap("Support")
        private Boolean support;

        private ListList(Builder builder) {
            this.menuName = builder.menuName;
            this.support = builder.support;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListList create() {
            return builder().build();
        }

        /**
         * @return menuName
         */
        public String getMenuName() {
            return this.menuName;
        }

        /**
         * @return support
         */
        public Boolean getSupport() {
            return this.support;
        }

        public static final class Builder {
            private String menuName; 
            private Boolean support; 

            /**
             * MenuName.
             */
            public Builder menuName(String menuName) {
                this.menuName = menuName;
                return this;
            }

            /**
             * Support.
             */
            public Builder support(Boolean support) {
                this.support = support;
                return this;
            }

            public ListList build() {
                return new ListList(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("list")
        private java.util.List < ListList> list;

        private List(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < ListList> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List < ListList> list; 

            /**
             * list.
             */
            public Builder list(java.util.List < ListList> list) {
                this.list = list;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
