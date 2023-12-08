// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListPoliciesForTargetResponseBody</p>
 */
public class ListPoliciesForTargetResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListPoliciesForTargetResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesForTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String nextToken; 
        private String requestId; 

        /**
         * The tag policies that are attached to the object.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the next query is required.
         * <p>
         * 
         * *   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.
         * *   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPoliciesForTargetResponseBody build() {
            return new ListPoliciesForTargetResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("PolicyContent")
        private String policyContent;

        @NameInMap("PolicyDesc")
        private String policyDesc;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("UserType")
        private String userType;

        private Data(Builder builder) {
            this.policyContent = builder.policyContent;
            this.policyDesc = builder.policyDesc;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
             * The document of the tag policy.
             */
            public Builder policyContent(String policyContent) {
                this.policyContent = policyContent;
                return this;
            }

            /**
             * The description of the tag policy.
             */
            public Builder policyDesc(String policyDesc) {
                this.policyDesc = policyDesc;
                return this;
            }

            /**
             * The ID of the tag policy.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the tag policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The mode of the Tag Policy feature. Valid values:
             * <p>
             * 
             * *   USER: single-account mode
             * *   RD: multi-account mode
             * 
             * For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
