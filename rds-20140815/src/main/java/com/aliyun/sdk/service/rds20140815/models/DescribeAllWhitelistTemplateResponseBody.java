// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllWhitelistTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllWhitelistTemplateResponseBody</p>
 */
public class DescribeAllWhitelistTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAllWhitelistTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllWhitelistTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code returned. Valid values:
         * <p>
         * 
         * *   **200**: success
         * *   **400**: client error
         * *   **401**: identity authentication failed
         * *   **404**: request page not found
         * *   **500**: server error
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned. Valid values:
         * <p>
         * 
         * *   **200**: success
         * *   **400**: client error
         * *   **500**: server error
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAllWhitelistTemplateResponseBody build() {
            return new DescribeAllWhitelistTemplateResponseBody(this);
        } 

    } 

    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private String ips;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Integer templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Integer userId;

        private Templates(Builder builder) {
            this.id = builder.id;
            this.ips = builder.ips;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return ips
         */
        public String getIps() {
            return this.ips;
        }

        /**
         * @return templateId
         */
        public Integer getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer id; 
            private String ips; 
            private Integer templateId; 
            private String templateName; 
            private Integer userId; 

            /**
             * The primary key of the data table.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The IP addresses.
             */
            public Builder ips(String ips) {
                this.ips = ips;
                return this;
            }

            /**
             * The ID of the whitelist template.
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the whitelist template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrPageNumbers")
        private Integer currPageNumbers;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("HasPrev")
        private Boolean hasPrev;

        @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
        private Integer maxRecordsPerPage;

        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List < Templates> templates;

        @com.aliyun.core.annotation.NameInMap("TotalPageNumbers")
        private Integer totalPageNumbers;

        @com.aliyun.core.annotation.NameInMap("TotalRecords")
        private Integer totalRecords;

        private Data(Builder builder) {
            this.currPageNumbers = builder.currPageNumbers;
            this.hasNext = builder.hasNext;
            this.hasPrev = builder.hasPrev;
            this.maxRecordsPerPage = builder.maxRecordsPerPage;
            this.templates = builder.templates;
            this.totalPageNumbers = builder.totalPageNumbers;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currPageNumbers
         */
        public Integer getCurrPageNumbers() {
            return this.currPageNumbers;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return hasPrev
         */
        public Boolean getHasPrev() {
            return this.hasPrev;
        }

        /**
         * @return maxRecordsPerPage
         */
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        /**
         * @return templates
         */
        public java.util.List < Templates> getTemplates() {
            return this.templates;
        }

        /**
         * @return totalPageNumbers
         */
        public Integer getTotalPageNumbers() {
            return this.totalPageNumbers;
        }

        /**
         * @return totalRecords
         */
        public Integer getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Integer currPageNumbers; 
            private Boolean hasNext; 
            private Boolean hasPrev; 
            private Integer maxRecordsPerPage; 
            private java.util.List < Templates> templates; 
            private Integer totalPageNumbers; 
            private Integer totalRecords; 

            /**
             * The page number.
             */
            public Builder currPageNumbers(Integer currPageNumbers) {
                this.currPageNumbers = currPageNumbers;
                return this;
            }

            /**
             * Indicates whether the data that meets the conditions is displayed on the next page. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * Indicates whether the data that meets the conditions is displayed on the previous page. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasPrev(Boolean hasPrev) {
                this.hasPrev = hasPrev;
                return this;
            }

            /**
             * The number of entries to return on each page.
             */
            public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
                this.maxRecordsPerPage = maxRecordsPerPage;
                return this;
            }

            /**
             * The information about whitelist templates that are returned by page.
             */
            public Builder templates(java.util.List < Templates> templates) {
                this.templates = templates;
                return this;
            }

            /**
             * The total number of pages returned.
             */
            public Builder totalPageNumbers(Integer totalPageNumbers) {
                this.totalPageNumbers = totalPageNumbers;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalRecords(Integer totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
