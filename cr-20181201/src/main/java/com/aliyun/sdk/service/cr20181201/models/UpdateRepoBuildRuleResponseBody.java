// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepoBuildRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRepoBuildRuleResponseBody</p>
 */
public class UpdateRepoBuildRuleResponseBody extends TeaModel {
    @NameInMap("BuildRuleId")
    private String buildRuleId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateRepoBuildRuleResponseBody(Builder builder) {
        this.buildRuleId = builder.buildRuleId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoBuildRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String buildRuleId; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * BuildRuleId.
         */
        public Builder buildRuleId(String buildRuleId) {
            this.buildRuleId = buildRuleId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateRepoBuildRuleResponseBody build() {
            return new UpdateRepoBuildRuleResponseBody(this);
        } 

    } 

}
