// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRegionsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Result(Builder builder) {
            this.id = builder.id;
            this.online = builder.online;
            this.regionId = builder.regionId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Integer id; 
            private Boolean online; 
            private String regionId; 
            private String title; 

            /**
             * Id
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
