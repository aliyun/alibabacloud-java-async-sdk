// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DeleteCompliancePacksResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCompliancePacksResponseBody</p>
 */
public class DeleteCompliancePacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperateCompliancePacksResult")
    private OperateCompliancePacksResult operateCompliancePacksResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCompliancePacksResponseBody(Builder builder) {
        this.operateCompliancePacksResult = builder.operateCompliancePacksResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCompliancePacksResponseBody create() {
        return builder().build();
    }

    /**
     * @return operateCompliancePacksResult
     */
    public OperateCompliancePacksResult getOperateCompliancePacksResult() {
        return this.operateCompliancePacksResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OperateCompliancePacksResult operateCompliancePacksResult; 
        private String requestId; 

        /**
         * <p>The returned result.</p>
         */
        public Builder operateCompliancePacksResult(OperateCompliancePacksResult operateCompliancePacksResult) {
            this.operateCompliancePacksResult = operateCompliancePacksResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCompliancePacksResponseBody build() {
            return new DeleteCompliancePacksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteCompliancePacksResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteCompliancePacksResponseBody</p>
     */
    public static class OperateCompliancePacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private OperateCompliancePacks(Builder builder) {
            this.compliancePackId = builder.compliancePackId;
            this.errorCode = builder.errorCode;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateCompliancePacks create() {
            return builder().build();
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String compliancePackId; 
            private String errorCode; 
            private Boolean success; 

            /**
             * <p>The ID of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-541e626622af0087****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * <ul>
             * <li>If the compliance package is deleted, no error code is returned.</li>
             * <li>If the compliance package fails to be deleted, an error code is returned. For more information about error codes, see <a href="https://error-center.alibabacloud.com/status/product/Config">Error codes</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CompliancePackAlreadyPending</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li>true: The request was successful.</li>
             * <li>false: The request failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public OperateCompliancePacks build() {
                return new OperateCompliancePacks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteCompliancePacksResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteCompliancePacksResponseBody</p>
     */
    public static class OperateCompliancePacksResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateCompliancePacks")
        private java.util.List<OperateCompliancePacks> operateCompliancePacks;

        private OperateCompliancePacksResult(Builder builder) {
            this.operateCompliancePacks = builder.operateCompliancePacks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateCompliancePacksResult create() {
            return builder().build();
        }

        /**
         * @return operateCompliancePacks
         */
        public java.util.List<OperateCompliancePacks> getOperateCompliancePacks() {
            return this.operateCompliancePacks;
        }

        public static final class Builder {
            private java.util.List<OperateCompliancePacks> operateCompliancePacks; 

            /**
             * <p>An array that contains compliance packages that are deleted.</p>
             */
            public Builder operateCompliancePacks(java.util.List<OperateCompliancePacks> operateCompliancePacks) {
                this.operateCompliancePacks = operateCompliancePacks;
                return this;
            }

            public OperateCompliancePacksResult build() {
                return new OperateCompliancePacksResult(this);
            } 

        } 

    }
}
