// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreativeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreativeInfoResponseBody</p>
 */
public class GetCreativeInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCreativeInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreativeInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public GetCreativeInfoResponseBody build() {
            return new GetCreativeInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccountNo")
        private String accountNo;

        @NameInMap("ChainValue")
        private String chainValue;

        @NameInMap("ComponentIdList")
        private String componentIdList;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("MainId")
        private Long mainId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PageId")
        private String pageId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskCount")
        private Integer taskCount;

        @NameInMap("Url")
        private String url;

        @NameInMap("UrlType")
        private String urlType;

        private Data(Builder builder) {
            this.accountNo = builder.accountNo;
            this.chainValue = builder.chainValue;
            this.componentIdList = builder.componentIdList;
            this.id = builder.id;
            this.mainId = builder.mainId;
            this.name = builder.name;
            this.pageId = builder.pageId;
            this.status = builder.status;
            this.taskCount = builder.taskCount;
            this.url = builder.url;
            this.urlType = builder.urlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountNo
         */
        public String getAccountNo() {
            return this.accountNo;
        }

        /**
         * @return chainValue
         */
        public String getChainValue() {
            return this.chainValue;
        }

        /**
         * @return componentIdList
         */
        public String getComponentIdList() {
            return this.componentIdList;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return mainId
         */
        public Long getMainId() {
            return this.mainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskCount
         */
        public Integer getTaskCount() {
            return this.taskCount;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return urlType
         */
        public String getUrlType() {
            return this.urlType;
        }

        public static final class Builder {
            private String accountNo; 
            private String chainValue; 
            private String componentIdList; 
            private Integer id; 
            private Long mainId; 
            private String name; 
            private String pageId; 
            private Integer status; 
            private Integer taskCount; 
            private String url; 
            private String urlType; 

            /**
             * AccountNo.
             */
            public Builder accountNo(String accountNo) {
                this.accountNo = accountNo;
                return this;
            }

            /**
             * ChainValue.
             */
            public Builder chainValue(String chainValue) {
                this.chainValue = chainValue;
                return this;
            }

            /**
             * ComponentIdList.
             */
            public Builder componentIdList(String componentIdList) {
                this.componentIdList = componentIdList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * MainId.
             */
            public Builder mainId(Long mainId) {
                this.mainId = mainId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskCount.
             */
            public Builder taskCount(Integer taskCount) {
                this.taskCount = taskCount;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * UrlType.
             */
            public Builder urlType(String urlType) {
                this.urlType = urlType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
