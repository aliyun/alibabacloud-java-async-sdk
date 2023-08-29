// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeMiniAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeMiniAppsResponseBody</p>
 */
public class ListMcubeMiniAppsResponseBody extends TeaModel {
    @NameInMap("ListMiniResult")
    private ListMiniResult listMiniResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeMiniAppsResponseBody(Builder builder) {
        this.listMiniResult = builder.listMiniResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeMiniAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return listMiniResult
     */
    public ListMiniResult getListMiniResult() {
        return this.listMiniResult;
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
        private ListMiniResult listMiniResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListMiniResult.
         */
        public Builder listMiniResult(ListMiniResult listMiniResult) {
            this.listMiniResult = listMiniResult;
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

        public ListMcubeMiniAppsResponseBody build() {
            return new ListMcubeMiniAppsResponseBody(this);
        } 

    } 

    public static class MiniProgramList extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("H5Id")
        private String h5Id;

        @NameInMap("H5Name")
        private String h5Name;

        private MiniProgramList(Builder builder) {
            this.appCode = builder.appCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiniProgramList create() {
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
         * @return h5Id
         */
        public String getH5Id() {
            return this.h5Id;
        }

        /**
         * @return h5Name
         */
        public String getH5Name() {
            return this.h5Name;
        }

        public static final class Builder {
            private String appCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private String h5Id; 
            private String h5Name; 

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
             * H5Id.
             */
            public Builder h5Id(String h5Id) {
                this.h5Id = h5Id;
                return this;
            }

            /**
             * H5Name.
             */
            public Builder h5Name(String h5Name) {
                this.h5Name = h5Name;
                return this;
            }

            public MiniProgramList build() {
                return new MiniProgramList(this);
            } 

        } 

    }
    public static class ListMiniResult extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("MiniProgramList")
        private java.util.List < MiniProgramList> miniProgramList;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ListMiniResult(Builder builder) {
            this.currentPage = builder.currentPage;
            this.hasMore = builder.hasMore;
            this.miniProgramList = builder.miniProgramList;
            this.pageSize = builder.pageSize;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListMiniResult create() {
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
         * @return miniProgramList
         */
        public java.util.List < MiniProgramList> getMiniProgramList() {
            return this.miniProgramList;
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

        public static final class Builder {
            private Integer currentPage; 
            private Boolean hasMore; 
            private java.util.List < MiniProgramList> miniProgramList; 
            private Integer pageSize; 
            private String resultMsg; 
            private Boolean success; 
            private Long totalCount; 

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
             * MiniProgramList.
             */
            public Builder miniProgramList(java.util.List < MiniProgramList> miniProgramList) {
                this.miniProgramList = miniProgramList;
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

            public ListMiniResult build() {
                return new ListMiniResult(this);
            } 

        } 

    }
}
