// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeNebulaAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeNebulaAppsResponseBody</p>
 */
public class ListMcubeNebulaAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListMcubeNebulaAppsResult")
    private ListMcubeNebulaAppsResult listMcubeNebulaAppsResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeNebulaAppsResponseBody(Builder builder) {
        this.listMcubeNebulaAppsResult = builder.listMcubeNebulaAppsResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeNebulaAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return listMcubeNebulaAppsResult
     */
    public ListMcubeNebulaAppsResult getListMcubeNebulaAppsResult() {
        return this.listMcubeNebulaAppsResult;
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
        private ListMcubeNebulaAppsResult listMcubeNebulaAppsResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListMcubeNebulaAppsResult.
         */
        public Builder listMcubeNebulaAppsResult(ListMcubeNebulaAppsResult listMcubeNebulaAppsResult) {
            this.listMcubeNebulaAppsResult = listMcubeNebulaAppsResult;
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

        public ListMcubeNebulaAppsResponseBody build() {
            return new ListMcubeNebulaAppsResponseBody(this);
        } 

    } 

    public static class NebulaAppInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H5Id")
        private String h5Id;

        @com.aliyun.core.annotation.NameInMap("H5Name")
        private String h5Name;

        private NebulaAppInfos(Builder builder) {
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NebulaAppInfos create() {
            return builder().build();
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
            private String h5Id; 
            private String h5Name; 

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

            public NebulaAppInfos build() {
                return new NebulaAppInfos(this);
            } 

        } 

    }
    public static class ListMcubeNebulaAppsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("NebulaAppInfos")
        private java.util.List < NebulaAppInfos> nebulaAppInfos;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ListMcubeNebulaAppsResult(Builder builder) {
            this.currentPage = builder.currentPage;
            this.errorCode = builder.errorCode;
            this.hasMore = builder.hasMore;
            this.nebulaAppInfos = builder.nebulaAppInfos;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListMcubeNebulaAppsResult create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return nebulaAppInfos
         */
        public java.util.List < NebulaAppInfos> getNebulaAppInfos() {
            return this.nebulaAppInfos;
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
            private String errorCode; 
            private Boolean hasMore; 
            private java.util.List < NebulaAppInfos> nebulaAppInfos; 
            private Integer pageSize; 
            private String requestId; 
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * NebulaAppInfos.
             */
            public Builder nebulaAppInfos(java.util.List < NebulaAppInfos> nebulaAppInfos) {
                this.nebulaAppInfos = nebulaAppInfos;
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

            public ListMcubeNebulaAppsResult build() {
                return new ListMcubeNebulaAppsResult(this);
            } 

        } 

    }
}
