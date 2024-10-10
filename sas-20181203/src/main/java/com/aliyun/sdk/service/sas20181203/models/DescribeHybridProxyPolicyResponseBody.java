// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridProxyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridProxyPolicyResponseBody</p>
 */
public class DescribeHybridProxyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("PolicyList")
    private java.util.List < PolicyList> policyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridProxyPolicyResponseBody(Builder builder) {
        this.count = builder.count;
        this.policyList = builder.policyList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridProxyPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return policyList
     */
    public java.util.List < PolicyList> getPolicyList() {
        return this.policyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < PolicyList> policyList; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * PolicyList.
         */
        public Builder policyList(java.util.List < PolicyList> policyList) {
            this.policyList = policyList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridProxyPolicyResponseBody build() {
            return new DescribeHybridProxyPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridProxyPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridProxyPolicyResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Info(Builder builder) {
            this.config = builder.config;
            this.fileName = builder.fileName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String fileName; 
            private String type; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridProxyPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridProxyPolicyResponseBody</p>
     */
    public static class PolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private java.util.List < Info> info;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private PolicyList(Builder builder) {
            this.info = builder.info;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyList create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public java.util.List < Info> getInfo() {
            return this.info;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private java.util.List < Info> info; 
            private String policyType; 

            /**
             * Info.
             */
            public Builder info(java.util.List < Info> info) {
                this.info = info;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public PolicyList build() {
                return new PolicyList(this);
            } 

        } 

    }
}
