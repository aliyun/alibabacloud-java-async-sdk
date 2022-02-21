// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachStandardRoomHttpsCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>AttachStandardRoomHttpsCertificateResponseBody</p>
 */
public class AttachStandardRoomHttpsCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private AttachStandardRoomHttpsCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachStandardRoomHttpsCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public AttachStandardRoomHttpsCertificateResponseBody build() {
            return new AttachStandardRoomHttpsCertificateResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        private Result(Builder builder) {
            this.certificateId = builder.certificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        public static final class Builder {
            private String certificateId; 

            /**
             * 证书Id
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
