// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
 */
public class EnterpriseTodoQueryAccountTodoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseTodoQueryAccountTodoListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseTodoQueryAccountTodoListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String code; 
        private Data data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseTodoQueryAccountTodoListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public EnterpriseTodoQueryAccountTodoListResponseBody build() {
            return new EnterpriseTodoQueryAccountTodoListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
     */
    public static class ManagerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("PkEncoded")
        private String pkEncoded;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private ManagerList(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.pk = builder.pk;
            this.pkEncoded = builder.pkEncoded;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagerList create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return pkEncoded
         */
        public String getPkEncoded() {
            return this.pkEncoded;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String aliyunId; 
            private String pk; 
            private String pkEncoded; 
            private String role; 

            private Builder() {
            } 

            private Builder(ManagerList model) {
                this.aliyunId = model.aliyunId;
                this.pk = model.pk;
                this.pkEncoded = model.pkEncoded;
                this.role = model.role;
            } 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * PkEncoded.
             */
            public Builder pkEncoded(String pkEncoded) {
                this.pkEncoded = pkEncoded;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public ManagerList build() {
                return new ManagerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
     */
    public static class FromLe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        @com.aliyun.core.annotation.NameInMap("LeId")
        private String leId;

        @com.aliyun.core.annotation.NameInMap("LicenseNumber")
        private String licenseNumber;

        @com.aliyun.core.annotation.NameInMap("ManageableAccountCount")
        private Long manageableAccountCount;

        @com.aliyun.core.annotation.NameInMap("ManagedAccountCount")
        private Long managedAccountCount;

        @com.aliyun.core.annotation.NameInMap("ManagerList")
        private java.util.List<ManagerList> managerList;

        @com.aliyun.core.annotation.NameInMap("NbId")
        private String nbId;

        @com.aliyun.core.annotation.NameInMap("SubjectName")
        private String subjectName;

        @com.aliyun.core.annotation.NameInMap("SubjectType")
        private String subjectType;

        private FromLe(Builder builder) {
            this.ecId = builder.ecId;
            this.leId = builder.leId;
            this.licenseNumber = builder.licenseNumber;
            this.manageableAccountCount = builder.manageableAccountCount;
            this.managedAccountCount = builder.managedAccountCount;
            this.managerList = builder.managerList;
            this.nbId = builder.nbId;
            this.subjectName = builder.subjectName;
            this.subjectType = builder.subjectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FromLe create() {
            return builder().build();
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        /**
         * @return leId
         */
        public String getLeId() {
            return this.leId;
        }

        /**
         * @return licenseNumber
         */
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        /**
         * @return manageableAccountCount
         */
        public Long getManageableAccountCount() {
            return this.manageableAccountCount;
        }

        /**
         * @return managedAccountCount
         */
        public Long getManagedAccountCount() {
            return this.managedAccountCount;
        }

        /**
         * @return managerList
         */
        public java.util.List<ManagerList> getManagerList() {
            return this.managerList;
        }

        /**
         * @return nbId
         */
        public String getNbId() {
            return this.nbId;
        }

        /**
         * @return subjectName
         */
        public String getSubjectName() {
            return this.subjectName;
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        public static final class Builder {
            private String ecId; 
            private String leId; 
            private String licenseNumber; 
            private Long manageableAccountCount; 
            private Long managedAccountCount; 
            private java.util.List<ManagerList> managerList; 
            private String nbId; 
            private String subjectName; 
            private String subjectType; 

            private Builder() {
            } 

            private Builder(FromLe model) {
                this.ecId = model.ecId;
                this.leId = model.leId;
                this.licenseNumber = model.licenseNumber;
                this.manageableAccountCount = model.manageableAccountCount;
                this.managedAccountCount = model.managedAccountCount;
                this.managerList = model.managerList;
                this.nbId = model.nbId;
                this.subjectName = model.subjectName;
                this.subjectType = model.subjectType;
            } 

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            /**
             * LeId.
             */
            public Builder leId(String leId) {
                this.leId = leId;
                return this;
            }

            /**
             * LicenseNumber.
             */
            public Builder licenseNumber(String licenseNumber) {
                this.licenseNumber = licenseNumber;
                return this;
            }

            /**
             * ManageableAccountCount.
             */
            public Builder manageableAccountCount(Long manageableAccountCount) {
                this.manageableAccountCount = manageableAccountCount;
                return this;
            }

            /**
             * ManagedAccountCount.
             */
            public Builder managedAccountCount(Long managedAccountCount) {
                this.managedAccountCount = managedAccountCount;
                return this;
            }

            /**
             * ManagerList.
             */
            public Builder managerList(java.util.List<ManagerList> managerList) {
                this.managerList = managerList;
                return this;
            }

            /**
             * NbId.
             */
            public Builder nbId(String nbId) {
                this.nbId = nbId;
                return this;
            }

            /**
             * SubjectName.
             */
            public Builder subjectName(String subjectName) {
                this.subjectName = subjectName;
                return this;
            }

            /**
             * SubjectType.
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            public FromLe build() {
                return new FromLe(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
     */
    public static class ProcessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("AuditTime")
        private Long auditTime;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        @com.aliyun.core.annotation.NameInMap("LeId")
        private String leId;

        @com.aliyun.core.annotation.NameInMap("NbId")
        private String nbId;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ProcessList(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.auditTime = builder.auditTime;
            this.ecId = builder.ecId;
            this.leId = builder.leId;
            this.nbId = builder.nbId;
            this.pk = builder.pk;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessList create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return auditTime
         */
        public Long getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        /**
         * @return leId
         */
        public String getLeId() {
            return this.leId;
        }

        /**
         * @return nbId
         */
        public String getNbId() {
            return this.nbId;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aliyunId; 
            private Long auditTime; 
            private String ecId; 
            private String leId; 
            private String nbId; 
            private String pk; 
            private String remark; 
            private String status; 

            private Builder() {
            } 

            private Builder(ProcessList model) {
                this.aliyunId = model.aliyunId;
                this.auditTime = model.auditTime;
                this.ecId = model.ecId;
                this.leId = model.leId;
                this.nbId = model.nbId;
                this.pk = model.pk;
                this.remark = model.remark;
                this.status = model.status;
            } 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * AuditTime.
             */
            public Builder auditTime(Long auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            /**
             * LeId.
             */
            public Builder leId(String leId) {
                this.leId = leId;
                return this;
            }

            /**
             * NbId.
             */
            public Builder nbId(String nbId) {
                this.nbId = nbId;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ProcessList build() {
                return new ProcessList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
     */
    public static class ToLeManagerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("PkEncoded")
        private String pkEncoded;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private ToLeManagerList(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.pk = builder.pk;
            this.pkEncoded = builder.pkEncoded;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToLeManagerList create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return pkEncoded
         */
        public String getPkEncoded() {
            return this.pkEncoded;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String aliyunId; 
            private String pk; 
            private String pkEncoded; 
            private String role; 

            private Builder() {
            } 

            private Builder(ToLeManagerList model) {
                this.aliyunId = model.aliyunId;
                this.pk = model.pk;
                this.pkEncoded = model.pkEncoded;
                this.role = model.role;
            } 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * PkEncoded.
             */
            public Builder pkEncoded(String pkEncoded) {
                this.pkEncoded = pkEncoded;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public ToLeManagerList build() {
                return new ToLeManagerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
     */
    public static class ToLe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        @com.aliyun.core.annotation.NameInMap("LeId")
        private String leId;

        @com.aliyun.core.annotation.NameInMap("LicenseNumber")
        private String licenseNumber;

        @com.aliyun.core.annotation.NameInMap("ManageableAccountCount")
        private Long manageableAccountCount;

        @com.aliyun.core.annotation.NameInMap("ManagedAccountCount")
        private Long managedAccountCount;

        @com.aliyun.core.annotation.NameInMap("ManagerList")
        private java.util.List<ToLeManagerList> managerList;

        @com.aliyun.core.annotation.NameInMap("NbId")
        private String nbId;

        @com.aliyun.core.annotation.NameInMap("SubjectName")
        private String subjectName;

        @com.aliyun.core.annotation.NameInMap("SubjectType")
        private String subjectType;

        private ToLe(Builder builder) {
            this.ecId = builder.ecId;
            this.leId = builder.leId;
            this.licenseNumber = builder.licenseNumber;
            this.manageableAccountCount = builder.manageableAccountCount;
            this.managedAccountCount = builder.managedAccountCount;
            this.managerList = builder.managerList;
            this.nbId = builder.nbId;
            this.subjectName = builder.subjectName;
            this.subjectType = builder.subjectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToLe create() {
            return builder().build();
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        /**
         * @return leId
         */
        public String getLeId() {
            return this.leId;
        }

        /**
         * @return licenseNumber
         */
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        /**
         * @return manageableAccountCount
         */
        public Long getManageableAccountCount() {
            return this.manageableAccountCount;
        }

        /**
         * @return managedAccountCount
         */
        public Long getManagedAccountCount() {
            return this.managedAccountCount;
        }

        /**
         * @return managerList
         */
        public java.util.List<ToLeManagerList> getManagerList() {
            return this.managerList;
        }

        /**
         * @return nbId
         */
        public String getNbId() {
            return this.nbId;
        }

        /**
         * @return subjectName
         */
        public String getSubjectName() {
            return this.subjectName;
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        public static final class Builder {
            private String ecId; 
            private String leId; 
            private String licenseNumber; 
            private Long manageableAccountCount; 
            private Long managedAccountCount; 
            private java.util.List<ToLeManagerList> managerList; 
            private String nbId; 
            private String subjectName; 
            private String subjectType; 

            private Builder() {
            } 

            private Builder(ToLe model) {
                this.ecId = model.ecId;
                this.leId = model.leId;
                this.licenseNumber = model.licenseNumber;
                this.manageableAccountCount = model.manageableAccountCount;
                this.managedAccountCount = model.managedAccountCount;
                this.managerList = model.managerList;
                this.nbId = model.nbId;
                this.subjectName = model.subjectName;
                this.subjectType = model.subjectType;
            } 

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            /**
             * LeId.
             */
            public Builder leId(String leId) {
                this.leId = leId;
                return this;
            }

            /**
             * LicenseNumber.
             */
            public Builder licenseNumber(String licenseNumber) {
                this.licenseNumber = licenseNumber;
                return this;
            }

            /**
             * ManageableAccountCount.
             */
            public Builder manageableAccountCount(Long manageableAccountCount) {
                this.manageableAccountCount = manageableAccountCount;
                return this;
            }

            /**
             * ManagedAccountCount.
             */
            public Builder managedAccountCount(Long managedAccountCount) {
                this.managedAccountCount = managedAccountCount;
                return this;
            }

            /**
             * ManagerList.
             */
            public Builder managerList(java.util.List<ToLeManagerList> managerList) {
                this.managerList = managerList;
                return this;
            }

            /**
             * NbId.
             */
            public Builder nbId(String nbId) {
                this.nbId = nbId;
                return this;
            }

            /**
             * SubjectName.
             */
            public Builder subjectName(String subjectName) {
                this.subjectName = subjectName;
                return this;
            }

            /**
             * SubjectType.
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            public ToLe build() {
                return new ToLe(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
     */
    public static class TodoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("ApplicantAliyunId")
        private String applicantAliyunId;

        @com.aliyun.core.annotation.NameInMap("ApplicantPk")
        private String applicantPk;

        @com.aliyun.core.annotation.NameInMap("ApplyRemark")
        private String applyRemark;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("AuditorAliyunId")
        private String auditorAliyunId;

        @com.aliyun.core.annotation.NameInMap("AuditorPk")
        private String auditorPk;

        @com.aliyun.core.annotation.NameInMap("AuditorStatus")
        private String auditorStatus;

        @com.aliyun.core.annotation.NameInMap("CanceledTime")
        private Long canceledTime;

        @com.aliyun.core.annotation.NameInMap("Closed")
        private Boolean closed;

        @com.aliyun.core.annotation.NameInMap("CurrAuditor")
        private Boolean currAuditor;

        @com.aliyun.core.annotation.NameInMap("FromLe")
        private FromLe fromLe;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("ProcessList")
        private java.util.List<ProcessList> processList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeoutTime")
        private Long timeoutTime;

        @com.aliyun.core.annotation.NameInMap("ToLe")
        private ToLe toLe;

        @com.aliyun.core.annotation.NameInMap("ToLeAudit")
        private Boolean toLeAudit;

        @com.aliyun.core.annotation.NameInMap("TodoId")
        private String todoId;

        @com.aliyun.core.annotation.NameInMap("TodoType")
        private String todoType;

        @com.aliyun.core.annotation.NameInMap("TodoView")
        private String todoView;

        private TodoList(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.applicantAliyunId = builder.applicantAliyunId;
            this.applicantPk = builder.applicantPk;
            this.applyRemark = builder.applyRemark;
            this.applyTime = builder.applyTime;
            this.auditorAliyunId = builder.auditorAliyunId;
            this.auditorPk = builder.auditorPk;
            this.auditorStatus = builder.auditorStatus;
            this.canceledTime = builder.canceledTime;
            this.closed = builder.closed;
            this.currAuditor = builder.currAuditor;
            this.fromLe = builder.fromLe;
            this.pk = builder.pk;
            this.processList = builder.processList;
            this.status = builder.status;
            this.timeoutTime = builder.timeoutTime;
            this.toLe = builder.toLe;
            this.toLeAudit = builder.toLeAudit;
            this.todoId = builder.todoId;
            this.todoType = builder.todoType;
            this.todoView = builder.todoView;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodoList create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return applicantAliyunId
         */
        public String getApplicantAliyunId() {
            return this.applicantAliyunId;
        }

        /**
         * @return applicantPk
         */
        public String getApplicantPk() {
            return this.applicantPk;
        }

        /**
         * @return applyRemark
         */
        public String getApplyRemark() {
            return this.applyRemark;
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return auditorAliyunId
         */
        public String getAuditorAliyunId() {
            return this.auditorAliyunId;
        }

        /**
         * @return auditorPk
         */
        public String getAuditorPk() {
            return this.auditorPk;
        }

        /**
         * @return auditorStatus
         */
        public String getAuditorStatus() {
            return this.auditorStatus;
        }

        /**
         * @return canceledTime
         */
        public Long getCanceledTime() {
            return this.canceledTime;
        }

        /**
         * @return closed
         */
        public Boolean getClosed() {
            return this.closed;
        }

        /**
         * @return currAuditor
         */
        public Boolean getCurrAuditor() {
            return this.currAuditor;
        }

        /**
         * @return fromLe
         */
        public FromLe getFromLe() {
            return this.fromLe;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return processList
         */
        public java.util.List<ProcessList> getProcessList() {
            return this.processList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeoutTime
         */
        public Long getTimeoutTime() {
            return this.timeoutTime;
        }

        /**
         * @return toLe
         */
        public ToLe getToLe() {
            return this.toLe;
        }

        /**
         * @return toLeAudit
         */
        public Boolean getToLeAudit() {
            return this.toLeAudit;
        }

        /**
         * @return todoId
         */
        public String getTodoId() {
            return this.todoId;
        }

        /**
         * @return todoType
         */
        public String getTodoType() {
            return this.todoType;
        }

        /**
         * @return todoView
         */
        public String getTodoView() {
            return this.todoView;
        }

        public static final class Builder {
            private String aliyunId; 
            private String applicantAliyunId; 
            private String applicantPk; 
            private String applyRemark; 
            private Long applyTime; 
            private String auditorAliyunId; 
            private String auditorPk; 
            private String auditorStatus; 
            private Long canceledTime; 
            private Boolean closed; 
            private Boolean currAuditor; 
            private FromLe fromLe; 
            private String pk; 
            private java.util.List<ProcessList> processList; 
            private String status; 
            private Long timeoutTime; 
            private ToLe toLe; 
            private Boolean toLeAudit; 
            private String todoId; 
            private String todoType; 
            private String todoView; 

            private Builder() {
            } 

            private Builder(TodoList model) {
                this.aliyunId = model.aliyunId;
                this.applicantAliyunId = model.applicantAliyunId;
                this.applicantPk = model.applicantPk;
                this.applyRemark = model.applyRemark;
                this.applyTime = model.applyTime;
                this.auditorAliyunId = model.auditorAliyunId;
                this.auditorPk = model.auditorPk;
                this.auditorStatus = model.auditorStatus;
                this.canceledTime = model.canceledTime;
                this.closed = model.closed;
                this.currAuditor = model.currAuditor;
                this.fromLe = model.fromLe;
                this.pk = model.pk;
                this.processList = model.processList;
                this.status = model.status;
                this.timeoutTime = model.timeoutTime;
                this.toLe = model.toLe;
                this.toLeAudit = model.toLeAudit;
                this.todoId = model.todoId;
                this.todoType = model.todoType;
                this.todoView = model.todoView;
            } 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * ApplicantAliyunId.
             */
            public Builder applicantAliyunId(String applicantAliyunId) {
                this.applicantAliyunId = applicantAliyunId;
                return this;
            }

            /**
             * ApplicantPk.
             */
            public Builder applicantPk(String applicantPk) {
                this.applicantPk = applicantPk;
                return this;
            }

            /**
             * ApplyRemark.
             */
            public Builder applyRemark(String applyRemark) {
                this.applyRemark = applyRemark;
                return this;
            }

            /**
             * ApplyTime.
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * AuditorAliyunId.
             */
            public Builder auditorAliyunId(String auditorAliyunId) {
                this.auditorAliyunId = auditorAliyunId;
                return this;
            }

            /**
             * AuditorPk.
             */
            public Builder auditorPk(String auditorPk) {
                this.auditorPk = auditorPk;
                return this;
            }

            /**
             * AuditorStatus.
             */
            public Builder auditorStatus(String auditorStatus) {
                this.auditorStatus = auditorStatus;
                return this;
            }

            /**
             * CanceledTime.
             */
            public Builder canceledTime(Long canceledTime) {
                this.canceledTime = canceledTime;
                return this;
            }

            /**
             * Closed.
             */
            public Builder closed(Boolean closed) {
                this.closed = closed;
                return this;
            }

            /**
             * CurrAuditor.
             */
            public Builder currAuditor(Boolean currAuditor) {
                this.currAuditor = currAuditor;
                return this;
            }

            /**
             * FromLe.
             */
            public Builder fromLe(FromLe fromLe) {
                this.fromLe = fromLe;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * ProcessList.
             */
            public Builder processList(java.util.List<ProcessList> processList) {
                this.processList = processList;
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
             * TimeoutTime.
             */
            public Builder timeoutTime(Long timeoutTime) {
                this.timeoutTime = timeoutTime;
                return this;
            }

            /**
             * ToLe.
             */
            public Builder toLe(ToLe toLe) {
                this.toLe = toLe;
                return this;
            }

            /**
             * ToLeAudit.
             */
            public Builder toLeAudit(Boolean toLeAudit) {
                this.toLeAudit = toLeAudit;
                return this;
            }

            /**
             * TodoId.
             */
            public Builder todoId(String todoId) {
                this.todoId = todoId;
                return this;
            }

            /**
             * TodoType.
             */
            public Builder todoType(String todoType) {
                this.todoType = todoType;
                return this;
            }

            /**
             * TodoView.
             */
            public Builder todoView(String todoView) {
                this.todoView = todoView;
                return this;
            }

            public TodoList build() {
                return new TodoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseTodoQueryAccountTodoListResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseTodoQueryAccountTodoListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("TodoList")
        private java.util.List<TodoList> todoList;

        private Data(Builder builder) {
            this.count = builder.count;
            this.todoList = builder.todoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return todoList
         */
        public java.util.List<TodoList> getTodoList() {
            return this.todoList;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<TodoList> todoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.todoList = model.todoList;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * TodoList.
             */
            public Builder todoList(java.util.List<TodoList> todoList) {
                this.todoList = todoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
