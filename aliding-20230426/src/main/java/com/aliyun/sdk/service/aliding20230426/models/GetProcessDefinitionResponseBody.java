// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProcessDefinitionResponseBody</p>
 */
public class GetProcessDefinitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("formUuid")
    private String formUuid;

    @com.aliyun.core.annotation.NameInMap("originator")
    private Originator originator;

    @com.aliyun.core.annotation.NameInMap("outResult")
    private String outResult;

    @com.aliyun.core.annotation.NameInMap("owners")
    private java.util.List<Owners> owners;

    @com.aliyun.core.annotation.NameInMap("processId")
    private String processId;

    @com.aliyun.core.annotation.NameInMap("processInstanceId")
    private String processInstanceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, ?> variables;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetProcessDefinitionResponseBody(Builder builder) {
        this.formUuid = builder.formUuid;
        this.originator = builder.originator;
        this.outResult = builder.outResult;
        this.owners = builder.owners;
        this.processId = builder.processId;
        this.processInstanceId = builder.processInstanceId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.tasks = builder.tasks;
        this.title = builder.title;
        this.variables = builder.variables;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProcessDefinitionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
    }

    /**
     * @return originator
     */
    public Originator getOriginator() {
        return this.originator;
    }

    /**
     * @return outResult
     */
    public String getOutResult() {
        return this.outResult;
    }

    /**
     * @return owners
     */
    public java.util.List<Owners> getOwners() {
        return this.owners;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String formUuid; 
        private Originator originator; 
        private String outResult; 
        private java.util.List<Owners> owners; 
        private String processId; 
        private String processInstanceId; 
        private String requestId; 
        private String status; 
        private java.util.List<Tasks> tasks; 
        private String title; 
        private java.util.Map<String, ?> variables; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetProcessDefinitionResponseBody model) {
            this.formUuid = model.formUuid;
            this.originator = model.originator;
            this.outResult = model.outResult;
            this.owners = model.owners;
            this.processId = model.processId;
            this.processInstanceId = model.processInstanceId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.tasks = model.tasks;
            this.title = model.title;
            this.variables = model.variables;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * formUuid.
         */
        public Builder formUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }

        /**
         * originator.
         */
        public Builder originator(Originator originator) {
            this.originator = originator;
            return this;
        }

        /**
         * outResult.
         */
        public Builder outResult(String outResult) {
            this.outResult = outResult;
            return this;
        }

        /**
         * owners.
         */
        public Builder owners(java.util.List<Owners> owners) {
            this.owners = owners;
            return this;
        }

        /**
         * processId.
         */
        public Builder processId(String processId) {
            this.processId = processId;
            return this;
        }

        /**
         * processInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.Map<String, ?> variables) {
            this.variables = variables;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetProcessDefinitionResponseBody build() {
            return new GetProcessDefinitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class MasterDataDepartments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("DeptNameInEnglish")
        private String deptNameInEnglish;

        @com.aliyun.core.annotation.NameInMap("DeptNo")
        private String deptNo;

        @com.aliyun.core.annotation.NameInMap("DeptPath")
        private String deptPath;

        @com.aliyun.core.annotation.NameInMap("HumanSourceGroupOrderNumber")
        private String humanSourceGroupOrderNumber;

        @com.aliyun.core.annotation.NameInMap("HumanSourceGroupWorkNo")
        private String humanSourceGroupWorkNo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MasterWorkNo")
        private String masterWorkNo;

        private MasterDataDepartments(Builder builder) {
            this.deptName = builder.deptName;
            this.deptNameInEnglish = builder.deptNameInEnglish;
            this.deptNo = builder.deptNo;
            this.deptPath = builder.deptPath;
            this.humanSourceGroupOrderNumber = builder.humanSourceGroupOrderNumber;
            this.humanSourceGroupWorkNo = builder.humanSourceGroupWorkNo;
            this.id = builder.id;
            this.masterWorkNo = builder.masterWorkNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterDataDepartments create() {
            return builder().build();
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return deptNameInEnglish
         */
        public String getDeptNameInEnglish() {
            return this.deptNameInEnglish;
        }

        /**
         * @return deptNo
         */
        public String getDeptNo() {
            return this.deptNo;
        }

        /**
         * @return deptPath
         */
        public String getDeptPath() {
            return this.deptPath;
        }

        /**
         * @return humanSourceGroupOrderNumber
         */
        public String getHumanSourceGroupOrderNumber() {
            return this.humanSourceGroupOrderNumber;
        }

        /**
         * @return humanSourceGroupWorkNo
         */
        public String getHumanSourceGroupWorkNo() {
            return this.humanSourceGroupWorkNo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return masterWorkNo
         */
        public String getMasterWorkNo() {
            return this.masterWorkNo;
        }

        public static final class Builder {
            private String deptName; 
            private String deptNameInEnglish; 
            private String deptNo; 
            private String deptPath; 
            private String humanSourceGroupOrderNumber; 
            private String humanSourceGroupWorkNo; 
            private Long id; 
            private String masterWorkNo; 

            private Builder() {
            } 

            private Builder(MasterDataDepartments model) {
                this.deptName = model.deptName;
                this.deptNameInEnglish = model.deptNameInEnglish;
                this.deptNo = model.deptNo;
                this.deptPath = model.deptPath;
                this.humanSourceGroupOrderNumber = model.humanSourceGroupOrderNumber;
                this.humanSourceGroupWorkNo = model.humanSourceGroupWorkNo;
                this.id = model.id;
                this.masterWorkNo = model.masterWorkNo;
            } 

            /**
             * DeptName.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * DeptNameInEnglish.
             */
            public Builder deptNameInEnglish(String deptNameInEnglish) {
                this.deptNameInEnglish = deptNameInEnglish;
                return this;
            }

            /**
             * DeptNo.
             */
            public Builder deptNo(String deptNo) {
                this.deptNo = deptNo;
                return this;
            }

            /**
             * DeptPath.
             */
            public Builder deptPath(String deptPath) {
                this.deptPath = deptPath;
                return this;
            }

            /**
             * HumanSourceGroupOrderNumber.
             */
            public Builder humanSourceGroupOrderNumber(String humanSourceGroupOrderNumber) {
                this.humanSourceGroupOrderNumber = humanSourceGroupOrderNumber;
                return this;
            }

            /**
             * HumanSourceGroupWorkNo.
             */
            public Builder humanSourceGroupWorkNo(String humanSourceGroupWorkNo) {
                this.humanSourceGroupWorkNo = humanSourceGroupWorkNo;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MasterWorkNo.
             */
            public Builder masterWorkNo(String masterWorkNo) {
                this.masterWorkNo = masterWorkNo;
                return this;
            }

            public MasterDataDepartments build() {
                return new MasterDataDepartments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class Originator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentDescription")
        private String departmentDescription;

        @com.aliyun.core.annotation.NameInMap("DisplayEnName")
        private String displayEnName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("MasterDataDepartments")
        private java.util.List<MasterDataDepartments> masterDataDepartments;

        @com.aliyun.core.annotation.NameInMap("OrderNumber")
        private String orderNumber;

        @com.aliyun.core.annotation.NameInMap("PersonalPhoto")
        private String personalPhoto;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TbWang")
        private String tbWang;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private String userInfo;

        private Originator(Builder builder) {
            this.departmentDescription = builder.departmentDescription;
            this.displayEnName = builder.displayEnName;
            this.displayName = builder.displayName;
            this.masterDataDepartments = builder.masterDataDepartments;
            this.orderNumber = builder.orderNumber;
            this.personalPhoto = builder.personalPhoto;
            this.status = builder.status;
            this.tbWang = builder.tbWang;
            this.userId = builder.userId;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Originator create() {
            return builder().build();
        }

        /**
         * @return departmentDescription
         */
        public String getDepartmentDescription() {
            return this.departmentDescription;
        }

        /**
         * @return displayEnName
         */
        public String getDisplayEnName() {
            return this.displayEnName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return masterDataDepartments
         */
        public java.util.List<MasterDataDepartments> getMasterDataDepartments() {
            return this.masterDataDepartments;
        }

        /**
         * @return orderNumber
         */
        public String getOrderNumber() {
            return this.orderNumber;
        }

        /**
         * @return personalPhoto
         */
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tbWang
         */
        public String getTbWang() {
            return this.tbWang;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInfo
         */
        public String getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String departmentDescription; 
            private String displayEnName; 
            private String displayName; 
            private java.util.List<MasterDataDepartments> masterDataDepartments; 
            private String orderNumber; 
            private String personalPhoto; 
            private String status; 
            private String tbWang; 
            private String userId; 
            private String userInfo; 

            private Builder() {
            } 

            private Builder(Originator model) {
                this.departmentDescription = model.departmentDescription;
                this.displayEnName = model.displayEnName;
                this.displayName = model.displayName;
                this.masterDataDepartments = model.masterDataDepartments;
                this.orderNumber = model.orderNumber;
                this.personalPhoto = model.personalPhoto;
                this.status = model.status;
                this.tbWang = model.tbWang;
                this.userId = model.userId;
                this.userInfo = model.userInfo;
            } 

            /**
             * DepartmentDescription.
             */
            public Builder departmentDescription(String departmentDescription) {
                this.departmentDescription = departmentDescription;
                return this;
            }

            /**
             * DisplayEnName.
             */
            public Builder displayEnName(String displayEnName) {
                this.displayEnName = displayEnName;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * MasterDataDepartments.
             */
            public Builder masterDataDepartments(java.util.List<MasterDataDepartments> masterDataDepartments) {
                this.masterDataDepartments = masterDataDepartments;
                return this;
            }

            /**
             * OrderNumber.
             */
            public Builder orderNumber(String orderNumber) {
                this.orderNumber = orderNumber;
                return this;
            }

            /**
             * PersonalPhoto.
             */
            public Builder personalPhoto(String personalPhoto) {
                this.personalPhoto = personalPhoto;
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
             * TbWang.
             */
            public Builder tbWang(String tbWang) {
                this.tbWang = tbWang;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(String userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Originator build() {
                return new Originator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class OwnersMasterDataDepartments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("DeptNameInEnglish")
        private String deptNameInEnglish;

        @com.aliyun.core.annotation.NameInMap("DeptNo")
        private String deptNo;

        @com.aliyun.core.annotation.NameInMap("DeptPath")
        private String deptPath;

        @com.aliyun.core.annotation.NameInMap("HumanSourceGroupOrderNumber")
        private String humanSourceGroupOrderNumber;

        @com.aliyun.core.annotation.NameInMap("HumanSourceGroupWorkNo")
        private String humanSourceGroupWorkNo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MasterWorkNo")
        private String masterWorkNo;

        private OwnersMasterDataDepartments(Builder builder) {
            this.deptName = builder.deptName;
            this.deptNameInEnglish = builder.deptNameInEnglish;
            this.deptNo = builder.deptNo;
            this.deptPath = builder.deptPath;
            this.humanSourceGroupOrderNumber = builder.humanSourceGroupOrderNumber;
            this.humanSourceGroupWorkNo = builder.humanSourceGroupWorkNo;
            this.id = builder.id;
            this.masterWorkNo = builder.masterWorkNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnersMasterDataDepartments create() {
            return builder().build();
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return deptNameInEnglish
         */
        public String getDeptNameInEnglish() {
            return this.deptNameInEnglish;
        }

        /**
         * @return deptNo
         */
        public String getDeptNo() {
            return this.deptNo;
        }

        /**
         * @return deptPath
         */
        public String getDeptPath() {
            return this.deptPath;
        }

        /**
         * @return humanSourceGroupOrderNumber
         */
        public String getHumanSourceGroupOrderNumber() {
            return this.humanSourceGroupOrderNumber;
        }

        /**
         * @return humanSourceGroupWorkNo
         */
        public String getHumanSourceGroupWorkNo() {
            return this.humanSourceGroupWorkNo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return masterWorkNo
         */
        public String getMasterWorkNo() {
            return this.masterWorkNo;
        }

        public static final class Builder {
            private String deptName; 
            private String deptNameInEnglish; 
            private String deptNo; 
            private String deptPath; 
            private String humanSourceGroupOrderNumber; 
            private String humanSourceGroupWorkNo; 
            private Long id; 
            private String masterWorkNo; 

            private Builder() {
            } 

            private Builder(OwnersMasterDataDepartments model) {
                this.deptName = model.deptName;
                this.deptNameInEnglish = model.deptNameInEnglish;
                this.deptNo = model.deptNo;
                this.deptPath = model.deptPath;
                this.humanSourceGroupOrderNumber = model.humanSourceGroupOrderNumber;
                this.humanSourceGroupWorkNo = model.humanSourceGroupWorkNo;
                this.id = model.id;
                this.masterWorkNo = model.masterWorkNo;
            } 

            /**
             * DeptName.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * DeptNameInEnglish.
             */
            public Builder deptNameInEnglish(String deptNameInEnglish) {
                this.deptNameInEnglish = deptNameInEnglish;
                return this;
            }

            /**
             * DeptNo.
             */
            public Builder deptNo(String deptNo) {
                this.deptNo = deptNo;
                return this;
            }

            /**
             * DeptPath.
             */
            public Builder deptPath(String deptPath) {
                this.deptPath = deptPath;
                return this;
            }

            /**
             * HumanSourceGroupOrderNumber.
             */
            public Builder humanSourceGroupOrderNumber(String humanSourceGroupOrderNumber) {
                this.humanSourceGroupOrderNumber = humanSourceGroupOrderNumber;
                return this;
            }

            /**
             * HumanSourceGroupWorkNo.
             */
            public Builder humanSourceGroupWorkNo(String humanSourceGroupWorkNo) {
                this.humanSourceGroupWorkNo = humanSourceGroupWorkNo;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MasterWorkNo.
             */
            public Builder masterWorkNo(String masterWorkNo) {
                this.masterWorkNo = masterWorkNo;
                return this;
            }

            public OwnersMasterDataDepartments build() {
                return new OwnersMasterDataDepartments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class Owners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentDescription")
        private String departmentDescription;

        @com.aliyun.core.annotation.NameInMap("DisplayEnName")
        private String displayEnName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("MasterDataDepartments")
        private java.util.List<OwnersMasterDataDepartments> masterDataDepartments;

        @com.aliyun.core.annotation.NameInMap("OrderNumber")
        private String orderNumber;

        @com.aliyun.core.annotation.NameInMap("PersonalPhoto")
        private String personalPhoto;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TbWang")
        private String tbWang;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private String userInfo;

        private Owners(Builder builder) {
            this.departmentDescription = builder.departmentDescription;
            this.displayEnName = builder.displayEnName;
            this.displayName = builder.displayName;
            this.masterDataDepartments = builder.masterDataDepartments;
            this.orderNumber = builder.orderNumber;
            this.personalPhoto = builder.personalPhoto;
            this.status = builder.status;
            this.tbWang = builder.tbWang;
            this.userId = builder.userId;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owners create() {
            return builder().build();
        }

        /**
         * @return departmentDescription
         */
        public String getDepartmentDescription() {
            return this.departmentDescription;
        }

        /**
         * @return displayEnName
         */
        public String getDisplayEnName() {
            return this.displayEnName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return masterDataDepartments
         */
        public java.util.List<OwnersMasterDataDepartments> getMasterDataDepartments() {
            return this.masterDataDepartments;
        }

        /**
         * @return orderNumber
         */
        public String getOrderNumber() {
            return this.orderNumber;
        }

        /**
         * @return personalPhoto
         */
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tbWang
         */
        public String getTbWang() {
            return this.tbWang;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInfo
         */
        public String getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String departmentDescription; 
            private String displayEnName; 
            private String displayName; 
            private java.util.List<OwnersMasterDataDepartments> masterDataDepartments; 
            private String orderNumber; 
            private String personalPhoto; 
            private String status; 
            private String tbWang; 
            private String userId; 
            private String userInfo; 

            private Builder() {
            } 

            private Builder(Owners model) {
                this.departmentDescription = model.departmentDescription;
                this.displayEnName = model.displayEnName;
                this.displayName = model.displayName;
                this.masterDataDepartments = model.masterDataDepartments;
                this.orderNumber = model.orderNumber;
                this.personalPhoto = model.personalPhoto;
                this.status = model.status;
                this.tbWang = model.tbWang;
                this.userId = model.userId;
                this.userInfo = model.userInfo;
            } 

            /**
             * DepartmentDescription.
             */
            public Builder departmentDescription(String departmentDescription) {
                this.departmentDescription = departmentDescription;
                return this;
            }

            /**
             * DisplayEnName.
             */
            public Builder displayEnName(String displayEnName) {
                this.displayEnName = displayEnName;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * MasterDataDepartments.
             */
            public Builder masterDataDepartments(java.util.List<OwnersMasterDataDepartments> masterDataDepartments) {
                this.masterDataDepartments = masterDataDepartments;
                return this;
            }

            /**
             * OrderNumber.
             */
            public Builder orderNumber(String orderNumber) {
                this.orderNumber = orderNumber;
                return this;
            }

            /**
             * PersonalPhoto.
             */
            public Builder personalPhoto(String personalPhoto) {
                this.personalPhoto = personalPhoto;
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
             * TbWang.
             */
            public Builder tbWang(String tbWang) {
                this.tbWang = tbWang;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(String userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Owners build() {
                return new Owners(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class Activity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private String activityId;

        @com.aliyun.core.annotation.NameInMap("ActivityInstanceStatus")
        private String activityInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("ActivityNameInEnglish")
        private String activityNameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private Activity(Builder builder) {
            this.activityId = builder.activityId;
            this.activityInstanceStatus = builder.activityInstanceStatus;
            this.activityName = builder.activityName;
            this.activityNameInEnglish = builder.activityNameInEnglish;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activity create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityInstanceStatus
         */
        public String getActivityInstanceStatus() {
            return this.activityInstanceStatus;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return activityNameInEnglish
         */
        public String getActivityNameInEnglish() {
            return this.activityNameInEnglish;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String activityId; 
            private String activityInstanceStatus; 
            private String activityName; 
            private String activityNameInEnglish; 
            private Long id; 

            private Builder() {
            } 

            private Builder(Activity model) {
                this.activityId = model.activityId;
                this.activityInstanceStatus = model.activityInstanceStatus;
                this.activityName = model.activityName;
                this.activityNameInEnglish = model.activityNameInEnglish;
                this.id = model.id;
            } 

            /**
             * ActivityId.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActivityInstanceStatus.
             */
            public Builder activityInstanceStatus(String activityInstanceStatus) {
                this.activityInstanceStatus = activityInstanceStatus;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * ActivityNameInEnglish.
             */
            public Builder activityNameInEnglish(String activityNameInEnglish) {
                this.activityNameInEnglish = activityNameInEnglish;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Activity build() {
                return new Activity(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProcessDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProcessDefinitionResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionerId")
        private String actionerId;

        @com.aliyun.core.annotation.NameInMap("Activity")
        private Activity activity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private Tasks(Builder builder) {
            this.actionerId = builder.actionerId;
            this.activity = builder.activity;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return actionerId
         */
        public String getActionerId() {
            return this.actionerId;
        }

        /**
         * @return activity
         */
        public Activity getActivity() {
            return this.activity;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String actionerId; 
            private Activity activity; 
            private String status; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.actionerId = model.actionerId;
                this.activity = model.activity;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * ActionerId.
             */
            public Builder actionerId(String actionerId) {
                this.actionerId = actionerId;
                return this;
            }

            /**
             * Activity.
             */
            public Builder activity(Activity activity) {
                this.activity = activity;
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
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
