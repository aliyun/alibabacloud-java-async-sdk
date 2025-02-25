// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExtensionsResponseBody</p>
 */
public class ListExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListExtensionsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExtensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExtensionsResponseBody build() {
            return new ListExtensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExtensionsResponseBody</p>
     */
    public static class BindEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        private BindEventList(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindEventList create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 

            /**
             * <p>The code of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>commit-file</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>File submission pre-event</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            public BindEventList build() {
                return new BindEventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExtensionsResponseBody</p>
     */
    public static class Extensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindEventList")
        private java.util.List<BindEventList> bindEventList;

        @com.aliyun.core.annotation.NameInMap("ExtensionCode")
        private String extensionCode;

        @com.aliyun.core.annotation.NameInMap("ExtensionDesc")
        private String extensionDesc;

        @com.aliyun.core.annotation.NameInMap("ExtensionName")
        private String extensionName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Extensions(Builder builder) {
            this.bindEventList = builder.bindEventList;
            this.extensionCode = builder.extensionCode;
            this.extensionDesc = builder.extensionDesc;
            this.extensionName = builder.extensionName;
            this.owner = builder.owner;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extensions create() {
            return builder().build();
        }

        /**
         * @return bindEventList
         */
        public java.util.List<BindEventList> getBindEventList() {
            return this.bindEventList;
        }

        /**
         * @return extensionCode
         */
        public String getExtensionCode() {
            return this.extensionCode;
        }

        /**
         * @return extensionDesc
         */
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        /**
         * @return extensionName
         */
        public String getExtensionName() {
            return this.extensionName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<BindEventList> bindEventList; 
            private String extensionCode; 
            private String extensionDesc; 
            private String extensionName; 
            private String owner; 
            private Integer status; 

            /**
             * <p>The list of extension point events.</p>
             */
            public Builder bindEventList(java.util.List<BindEventList> bindEventList) {
                this.bindEventList = bindEventList;
                return this;
            }

            /**
             * <p>The unique code of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>Extension Code</p>
             */
            public Builder extensionCode(String extensionCode) {
                this.extensionCode = extensionCode;
                return this;
            }

            /**
             * <p>The description of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a description</p>
             */
            public Builder extensionDesc(String extensionDesc) {
                this.extensionDesc = extensionDesc;
                return this;
            }

            /**
             * <p>The name of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>Extension name</p>
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>2003****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The state of the extension. Valid values: 0: Testing 1: Publishing 3: Disabled 4: Processing 5: Approved 6: Approve Failed</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExtensionsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extensions")
        private java.util.List<Extensions> extensions;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.extensions = builder.extensions;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return extensions
         */
        public java.util.List<Extensions> getExtensions() {
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Extensions> extensions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The list of extensions.</p>
             */
            public Builder extensions(java.util.List<Extensions> extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
