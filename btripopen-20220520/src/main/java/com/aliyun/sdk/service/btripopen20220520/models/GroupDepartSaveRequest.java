// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupDepartSaveRequest} extends {@link RequestModel}
 *
 * <p>GroupDepartSaveRequest</p>
 */
public class GroupDepartSaveRequest extends Request {
    @Body
    @NameInMap("dept_name")
    @Validation(required = true)
    private String deptName;

    @Body
    @NameInMap("manager_ids")
    private String managerIds;

    @Body
    @NameInMap("outer_dept_id")
    @Validation(required = true)
    private String outerDeptId;

    @Body
    @NameInMap("outer_dept_pid")
    private String outerDeptPid;

    @Body
    @NameInMap("status")
    @Validation(required = true)
    private Integer status;

    @Body
    @NameInMap("sub_corp_id_list")
    private java.util.List < String > subCorpIdList;

    @Body
    @NameInMap("sync_group")
    private Boolean syncGroup;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private GroupDepartSaveRequest(Builder builder) {
        super(builder);
        this.deptName = builder.deptName;
        this.managerIds = builder.managerIds;
        this.outerDeptId = builder.outerDeptId;
        this.outerDeptPid = builder.outerDeptPid;
        this.status = builder.status;
        this.subCorpIdList = builder.subCorpIdList;
        this.syncGroup = builder.syncGroup;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupDepartSaveRequest create() {
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
     * @return managerIds
     */
    public String getManagerIds() {
        return this.managerIds;
    }

    /**
     * @return outerDeptId
     */
    public String getOuterDeptId() {
        return this.outerDeptId;
    }

    /**
     * @return outerDeptPid
     */
    public String getOuterDeptPid() {
        return this.outerDeptPid;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return subCorpIdList
     */
    public java.util.List < String > getSubCorpIdList() {
        return this.subCorpIdList;
    }

    /**
     * @return syncGroup
     */
    public Boolean getSyncGroup() {
        return this.syncGroup;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<GroupDepartSaveRequest, Builder> {
        private String deptName; 
        private String managerIds; 
        private String outerDeptId; 
        private String outerDeptPid; 
        private Integer status; 
        private java.util.List < String > subCorpIdList; 
        private Boolean syncGroup; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(GroupDepartSaveRequest request) {
            super(request);
            this.deptName = request.deptName;
            this.managerIds = request.managerIds;
            this.outerDeptId = request.outerDeptId;
            this.outerDeptPid = request.outerDeptPid;
            this.status = request.status;
            this.subCorpIdList = request.subCorpIdList;
            this.syncGroup = request.syncGroup;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 部门名称
         */
        public Builder deptName(String deptName) {
            this.putBodyParameter("dept_name", deptName);
            this.deptName = deptName;
            return this;
        }

        /**
         * 部门主管ID列表
         */
        public Builder managerIds(String managerIds) {
            this.putBodyParameter("manager_ids", managerIds);
            this.managerIds = managerIds;
            return this;
        }

        /**
         * 三方部门ID
         */
        public Builder outerDeptId(String outerDeptId) {
            this.putBodyParameter("outer_dept_id", outerDeptId);
            this.outerDeptId = outerDeptId;
            return this;
        }

        /**
         * 三方父级部门ID
         */
        public Builder outerDeptPid(String outerDeptPid) {
            this.putBodyParameter("outer_dept_pid", outerDeptPid);
            this.outerDeptPid = outerDeptPid;
            return this;
        }

        /**
         * 部门状态，0生效；1失效
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * sub_corp_id_list.
         */
        public Builder subCorpIdList(java.util.List < String > subCorpIdList) {
            String subCorpIdListShrink = shrink(subCorpIdList, "sub_corp_id_list", "json");
            this.putBodyParameter("sub_corp_id_list", subCorpIdListShrink);
            this.subCorpIdList = subCorpIdList;
            return this;
        }

        /**
         * sync_group.
         */
        public Builder syncGroup(Boolean syncGroup) {
            this.putBodyParameter("sync_group", syncGroup);
            this.syncGroup = syncGroup;
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
        public GroupDepartSaveRequest build() {
            return new GroupDepartSaveRequest(this);
        } 

    } 

}
