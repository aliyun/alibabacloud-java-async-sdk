// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkValidateStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SdkValidateStatusResponseBody</p>
 */
public class SdkValidateStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private SdkValidateStatusResponseBody(Builder builder) {
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

    public static SdkValidateStatusResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
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
        public Builder data(Data data) {
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

        public SdkValidateStatusResponseBody build() {
            return new SdkValidateStatusResponseBody(this);
        } 

    } 

    public static class AppExtPopList extends TeaModel {
        @NameInMap("ExtId")
        private Long extId;

        @NameInMap("FlowIp")
        private java.util.List < String > flowIp;

        @NameInMap("FlowUrl")
        private java.util.List < String > flowUrl;

        @NameInMap("OriginalIpList")
        private java.util.List < String > originalIpList;

        @NameInMap("OriginalUrlList")
        private java.util.List < String > originalUrlList;

        private AppExtPopList(Builder builder) {
            this.extId = builder.extId;
            this.flowIp = builder.flowIp;
            this.flowUrl = builder.flowUrl;
            this.originalIpList = builder.originalIpList;
            this.originalUrlList = builder.originalUrlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppExtPopList create() {
            return builder().build();
        }

        /**
         * @return extId
         */
        public Long getExtId() {
            return this.extId;
        }

        /**
         * @return flowIp
         */
        public java.util.List < String > getFlowIp() {
            return this.flowIp;
        }

        /**
         * @return flowUrl
         */
        public java.util.List < String > getFlowUrl() {
            return this.flowUrl;
        }

        /**
         * @return originalIpList
         */
        public java.util.List < String > getOriginalIpList() {
            return this.originalIpList;
        }

        /**
         * @return originalUrlList
         */
        public java.util.List < String > getOriginalUrlList() {
            return this.originalUrlList;
        }

        public static final class Builder {
            private Long extId; 
            private java.util.List < String > flowIp; 
            private java.util.List < String > flowUrl; 
            private java.util.List < String > originalIpList; 
            private java.util.List < String > originalUrlList; 

            /**
             * ExtId.
             */
            public Builder extId(Long extId) {
                this.extId = extId;
                return this;
            }

            /**
             * cdn ip
             */
            public Builder flowIp(java.util.List < String > flowIp) {
                this.flowIp = flowIp;
                return this;
            }

            /**
             * cdn 域名信息
             */
            public Builder flowUrl(java.util.List < String > flowUrl) {
                this.flowUrl = flowUrl;
                return this;
            }

            /**
             * 业务方ip集合
             */
            public Builder originalIpList(java.util.List < String > originalIpList) {
                this.originalIpList = originalIpList;
                return this;
            }

            /**
             * 业务方域名集合
             */
            public Builder originalUrlList(java.util.List < String > originalUrlList) {
                this.originalUrlList = originalUrlList;
                return this;
            }

            public AppExtPopList build() {
                return new AppExtPopList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppExtPopList")
        private java.util.List < AppExtPopList> appExtPopList;

        @NameInMap("FreeFlow")
        private Boolean freeFlow;

        @NameInMap("PseudoCode")
        private String pseudoCode;

        private Data(Builder builder) {
            this.appExtPopList = builder.appExtPopList;
            this.freeFlow = builder.freeFlow;
            this.pseudoCode = builder.pseudoCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appExtPopList
         */
        public java.util.List < AppExtPopList> getAppExtPopList() {
            return this.appExtPopList;
        }

        /**
         * @return freeFlow
         */
        public Boolean getFreeFlow() {
            return this.freeFlow;
        }

        /**
         * @return pseudoCode
         */
        public String getPseudoCode() {
            return this.pseudoCode;
        }

        public static final class Builder {
            private java.util.List < AppExtPopList> appExtPopList; 
            private Boolean freeFlow; 
            private String pseudoCode; 

            /**
             * AppExtPopList.
             */
            public Builder appExtPopList(java.util.List < AppExtPopList> appExtPopList) {
                this.appExtPopList = appExtPopList;
                return this;
            }

            /**
             * 是否处于免流状态，取值范围为true/false
             */
            public Builder freeFlow(Boolean freeFlow) {
                this.freeFlow = freeFlow;
                return this;
            }

            /**
             * 伪码
             */
            public Builder pseudoCode(String pseudoCode) {
                this.pseudoCode = pseudoCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
