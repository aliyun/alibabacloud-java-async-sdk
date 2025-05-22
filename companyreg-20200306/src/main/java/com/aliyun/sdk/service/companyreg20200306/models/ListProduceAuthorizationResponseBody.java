// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link ListProduceAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>ListProduceAuthorizationResponseBody</p>
 */
public class ListProduceAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(ListProduceAuthorizationResponseBody model) {
            this.currentPageNum = model.currentPageNum;
            this.data = model.data;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

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
        public Builder data(java.util.List<Data> data) {
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

    /**
     * 
     * {@link ListProduceAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>ListProduceAuthorizationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
        private String authorizedUserId;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserName")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizedUserId = model.authorizedUserId;
                this.authorizedUserName = model.authorizedUserName;
            } 

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
