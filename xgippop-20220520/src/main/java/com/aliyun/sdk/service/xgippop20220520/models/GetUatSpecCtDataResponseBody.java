// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUatSpecCtDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetUatSpecCtDataResponseBody</p>
 */
public class GetUatSpecCtDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetUatSpecCtDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rt = builder.rt;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUatSpecCtDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
     * @return rt
     */
    public Long getRt() {
        return this.rt;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Long rt; 
        private Boolean success; 

        /**
         * 结果码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 结果
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 结果描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求链路ID，如POP请求进来的requestId，返回时原样返回
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务端处理耗时，ms
         */
        public Builder rt(Long rt) {
            this.rt = rt;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUatSpecCtDataResponseBody build() {
            return new GetUatSpecCtDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("MonthCount")
        private Long monthCount;

        @NameInMap("SpecType")
        private String specType;

        private Data(Builder builder) {
            this.monthCount = builder.monthCount;
            this.specType = builder.specType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return monthCount
         */
        public Long getMonthCount() {
            return this.monthCount;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        public static final class Builder {
            private Long monthCount; 
            private String specType; 

            /**
             * 月总量
             */
            public Builder monthCount(Long monthCount) {
                this.monthCount = monthCount;
                return this;
            }

            /**
             * 规格类型
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
