// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectionalDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListDirectionalDetailResponseBody</p>
 */
public class ListDirectionalDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LocalizedMessage")
    private String localizedMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDirectionalDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.localizedMessage = builder.localizedMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectionalDetailResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return localizedMessage
     */
    public String getLocalizedMessage() {
        return this.localizedMessage;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String localizedMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * LocalizedMessage.
         */
        public Builder localizedMessage(String localizedMessage) {
            this.localizedMessage = localizedMessage;
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
         * 必填
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDirectionalDetailResponseBody build() {
            return new ListDirectionalDetailResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("AddressType")
        private String addressType;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Source")
        private String source;

        @NameInMap("State")
        private String state;

        private List(Builder builder) {
            this.address = builder.address;
            this.addressType = builder.addressType;
            this.groupId = builder.groupId;
            this.source = builder.source;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String address; 
            private String addressType; 
            private String groupId; 
            private String source; 
            private String state; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AddressType.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PaginationResult extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private PaginationResult(Builder builder) {
            this.list = builder.list;
            this.pageCount = builder.pageCount;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaginationResult create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageCount; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PaginationResult build() {
                return new PaginationResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DirectionalGroupId")
        private Long directionalGroupId;

        @NameInMap("DirectionalName")
        private String directionalName;

        @NameInMap("PaginationResult")
        private PaginationResult paginationResult;

        private Data(Builder builder) {
            this.directionalGroupId = builder.directionalGroupId;
            this.directionalName = builder.directionalName;
            this.paginationResult = builder.paginationResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return directionalGroupId
         */
        public Long getDirectionalGroupId() {
            return this.directionalGroupId;
        }

        /**
         * @return directionalName
         */
        public String getDirectionalName() {
            return this.directionalName;
        }

        /**
         * @return paginationResult
         */
        public PaginationResult getPaginationResult() {
            return this.paginationResult;
        }

        public static final class Builder {
            private Long directionalGroupId; 
            private String directionalName; 
            private PaginationResult paginationResult; 

            /**
             * DirectionalGroupId.
             */
            public Builder directionalGroupId(Long directionalGroupId) {
                this.directionalGroupId = directionalGroupId;
                return this;
            }

            /**
             * DirectionalName.
             */
            public Builder directionalName(String directionalName) {
                this.directionalName = directionalName;
                return this;
            }

            /**
             * PaginationResult.
             */
            public Builder paginationResult(PaginationResult paginationResult) {
                this.paginationResult = paginationResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
