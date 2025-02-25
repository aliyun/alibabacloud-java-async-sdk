// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link UpdateVideoConferenceSettingResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVideoConferenceSettingResponseBody</p>
 */
public class UpdateVideoConferenceSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("caseResult")
    private String caseResult;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private UpdateVideoConferenceSettingResponseBody(Builder builder) {
        this.caseResult = builder.caseResult;
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoConferenceSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return caseResult
     */
    public String getCaseResult() {
        return this.caseResult;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String caseResult; 
        private String code; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * caseResult.
         */
        public Builder caseResult(String caseResult) {
            this.caseResult = caseResult;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public UpdateVideoConferenceSettingResponseBody build() {
            return new UpdateVideoConferenceSettingResponseBody(this);
        } 

    } 

}
