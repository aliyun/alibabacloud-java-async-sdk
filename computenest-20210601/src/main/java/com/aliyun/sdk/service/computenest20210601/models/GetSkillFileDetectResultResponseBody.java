// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetSkillFileDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillFileDetectResultResponseBody</p>
 */
public class GetSkillFileDetectResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HashKey")
    private String hashKey;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Integer result;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Integer score;

    private GetSkillFileDetectResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.hashKey = builder.hashKey;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.score = builder.score;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillFileDetectResultResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String code; 
        private String hashKey; 
        private String message; 
        private String requestId; 
        private Integer result; 
        private Integer score; 

        private Builder() {
        } 

        private Builder(GetSkillFileDetectResultResponseBody model) {
            this.code = model.code;
            this.hashKey = model.hashKey;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.score = model.score;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetSkillFileDetectResultResponseBody build() {
            return new GetSkillFileDetectResultResponseBody(this);
        } 

    } 

}
