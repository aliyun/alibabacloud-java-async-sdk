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
 * {@link DescribeInstanceLinkedWhitelistTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceLinkedWhitelistTemplateResponseBody</p>
 */
public class DescribeInstanceLinkedWhitelistTemplateResponseBody extends TeaModel {
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

    private DescribeInstanceLinkedWhitelistTemplateResponseBody(Builder builder) {
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

    public static DescribeInstanceLinkedWhitelistTemplateResponseBody create() {
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
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

        public DescribeInstanceLinkedWhitelistTemplateResponseBody build() {
            return new DescribeInstanceLinkedWhitelistTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceLinkedWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceLinkedWhitelistTemplateResponseBody</p>
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
             * <p>1884</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>12.0.X.X,10.2.X.X</p>
             */
            public Builder ips(String ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The whitelist template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>412</p>
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The whitelist template name.</p>
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
             * <p>16****</p>
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
     * {@link DescribeInstanceLinkedWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceLinkedWhitelistTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List<Templates> templates;

        private Data(Builder builder) {
            this.insName = builder.insName;
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return templates
         */
        public java.util.List<Templates> getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private String insName; 
            private java.util.List<Templates> templates; 

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp191w771kd3****</p>
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * <p>The information about whitelists that are returned by page.</p>
             */
            public Builder templates(java.util.List<Templates> templates) {
                this.templates = templates;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
