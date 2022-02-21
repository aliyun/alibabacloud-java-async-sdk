// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenerCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenerCertificatesResponseBody</p>
 */
public class ListListenerCertificatesResponseBody extends TeaModel {
    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenerCertificatesResponseBody(Builder builder) {
        this.certificates = builder.certificates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenerCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificates
     */
    public java.util.List < Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Certificates> certificates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * 监听SSL证书列表
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * 本次查询返回记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总记录数
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenerCertificatesResponseBody build() {
            return new ListListenerCertificatesResponseBody(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("CertificateType")
        private String certificateType;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Status")
        private String status;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateType = builder.certificateType;
            this.isDefault = builder.isDefault;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certificateId; 
            private String certificateType; 
            private Boolean isDefault; 
            private String status; 

            /**
             * 证书Id
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * 证书类型
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * 是否为默认证书
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * 证书状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
