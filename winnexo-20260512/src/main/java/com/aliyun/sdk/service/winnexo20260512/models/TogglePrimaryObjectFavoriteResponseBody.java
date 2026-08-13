// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link TogglePrimaryObjectFavoriteResponseBody} extends {@link TeaModel}
 *
 * <p>TogglePrimaryObjectFavoriteResponseBody</p>
 */
public class TogglePrimaryObjectFavoriteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("favoriteCount")
    private Long favoriteCount;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    private TogglePrimaryObjectFavoriteResponseBody(Builder builder) {
        this.code = builder.code;
        this.favoriteCount = builder.favoriteCount;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TogglePrimaryObjectFavoriteResponseBody create() {
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
     * @return favoriteCount
     */
    public Long getFavoriteCount() {
        return this.favoriteCount;
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
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String code; 
        private Long favoriteCount; 
        private String message; 
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(TogglePrimaryObjectFavoriteResponseBody model) {
            this.code = model.code;
            this.favoriteCount = model.favoriteCount;
            this.message = model.message;
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>该用户的关注总数（针对该对象类型）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder favoriteCount(Long favoriteCount) {
            this.favoriteCount = favoriteCount;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public TogglePrimaryObjectFavoriteResponseBody build() {
            return new TogglePrimaryObjectFavoriteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TogglePrimaryObjectFavoriteResponseBody} extends {@link TeaModel}
     *
     * <p>TogglePrimaryObjectFavoriteResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isFavorited")
        private Boolean isFavorited;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        private Results(Builder builder) {
            this.isFavorited = builder.isFavorited;
            this.message = builder.message;
            this.objectId = builder.objectId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return isFavorited
         */
        public Boolean getIsFavorited() {
            return this.isFavorited;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Boolean isFavorited; 
            private String message; 
            private String objectId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.isFavorited = model.isFavorited;
                this.message = model.message;
                this.objectId = model.objectId;
                this.success = model.success;
            } 

            /**
             * <p>操作后是否已关注</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFavorited(Boolean isFavorited) {
                this.isFavorited = isFavorited;
                return this;
            }

            /**
             * <p>失败原因（成功时为 null）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>主对象业务ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>操作是否成功</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
