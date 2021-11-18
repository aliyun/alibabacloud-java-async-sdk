// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateBuildRecordByRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBuildRecordByRuleResponseBody</p>
 */
public class CreateBuildRecordByRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("BuildRecordId")
    private String buildRecordId;


    private CreateBuildRecordByRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.buildRecordId = builder.buildRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBuildRecordByRuleResponseBody create() {
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
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private String buildRecordId; 

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
         * <p>Build record ID</p>
         */
        public Builder buildRecordId(String buildRecordId) {
            this.buildRecordId = buildRecordId;
            return this;
        }

        public CreateBuildRecordByRuleResponseBody build() {
            return new CreateBuildRecordByRuleResponseBody(this);
        } 

    } 

}
