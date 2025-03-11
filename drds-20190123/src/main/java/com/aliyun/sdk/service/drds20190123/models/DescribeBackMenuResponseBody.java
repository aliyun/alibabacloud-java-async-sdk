// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeBackMenuResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackMenuResponseBody</p>
 */
public class DescribeBackMenuResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The backup information list.</p>
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>60C21BE4-EDFE-454C-95ED-3A5C74******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackMenuResponseBody build() {
            return new DescribeBackMenuResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackMenuResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackMenuResponseBody</p>
     */
    public static class ListList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MenuName")
        private String menuName;

        @com.aliyun.core.annotation.NameInMap("Support")
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
             * <p>The backup method. Valid values:</p>
             * <ul>
             * <li>**Logic **: logical backup</li>
             * <li><strong>phy</strong>: physical backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>phy</p>
             */
            public Builder menuName(String menuName) {
                this.menuName = menuName;
                return this;
            }

            /**
             * <p>Indicates whether backup recovery is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeBackMenuResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackMenuResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<ListList> list;

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
        public java.util.List<ListList> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<ListList> list; 

            /**
             * list.
             */
            public Builder list(java.util.List<ListList> list) {
                this.list = list;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
