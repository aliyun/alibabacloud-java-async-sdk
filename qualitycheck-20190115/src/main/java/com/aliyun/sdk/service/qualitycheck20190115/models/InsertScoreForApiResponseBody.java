// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertScoreForApiResponseBody} extends {@link TeaModel}
 *
 * <p>InsertScoreForApiResponseBody</p>
 */
public class InsertScoreForApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InsertScoreForApiResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertScoreForApiResponseBody create() {
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

        public InsertScoreForApiResponseBody build() {
            return new InsertScoreForApiResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScoreId")
        private Long scoreId;

        @com.aliyun.core.annotation.NameInMap("ScoreName")
        private String scoreName;

        private Data(Builder builder) {
            this.scoreId = builder.scoreId;
            this.scoreName = builder.scoreName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scoreId
         */
        public Long getScoreId() {
            return this.scoreId;
        }

        /**
         * @return scoreName
         */
        public String getScoreName() {
            return this.scoreName;
        }

        public static final class Builder {
            private Long scoreId; 
            private String scoreName; 

            /**
             * ScoreId.
             */
            public Builder scoreId(Long scoreId) {
                this.scoreId = scoreId;
                return this;
            }

            /**
             * ScoreName.
             */
            public Builder scoreName(String scoreName) {
                this.scoreName = scoreName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
