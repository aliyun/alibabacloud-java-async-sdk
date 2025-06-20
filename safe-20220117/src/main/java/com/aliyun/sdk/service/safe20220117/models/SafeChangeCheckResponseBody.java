// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SafeChangeCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SafeChangeCheckResponseBody</p>
 */
public class SafeChangeCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SafeChangeCheckResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SafeChangeCheckResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public SafeChangeCheckResponseBody build() {
            return new SafeChangeCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SafeChangeCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckResponseBody</p>
     */
    public static class RuleDetailUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SceneEnum")
        private String sceneEnum;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private RuleDetailUrlList(Builder builder) {
            this.sceneEnum = builder.sceneEnum;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleDetailUrlList create() {
            return builder().build();
        }

        /**
         * @return sceneEnum
         */
        public String getSceneEnum() {
            return this.sceneEnum;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String sceneEnum; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(RuleDetailUrlList model) {
                this.sceneEnum = model.sceneEnum;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * SceneEnum.
             */
            public Builder sceneEnum(String sceneEnum) {
                this.sceneEnum = sceneEnum;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RuleDetailUrlList build() {
                return new RuleDetailUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SafeChangeCheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveResultUrl")
        private String approveResultUrl;

        @com.aliyun.core.annotation.NameInMap("BgCheckStatus")
        private String bgCheckStatus;

        @com.aliyun.core.annotation.NameInMap("BgVid")
        private String bgVid;

        @com.aliyun.core.annotation.NameInMap("CheckResultUrl")
        private String checkResultUrl;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckholdReason")
        private java.util.List<String> checkholdReason;

        @com.aliyun.core.annotation.NameInMap("RuleDetailUrlList")
        private java.util.List<RuleDetailUrlList> ruleDetailUrlList;

        @com.aliyun.core.annotation.NameInMap("SourceOrderId")
        private String sourceOrderId;

        private Data(Builder builder) {
            this.approveResultUrl = builder.approveResultUrl;
            this.bgCheckStatus = builder.bgCheckStatus;
            this.bgVid = builder.bgVid;
            this.checkResultUrl = builder.checkResultUrl;
            this.checkStatus = builder.checkStatus;
            this.checkholdReason = builder.checkholdReason;
            this.ruleDetailUrlList = builder.ruleDetailUrlList;
            this.sourceOrderId = builder.sourceOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return approveResultUrl
         */
        public String getApproveResultUrl() {
            return this.approveResultUrl;
        }

        /**
         * @return bgCheckStatus
         */
        public String getBgCheckStatus() {
            return this.bgCheckStatus;
        }

        /**
         * @return bgVid
         */
        public String getBgVid() {
            return this.bgVid;
        }

        /**
         * @return checkResultUrl
         */
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkholdReason
         */
        public java.util.List<String> getCheckholdReason() {
            return this.checkholdReason;
        }

        /**
         * @return ruleDetailUrlList
         */
        public java.util.List<RuleDetailUrlList> getRuleDetailUrlList() {
            return this.ruleDetailUrlList;
        }

        /**
         * @return sourceOrderId
         */
        public String getSourceOrderId() {
            return this.sourceOrderId;
        }

        public static final class Builder {
            private String approveResultUrl; 
            private String bgCheckStatus; 
            private String bgVid; 
            private String checkResultUrl; 
            private String checkStatus; 
            private java.util.List<String> checkholdReason; 
            private java.util.List<RuleDetailUrlList> ruleDetailUrlList; 
            private String sourceOrderId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.approveResultUrl = model.approveResultUrl;
                this.bgCheckStatus = model.bgCheckStatus;
                this.bgVid = model.bgVid;
                this.checkResultUrl = model.checkResultUrl;
                this.checkStatus = model.checkStatus;
                this.checkholdReason = model.checkholdReason;
                this.ruleDetailUrlList = model.ruleDetailUrlList;
                this.sourceOrderId = model.sourceOrderId;
            } 

            /**
             * ApproveResultUrl.
             */
            public Builder approveResultUrl(String approveResultUrl) {
                this.approveResultUrl = approveResultUrl;
                return this;
            }

            /**
             * BgCheckStatus.
             */
            public Builder bgCheckStatus(String bgCheckStatus) {
                this.bgCheckStatus = bgCheckStatus;
                return this;
            }

            /**
             * BgVid.
             */
            public Builder bgVid(String bgVid) {
                this.bgVid = bgVid;
                return this;
            }

            /**
             * CheckResultUrl.
             */
            public Builder checkResultUrl(String checkResultUrl) {
                this.checkResultUrl = checkResultUrl;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * CheckholdReason.
             */
            public Builder checkholdReason(java.util.List<String> checkholdReason) {
                this.checkholdReason = checkholdReason;
                return this;
            }

            /**
             * RuleDetailUrlList.
             */
            public Builder ruleDetailUrlList(java.util.List<RuleDetailUrlList> ruleDetailUrlList) {
                this.ruleDetailUrlList = ruleDetailUrlList;
                return this;
            }

            /**
             * SourceOrderId.
             */
            public Builder sourceOrderId(String sourceOrderId) {
                this.sourceOrderId = sourceOrderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
