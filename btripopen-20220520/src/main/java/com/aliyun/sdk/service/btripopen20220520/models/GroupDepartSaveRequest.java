// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GroupDepartSaveRequest} extends {@link RequestModel}
 *
 * <p>GroupDepartSaveRequest</p>
 */
public class GroupDepartSaveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dept_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deptName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manager_ids")
    private String managerIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outer_dept_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerDeptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outer_dept_pid")
    private String outerDeptPid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sub_corp_id_list")
    private java.util.List < String > subCorpIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sync_group")
    private Boolean syncGroup;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
         * <p>This parameter is required.</p>
         */
        public Builder deptName(String deptName) {
            this.putBodyParameter("dept_name", deptName);
            this.deptName = deptName;
            return this;
        }

        /**
         * manager_ids.
         */
        public Builder managerIds(String managerIds) {
            this.putBodyParameter("manager_ids", managerIds);
            this.managerIds = managerIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
        public Builder outerDeptId(String outerDeptId) {
            this.putBodyParameter("outer_dept_id", outerDeptId);
            this.outerDeptId = outerDeptId;
            return this;
        }

        /**
         * outer_dept_pid.
         */
        public Builder outerDeptPid(String outerDeptPid) {
            this.putBodyParameter("outer_dept_pid", outerDeptPid);
            this.outerDeptPid = outerDeptPid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
