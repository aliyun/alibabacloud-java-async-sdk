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
         * QosRules.
         */
        public Builder qosRules(java.util.List<QosRules> qosRules) {
            this.qosRules = qosRules;
            return this;
        }

        /**
         * RequestId.
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
            private String download; 
            private String networkPackageId; 
            private String qosRuleId; 
            private String qosRuleName; 
            private String upload; 

            private Builder() {
            } 

            private Builder(QosRules model) {
                this.desktopCount = model.desktopCount;
                this.download = model.download;
                this.networkPackageId = model.networkPackageId;
                this.qosRuleId = model.qosRuleId;
                this.qosRuleName = model.qosRuleName;
                this.upload = model.upload;
            } 

            /**
             * DesktopCount.
             */
            public Builder desktopCount(String desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * Download.
             */
            public Builder download(String download) {
                this.download = download;
                return this;
            }

            /**
             * NetworkPackageId.
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * QosRuleId.
             */
            public Builder qosRuleId(String qosRuleId) {
                this.qosRuleId = qosRuleId;
                return this;
            }

            /**
             * QosRuleName.
             */
            public Builder qosRuleName(String qosRuleName) {
                this.qosRuleName = qosRuleName;
                return this;
            }

            /**
             * Upload.
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
