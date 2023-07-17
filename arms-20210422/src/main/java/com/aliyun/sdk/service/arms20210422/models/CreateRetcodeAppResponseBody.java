// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRetcodeAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRetcodeAppResponseBody</p>
 */
public class CreateRetcodeAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetcodeAppDataBean")
    private RetcodeAppDataBean retcodeAppDataBean;

    private CreateRetcodeAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.retcodeAppDataBean = builder.retcodeAppDataBean;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRetcodeAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retcodeAppDataBean
     */
    public RetcodeAppDataBean getRetcodeAppDataBean() {
        return this.retcodeAppDataBean;
    }

    public static final class Builder {
        private String requestId; 
        private RetcodeAppDataBean retcodeAppDataBean; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RetcodeAppDataBean.
         */
        public Builder retcodeAppDataBean(RetcodeAppDataBean retcodeAppDataBean) {
            this.retcodeAppDataBean = retcodeAppDataBean;
            return this;
        }

        public CreateRetcodeAppResponseBody build() {
            return new CreateRetcodeAppResponseBody(this);
        } 

    } 

    public static class RetcodeAppDataBean extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("Pid")
        private String pid;

        private RetcodeAppDataBean(Builder builder) {
            this.appId = builder.appId;
            this.pid = builder.pid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetcodeAppDataBean create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        public static final class Builder {
            private Long appId; 
            private String pid; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            public RetcodeAppDataBean build() {
                return new RetcodeAppDataBean(this);
            } 

        } 

    }
}
