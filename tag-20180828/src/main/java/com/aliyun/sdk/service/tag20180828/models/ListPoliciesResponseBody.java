// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPoliciesResponseBody</p>
 */
public class ListPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PolicyList")
    private java.util.List<PolicyList> policyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPoliciesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.policyList = builder.policyList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policyList
     */
    public java.util.List<PolicyList> getPolicyList() {
        return this.policyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<PolicyList> policyList; 
        private String requestId; 

        /**
         * <p>Indicates whether the next query is required.</p>
         * <ul>
         * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
         * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The tag policies.</p>
         */
        public Builder policyList(java.util.List<PolicyList> policyList) {
            this.policyList = policyList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>72477CFF-5B24-5E30-9861-3DD9C4BD46E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPoliciesResponseBody build() {
            return new ListPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPoliciesResponseBody</p>
     */
    public static class PolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyContent")
        private String policyContent;

        @com.aliyun.core.annotation.NameInMap("PolicyDesc")
        private String policyDesc;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private PolicyList(Builder builder) {
            this.policyContent = builder.policyContent;
            this.policyDesc = builder.policyDesc;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyList create() {
            return builder().build();
        }

        /**
         * @return policyContent
         */
        public String getPolicyContent() {
            return this.policyContent;
        }

        /**
         * @return policyDesc
         */
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String policyContent; 
            private String policyDesc; 
            private String policyId; 
            private String policyName; 
            private String userType; 

            /**
             * <p>The document of the tag policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;tags&quot;:{&quot;CostCenter&quot;:{&quot;tag_value&quot;:{&quot;@@assign&quot;:[&quot;Beijing&quot;,&quot;Shanghai&quot;]},&quot;tag_key&quot;:{&quot;@@assign&quot;:&quot;CostCenter&quot;}}}}</p>
             */
            public Builder policyContent(String policyContent) {
                this.policyContent = policyContent;
                return this;
            }

            /**
             * <p>The description of the tag policy.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a tag policy example.</p>
             */
            public Builder policyDesc(String policyDesc) {
                this.policyDesc = policyDesc;
                return this;
            }

            /**
             * <p>The ID of the tag policy.</p>
             * 
             * <strong>example:</strong>
             * <p>p-de62a0bf400e4b69****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the tag policy.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The mode of the Tag Policy feature. Valid values:</p>
             * <ul>
             * <li>USER: single-account mode</li>
             * <li>RD: multi-account mode</li>
             * </ul>
             * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public PolicyList build() {
                return new PolicyList(this);
            } 

        } 

    }
}
