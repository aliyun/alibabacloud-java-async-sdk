// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link VerifyPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyPlaybookResponseBody</p>
 */
public class VerifyPlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckTaskInfos")
    private java.util.List<CheckTaskInfos> checkTaskInfos;

    @com.aliyun.core.annotation.NameInMap("Prerequisites")
    private java.util.List<Prerequisites> prerequisites;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifyPlaybookResponseBody(Builder builder) {
        this.checkTaskInfos = builder.checkTaskInfos;
        this.prerequisites = builder.prerequisites;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPlaybookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkTaskInfos
     */
    public java.util.List<CheckTaskInfos> getCheckTaskInfos() {
        return this.checkTaskInfos;
    }

    /**
     * @return prerequisites
     */
    public java.util.List<Prerequisites> getPrerequisites() {
        return this.prerequisites;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CheckTaskInfos> checkTaskInfos; 
        private java.util.List<Prerequisites> prerequisites; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(VerifyPlaybookResponseBody model) {
            this.checkTaskInfos = model.checkTaskInfos;
            this.prerequisites = model.prerequisites;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result of the verification.</p>
         */
        public Builder checkTaskInfos(java.util.List<CheckTaskInfos> checkTaskInfos) {
            this.checkTaskInfos = checkTaskInfos;
            return this;
        }

        /**
         * Prerequisites.
         */
        public Builder prerequisites(java.util.List<Prerequisites> prerequisites) {
            this.prerequisites = prerequisites;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0DFC9403-54EB-5672-B690-9AA93C9EBB54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyPlaybookResponseBody build() {
            return new VerifyPlaybookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyPlaybookResponseBody</p>
     */
    public static class CheckTaskInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private CheckTaskInfos(Builder builder) {
            this.detail = builder.detail;
            this.nodeName = builder.nodeName;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckTaskInfos create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String detail; 
            private String nodeName; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(CheckTaskInfos model) {
                this.detail = model.detail;
                this.nodeName = model.nodeName;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The error message returned when the playbook does not pass the check.</p>
             * 
             * <strong>example:</strong>
             * <p>Node [python3_3] doesn&quot;t have the asset information</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The name of the node in the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>python3_3</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The severity level of the verification information. Valid values:</p>
             * <ul>
             * <li>warn: An issue may occur during playbook running.</li>
             * <li>error: The playbook cannot be compiled.</li>
             * <li>remind: The publishing and running of the playbook are not affected. We recommend that you optimize the playbook format.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public CheckTaskInfos build() {
                return new CheckTaskInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyPlaybookResponseBody</p>
     */
    public static class Prerequisites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrerequisiteType")
        private String prerequisiteType;

        @com.aliyun.core.annotation.NameInMap("PrerequisiteValue")
        private String prerequisiteValue;

        private Prerequisites(Builder builder) {
            this.prerequisiteType = builder.prerequisiteType;
            this.prerequisiteValue = builder.prerequisiteValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prerequisites create() {
            return builder().build();
        }

        /**
         * @return prerequisiteType
         */
        public String getPrerequisiteType() {
            return this.prerequisiteType;
        }

        /**
         * @return prerequisiteValue
         */
        public String getPrerequisiteValue() {
            return this.prerequisiteValue;
        }

        public static final class Builder {
            private String prerequisiteType; 
            private String prerequisiteValue; 

            private Builder() {
            } 

            private Builder(Prerequisites model) {
                this.prerequisiteType = model.prerequisiteType;
                this.prerequisiteValue = model.prerequisiteValue;
            } 

            /**
             * PrerequisiteType.
             */
            public Builder prerequisiteType(String prerequisiteType) {
                this.prerequisiteType = prerequisiteType;
                return this;
            }

            /**
             * PrerequisiteValue.
             */
            public Builder prerequisiteValue(String prerequisiteValue) {
                this.prerequisiteValue = prerequisiteValue;
                return this;
            }

            public Prerequisites build() {
                return new Prerequisites(this);
            } 

        } 

    }
}
