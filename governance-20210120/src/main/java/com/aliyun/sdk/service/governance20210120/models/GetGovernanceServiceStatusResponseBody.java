// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link GetGovernanceServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetGovernanceServiceStatusResponseBody</p>
 */
public class GetGovernanceServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailureCode")
    private String failureCode;

    @com.aliyun.core.annotation.NameInMap("FailureMessage")
    private String failureMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
    private String serviceStatus;

    private GetGovernanceServiceStatusResponseBody(Builder builder) {
        this.failureCode = builder.failureCode;
        this.failureMessage = builder.failureMessage;
        this.requestId = builder.requestId;
        this.serviceStatus = builder.serviceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceServiceStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failureCode
     */
    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * @return failureMessage
     */
    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public static final class Builder {
        private String failureCode; 
        private String failureMessage; 
        private String requestId; 
        private String serviceStatus; 

        private Builder() {
        } 

        private Builder(GetGovernanceServiceStatusResponseBody model) {
            this.failureCode = model.failureCode;
            this.failureMessage = model.failureMessage;
            this.requestId = model.requestId;
            this.serviceStatus = model.serviceStatus;
        } 

        /**
         * <p>业务失败原因码。EnableFailed 或 DisableFailed 时返回；其他状态可省略。Enabling 自动补偿期间可返回最近一次补偿异常码，但仍属于进行中状态。</p>
         * 
         * <strong>example:</strong>
         * <p>Governance.DisableFailed</p>
         */
        public Builder failureCode(String failureCode) {
            this.failureCode = failureCode;
            return this;
        }

        /**
         * <p>可供调用方理解和处理的安全业务失败原因。EnableFailed 或 DisableFailed 时返回；其他状态可省略。Enabling 自动补偿期间可返回最近一次补偿异常说明。</p>
         * 
         * <strong>example:</strong>
         * <p>The service could not be disabled. Query the service status before retrying. If the problem persists, submit a ticket.</p>
         */
        public Builder failureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>AI 云治理中心服务状态。Enabled：AI 云治理中心和治理成熟度检测均开通成功；Disabled：从未开通或已正常关闭；EnableFailed：开通失败且已自动清理本次开通部分，可重新完整开通；DisableFailed：关闭失败，可能存在部分已关闭状态，可重试关闭，不能直接开通；Enabling：开通或失败后的自动补偿进行中，补偿失败仍保留该状态并继续补偿；Disabling：关闭进行中。Enabling/Disabling 需继续轮询，其他四态为结果状态。既有开通记录保持原有兼容口径；本次 API 新发起开通严格在两项均成功后返回 Enabled。</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        public GetGovernanceServiceStatusResponseBody build() {
            return new GetGovernanceServiceStatusResponseBody(this);
        } 

    } 

}
