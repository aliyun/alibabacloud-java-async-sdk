// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ApplyCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyCertificateResponseBody</p>
 */
public class ApplyCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ApplyCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.siteName = builder.siteName;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCertificateResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private String siteName; 
        private Long totalCount; 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of free certificate application details.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Site name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * <p>Number of certificates applied for, which is the same as the number of input domains.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ApplyCertificateResponseBody build() {
            return new ApplyCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyCertificateResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.domain = builder.domain;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String domain; 
            private String id; 
            private String status; 

            /**
             * <p>Certificate domain.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30000478</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Status of the certificate application.</p>
             * 
             * <strong>example:</strong>
             * <p>Applying</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
