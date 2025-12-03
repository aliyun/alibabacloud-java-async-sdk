// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link GetFileDetectResultInnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectResultInnerResponseBody</p>
 */
public class GetFileDetectResultInnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultList")
    private java.util.List<ResultList> resultList;

    private GetFileDetectResultInnerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectResultInnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultList
     */
    public java.util.List<ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultList> resultList; 

        private Builder() {
        } 

        private Builder(GetFileDetectResultInnerResponseBody model) {
            this.requestId = model.requestId;
            this.resultList = model.resultList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultList.
         */
        public Builder resultList(java.util.List<ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public GetFileDetectResultInnerResponseBody build() {
            return new GetFileDetectResultInnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileDetectResultInnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileDetectResultInnerResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("HashKey")
        private String hashKey;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("VirusType")
        private String virusType;

        private ResultList(Builder builder) {
            this.code = builder.code;
            this.expireTime = builder.expireTime;
            this.ext = builder.ext;
            this.hashKey = builder.hashKey;
            this.message = builder.message;
            this.result = builder.result;
            this.score = builder.score;
            this.virusType = builder.virusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return virusType
         */
        public String getVirusType() {
            return this.virusType;
        }

        public static final class Builder {
            private String code; 
            private String expireTime; 
            private String ext; 
            private String hashKey; 
            private String message; 
            private Integer result; 
            private Integer score; 
            private String virusType; 

            private Builder() {
            } 

            private Builder(ResultList model) {
                this.code = model.code;
                this.expireTime = model.expireTime;
                this.ext = model.ext;
                this.hashKey = model.hashKey;
                this.message = model.message;
                this.result = model.result;
                this.score = model.score;
                this.virusType = model.virusType;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * HashKey.
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
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
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * VirusType.
             */
            public Builder virusType(String virusType) {
                this.virusType = virusType;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
