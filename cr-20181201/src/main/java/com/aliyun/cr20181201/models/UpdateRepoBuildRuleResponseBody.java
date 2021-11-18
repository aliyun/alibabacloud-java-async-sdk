// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateRepoBuildRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRepoBuildRuleResponseBody</p>
 */
public class UpdateRepoBuildRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("BuildRuleId")
    private String buildRuleId;


    private UpdateRepoBuildRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.buildRuleId = builder.buildRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoBuildRuleResponseBody create() {
        return builder().build();
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

    /**
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private String buildRuleId; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Build Rules ID</p>
         */
        public Builder buildRuleId(String buildRuleId) {
            this.buildRuleId = buildRuleId;
            return this;
        }

        public UpdateRepoBuildRuleResponseBody build() {
            return new UpdateRepoBuildRuleResponseBody(this);
        } 

    } 

}
