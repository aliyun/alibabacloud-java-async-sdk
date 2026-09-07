// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeQosRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQosRulesResponseBody</p>
 */
public class DescribeQosRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QosRules")
    private java.util.List<QosRules> qosRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeQosRulesResponseBody(Builder builder) {
        this.qosRules = builder.qosRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQosRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return qosRules
     */
    public java.util.List<QosRules> getQosRules() {
        return this.qosRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<QosRules> qosRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeQosRulesResponseBody model) {
            this.qosRules = model.qosRules;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of QoS rules.</p>
         */
        public Builder qosRules(java.util.List<QosRules> qosRules) {
            this.qosRules = qosRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeQosRulesResponseBody build() {
            return new DescribeQosRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQosRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQosRulesResponseBody</p>
     */
    public static class QosRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private String desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupCount")
        private Integer desktopGroupCount;

        @com.aliyun.core.annotation.NameInMap("Download")
        private String download;

        @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
        private String networkPackageId;

        @com.aliyun.core.annotation.NameInMap("QosRuleId")
        private String qosRuleId;

        @com.aliyun.core.annotation.NameInMap("QosRuleName")
        private String qosRuleName;

        @com.aliyun.core.annotation.NameInMap("Upload")
        private String upload;

        private QosRules(Builder builder) {
            this.desktopCount = builder.desktopCount;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.download = builder.download;
            this.networkPackageId = builder.networkPackageId;
            this.qosRuleId = builder.qosRuleId;
            this.qosRuleName = builder.qosRuleName;
            this.upload = builder.upload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosRules create() {
            return builder().build();
        }

        /**
         * @return desktopCount
         */
        public String getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopGroupCount
         */
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        /**
         * @return download
         */
        public String getDownload() {
            return this.download;
        }

        /**
         * @return networkPackageId
         */
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        /**
         * @return qosRuleId
         */
        public String getQosRuleId() {
            return this.qosRuleId;
        }

        /**
         * @return qosRuleName
         */
        public String getQosRuleName() {
            return this.qosRuleName;
        }

        /**
         * @return upload
         */
        public String getUpload() {
            return this.upload;
        }

        public static final class Builder {
            private String desktopCount; 
            private Integer desktopGroupCount; 
            private String download; 
            private String networkPackageId; 
            private String qosRuleId; 
            private String qosRuleName; 
            private String upload; 

            private Builder() {
            } 

            private Builder(QosRules model) {
                this.desktopCount = model.desktopCount;
                this.desktopGroupCount = model.desktopGroupCount;
                this.download = model.download;
                this.networkPackageId = model.networkPackageId;
                this.qosRuleId = model.qosRuleId;
                this.qosRuleName = model.qosRuleName;
                this.upload = model.upload;
            } 

            /**
             * <p>The number of cloud computers in the pool.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder desktopCount(String desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The number of cloud computer pools associated with the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopGroupCount(Integer desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * <p>The downstream bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder download(String download) {
                this.download = download;
                return this;
            }

            /**
             * <p>The premium Internet bandwidth ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np-5cjh3sqs1ty3s02xq</p>
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * <p>The QoS rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-chvkz5ekzgcb6bo0f</p>
             */
            public Builder qosRuleId(String qosRuleId) {
                this.qosRuleId = qosRuleId;
                return this;
            }

            /**
             * <p>The name of the QoS rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Office network QoS rule</p>
             */
            public Builder qosRuleName(String qosRuleName) {
                this.qosRuleName = qosRuleName;
                return this;
            }

            /**
             * <p>The upstream bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder upload(String upload) {
                this.upload = upload;
                return this;
            }

            public QosRules build() {
                return new QosRules(this);
            } 

        } 

    }
}
