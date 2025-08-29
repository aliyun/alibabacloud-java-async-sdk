// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link PrivilegeTransferResultEntrie} extends {@link TeaModel}
 *
 * <p>PrivilegeTransferResultEntrie</p>
 */
public class PrivilegeTransferResultEntrie extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List<PrivilegeTransferResultEntrie> children;

    @com.aliyun.core.annotation.NameInMap("ErrMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("IsLeaf")
    private Boolean isLeaf;

    @com.aliyun.core.annotation.NameInMap("Privilege")
    private String privilege;

    @com.aliyun.core.annotation.NameInMap("PrivilegeDisplayName")
    private String privilegeDisplayName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Test")
    private String test;

    private PrivilegeTransferResultEntrie(Builder builder) {
        this.children = builder.children;
        this.errMsg = builder.errMsg;
        this.isLeaf = builder.isLeaf;
        this.privilege = builder.privilege;
        this.privilegeDisplayName = builder.privilegeDisplayName;
        this.status = builder.status;
        this.test = builder.test;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrivilegeTransferResultEntrie create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return children
     */
    public java.util.List<PrivilegeTransferResultEntrie> getChildren() {
        return this.children;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return isLeaf
     */
    public Boolean getIsLeaf() {
        return this.isLeaf;
    }

    /**
     * @return privilege
     */
    public String getPrivilege() {
        return this.privilege;
    }

    /**
     * @return privilegeDisplayName
     */
    public String getPrivilegeDisplayName() {
        return this.privilegeDisplayName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return test
     */
    public String getTest() {
        return this.test;
    }

    public static final class Builder {
        private java.util.List<PrivilegeTransferResultEntrie> children; 
        private String errMsg; 
        private Boolean isLeaf; 
        private String privilege; 
        private String privilegeDisplayName; 
        private String status; 
        private String test; 

        private Builder() {
        } 

        private Builder(PrivilegeTransferResultEntrie model) {
            this.children = model.children;
            this.errMsg = model.errMsg;
            this.isLeaf = model.isLeaf;
            this.privilege = model.privilege;
            this.privilegeDisplayName = model.privilegeDisplayName;
            this.status = model.status;
            this.test = model.test;
        } 

        /**
         * Children.
         */
        public Builder children(java.util.List<PrivilegeTransferResultEntrie> children) {
            this.children = children;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * IsLeaf.
         */
        public Builder isLeaf(Boolean isLeaf) {
            this.isLeaf = isLeaf;
            return this;
        }

        /**
         * Privilege.
         */
        public Builder privilege(String privilege) {
            this.privilege = privilege;
            return this;
        }

        /**
         * PrivilegeDisplayName.
         */
        public Builder privilegeDisplayName(String privilegeDisplayName) {
            this.privilegeDisplayName = privilegeDisplayName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Test.
         */
        public Builder test(String test) {
            this.test = test;
            return this;
        }

        public PrivilegeTransferResultEntrie build() {
            return new PrivilegeTransferResultEntrie(this);
        } 

    } 

}
