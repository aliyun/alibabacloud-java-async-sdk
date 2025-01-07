// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<List> list;

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
    public java.util.List<List> getList() {
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
        private java.util.List<List> list; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code that is returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the attacker profile.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8A5A2DA6-67EA-5968-960F-6B20FD0C*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHoneypotAttackerPortraitResponseBody build() {
            return new ListHoneypotAttackerPortraitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHoneypotAttackerPortraitResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotAttackerPortraitResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private java.util.List<String> externalIp;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private java.util.List<String> internalIp;

        @com.aliyun.core.annotation.NameInMap("RealIp")
        private java.util.List<String> realIp;

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
        public java.util.List<String> getExternalIp() {
            return this.externalIp;
        }

        /**
         * @return internalIp
         */
        public java.util.List<String> getInternalIp() {
            return this.internalIp;
        }

        /**
         * @return realIp
         */
        public java.util.List<String> getRealIp() {
            return this.realIp;
        }

        public static final class Builder {
            private java.util.List<String> externalIp; 
            private java.util.List<String> internalIp; 
            private java.util.List<String> realIp; 

            /**
             * <p>The public IP addresses.</p>
             */
            public Builder externalIp(java.util.List<String> externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * <p>The private IP addresses.</p>
             */
            public Builder internalIp(java.util.List<String> internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * <p>The originating IP addresses.</p>
             */
            public Builder realIp(java.util.List<String> realIp) {
                this.realIp = realIp;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHoneypotAttackerPortraitResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotAttackerPortraitResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackCount")
        private Integer attackCount;

        @com.aliyun.core.annotation.NameInMap("Browser")
        private java.util.List<String> browser;

        @com.aliyun.core.annotation.NameInMap("Host")
        private java.util.List<String> host;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("PortraitId")
        private String portraitId;

        @com.aliyun.core.annotation.NameInMap("Social")
        private java.util.List<String> social;

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
        public java.util.List<String> getBrowser() {
            return this.browser;
        }

        /**
         * @return host
         */
        public java.util.List<String> getHost() {
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
        public java.util.List<String> getSocial() {
            return this.social;
        }

        public static final class Builder {
            private Integer attackCount; 
            private java.util.List<String> browser; 
            private java.util.List<String> host; 
            private Long lastTime; 
            private Network network; 
            private String portraitId; 
            private java.util.List<String> social; 

            /**
             * <p>The number of attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder attackCount(Integer attackCount) {
                this.attackCount = attackCount;
                return this;
            }

            /**
             * <p>The information about the browsers of the attack source.</p>
             */
            public Builder browser(java.util.List<String> browser) {
                this.browser = browser;
                return this;
            }

            /**
             * <p>The information about the hosts of the attack source.</p>
             */
            public Builder host(java.util.List<String> host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The timestamp at which the attack was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679896965</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The network information about the attack source.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The attacker profile ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cd48604a-1694-4f03-ade0-ec6994c3****</p>
             */
            public Builder portraitId(String portraitId) {
                this.portraitId = portraitId;
                return this;
            }

            /**
             * <p>The social information about the attack source.</p>
             */
            public Builder social(java.util.List<String> social) {
                this.social = social;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHoneypotAttackerPortraitResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotAttackerPortraitResponseBody</p>
     */
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
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
