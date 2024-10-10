// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckResultResponseBody</p>
 */
public class DescribeCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckResultList")
    private java.util.List < CheckResultList> checkResultList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCheckResultResponseBody(Builder builder) {
        this.checkResultList = builder.checkResultList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkResultList
     */
    public java.util.List < CheckResultList> getCheckResultList() {
        return this.checkResultList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CheckResultList> checkResultList; 
        private String requestId; 

        /**
         * <p>The check results.</p>
         */
        public Builder checkResultList(java.util.List < CheckResultList> checkResultList) {
            this.checkResultList = checkResultList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCheckResultResponseBody build() {
            return new DescribeCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCheckResultResponseBody</p>
     */
    public static class CheckResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceStatus")
        private Integer complianceStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CheckResultList(Builder builder) {
            this.complianceStatus = builder.complianceStatus;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckResultList create() {
            return builder().build();
        }

        /**
         * @return complianceStatus
         */
        public Integer getComplianceStatus() {
            return this.complianceStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer complianceStatus; 
            private String name; 

            /**
             * <p>The compliance status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: compliant</li>
             * <li><strong>0</strong>: non-compliant</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder complianceStatus(Integer complianceStatus) {
                this.complianceStatus = complianceStatus;
                return this;
            }

            /**
             * <p>The name of the corresponding section. Valid values:</p>
             * <ul>
             * <li><strong>information_classification</strong>: information classification</li>
             * <li><strong>information_mark</strong>: information labeling</li>
             * <li><strong>network_security_policy</strong>: access to networks and network services</li>
             * <li><strong>login_control</strong>: secure logon procedures</li>
             * <li><strong>week_password</strong>: password management system</li>
             * <li><strong>key_manage</strong>: key management</li>
             * <li><strong>malicious_software</strong>: protection against malware</li>
             * <li><strong>information_backup</strong>: information backup</li>
             * <li><strong>audit_policy</strong>: information system audit control mechanisms</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>information_mark</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CheckResultList build() {
                return new CheckResultList(this);
            } 

        } 

    }
}
