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
 * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespacesResponseBody</p>
 */
public class DescribeNamespacesResponseBody extends TeaModel {
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

    private DescribeNamespacesResponseBody(Builder builder) {
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

    public static DescribeNamespacesResponseBody create() {
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

        private Builder(DescribeNamespacesResponseBody model) {
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
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
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
         * <p>The information of namespaces.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
         * <li>An error code: If the call fails, an error code is returned.</li>
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
         * <p>Indicates whether the list of namespaces was queried. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The list was queried.</li>
         * <li><strong>false</strong>: The list failed to be queried.</li>
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
         * <p>The trace ID that is used to query the details of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a981dd515966966104121683d****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeNamespacesResponseBody build() {
            return new DescribeNamespacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class Namespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("AddressServerHost")
        private String addressServerHost;

        @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
        private String nameSpaceShortId;

        @com.aliyun.core.annotation.NameInMap("NamespaceDescription")
        private String namespaceDescription;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private Namespaces(Builder builder) {
            this.accessKey = builder.accessKey;
            this.addressServerHost = builder.addressServerHost;
            this.nameSpaceShortId = builder.nameSpaceShortId;
            this.namespaceDescription = builder.namespaceDescription;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.regionId = builder.regionId;
            this.secretKey = builder.secretKey;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return addressServerHost
         */
        public String getAddressServerHost() {
            return this.addressServerHost;
        }

        /**
         * @return nameSpaceShortId
         */
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        /**
         * @return namespaceDescription
         */
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String accessKey; 
            private String addressServerHost; 
            private String nameSpaceShortId; 
            private String namespaceDescription; 
            private String namespaceId; 
            private String namespaceName; 
            private String regionId; 
            private String secretKey; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(Namespaces model) {
                this.accessKey = model.accessKey;
                this.addressServerHost = model.addressServerHost;
                this.nameSpaceShortId = model.nameSpaceShortId;
                this.namespaceDescription = model.namespaceDescription;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
                this.regionId = model.regionId;
                this.secretKey = model.secretKey;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The ACM-specific AccessKey ID. It can be used to manage data in an Application Configuration Management (ACM) namespace. For more information, see <a href="https://help.aliyun.com/document_detail/68941.html">Differences between Alibaba Cloud AccessKey and ACM-specific AccessKey</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>b34dbe3315c64f9f99b58ea447ec****</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The endpoint of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>addr-bj-internal.edas.aliyun.com</p>
             */
            public Builder addressServerHost(String addressServerHost) {
                this.addressServerHost = addressServerHost;
                return this;
            }

            /**
             * <p>The short ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nameSpaceShortId(String nameSpaceShortId) {
                this.nameSpaceShortId = nameSpaceShortId;
                return this;
            }

            /**
             * <p>The description of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder namespaceDescription(String namespaceDescription) {
                this.namespaceDescription = namespaceDescription;
                return this;
            }

            /**
             * <p>The ID of the namespace. You cannot query, modify, or delete the default namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
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
             * <p>The ACM-specific AccessKey secret. It can be used to manage data in an ACM namespace. For more information, see <a href="https://help.aliyun.com/document_detail/68941.html">Differences between Alibaba Cloud AccessKey and ACM-specific AccessKey</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>G/w6sseK7+nb3S6HBmANDBMD****</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>838cad95-973f-48fe-830b-2a8546d7****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List<Namespaces> namespaces;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.namespaces = builder.namespaces;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return namespaces
         */
        public java.util.List<Namespaces> getNamespaces() {
            return this.namespaces;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<Namespaces> namespaces; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.namespaces = model.namespaces;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The namespaces.</p>
             */
            public Builder namespaces(java.util.List<Namespaces> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of namespaces.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
