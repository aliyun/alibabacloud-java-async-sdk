// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AdadaAResponseBody} extends {@link TeaModel}
 *
 * <p>AdadaAResponseBody</p>
 */
public class AdadaAResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("result")
    private String result;

    @NameInMap("success")
    private Boolean success;

    private AdadaAResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdadaAResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AdadaAResponseBody build() {
            return new AdadaAResponseBody(this);
        } 

    } 

}
