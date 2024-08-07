// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotAttackerPortraitResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotAttackerPortraitResponseBody</p>
 */
public class ListHoneypotAttackerPortraitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListHoneypotAttackerPortraitResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.list = builder.list;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotAttackerPortraitResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
        private Integer httpStatusCode; 
        private java.util.List < List> list; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code that is returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The details of the attacker profile.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHoneypotAttackerPortraitResponseBody build() {
            return new ListHoneypotAttackerPortraitResponseBody(this);
        } 

    } 

    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private java.util.List < String > externalIp;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private java.util.List < String > internalIp;

        @com.aliyun.core.annotation.NameInMap("RealIp")
        private java.util.List < String > realIp;

        private Network(Builder builder) {
            this.externalIp = builder.externalIp;
            this.internalIp = builder.internalIp;
            this.realIp = builder.realIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return externalIp
         */
        public java.util.List < String > getExternalIp() {
            return this.externalIp;
        }

        /**
         * @return internalIp
         */
        public java.util.List < String > getInternalIp() {
            return this.internalIp;
        }

        /**
         * @return realIp
         */
        public java.util.List < String > getRealIp() {
            return this.realIp;
        }

        public static final class Builder {
            private java.util.List < String > externalIp; 
            private java.util.List < String > internalIp; 
            private java.util.List < String > realIp; 

            /**
             * The public IP addresses.
             */
            public Builder externalIp(java.util.List < String > externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * The private IP addresses.
             */
            public Builder internalIp(java.util.List < String > internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * The originating IP addresses.
             */
            public Builder realIp(java.util.List < String > realIp) {
                this.realIp = realIp;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackCount")
        private Integer attackCount;

        @com.aliyun.core.annotation.NameInMap("Browser")
        private java.util.List < String > browser;

        @com.aliyun.core.annotation.NameInMap("Host")
        private java.util.List < String > host;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("PortraitId")
        private String portraitId;

        @com.aliyun.core.annotation.NameInMap("Social")
        private java.util.List < String > social;

        private List(Builder builder) {
            this.attackCount = builder.attackCount;
            this.browser = builder.browser;
            this.host = builder.host;
            this.lastTime = builder.lastTime;
            this.network = builder.network;
            this.portraitId = builder.portraitId;
            this.social = builder.social;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return attackCount
         */
        public Integer getAttackCount() {
            return this.attackCount;
        }

        /**
         * @return browser
         */
        public java.util.List < String > getBrowser() {
            return this.browser;
        }

        /**
         * @return host
         */
        public java.util.List < String > getHost() {
            return this.host;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return portraitId
         */
        public String getPortraitId() {
            return this.portraitId;
        }

        /**
         * @return social
         */
        public java.util.List < String > getSocial() {
            return this.social;
        }

        public static final class Builder {
            private Integer attackCount; 
            private java.util.List < String > browser; 
            private java.util.List < String > host; 
            private Long lastTime; 
            private Network network; 
            private String portraitId; 
            private java.util.List < String > social; 

            /**
             * The number of attacks.
             */
            public Builder attackCount(Integer attackCount) {
                this.attackCount = attackCount;
                return this;
            }

            /**
             * The information about the browsers of the attack source.
             */
            public Builder browser(java.util.List < String > browser) {
                this.browser = browser;
                return this;
            }

            /**
             * The information about the hosts of the attack source.
             */
            public Builder host(java.util.List < String > host) {
                this.host = host;
                return this;
            }

            /**
             * The timestamp at which the attack was last detected. Unit: milliseconds.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The network information about the attack source.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * The attacker profile ID.
             */
            public Builder portraitId(String portraitId) {
                this.portraitId = portraitId;
                return this;
            }

            /**
             * The social information about the attack source.
             */
            public Builder social(java.util.List < String > social) {
                this.social = social;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
