// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link CheckDisposableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDisposableResponseBody</p>
 */
public class CheckDisposableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsDisposable")
    private String isDisposable;

    @com.aliyun.core.annotation.NameInMap("IsFormatValid")
    private String isFormatValid;

    @com.aliyun.core.annotation.NameInMap("IsMxValid")
    private String isMxValid;

    @com.aliyun.core.annotation.NameInMap("IsOkToSend")
    private String isOkToSend;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckDisposableResponseBody(Builder builder) {
        this.isDisposable = builder.isDisposable;
        this.isFormatValid = builder.isFormatValid;
        this.isMxValid = builder.isMxValid;
        this.isOkToSend = builder.isOkToSend;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDisposableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDisposable
     */
    public String getIsDisposable() {
        return this.isDisposable;
    }

    /**
     * @return isFormatValid
     */
    public String getIsFormatValid() {
        return this.isFormatValid;
    }

    /**
     * @return isMxValid
     */
    public String getIsMxValid() {
        return this.isMxValid;
    }

    /**
     * @return isOkToSend
     */
    public String getIsOkToSend() {
        return this.isOkToSend;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String isDisposable; 
        private String isFormatValid; 
        private String isMxValid; 
        private String isOkToSend; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckDisposableResponseBody model) {
            this.isDisposable = model.isDisposable;
            this.isFormatValid = model.isFormatValid;
            this.isMxValid = model.isMxValid;
            this.isOkToSend = model.isOkToSend;
            this.requestId = model.requestId;
        } 

        /**
         * IsDisposable.
         */
        public Builder isDisposable(String isDisposable) {
            this.isDisposable = isDisposable;
            return this;
        }

        /**
         * IsFormatValid.
         */
        public Builder isFormatValid(String isFormatValid) {
            this.isFormatValid = isFormatValid;
            return this;
        }

        /**
         * IsMxValid.
         */
        public Builder isMxValid(String isMxValid) {
            this.isMxValid = isMxValid;
            return this;
        }

        /**
         * IsOkToSend.
         */
        public Builder isOkToSend(String isOkToSend) {
            this.isOkToSend = isOkToSend;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDisposableResponseBody build() {
            return new CheckDisposableResponseBody(this);
        } 

    } 

}
