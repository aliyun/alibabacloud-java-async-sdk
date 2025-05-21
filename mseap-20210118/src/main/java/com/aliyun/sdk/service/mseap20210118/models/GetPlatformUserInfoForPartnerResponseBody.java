// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link GetPlatformUserInfoForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetPlatformUserInfoForPartnerResponseBody</p>
 */
public class GetPlatformUserInfoForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptedOpenId")
    private String encryptedOpenId;

    @com.aliyun.core.annotation.NameInMap("EncryptedUnionId")
    private String encryptedUnionId;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPlatformUserInfoForPartnerResponseBody(Builder builder) {
        this.encryptedOpenId = builder.encryptedOpenId;
        this.encryptedUnionId = builder.encryptedUnionId;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlatformUserInfoForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptedOpenId
     */
    public String getEncryptedOpenId() {
        return this.encryptedOpenId;
    }

    /**
     * @return encryptedUnionId
     */
    public String getEncryptedUnionId() {
        return this.encryptedUnionId;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String encryptedOpenId; 
        private String encryptedUnionId; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPlatformUserInfoForPartnerResponseBody model) {
            this.encryptedOpenId = model.encryptedOpenId;
            this.encryptedUnionId = model.encryptedUnionId;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * EncryptedOpenId.
         */
        public Builder encryptedOpenId(String encryptedOpenId) {
            this.encryptedOpenId = encryptedOpenId;
            return this;
        }

        /**
         * EncryptedUnionId.
         */
        public Builder encryptedUnionId(String encryptedUnionId) {
            this.encryptedUnionId = encryptedUnionId;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0320C9F4-5EDC-5355-9D7E-DF4CF6C2B3BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>success</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPlatformUserInfoForPartnerResponseBody build() {
            return new GetPlatformUserInfoForPartnerResponseBody(this);
        } 

    } 

}
