// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExtensionsResponseBody</p>
 */
public class ListExtensionsResponseBody extends TeaModel {
    @NameInMap("Extensions")
    private java.util.List < Extensions> extensions;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListExtensionsResponseBody(Builder builder) {
        this.extensions = builder.extensions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExtensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return extensions
     */
    public java.util.List < Extensions> getExtensions() {
        return this.extensions;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List < Extensions> extensions; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Extensions.
         */
        public Builder extensions(java.util.List < Extensions> extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExtensionsResponseBody build() {
            return new ListExtensionsResponseBody(this);
        } 

    } 

    public static class Extensions extends TeaModel {
        @NameInMap("Enabled")
        private String enabled;

        @NameInMap("ExtensionDesc")
        private String extensionDesc;

        @NameInMap("ExtensionDocumentationLink")
        private String extensionDocumentationLink;

        @NameInMap("ExtensionId")
        private String extensionId;

        @NameInMap("ExtensionName")
        private String extensionName;

        private Extensions(Builder builder) {
            this.enabled = builder.enabled;
            this.extensionDesc = builder.extensionDesc;
            this.extensionDocumentationLink = builder.extensionDocumentationLink;
            this.extensionId = builder.extensionId;
            this.extensionName = builder.extensionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extensions create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return extensionDesc
         */
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        /**
         * @return extensionDocumentationLink
         */
        public String getExtensionDocumentationLink() {
            return this.extensionDocumentationLink;
        }

        /**
         * @return extensionId
         */
        public String getExtensionId() {
            return this.extensionId;
        }

        /**
         * @return extensionName
         */
        public String getExtensionName() {
            return this.extensionName;
        }

        public static final class Builder {
            private String enabled; 
            private String extensionDesc; 
            private String extensionDocumentationLink; 
            private String extensionId; 
            private String extensionName; 

            /**
             * Enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * ExtensionDesc.
             */
            public Builder extensionDesc(String extensionDesc) {
                this.extensionDesc = extensionDesc;
                return this;
            }

            /**
             * ExtensionDocumentationLink.
             */
            public Builder extensionDocumentationLink(String extensionDocumentationLink) {
                this.extensionDocumentationLink = extensionDocumentationLink;
                return this;
            }

            /**
             * ExtensionId.
             */
            public Builder extensionId(String extensionId) {
                this.extensionId = extensionId;
                return this;
            }

            /**
             * ExtensionName.
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
}
