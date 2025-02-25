// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUnbeianIpCheckTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListUnbeianIpCheckTypeResponseBody</p>
 */
public class ListUnbeianIpCheckTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HuntressIpCheckTypeResultDO")
    private HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListUnbeianIpCheckTypeResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.huntressIpCheckTypeResultDO = builder.huntressIpCheckTypeResultDO;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnbeianIpCheckTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return huntressIpCheckTypeResultDO
     */
    public HuntressIpCheckTypeResultDO getHuntressIpCheckTypeResultDO() {
        return this.huntressIpCheckTypeResultDO;
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
        private Integer errorCode; 
        private String errorMessage; 
        private HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HuntressIpCheckTypeResultDO.
         */
        public Builder huntressIpCheckTypeResultDO(HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO) {
            this.huntressIpCheckTypeResultDO = huntressIpCheckTypeResultDO;
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

        public ListUnbeianIpCheckTypeResponseBody build() {
            return new ListUnbeianIpCheckTypeResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private List(Builder builder) {
            this.aliuid = builder.aliuid;
            this.caller = builder.caller;
            this.checkType = builder.checkType;
            this.ip = builder.ip;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Long aliuid; 
            private String caller; 
            private Integer checkType; 
            private String ip; 
            private String remark; 

            /**
             * Aliuid.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class HuntressIpCheckTypeResultDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private HuntressIpCheckTypeResultDO(Builder builder) {
            this.list = builder.list;
            this.msg = builder.msg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HuntressIpCheckTypeResultDO create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private String msg; 
            private Boolean success; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public HuntressIpCheckTypeResultDO build() {
                return new HuntressIpCheckTypeResultDO(this);
            } 

        } 

    }
}
