// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveDomainStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveDomainStatusResponseBody</p>
 */
public class GetLiveDomainStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetLiveDomainStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveDomainStatusResponseBody create() {
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

        public GetLiveDomainStatusResponseBody build() {
            return new GetLiveDomainStatusResponseBody(this);
        } 

    } 

    public static class LiveDomainInfoList extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Status")
        private String status;

        private LiveDomainInfoList(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainInfoList create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cname; 
            private String domain; 
            private String status; 

            /**
             * 直播域名CNAME
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * 直播域名
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * 直播域名状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LiveDomainInfoList build() {
                return new LiveDomainInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("LiveDomainInfoList")
        private java.util.List < LiveDomainInfoList> liveDomainInfoList;

        private Result(Builder builder) {
            this.liveDomainInfoList = builder.liveDomainInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return liveDomainInfoList
         */
        public java.util.List < LiveDomainInfoList> getLiveDomainInfoList() {
            return this.liveDomainInfoList;
        }

        public static final class Builder {
            private java.util.List < LiveDomainInfoList> liveDomainInfoList; 

            /**
             * 直播域名信息列表
             */
            public Builder liveDomainInfoList(java.util.List < LiveDomainInfoList> liveDomainInfoList) {
                this.liveDomainInfoList = liveDomainInfoList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
