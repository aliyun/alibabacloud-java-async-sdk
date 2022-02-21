// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCnameDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCnameDetailResponseBody</p>
 */
public class GetCnameDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetCnameDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCnameDetailResponseBody create() {
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetCnameDetailResponseBody build() {
            return new GetCnameDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.cname = builder.cname;
            this.domainName = builder.domainName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cname; 
            private String domainName; 
            private Integer status; 

            /**
             * cname名称
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * 域名名称
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * cname的状态
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Data")
        private java.util.List < Data> data;

        private Result(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < Data> data; 

            /**
             * 应用列表信息
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
