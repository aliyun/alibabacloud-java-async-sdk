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
         * BeebotRequestId.
         */
        public Builder beebotRequestId(String beebotRequestId) {
            this.beebotRequestId = beebotRequestId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Lgfs.
         */
        public Builder lgfs(java.util.List<Lgfs> lgfs) {
            this.lgfs = lgfs;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * LgfId.
             */
            public Builder lgfId(Long lgfId) {
                this.lgfId = lgfId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * RuleText.
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
