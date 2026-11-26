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
 * {@link QueryMusicTypeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMusicTypeResponseBody</p>
 */
public class QueryMusicTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private QueryMusicTypeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMusicTypeResponseBody create() {
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

        private Builder(QueryMusicTypeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code returned by the alarm service</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>设备账号未关联</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>request ID</p>
         * 
         * <strong>example:</strong>
         * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of ringtone types</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public QueryMusicTypeResponseBody build() {
            return new QueryMusicTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMusicTypeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMusicTypeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MusicType")
        private Long musicType;

        @com.aliyun.core.annotation.NameInMap("MusicTypeName")
        private String musicTypeName;

        private Result(Builder builder) {
            this.musicType = builder.musicType;
            this.musicTypeName = builder.musicTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return musicType
         */
        public Long getMusicType() {
            return this.musicType;
        }

        /**
         * @return musicTypeName
         */
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        public static final class Builder {
            private Long musicType; 
            private String musicTypeName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.musicType = model.musicType;
                this.musicTypeName = model.musicTypeName;
            } 

            /**
             * <p>Ringtone type ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder musicType(Long musicType) {
                this.musicType = musicType;
                return this;
            }

            /**
             * <p>Name of the ringtone category</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder musicTypeName(String musicTypeName) {
                this.musicTypeName = musicTypeName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
