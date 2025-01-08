// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link SyncSensitiveWordResponseBody} extends {@link TeaModel}
 *
 * <p>SyncSensitiveWordResponseBody</p>
 */
public class SyncSensitiveWordResponseBody extends TeaModel {
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

    private SyncSensitiveWordResponseBody(Builder builder) {
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

    public static SyncSensitiveWordResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public SyncSensitiveWordResponseBody build() {
            return new SyncSensitiveWordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SyncSensitiveWordResponseBody} extends {@link TeaModel}
     *
     * <p>SyncSensitiveWordResponseBody</p>
     */
    public static class SensitiveWordErrorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("ErrStatus")
        private Integer errStatus;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private SensitiveWordErrorList(Builder builder) {
            this.errMessage = builder.errMessage;
            this.errStatus = builder.errStatus;
            this.index = builder.index;
            this.label = builder.label;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveWordErrorList create() {
            return builder().build();
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return errStatus
         */
        public Integer getErrStatus() {
            return this.errStatus;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String errMessage; 
            private Integer errStatus; 
            private Long index; 
            private String label; 
            private String word; 

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * ErrStatus.
             */
            public Builder errStatus(Integer errStatus) {
                this.errStatus = errStatus;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public SensitiveWordErrorList build() {
                return new SensitiveWordErrorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncSensitiveWordResponseBody} extends {@link TeaModel}
     *
     * <p>SyncSensitiveWordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SensitiveWordErrorList")
        private java.util.List<SensitiveWordErrorList> sensitiveWordErrorList;

        private Data(Builder builder) {
            this.sensitiveWordErrorList = builder.sensitiveWordErrorList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sensitiveWordErrorList
         */
        public java.util.List<SensitiveWordErrorList> getSensitiveWordErrorList() {
            return this.sensitiveWordErrorList;
        }

        public static final class Builder {
            private java.util.List<SensitiveWordErrorList> sensitiveWordErrorList; 

            /**
             * SensitiveWordErrorList.
             */
            public Builder sensitiveWordErrorList(java.util.List<SensitiveWordErrorList> sensitiveWordErrorList) {
                this.sensitiveWordErrorList = sensitiveWordErrorList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
