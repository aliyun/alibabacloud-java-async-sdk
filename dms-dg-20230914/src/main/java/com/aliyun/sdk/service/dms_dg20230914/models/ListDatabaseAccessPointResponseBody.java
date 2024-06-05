// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabaseAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabaseAccessPointResponseBody</p>
 */
public class ListDatabaseAccessPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("DbInstanceAccessPointList")
    private java.util.List < DbInstanceAccessPointList> dbInstanceAccessPointList;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ListDatabaseAccessPointResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.dbInstanceAccessPointList = builder.dbInstanceAccessPointList;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseAccessPointResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return dbInstanceAccessPointList
     */
    public java.util.List < DbInstanceAccessPointList> getDbInstanceAccessPointList() {
        return this.dbInstanceAccessPointList;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List < DbInstanceAccessPointList> dbInstanceAccessPointList; 
        private String errorMsg; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * DbInstanceAccessPointList.
         */
        public Builder dbInstanceAccessPointList(java.util.List < DbInstanceAccessPointList> dbInstanceAccessPointList) {
            this.dbInstanceAccessPointList = dbInstanceAccessPointList;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListDatabaseAccessPointResponseBody build() {
            return new ListDatabaseAccessPointResponseBody(this);
        } 

    } 

    public static class DbInstanceAccessPointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessAddr")
        private String accessAddr;

        @com.aliyun.core.annotation.NameInMap("AccessPort")
        private Integer accessPort;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("RouterId")
        private String routerId;

        @com.aliyun.core.annotation.NameInMap("VpcAzoneId")
        private String vpcAzoneId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private DbInstanceAccessPointList(Builder builder) {
            this.accessAddr = builder.accessAddr;
            this.accessPort = builder.accessPort;
            this.dbInstanceId = builder.dbInstanceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.routerId = builder.routerId;
            this.vpcAzoneId = builder.vpcAzoneId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstanceAccessPointList create() {
            return builder().build();
        }

        /**
         * @return accessAddr
         */
        public String getAccessAddr() {
            return this.accessAddr;
        }

        /**
         * @return accessPort
         */
        public Integer getAccessPort() {
            return this.accessPort;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return routerId
         */
        public String getRouterId() {
            return this.routerId;
        }

        /**
         * @return vpcAzoneId
         */
        public String getVpcAzoneId() {
            return this.vpcAzoneId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String accessAddr; 
            private Integer accessPort; 
            private String dbInstanceId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String routerId; 
            private String vpcAzoneId; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * AccessAddr.
             */
            public Builder accessAddr(String accessAddr) {
                this.accessAddr = accessAddr;
                return this;
            }

            /**
             * AccessPort.
             */
            public Builder accessPort(Integer accessPort) {
                this.accessPort = accessPort;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * RouterId.
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * VpcAzoneId.
             */
            public Builder vpcAzoneId(String vpcAzoneId) {
                this.vpcAzoneId = vpcAzoneId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public DbInstanceAccessPointList build() {
                return new DbInstanceAccessPointList(this);
            } 

        } 

    }
}
