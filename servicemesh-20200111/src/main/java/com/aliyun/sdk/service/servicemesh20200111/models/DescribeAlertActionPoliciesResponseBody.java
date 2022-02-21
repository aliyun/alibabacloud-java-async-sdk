// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertActionPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertActionPoliciesResponseBody</p>
 */
public class DescribeAlertActionPoliciesResponseBody extends TeaModel {
    @NameInMap("ActionPolicyList")
    private java.util.List < ActionPolicyList> actionPolicyList;

    @NameInMap("PageTotal")
    private Integer pageTotal;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAlertActionPoliciesResponseBody(Builder builder) {
        this.actionPolicyList = builder.actionPolicyList;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertActionPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionPolicyList
     */
    public java.util.List < ActionPolicyList> getActionPolicyList() {
        return this.actionPolicyList;
    }

    /**
     * @return pageTotal
     */
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ActionPolicyList> actionPolicyList; 
        private Integer pageTotal; 
        private String requestId; 

        /**
         * ActionPolicyList.
         */
        public Builder actionPolicyList(java.util.List < ActionPolicyList> actionPolicyList) {
            this.actionPolicyList = actionPolicyList;
            return this;
        }

        /**
         * PageTotal.
         */
        public Builder pageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAlertActionPoliciesResponseBody build() {
            return new DescribeAlertActionPoliciesResponseBody(this);
        } 

    } 

    public static class ActionPolicyList extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private ActionPolicyList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionPolicyList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(String id) {
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

            public ActionPolicyList build() {
                return new ActionPolicyList(this);
            } 

        } 

    }
}
