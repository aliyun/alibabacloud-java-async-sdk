// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeWhitelistsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeWhitelistsResponseBody</p>
 */
public class ListMcubeWhitelistsResponseBody extends TeaModel {
    @NameInMap("ListWhitelistResult")
    private ListWhitelistResult listWhitelistResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeWhitelistsResponseBody(Builder builder) {
        this.listWhitelistResult = builder.listWhitelistResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeWhitelistsResponseBody create() {
        return builder().build();
    }

    /**
     * @return listWhitelistResult
     */
    public ListWhitelistResult getListWhitelistResult() {
        return this.listWhitelistResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private ListWhitelistResult listWhitelistResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListWhitelistResult.
         */
        public Builder listWhitelistResult(ListWhitelistResult listWhitelistResult) {
            this.listWhitelistResult = listWhitelistResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ListMcubeWhitelistsResponseBody build() {
            return new ListMcubeWhitelistsResponseBody(this);
        } 

    } 

    public static class Whitelists extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("WhiteListCount")
        private Long whiteListCount;

        @NameInMap("WhiteListName")
        private String whiteListName;

        @NameInMap("WhitelistType")
        private String whitelistType;

        private Whitelists(Builder builder) {
            this.appCode = builder.appCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.whiteListCount = builder.whiteListCount;
            this.whiteListName = builder.whiteListName;
            this.whitelistType = builder.whitelistType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelists create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return whiteListCount
         */
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        /**
         * @return whiteListName
         */
        public String getWhiteListName() {
            return this.whiteListName;
        }

        /**
         * @return whitelistType
         */
        public String getWhitelistType() {
            return this.whitelistType;
        }

        public static final class Builder {
            private String appCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long whiteListCount; 
            private String whiteListName; 
            private String whitelistType; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * WhiteListCount.
             */
            public Builder whiteListCount(Long whiteListCount) {
                this.whiteListCount = whiteListCount;
                return this;
            }

            /**
             * WhiteListName.
             */
            public Builder whiteListName(String whiteListName) {
                this.whiteListName = whiteListName;
                return this;
            }

            /**
             * WhitelistType.
             */
            public Builder whitelistType(String whitelistType) {
                this.whitelistType = whitelistType;
                return this;
            }

            public Whitelists build() {
                return new Whitelists(this);
            } 

        } 

    }
    public static class ListWhitelistResult extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("Whitelists")
        private java.util.List < Whitelists> whitelists;

        private ListWhitelistResult(Builder builder) {
            this.currentPage = builder.currentPage;
            this.hasMore = builder.hasMore;
            this.pageSize = builder.pageSize;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
            this.whitelists = builder.whitelists;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListWhitelistResult create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return whitelists
         */
        public java.util.List < Whitelists> getWhitelists() {
            return this.whitelists;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Boolean hasMore; 
            private Integer pageSize; 
            private String resultMsg; 
            private Boolean success; 
            private Long totalCount; 
            private java.util.List < Whitelists> whitelists; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
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
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * Whitelists.
             */
            public Builder whitelists(java.util.List < Whitelists> whitelists) {
                this.whitelists = whitelists;
                return this;
            }

            public ListWhitelistResult build() {
                return new ListWhitelistResult(this);
            } 

        } 

    }
}
