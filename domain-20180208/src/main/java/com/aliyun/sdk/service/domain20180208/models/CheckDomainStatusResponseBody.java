// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link CheckDomainStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainStatusResponseBody</p>
 */
public class CheckDomainStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CheckDomainStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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
        private String errorCode; 
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CheckDomainStatusResponseBody model) {
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
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

        public CheckDomainStatusResponseBody build() {
            return new CheckDomainStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckDomainStatusResponseBody} extends {@link TeaModel}
     *
     * <p>CheckDomainStatusResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadDate")
        private Long deadDate;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Float price;

        @com.aliyun.core.annotation.NameInMap("RegDate")
        private Long regDate;

        private Module(Builder builder) {
            this.deadDate = builder.deadDate;
            this.domain = builder.domain;
            this.endTime = builder.endTime;
            this.price = builder.price;
            this.regDate = builder.regDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return deadDate
         */
        public Long getDeadDate() {
            return this.deadDate;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return regDate
         */
        public Long getRegDate() {
            return this.regDate;
        }

        public static final class Builder {
            private Long deadDate; 
            private String domain; 
            private Long endTime; 
            private Float price; 
            private Long regDate; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.deadDate = model.deadDate;
                this.domain = model.domain;
                this.endTime = model.endTime;
                this.price = model.price;
                this.regDate = model.regDate;
            } 

            /**
             * DeadDate.
             */
            public Builder deadDate(Long deadDate) {
                this.deadDate = deadDate;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * RegDate.
             */
            public Builder regDate(Long regDate) {
                this.regDate = regDate;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
