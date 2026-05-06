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
 * {@link ListKeylessServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListKeylessServersResponseBody</p>
 */
public class ListKeylessServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListKeylessServersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeylessServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
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
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Long siteId; 
        private String siteName; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListKeylessServersResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.result = model.result;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteName.
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKeylessServersResponseBody build() {
            return new ListKeylessServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKeylessServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListKeylessServersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaCertificate")
        private String caCertificate;

        @com.aliyun.core.annotation.NameInMap("ClientCertificate")
        private String clientCertificate;

        @com.aliyun.core.annotation.NameInMap("ClientPrivateKey")
        private String clientPrivateKey;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Verify")
        private Boolean verify;

        private Result(Builder builder) {
            this.caCertificate = builder.caCertificate;
            this.clientCertificate = builder.clientCertificate;
            this.clientPrivateKey = builder.clientPrivateKey;
            this.createTime = builder.createTime;
            this.host = builder.host;
            this.id = builder.id;
            this.name = builder.name;
            this.port = builder.port;
            this.updateTime = builder.updateTime;
            this.verify = builder.verify;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return caCertificate
         */
        public String getCaCertificate() {
            return this.caCertificate;
        }

        /**
         * @return clientCertificate
         */
        public String getClientCertificate() {
            return this.clientCertificate;
        }

        /**
         * @return clientPrivateKey
         */
        public String getClientPrivateKey() {
            return this.clientPrivateKey;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verify
         */
        public Boolean getVerify() {
            return this.verify;
        }

        public static final class Builder {
            private String caCertificate; 
            private String clientCertificate; 
            private String clientPrivateKey; 
            private String createTime; 
            private String host; 
            private String id; 
            private String name; 
            private Long port; 
            private String updateTime; 
            private Boolean verify; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.caCertificate = model.caCertificate;
                this.clientCertificate = model.clientCertificate;
                this.clientPrivateKey = model.clientPrivateKey;
                this.createTime = model.createTime;
                this.host = model.host;
                this.id = model.id;
                this.name = model.name;
                this.port = model.port;
                this.updateTime = model.updateTime;
                this.verify = model.verify;
            } 

            /**
             * CaCertificate.
             */
            public Builder caCertificate(String caCertificate) {
                this.caCertificate = caCertificate;
                return this;
            }

            /**
             * ClientCertificate.
             */
            public Builder clientCertificate(String clientCertificate) {
                this.clientCertificate = clientCertificate;
                return this;
            }

            /**
             * ClientPrivateKey.
             */
            public Builder clientPrivateKey(String clientPrivateKey) {
                this.clientPrivateKey = clientPrivateKey;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Keyless server ID。</p>
             * 
             * <strong>example:</strong>
             * <p>babab9db65ee5efcca9f3d41d4b5****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Verify.
             */
            public Builder verify(Boolean verify) {
                this.verify = verify;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
