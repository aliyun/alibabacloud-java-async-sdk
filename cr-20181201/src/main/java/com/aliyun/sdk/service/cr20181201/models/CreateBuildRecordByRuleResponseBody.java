// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBuildRecordByRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBuildRecordByRuleResponseBody</p>
 */
public class CreateBuildRecordByRuleResponseBody extends TeaModel {
    @NameInMap("BuildRecordId")
    private String buildRecordId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBuildRecordByRuleResponseBody(Builder builder) {
        this.buildRecordId = builder.buildRecordId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBuildRecordByRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return this.buildRecordId;
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
        private String buildRecordId; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * The ID of the image building record.
         */
        public Builder buildRecordId(String buildRecordId) {
            this.buildRecordId = buildRecordId;
            return this;
        }

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBuildRecordByRuleResponseBody build() {
            return new CreateBuildRecordByRuleResponseBody(this);
        } 

    } 

}
