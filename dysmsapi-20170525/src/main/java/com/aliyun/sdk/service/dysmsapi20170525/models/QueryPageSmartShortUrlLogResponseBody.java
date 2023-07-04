// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPageSmartShortUrlLogResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPageSmartShortUrlLogResponseBody</p>
 */
public class QueryPageSmartShortUrlLogResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryPageSmartShortUrlLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPageSmartShortUrlLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private String message; 
        private Model model; 
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        public QueryPageSmartShortUrlLogResponseBody build() {
            return new QueryPageSmartShortUrlLogResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ClickState")
        private Long clickState;

        @NameInMap("ClickTime")
        private Long clickTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("ShortName")
        private String shortName;

        @NameInMap("ShortUrl")
        private String shortUrl;

        private List(Builder builder) {
            this.clickState = builder.clickState;
            this.clickTime = builder.clickTime;
            this.createTime = builder.createTime;
            this.phoneNumber = builder.phoneNumber;
            this.shortName = builder.shortName;
            this.shortUrl = builder.shortUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return clickState
         */
        public Long getClickState() {
            return this.clickState;
        }

        /**
         * @return clickTime
         */
        public Long getClickTime() {
            return this.clickTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        /**
         * @return shortUrl
         */
        public String getShortUrl() {
            return this.shortUrl;
        }

        public static final class Builder {
            private Long clickState; 
            private Long clickTime; 
            private Long createTime; 
            private String phoneNumber; 
            private String shortName; 
            private String shortUrl; 

            /**
             * ClickState.
             */
            public Builder clickState(Long clickState) {
                this.clickState = clickState;
                return this;
            }

            /**
             * ClickTime.
             */
            public Builder clickTime(Long clickTime) {
                this.clickTime = clickTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * ShortName.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            /**
             * ShortUrl.
             */
            public Builder shortUrl(String shortUrl) {
                this.shortUrl = shortUrl;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNo")
        private Long pageNo;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("TotalPage")
        private Long totalPage;

        private Model(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long totalCount; 
            private Long totalPage; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
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
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
