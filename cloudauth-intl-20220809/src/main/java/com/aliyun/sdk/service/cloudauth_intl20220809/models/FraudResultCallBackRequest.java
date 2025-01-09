// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link FraudResultCallBackRequest} extends {@link RequestModel}
 *
 * <p>FraudResultCallBackRequest</p>
 */
public class FraudResultCallBackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtParams")
    private String extParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyDeployEnv")
    private String verifyDeployEnv;

    private FraudResultCallBackRequest(Builder builder) {
        super(builder);
        this.certifyId = builder.certifyId;
        this.extParams = builder.extParams;
        this.resultCode = builder.resultCode;
        this.verifyDeployEnv = builder.verifyDeployEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FraudResultCallBackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return extParams
     */
    public String getExtParams() {
        return this.extParams;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return verifyDeployEnv
     */
    public String getVerifyDeployEnv() {
        return this.verifyDeployEnv;
    }

    public static final class Builder extends Request.Builder<FraudResultCallBackRequest, Builder> {
        private String certifyId; 
        private String extParams; 
        private String resultCode; 
        private String verifyDeployEnv; 

        private Builder() {
            super();
        } 

        private Builder(FraudResultCallBackRequest request) {
            super(request);
            this.certifyId = request.certifyId;
            this.extParams = request.extParams;
            this.resultCode = request.resultCode;
            this.verifyDeployEnv = request.verifyDeployEnv;
        } 

        /**
         * CertifyId.
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * ExtParams.
         */
        public Builder extParams(String extParams) {
            this.putQueryParameter("ExtParams", extParams);
            this.extParams = extParams;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.putQueryParameter("ResultCode", resultCode);
            this.resultCode = resultCode;
            return this;
        }

        /**
         * VerifyDeployEnv.
         */
        public Builder verifyDeployEnv(String verifyDeployEnv) {
            this.putQueryParameter("VerifyDeployEnv", verifyDeployEnv);
            this.verifyDeployEnv = verifyDeployEnv;
            return this;
        }

        @Override
        public FraudResultCallBackRequest build() {
            return new FraudResultCallBackRequest(this);
        } 

    } 

}
