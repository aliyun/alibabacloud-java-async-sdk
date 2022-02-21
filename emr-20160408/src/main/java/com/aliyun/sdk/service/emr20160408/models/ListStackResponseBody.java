// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackResponseBody</p>
 */
public class ListStackResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackList")
    private StackList stackList;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListStackResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stackList = builder.stackList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackResponseBody create() {
        return builder().build();
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
     * @return stackList
     */
    public StackList getStackList() {
        return this.stackList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private StackList stackList; 
        private Integer totalCount; 

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
         * StackList.
         */
        public Builder stackList(StackList stackList) {
            this.stackList = stackList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackResponseBody build() {
            return new ListStackResponseBody(this);
        } 

    } 

    public static class Stack extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("Version")
        private String version;

        private Stack(Builder builder) {
            this.name = builder.name;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stack create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String status; 
            private String version; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Stack build() {
                return new Stack(this);
            } 

        } 

    }
    public static class StackList extends TeaModel {
        @NameInMap("Stack")
        private java.util.List < Stack> stack;

        private StackList(Builder builder) {
            this.stack = builder.stack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackList create() {
            return builder().build();
        }

        /**
         * @return stack
         */
        public java.util.List < Stack> getStack() {
            return this.stack;
        }

        public static final class Builder {
            private java.util.List < Stack> stack; 

            /**
             * Stack.
             */
            public Builder stack(java.util.List < Stack> stack) {
                this.stack = stack;
                return this;
            }

            public StackList build() {
                return new StackList(this);
            } 

        } 

    }
}
