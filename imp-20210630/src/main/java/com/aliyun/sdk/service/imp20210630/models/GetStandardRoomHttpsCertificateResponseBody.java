// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStandardRoomHttpsCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardRoomHttpsCertificateResponseBody</p>
 */
public class GetStandardRoomHttpsCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetStandardRoomHttpsCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardRoomHttpsCertificateResponseBody create() {
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

        public GetStandardRoomHttpsCertificateResponseBody build() {
            return new GetStandardRoomHttpsCertificateResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CertificateName")
        private String certificateName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ExpireTime")
        private String expireTime;

        private Result(Builder builder) {
            this.certificateName = builder.certificateName;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.expireTime = builder.expireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        public static final class Builder {
            private String certificateName; 
            private String createTime; 
            private String domainName; 
            private String expireTime; 

            /**
             * 证书名称
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * 证书创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 使用证书的确切域名
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * 证书过期时间
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
