// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeListResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListResourcesResponseBody</p>
 */
public class DescribeListResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeListResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListResourcesResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String errorCode; 
        private String msg; 
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public DescribeListResourcesResponseBody build() {
            return new DescribeListResourcesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("OssLink")
        private java.util.List < String > ossLink;

        @NameInMap("TrackId")
        private String trackId;

        private Data(Builder builder) {
            this.ossLink = builder.ossLink;
            this.trackId = builder.trackId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ossLink
         */
        public java.util.List < String > getOssLink() {
            return this.ossLink;
        }

        /**
         * @return trackId
         */
        public String getTrackId() {
            return this.trackId;
        }

        public static final class Builder {
            private java.util.List < String > ossLink; 
            private String trackId; 

            /**
             * OssLink.
             */
            public Builder ossLink(java.util.List < String > ossLink) {
                this.ossLink = ossLink;
                return this;
            }

            /**
             * TrackId.
             */
            public Builder trackId(String trackId) {
                this.trackId = trackId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
