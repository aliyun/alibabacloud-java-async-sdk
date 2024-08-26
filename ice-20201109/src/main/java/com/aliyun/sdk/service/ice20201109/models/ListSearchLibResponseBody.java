// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchLibResponseBody} extends {@link TeaModel}
 *
 * <p>ListSearchLibResponseBody</p>
 */
public class ListSearchLibResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchLibInfoList")
    private java.util.List < SearchLibInfoList> searchLibInfoList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ListSearchLibResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.searchLibInfoList = builder.searchLibInfoList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchLibResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchLibInfoList
     */
    public java.util.List < SearchLibInfoList> getSearchLibInfoList() {
        return this.searchLibInfoList;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private java.util.List < SearchLibInfoList> searchLibInfoList; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * SearchLibInfoList.
         */
        public Builder searchLibInfoList(java.util.List < SearchLibInfoList> searchLibInfoList) {
            this.searchLibInfoList = searchLibInfoList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListSearchLibResponseBody build() {
            return new ListSearchLibResponseBody(this);
        } 

    } 

    public static class SearchLibInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchLibName")
        private String searchLibName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SearchLibInfoList(Builder builder) {
            this.searchLibName = builder.searchLibName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchLibInfoList create() {
            return builder().build();
        }

        /**
         * @return searchLibName
         */
        public String getSearchLibName() {
            return this.searchLibName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String searchLibName; 
            private String status; 

            /**
             * SearchLibName.
             */
            public Builder searchLibName(String searchLibName) {
                this.searchLibName = searchLibName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SearchLibInfoList build() {
                return new SearchLibInfoList(this);
            } 

        } 

    }
}
