// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySendDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySendDetailsResponseBody</p>
 */
public class QuerySendDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List < Model> model;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QuerySendDetailsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySendDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List < Model> getModel() {
        return this.model;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private java.util.List < Model> model; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code.</p>
         * <p>If OK is returned, the request is successful. Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html?spm=a2c4g.419277.0.i11">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder model(java.util.List < Model> model) {
            this.model = model;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySendDetailsResponseBody build() {
            return new QuerySendDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySendDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySendDetailsResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private String errCode;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("PhoneNum")
        private String phoneNum;

        @com.aliyun.core.annotation.NameInMap("ReceiveDate")
        private String receiveDate;

        @com.aliyun.core.annotation.NameInMap("SendDate")
        private String sendDate;

        @com.aliyun.core.annotation.NameInMap("SendStatus")
        private Long sendStatus;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private Model(Builder builder) {
            this.content = builder.content;
            this.errCode = builder.errCode;
            this.outId = builder.outId;
            this.phoneNum = builder.phoneNum;
            this.receiveDate = builder.receiveDate;
            this.sendDate = builder.sendDate;
            this.sendStatus = builder.sendStatus;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return errCode
         */
        public String getErrCode() {
            return this.errCode;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return phoneNum
         */
        public String getPhoneNum() {
            return this.phoneNum;
        }

        /**
         * @return receiveDate
         */
        public String getReceiveDate() {
            return this.receiveDate;
        }

        /**
         * @return sendDate
         */
        public String getSendDate() {
            return this.sendDate;
        }

        /**
         * @return sendStatus
         */
        public Long getSendStatus() {
            return this.sendStatus;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String content; 
            private String errCode; 
            private String outId; 
            private String phoneNum; 
            private String receiveDate; 
            private String sendDate; 
            private Long sendStatus; 
            private String templateCode; 

            /**
             * <p>The content of the text message.</p>
             * 
             * <strong>example:</strong>
             * <p>203160</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The status code returned by the carrier.</p>
             * <ul>
             * <li>If the text message was delivered, &quot;DELIVERED&quot; is returned.</li>
             * <li>If the text message failed to be sent, see <a href="https://help.aliyun.com/document_detail/101347.html?spm=a2c4g.419277.0.i8">Error codes</a> for more information.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELIVERED</p>
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>The extension field.</p>
             * 
             * <strong>example:</strong>
             * <p>12131231</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            /**
             * <p>The date and time when the text message was received.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-08 16:44:13</p>
             */
            public Builder receiveDate(String receiveDate) {
                this.receiveDate = receiveDate;
                return this;
            }

            /**
             * <p>The date when the text message was sent. You can query text messages that were sent within the last 30 days.</p>
             * <p>The date is in the yyyyMMdd format. Example: 20181225.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-08 16:44:13</p>
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * <p>The delivery status of the text message.</p>
             * <ul>
             * <li>1: A delivery receipt is to be sent.</li>
             * <li>2: The text message failed to be sent.</li>
             * <li>3: The text message was sent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sendStatus(Long sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * <p>The code of the text message template.</p>
             * <p>Log on to the SMS console. In the left-side navigation pane, click <strong>Go China</strong> or <strong>Go Globe</strong>. You can view the text message template code in the <strong>Template Code</strong> column on the <strong>Message Templates</strong> tab.</p>
             * <blockquote>
             * <p> The text message templates must be created on the Go Globe page and approved.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SMS_12231****</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
