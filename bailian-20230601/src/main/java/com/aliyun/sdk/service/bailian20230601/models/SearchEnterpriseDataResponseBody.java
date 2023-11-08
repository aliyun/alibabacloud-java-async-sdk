// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEnterpriseDataResponseBody} extends {@link TeaModel}
 *
 * <p>SearchEnterpriseDataResponseBody</p>
 */
public class SearchEnterpriseDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SearchEnterpriseDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEnterpriseDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public SearchEnterpriseDataResponseBody build() {
            return new SearchEnterpriseDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("DataName")
        private String dataName;

        @NameInMap("Score")
        private String score;

        @NameInMap("Source")
        private String source;

        @NameInMap("Text")
        private String text;

        @NameInMap("Title")
        private String title;

        @NameInMap("TitlePath")
        private String titlePath;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.dataName = builder.dataName;
            this.score = builder.score;
            this.source = builder.source;
            this.text = builder.text;
            this.title = builder.title;
            this.titlePath = builder.titlePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return dataName
         */
        public String getDataName() {
            return this.dataName;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return titlePath
         */
        public String getTitlePath() {
            return this.titlePath;
        }

        public static final class Builder {
            private String dataId; 
            private String dataName; 
            private String score; 
            private String source; 
            private String text; 
            private String title; 
            private String titlePath; 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * DataName.
             */
            public Builder dataName(String dataName) {
                this.dataName = dataName;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
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
             * TitlePath.
             */
            public Builder titlePath(String titlePath) {
                this.titlePath = titlePath;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
