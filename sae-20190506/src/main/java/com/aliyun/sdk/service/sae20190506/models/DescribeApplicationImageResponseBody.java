// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationImageResponseBody</p>
 */
public class DescribeApplicationImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationImageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationImageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>3xx</strong>: The request was redirected.</p>
         * </li>
         * <li><p><strong>4xx</strong>: A client-side error occurred.</p>
         * </li>
         * <li><p><strong>5xx</strong>: A server-side error occurred.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The application image information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * <ul>
         * <li><p>This parameter is left empty if the request is successful.</p>
         * </li>
         * <li><p>This parameter returns an error code if the request fails. For more information, see the <strong>Error codes</strong> section of this topic.</p>
         * </li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li><p><strong>success</strong> is returned if the request is successful.</p>
         * </li>
         * <li><p>An error code is returned if the request fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID that is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationImageResponseBody build() {
            return new DescribeApplicationImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationImageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationImageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrUrl")
        private String crUrl;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private String logo;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RepoOriginType")
        private String repoOriginType;

        @com.aliyun.core.annotation.NameInMap("RepoTag")
        private String repoTag;

        @com.aliyun.core.annotation.NameInMap("RepoType")
        private String repoType;

        private Data(Builder builder) {
            this.crUrl = builder.crUrl;
            this.logo = builder.logo;
            this.regionId = builder.regionId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoOriginType = builder.repoOriginType;
            this.repoTag = builder.repoTag;
            this.repoType = builder.repoType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return crUrl
         */
        public String getCrUrl() {
            return this.crUrl;
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return repoOriginType
         */
        public String getRepoOriginType() {
            return this.repoOriginType;
        }

        /**
         * @return repoTag
         */
        public String getRepoTag() {
            return this.repoTag;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        public static final class Builder {
            private String crUrl; 
            private String logo; 
            private String regionId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoOriginType; 
            private String repoTag; 
            private String repoType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.crUrl = model.crUrl;
                this.logo = model.logo;
                this.regionId = model.regionId;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.repoOriginType = model.repoOriginType;
                this.repoTag = model.repoTag;
                this.repoType = model.repoType;
            } 

            /**
             * <p>This parameter is reserved.</p>
             */
            public Builder crUrl(String crUrl) {
                this.crUrl = crUrl;
                return this;
            }

            /**
             * <p>This parameter is reserved.</p>
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The image repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The image namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The image repository type. Currently, only Container Registry is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ALI_HUB</p>
             */
            public Builder repoOriginType(String repoOriginType) {
                this.repoOriginType = repoOriginType;
                return this;
            }

            /**
             * <p>The image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder repoTag(String repoTag) {
                this.repoTag = repoTag;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
