// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link AddDepartmentRequest} extends {@link RequestModel}
 *
 * <p>AddDepartmentRequest</p>
 */
public class AddDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dept_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deptName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manager_employee_id_list")
    private java.util.List<String> managerEmployeeIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_dept_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outDeptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_dept_pid")
    private String outDeptPid;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private AddDepartmentRequest(Builder builder) {
        super(builder);
        this.deptName = builder.deptName;
        this.managerEmployeeIdList = builder.managerEmployeeIdList;
        this.outDeptId = builder.outDeptId;
        this.outDeptPid = builder.outDeptPid;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDepartmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deptName
     */
    public String getDeptName() {
        return this.deptName;
    }

    /**
     * @return managerEmployeeIdList
     */
    public java.util.List<String> getManagerEmployeeIdList() {
        return this.managerEmployeeIdList;
    }

    /**
     * @return outDeptId
     */
    public String getOutDeptId() {
        return this.outDeptId;
    }

    /**
     * @return outDeptPid
     */
    public String getOutDeptPid() {
        return this.outDeptPid;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<AddDepartmentRequest, Builder> {
        private String deptName; 
        private java.util.List<String> managerEmployeeIdList; 
        private String outDeptId; 
        private String outDeptPid; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(AddDepartmentRequest request) {
            super(request);
            this.deptName = request.deptName;
            this.managerEmployeeIdList = request.managerEmployeeIdList;
            this.outDeptId = request.outDeptId;
            this.outDeptPid = request.outDeptPid;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deptName(String deptName) {
            this.putBodyParameter("dept_name", deptName);
            this.deptName = deptName;
            return this;
        }

        /**
         * manager_employee_id_list.
         */
        public Builder managerEmployeeIdList(java.util.List<String> managerEmployeeIdList) {
            String managerEmployeeIdListShrink = shrink(managerEmployeeIdList, "manager_employee_id_list", "json");
            this.putBodyParameter("manager_employee_id_list", managerEmployeeIdListShrink);
            this.managerEmployeeIdList = managerEmployeeIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dept123</p>
         */
        public Builder outDeptId(String outDeptId) {
            this.putBodyParameter("out_dept_id", outDeptId);
            this.outDeptId = outDeptId;
            return this;
        }

        /**
         * out_dept_pid.
         */
        public Builder outDeptPid(String outDeptPid) {
            this.putBodyParameter("out_dept_pid", outDeptPid);
            this.outDeptPid = outDeptPid;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public AddDepartmentRequest build() {
            return new AddDepartmentRequest(this);
        } 

    } 

}
