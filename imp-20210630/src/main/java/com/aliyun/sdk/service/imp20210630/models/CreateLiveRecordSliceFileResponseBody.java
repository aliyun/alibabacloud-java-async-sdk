// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveRecordSliceFileResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveRecordSliceFileResponseBody</p>
 */
public class CreateLiveRecordSliceFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateLiveRecordSliceFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveRecordSliceFileResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 创建场景化直播返回的结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateLiveRecordSliceFileResponseBody build() {
            return new CreateLiveRecordSliceFileResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("SliceRecordUrl")
        private String sliceRecordUrl;

        private Result(Builder builder) {
            this.sliceRecordUrl = builder.sliceRecordUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return sliceRecordUrl
         */
        public String getSliceRecordUrl() {
            return this.sliceRecordUrl;
        }

        public static final class Builder {
            private String sliceRecordUrl; 

            /**
             * 片段录制文件的地址。
             */
            public Builder sliceRecordUrl(String sliceRecordUrl) {
                this.sliceRecordUrl = sliceRecordUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
