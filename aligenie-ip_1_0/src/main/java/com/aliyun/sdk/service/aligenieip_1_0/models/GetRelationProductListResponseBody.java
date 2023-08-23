// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRelationProductListResponseBody} extends {@link TeaModel}
 *
 * <p>GetRelationProductListResponseBody</p>
 */
public class GetRelationProductListResponseBody extends TeaModel {
    @NameInMap("Extentions")
    private java.util.Map < String, ? > extentions;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private GetRelationProductListResponseBody(Builder builder) {
        this.extentions = builder.extentions;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRelationProductListResponseBody create() {
        return builder().build();
    }

    /**
     * @return extentions
     */
    public java.util.Map < String, ? > getExtentions() {
        return this.extentions;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private java.util.Map < String, ? > extentions; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer statusCode; 

        /**
         * Extentions.
         */
        public Builder extentions(java.util.Map < String, ? > extentions) {
            this.extentions = extentions;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public GetRelationProductListResponseBody build() {
            return new GetRelationProductListResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Pk")
        private String pk;

        private Result(Builder builder) {
            this.name = builder.name;
            this.pk = builder.pk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        public static final class Builder {
            private String name; 
            private String pk; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
