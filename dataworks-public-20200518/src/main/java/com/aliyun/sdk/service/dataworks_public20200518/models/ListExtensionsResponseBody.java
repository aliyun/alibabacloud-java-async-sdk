// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
    @NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @NameInMap("RequestId")
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
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExtensionsResponseBody build() {
            return new ListExtensionsResponseBody(this);
        } 

    } 

    public static class BindEventList extends TeaModel {
        @NameInMap("EventCode")
        private String eventCode;

        @NameInMap("EventName")
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
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * EventName.
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
    public static class Extensions extends TeaModel {
        @NameInMap("BindEventList")
        private java.util.List < BindEventList> bindEventList;

        @NameInMap("ExtensionCode")
        private String extensionCode;

        @NameInMap("ExtensionDesc")
        private String extensionDesc;

        @NameInMap("ExtensionName")
        private String extensionName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Status")
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
        public java.util.List < BindEventList> getBindEventList() {
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
            private java.util.List < BindEventList> bindEventList; 
            private String extensionCode; 
            private String extensionDesc; 
            private String extensionName; 
            private String owner; 
            private Integer status; 

            /**
             * BindEventList.
             */
            public Builder bindEventList(java.util.List < BindEventList> bindEventList) {
                this.bindEventList = bindEventList;
                return this;
            }

            /**
             * ExtensionCode.
             */
            public Builder extensionCode(String extensionCode) {
                this.extensionCode = extensionCode;
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
             * ExtensionName.
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Status.
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
    public static class PagingInfo extends TeaModel {
        @NameInMap("Extensions")
        private java.util.List < Extensions> extensions;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Extensions> extensions; 
            private Integer pageNumber; 
            private Integer pageSize; 
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
             * TotalCount.
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
