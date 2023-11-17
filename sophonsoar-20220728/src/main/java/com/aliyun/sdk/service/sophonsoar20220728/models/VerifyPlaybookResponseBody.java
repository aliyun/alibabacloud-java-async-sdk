// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyPlaybookResponseBody</p>
 */
public class VerifyPlaybookResponseBody extends TeaModel {
    @NameInMap("CheckTaskInfos")
    private java.util.List < CheckTaskInfos> checkTaskInfos;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyPlaybookResponseBody(Builder builder) {
        this.checkTaskInfos = builder.checkTaskInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPlaybookResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkTaskInfos
     */
    public java.util.List < CheckTaskInfos> getCheckTaskInfos() {
        return this.checkTaskInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CheckTaskInfos> checkTaskInfos; 
        private String requestId; 

        /**
         * CheckTaskInfos.
         */
        public Builder checkTaskInfos(java.util.List < CheckTaskInfos> checkTaskInfos) {
            this.checkTaskInfos = checkTaskInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyPlaybookResponseBody build() {
            return new VerifyPlaybookResponseBody(this);
        } 

    } 

    public static class CheckTaskInfos extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("RiskLevel")
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

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * RiskLevel.
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
}
