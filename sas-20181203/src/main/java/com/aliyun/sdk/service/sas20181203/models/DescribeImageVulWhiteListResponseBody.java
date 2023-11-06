// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageVulWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageVulWhiteListResponseBody</p>
 */
public class DescribeImageVulWhiteListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("ImageVulWhitelist")
    private java.util.List < ImageVulWhitelist> imageVulWhitelist;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TimeCost")
    private Long timeCost;

    private DescribeImageVulWhiteListResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.imageVulWhitelist = builder.imageVulWhitelist;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageVulWhiteListResponseBody create() {
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
     * @return imageVulWhitelist
     */
    public java.util.List < ImageVulWhitelist> getImageVulWhitelist() {
        return this.imageVulWhitelist;
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

    /**
     * @return timeCost
     */
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List < ImageVulWhitelist> imageVulWhitelist; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 
        private Long timeCost; 

        /**
         * The status code returned. A value of **200** indicates that the request was successful. Other values indicate that the request failed. You can identify the cause of the failure based on the value of this parameter.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The information about the whitelist of image vulnerabilities.
         */
        public Builder imageVulWhitelist(java.util.List < ImageVulWhitelist> imageVulWhitelist) {
            this.imageVulWhitelist = imageVulWhitelist;
            return this;
        }

        /**
         * The message returned.
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
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The amount of time that was consumed to process the request. Unit: milliseconds.
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public DescribeImageVulWhiteListResponseBody build() {
            return new DescribeImageVulWhiteListResponseBody(this);
        } 

    } 

    public static class ImageVulWhitelist extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Target")
        private String target;

        @NameInMap("Type")
        private String type;

        private ImageVulWhitelist(Builder builder) {
            this.aliasName = builder.aliasName;
            this.id = builder.id;
            this.name = builder.name;
            this.reason = builder.reason;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageVulWhitelist create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private Long id; 
            private String name; 
            private String reason; 
            private String target; 
            private String type; 

            /**
             * The alias of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The primary key ID of the vulnerability.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The reason the vulnerability is added to the whitelist.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The object on which the query is performed. The value of this parameter is in the JSON format and contains the following fields:
             * <p>
             * 
             * *   **type**: the object type. The value is fixed to repo.
             * *   **target**: the object content. The value is in the Namespace/Image repository format.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   **cve**: system vulnerability
             * *   **sca**: application vulnerability
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ImageVulWhitelist build() {
                return new ImageVulWhitelist(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The page number of the returned page.
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
