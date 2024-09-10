// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The check results.
         */
        public Builder checkResultList(java.util.List < CheckResultList> checkResultList) {
            this.checkResultList = checkResultList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCheckResultResponseBody build() {
            return new DescribeCheckResultResponseBody(this);
        } 

    } 

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
             * The compliance status. Valid values:
             * <p>
             * 
             * *   **1**: compliant
             * *   **0**: non-compliant
             */
            public Builder complianceStatus(Integer complianceStatus) {
                this.complianceStatus = complianceStatus;
                return this;
            }

            /**
             * The name of the corresponding section. Valid values:
             * <p>
             * 
             * *   **information_classification**: information classification
             * *   **information_mark**: information labeling
             * *   **network_security_policy**: access to networks and network services
             * *   **login_control**: secure logon procedures
             * *   **week_password**: password management system
             * *   **key_manage**: key management
             * *   **malicious_software**: protection against malware
             * *   **information_backup**: information backup
             * *   **audit_policy**: information system audit control mechanisms
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
