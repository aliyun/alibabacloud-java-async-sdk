// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProduceAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>ListProduceAuthorizationResponseBody</p>
 */
public class ListProduceAuthorizationResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private ListProduceAuthorizationResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProduceAuthorizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private java.util.List < Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListProduceAuthorizationResponseBody build() {
            return new ListProduceAuthorizationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuthorizedUserId")
        private String authorizedUserId;

        @NameInMap("AuthorizedUserName")
        private String authorizedUserName;

        private Data(Builder builder) {
            this.authorizedUserId = builder.authorizedUserId;
            this.authorizedUserName = builder.authorizedUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizedUserId
         */
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        /**
         * @return authorizedUserName
         */
        public String getAuthorizedUserName() {
            return this.authorizedUserName;
        }

        public static final class Builder {
            private String authorizedUserId; 
            private String authorizedUserName; 

            /**
             * AuthorizedUserId.
             */
            public Builder authorizedUserId(String authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * AuthorizedUserName.
             */
            public Builder authorizedUserName(String authorizedUserName) {
                this.authorizedUserName = authorizedUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
