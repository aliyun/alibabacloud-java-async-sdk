// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link SearchFaceResponseBody} extends {@link TeaModel}
 *
 * <p>SearchFaceResponseBody</p>
 */
public class SearchFaceResponseBody extends TeaModel {
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

    private SearchFaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFaceResponseBody create() {
        return builder().build();
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

        public SearchFaceResponseBody build() {
            return new SearchFaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchFaceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFaceResponseBody</p>
     */
    public static class TopUserItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private TopUserItem(Builder builder) {
            this.score = builder.score;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopUserItem create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Float score; 
            private String userId; 

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TopUserItem build() {
                return new TopUserItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchFaceResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopUserItem")
        private java.util.List<TopUserItem> topUserItem;

        private Data(Builder builder) {
            this.topUserItem = builder.topUserItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return topUserItem
         */
        public java.util.List<TopUserItem> getTopUserItem() {
            return this.topUserItem;
        }

        public static final class Builder {
            private java.util.List<TopUserItem> topUserItem; 

            /**
             * TopUserItem.
             */
            public Builder topUserItem(java.util.List<TopUserItem> topUserItem) {
                this.topUserItem = topUserItem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
