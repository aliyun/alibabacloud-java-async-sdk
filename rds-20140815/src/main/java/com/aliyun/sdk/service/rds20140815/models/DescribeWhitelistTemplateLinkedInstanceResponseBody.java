// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWhitelistTemplateLinkedInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhitelistTemplateLinkedInstanceResponseBody</p>
 */
public class DescribeWhitelistTemplateLinkedInstanceResponseBody extends TeaModel {
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

    private DescribeWhitelistTemplateLinkedInstanceResponseBody(Builder builder) {
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

    public static DescribeWhitelistTemplateLinkedInstanceResponseBody create() {
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
         * <p>9F8C06AD-3F37-57A0-ABBF-ABD7824F55CE</p>
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

        public DescribeWhitelistTemplateLinkedInstanceResponseBody build() {
            return new DescribeWhitelistTemplateLinkedInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWhitelistTemplateLinkedInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhitelistTemplateLinkedInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InsName")
        private java.util.List < String > insName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Integer templateId;

        private Data(Builder builder) {
            this.insName = builder.insName;
            this.templateId = builder.templateId;
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
        public java.util.List < String > getInsName() {
            return this.insName;
        }

        /**
         * @return templateId
         */
        public Integer getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private java.util.List < String > insName; 
            private Integer templateId; 

            /**
             * <p>The information about the instance.</p>
             */
            public Builder insName(java.util.List < String > insName) {
                this.insName = insName;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
