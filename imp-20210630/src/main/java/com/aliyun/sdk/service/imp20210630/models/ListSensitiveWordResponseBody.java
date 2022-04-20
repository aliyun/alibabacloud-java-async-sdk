// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveWordResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveWordResponseBody</p>
 */
public class ListSensitiveWordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListSensitiveWordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveWordResponseBody create() {
        return builder().build();
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 调用发送直播间弹幕的返回结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListSensitiveWordResponseBody build() {
            return new ListSensitiveWordResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("WordList")
        private java.util.List < String > wordList;

        private Result(Builder builder) {
            this.wordList = builder.wordList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return wordList
         */
        public java.util.List < String > getWordList() {
            return this.wordList;
        }

        public static final class Builder {
            private java.util.List < String > wordList; 

            /**
             * WordList.
             */
            public Builder wordList(java.util.List < String > wordList) {
                this.wordList = wordList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
