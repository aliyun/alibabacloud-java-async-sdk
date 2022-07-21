// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AliyunAccounts} extends {@link TeaModel}
 *
 * <p>AliyunAccounts</p>
 */
public class AliyunAccounts extends TeaModel {
    @NameInMap("AliyunUid")
    private String aliyunUid;

    @NameInMap("EmployeeId")
    private String employeeId;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    private AliyunAccounts(Builder builder) {
        this.aliyunUid = builder.aliyunUid;
        this.employeeId = builder.employeeId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AliyunAccounts create() {
        return builder().build();
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    /**
     * @return employeeId
     */
    public String getEmployeeId() {
        return this.employeeId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public static final class Builder {
        private String aliyunUid; 
        private String employeeId; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 

        /**
         * Aliyun账号的UID
         */
        public Builder aliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * 弹内用户的工号
         */
        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        /**
         * 这条记录的创建时间
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * 这条记录的上次修改时间
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        public AliyunAccounts build() {
            return new AliyunAccounts(this);
        } 

    } 

}
