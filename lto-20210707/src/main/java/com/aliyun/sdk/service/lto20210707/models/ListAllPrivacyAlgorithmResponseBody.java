// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListAllPrivacyAlgorithmResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllPrivacyAlgorithmResponseBody</p>
 */
public class ListAllPrivacyAlgorithmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAllPrivacyAlgorithmResponseBody(Builder builder) {
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

    public static ListAllPrivacyAlgorithmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAllPrivacyAlgorithmResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(java.util.List<Data> data) {
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

        public ListAllPrivacyAlgorithmResponseBody build() {
            return new ListAllPrivacyAlgorithmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllPrivacyAlgorithmResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllPrivacyAlgorithmResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgImplList")
        private java.util.List<String> algImplList;

        @com.aliyun.core.annotation.NameInMap("AlgType")
        private String algType;

        private Data(Builder builder) {
            this.algImplList = builder.algImplList;
            this.algType = builder.algType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algImplList
         */
        public java.util.List<String> getAlgImplList() {
            return this.algImplList;
        }

        /**
         * @return algType
         */
        public String getAlgType() {
            return this.algType;
        }

        public static final class Builder {
            private java.util.List<String> algImplList; 
            private String algType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.algImplList = model.algImplList;
                this.algType = model.algType;
            } 

            /**
             * AlgImplList.
             */
            public Builder algImplList(java.util.List<String> algImplList) {
                this.algImplList = algImplList;
                return this;
            }

            /**
             * AlgType.
             */
            public Builder algType(String algType) {
                this.algType = algType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
