// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
         * <p>The response code returned. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: success</li>
         * <li><strong>400</strong>: client error</li>
         * <li><strong>401</strong>: identity authentication failed</li>
         * <li><strong>404</strong>: request page not found</li>
         * <li><strong>500</strong>: server error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: success</li>
         * <li><strong>400</strong>: client error</li>
         * <li><strong>500</strong>: server error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
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

        public DescribeAllWhitelistTemplateResponseBody build() {
            return new DescribeAllWhitelistTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAllWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllWhitelistTemplateResponseBody</p>
     */
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
             * <p>The primary key of the data table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>12.2.X.X,10.0.X.X</p>
             */
            public Builder ips(String ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The ID of the whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>412</p>
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>template_123</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>168****</p>
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
    /**
     * 
     * {@link DescribeAllWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllWhitelistTemplateResponseBody</p>
     */
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
        private java.util.List<Templates> templates;

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
        public java.util.List<Templates> getTemplates() {
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
            private java.util.List<Templates> templates; 
            private Integer totalPageNumbers; 
            private Integer totalRecords; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currPageNumbers(Integer currPageNumbers) {
                this.currPageNumbers = currPageNumbers;
                return this;
            }

            /**
             * <p>Indicates whether the data that meets the conditions is displayed on the next page. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * <p>Indicates whether the data that meets the conditions is displayed on the previous page. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasPrev(Boolean hasPrev) {
                this.hasPrev = hasPrev;
                return this;
            }

            /**
             * <p>The number of entries to return on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
                this.maxRecordsPerPage = maxRecordsPerPage;
                return this;
            }

            /**
             * <p>The information about whitelist templates that are returned by page.</p>
             */
            public Builder templates(java.util.List<Templates> templates) {
                this.templates = templates;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalPageNumbers(Integer totalPageNumbers) {
                this.totalPageNumbers = totalPageNumbers;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>402</p>
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
