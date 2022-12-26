// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAgentInstallStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgentInstallStatusResponseBody</p>
 */
public class DescribeAgentInstallStatusResponseBody extends TeaModel {
    @NameInMap("AegisClientInvokeStatusResponseList")
    private java.util.List < AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAgentInstallStatusResponseBody(Builder builder) {
        this.aegisClientInvokeStatusResponseList = builder.aegisClientInvokeStatusResponseList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgentInstallStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return aegisClientInvokeStatusResponseList
     */
    public java.util.List < AegisClientInvokeStatusResponseList> getAegisClientInvokeStatusResponseList() {
        return this.aegisClientInvokeStatusResponseList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList; 
        private String requestId; 

        /**
         * AegisClientInvokeStatusResponseList.
         */
        public Builder aegisClientInvokeStatusResponseList(java.util.List < AegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList) {
            this.aegisClientInvokeStatusResponseList = aegisClientInvokeStatusResponseList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAgentInstallStatusResponseBody build() {
            return new DescribeAgentInstallStatusResponseBody(this);
        } 

    } 

    public static class AegisClientInvokeStatusResponseList extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("ResuleCode")
        private String resuleCode;

        @NameInMap("Result")
        private Integer result;

        @NameInMap("Uuid")
        private String uuid;

        private AegisClientInvokeStatusResponseList(Builder builder) {
            this.message = builder.message;
            this.resuleCode = builder.resuleCode;
            this.result = builder.result;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AegisClientInvokeStatusResponseList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return resuleCode
         */
        public String getResuleCode() {
            return this.resuleCode;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String message; 
            private String resuleCode; 
            private Integer result; 
            private String uuid; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ResuleCode.
             */
            public Builder resuleCode(String resuleCode) {
                this.resuleCode = resuleCode;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AegisClientInvokeStatusResponseList build() {
                return new AegisClientInvokeStatusResponseList(this);
            } 

        } 

    }
}
