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
 * {@link QueryAddUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAddUserInfoResponseBody</p>
 */
public class QueryAddUserInfoResponseBody extends TeaModel {
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

    private QueryAddUserInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAddUserInfoResponseBody create() {
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

        public QueryAddUserInfoResponseBody build() {
            return new QueryAddUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAddUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAddUserInfoResponseBody</p>
     */
    public static class CurrentFaceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientTag")
        private String clientTag;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private CurrentFaceInfos(Builder builder) {
            this.clientTag = builder.clientTag;
            this.index = builder.index;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentFaceInfos create() {
            return builder().build();
        }

        /**
         * @return clientTag
         */
        public String getClientTag() {
            return this.clientTag;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String clientTag; 
            private Integer index; 
            private String userId; 

            /**
             * ClientTag.
             */
            public Builder clientTag(String clientTag) {
                this.clientTag = clientTag;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public CurrentFaceInfos build() {
                return new CurrentFaceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAddUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAddUserInfoResponseBody</p>
     */
    public static class FailedFaceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientTag")
        private String clientTag;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private FailedFaceInfos(Builder builder) {
            this.clientTag = builder.clientTag;
            this.index = builder.index;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedFaceInfos create() {
            return builder().build();
        }

        /**
         * @return clientTag
         */
        public String getClientTag() {
            return this.clientTag;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String clientTag; 
            private Integer index; 
            private String userId; 

            /**
             * ClientTag.
             */
            public Builder clientTag(String clientTag) {
                this.clientTag = clientTag;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FailedFaceInfos build() {
                return new FailedFaceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAddUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAddUserInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentFaceInfos")
        private java.util.List<CurrentFaceInfos> currentFaceInfos;

        @com.aliyun.core.annotation.NameInMap("FailedFaceInfos")
        private java.util.List<FailedFaceInfos> failedFaceInfos;

        private Data(Builder builder) {
            this.currentFaceInfos = builder.currentFaceInfos;
            this.failedFaceInfos = builder.failedFaceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentFaceInfos
         */
        public java.util.List<CurrentFaceInfos> getCurrentFaceInfos() {
            return this.currentFaceInfos;
        }

        /**
         * @return failedFaceInfos
         */
        public java.util.List<FailedFaceInfos> getFailedFaceInfos() {
            return this.failedFaceInfos;
        }

        public static final class Builder {
            private java.util.List<CurrentFaceInfos> currentFaceInfos; 
            private java.util.List<FailedFaceInfos> failedFaceInfos; 

            /**
             * CurrentFaceInfos.
             */
            public Builder currentFaceInfos(java.util.List<CurrentFaceInfos> currentFaceInfos) {
                this.currentFaceInfos = currentFaceInfos;
                return this;
            }

            /**
             * FailedFaceInfos.
             */
            public Builder failedFaceInfos(java.util.List<FailedFaceInfos> failedFaceInfos) {
                this.failedFaceInfos = failedFaceInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
