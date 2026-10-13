// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListBeebotIntentLgfResponseBody} extends {@link TeaModel}
 *
 * <p>ListBeebotIntentLgfResponseBody</p>
 */
public class ListBeebotIntentLgfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeebotRequestId")
    private String beebotRequestId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Lgfs")
    private java.util.List<Lgfs> lgfs;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBeebotIntentLgfResponseBody(Builder builder) {
        this.beebotRequestId = builder.beebotRequestId;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.lgfs = builder.lgfs;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBeebotIntentLgfResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beebotRequestId
     */
    public String getBeebotRequestId() {
        return this.beebotRequestId;
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
     * @return lgfs
     */
    public java.util.List<Lgfs> getLgfs() {
        return this.lgfs;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String beebotRequestId; 
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Lgfs> lgfs; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBeebotIntentLgfResponseBody model) {
            this.beebotRequestId = model.beebotRequestId;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.lgfs = model.lgfs;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The internal request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497CFAFF-48CC-161A-AD2C-252DED569037</p>
         */
        public Builder beebotRequestId(String beebotRequestId) {
            this.beebotRequestId = beebotRequestId;
            return this;
        }

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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
         * <p>The list of LGFs.</p>
         */
        public Builder lgfs(java.util.List<Lgfs> lgfs) {
            this.lgfs = lgfs;
            return this;
        }

        /**
         * <p>The API message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBeebotIntentLgfResponseBody build() {
            return new ListBeebotIntentLgfResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBeebotIntentLgfResponseBody} extends {@link TeaModel}
     *
     * <p>ListBeebotIntentLgfResponseBody</p>
     */
    public static class Lgfs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("LgfId")
        private Long lgfId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("RuleText")
        private String ruleText;

        private Lgfs(Builder builder) {
            this.createTime = builder.createTime;
            this.intentId = builder.intentId;
            this.lgfId = builder.lgfId;
            this.modifyTime = builder.modifyTime;
            this.ruleText = builder.ruleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lgfs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return lgfId
         */
        public Long getLgfId() {
            return this.lgfId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return ruleText
         */
        public String getRuleText() {
            return this.ruleText;
        }

        public static final class Builder {
            private String createTime; 
            private Long intentId; 
            private Long lgfId; 
            private String modifyTime; 
            private String ruleText; 

            private Builder() {
            } 

            private Builder(Lgfs model) {
                this.createTime = model.createTime;
                this.intentId = model.intentId;
                this.lgfId = model.lgfId;
                this.modifyTime = model.modifyTime;
                this.ruleText = model.ruleText;
            } 

            /**
             * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.+ZZZZ, where +ZZZZ indicates the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-21 10:54:18.+0800</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The intent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10717802</p>
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>The utterance template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5666117</p>
             */
            public Builder lgfId(Long lgfId) {
                this.lgfId = lgfId;
                return this;
            }

            /**
             * <p>The modification time. The format is YYYY-MM-DD HH:mm:ss.+ZZZZ, where +ZZZZ indicates the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-21 10:54:18.+0800</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The content of the utterance template.</p>
             * 
             * <strong>example:</strong>
             * <p>I am an utterance template</p>
             */
            public Builder ruleText(String ruleText) {
                this.ruleText = ruleText;
                return this;
            }

            public Lgfs build() {
                return new Lgfs(this);
            } 

        } 

    }
}
