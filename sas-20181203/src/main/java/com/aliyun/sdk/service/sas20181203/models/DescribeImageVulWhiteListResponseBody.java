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
 * {@link DescribeImageVulWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageVulWhiteListResponseBody</p>
 */
public class DescribeImageVulWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ImageVulWhitelist")
    private java.util.List<ImageVulWhitelist> imageVulWhitelist;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TimeCost")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ImageVulWhitelist> getImageVulWhitelist() {
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
        private java.util.List<ImageVulWhitelist> imageVulWhitelist; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 
        private Long timeCost; 

        private Builder() {
        } 

        private Builder(DescribeImageVulWhiteListResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.imageVulWhitelist = model.imageVulWhitelist;
            this.message = model.message;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timeCost = model.timeCost;
        } 

        /**
         * <p>The status code returned. A value of <strong>200</strong> indicates that the request was successful. Other values indicate that the request failed. You can identify the cause of the failure based on the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The information about the whitelist of image vulnerabilities.</p>
         */
        public Builder imageVulWhitelist(java.util.List<ImageVulWhitelist> imageVulWhitelist) {
            this.imageVulWhitelist = imageVulWhitelist;
            return this;
        }

        /**
         * <p>The message returned.</p>
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
         * <p>911025D0-3D1E-5213-A18A-37EA0C92****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The amount of time that was consumed to process the request. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public DescribeImageVulWhiteListResponseBody build() {
            return new DescribeImageVulWhiteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageVulWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageVulWhiteListResponseBody</p>
     */
    public static class ImageVulWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(ImageVulWhitelist model) {
                this.aliasName = model.aliasName;
                this.id = model.id;
                this.name = model.name;
                this.reason = model.reason;
                this.target = model.target;
                this.type = model.type;
            } 

            /**
             * <p>The alias of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2019-19906:in_sasl_add_string</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The primary key ID of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>34032043</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>scan:AVD-2022-953356</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The reason why the vulnerability is added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>already config in another way</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The object on which the query is performed. The value of this parameter is in the JSON format and contains the following fields:</p>
             * <ul>
             * <li><strong>type</strong>: the object type. The value is fixed to repo.</li>
             * <li><strong>target</strong>: the object content. The value is in the Namespace/Image repository format.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;repo&quot;,&quot;target&quot;:[&quot;sas_test/script_0209&quot;,&quot;sas_test/script&quot;]}</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: system vulnerability</li>
             * <li><strong>sca</strong>: application vulnerability</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sca</p>
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
    /**
     * 
     * {@link DescribeImageVulWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageVulWhiteListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>100</p>
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
