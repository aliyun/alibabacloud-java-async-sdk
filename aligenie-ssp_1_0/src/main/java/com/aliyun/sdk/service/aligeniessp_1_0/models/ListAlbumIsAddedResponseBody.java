// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListAlbumIsAddedResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlbumIsAddedResponseBody</p>
 */
public class ListAlbumIsAddedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListAlbumIsAddedResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlbumIsAddedResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListAlbumIsAddedResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Additional information</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>BCC85E69-5DA6-197E-A8C1-8A1B19CF781B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListAlbumIsAddedResponseBody build() {
            return new ListAlbumIsAddedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlbumIsAddedResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlbumIsAddedResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbumId")
        private String albumId;

        @com.aliyun.core.annotation.NameInMap("IsAdded")
        private String isAdded;

        private Result(Builder builder) {
            this.albumId = builder.albumId;
            this.isAdded = builder.isAdded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return albumId
         */
        public String getAlbumId() {
            return this.albumId;
        }

        /**
         * @return isAdded
         */
        public String getIsAdded() {
            return this.isAdded;
        }

        public static final class Builder {
            private String albumId; 
            private String isAdded; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.albumId = model.albumId;
                this.isAdded = model.isAdded;
            } 

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>51999575</p>
             */
            public Builder albumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            /**
             * <p>Whether it is subscribed</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAdded(String isAdded) {
                this.isAdded = isAdded;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
