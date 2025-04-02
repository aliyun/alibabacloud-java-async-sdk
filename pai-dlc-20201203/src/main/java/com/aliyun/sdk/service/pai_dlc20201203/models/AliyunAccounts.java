// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link AliyunAccounts} extends {@link TeaModel}
 *
 * <p>AliyunAccounts</p>
 */
public class AliyunAccounts extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunUid")
    private String aliyunUid;

    @com.aliyun.core.annotation.NameInMap("EmployeeId")
    private String employeeId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AliyunAccounts model) {
            this.aliyunUid = model.aliyunUid;
            this.employeeId = model.employeeId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
        } 

        /**
         * AliyunUid.
         */
        public Builder aliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * EmployeeId.
         */
        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifyTime.
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
