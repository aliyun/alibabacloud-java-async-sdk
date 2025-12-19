// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppAiStaff} extends {@link TeaModel}
 *
 * <p>AppAiStaff</p>
 */
public class AppAiStaff extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("StaffId")
    private String staffId;

    @com.aliyun.core.annotation.NameInMap("StaffName")
    private String staffName;

    @com.aliyun.core.annotation.NameInMap("StaffType")
    private String staffType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private AppAiStaff(Builder builder) {
        this.staffId = builder.staffId;
        this.staffName = builder.staffName;
        this.staffType = builder.staffType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppAiStaff create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return staffId
     */
    public String getStaffId() {
        return this.staffId;
    }

    /**
     * @return staffName
     */
    public String getStaffName() {
        return this.staffName;
    }

    /**
     * @return staffType
     */
    public String getStaffType() {
        return this.staffType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String staffId; 
        private String staffName; 
        private String staffType; 
        private String status; 

        private Builder() {
        } 

        private Builder(AppAiStaff model) {
            this.staffId = model.staffId;
            this.staffName = model.staffName;
            this.staffType = model.staffType;
            this.status = model.status;
        } 

        /**
         * StaffId.
         */
        public Builder staffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        /**
         * StaffName.
         */
        public Builder staffName(String staffName) {
            this.staffName = staffName;
            return this;
        }

        /**
         * StaffType.
         */
        public Builder staffType(String staffType) {
            this.staffType = staffType;
            return this;
        }

        /**
         * <p>可能的值：unknown, init, testing, online</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AppAiStaff build() {
            return new AppAiStaff(this);
        } 

    } 

}
