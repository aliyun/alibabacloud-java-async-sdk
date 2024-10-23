// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMeCorpSubmissionResponseBody} extends {@link TeaModel}
 *
 * <p>GetMeCorpSubmissionResponseBody</p>
 */
public class GetMeCorpSubmissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetMeCorpSubmissionResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMeCorpSubmissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
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
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private String requestId; 
        private Long totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
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
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
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

        public GetMeCorpSubmissionResponseBody build() {
            return new GetMeCorpSubmissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMeCorpSubmissionResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeCorpSubmissionResponseBody</p>
     */
    public static class Actioner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuName")
        private String buName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EmployeeType")
        private String employeeType;

        @com.aliyun.core.annotation.NameInMap("EmployeeTypeInformation")
        private String employeeTypeInformation;

        @com.aliyun.core.annotation.NameInMap("HumanResourceGroupWorkNumber")
        private String humanResourceGroupWorkNumber;

        @com.aliyun.core.annotation.NameInMap("IsSystemAdmin")
        private Boolean isSystemAdmin;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("OrderNumber")
        private String orderNumber;

        @com.aliyun.core.annotation.NameInMap("PersonalPhoto")
        private String personalPhoto;

        @com.aliyun.core.annotation.NameInMap("PersonalPhotoUrl")
        private String personalPhotoUrl;

        @com.aliyun.core.annotation.NameInMap("PinyinNameAll")
        private String pinyinNameAll;

        @com.aliyun.core.annotation.NameInMap("PinyinNickName")
        private String pinyinNickName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SuperUserId")
        private String superUserId;

        @com.aliyun.core.annotation.NameInMap("TbWang")
        private String tbWang;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Actioner(Builder builder) {
            this.buName = builder.buName;
            this.email = builder.email;
            this.employeeType = builder.employeeType;
            this.employeeTypeInformation = builder.employeeTypeInformation;
            this.humanResourceGroupWorkNumber = builder.humanResourceGroupWorkNumber;
            this.isSystemAdmin = builder.isSystemAdmin;
            this.level = builder.level;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.orderNumber = builder.orderNumber;
            this.personalPhoto = builder.personalPhoto;
            this.personalPhotoUrl = builder.personalPhotoUrl;
            this.pinyinNameAll = builder.pinyinNameAll;
            this.pinyinNickName = builder.pinyinNickName;
            this.state = builder.state;
            this.superUserId = builder.superUserId;
            this.tbWang = builder.tbWang;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actioner create() {
            return builder().build();
        }

        /**
         * @return buName
         */
        public String getBuName() {
            return this.buName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return employeeType
         */
        public String getEmployeeType() {
            return this.employeeType;
        }

        /**
         * @return employeeTypeInformation
         */
        public String getEmployeeTypeInformation() {
            return this.employeeTypeInformation;
        }

        /**
         * @return humanResourceGroupWorkNumber
         */
        public String getHumanResourceGroupWorkNumber() {
            return this.humanResourceGroupWorkNumber;
        }

        /**
         * @return isSystemAdmin
         */
        public Boolean getIsSystemAdmin() {
            return this.isSystemAdmin;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
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
         * @return personalPhotoUrl
         */
        public String getPersonalPhotoUrl() {
            return this.personalPhotoUrl;
        }

        /**
         * @return pinyinNameAll
         */
        public String getPinyinNameAll() {
            return this.pinyinNameAll;
        }

        /**
         * @return pinyinNickName
         */
        public String getPinyinNickName() {
            return this.pinyinNickName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return superUserId
         */
        public String getSuperUserId() {
            return this.superUserId;
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

        public static final class Builder {
            private String buName; 
            private String email; 
            private String employeeType; 
            private String employeeTypeInformation; 
            private String humanResourceGroupWorkNumber; 
            private Boolean isSystemAdmin; 
            private String level; 
            private String name; 
            private String nickName; 
            private String orderNumber; 
            private String personalPhoto; 
            private String personalPhotoUrl; 
            private String pinyinNameAll; 
            private String pinyinNickName; 
            private String state; 
            private String superUserId; 
            private String tbWang; 
            private String userId; 

            /**
             * BuName.
             */
            public Builder buName(String buName) {
                this.buName = buName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EmployeeType.
             */
            public Builder employeeType(String employeeType) {
                this.employeeType = employeeType;
                return this;
            }

            /**
             * EmployeeTypeInformation.
             */
            public Builder employeeTypeInformation(String employeeTypeInformation) {
                this.employeeTypeInformation = employeeTypeInformation;
                return this;
            }

            /**
             * HumanResourceGroupWorkNumber.
             */
            public Builder humanResourceGroupWorkNumber(String humanResourceGroupWorkNumber) {
                this.humanResourceGroupWorkNumber = humanResourceGroupWorkNumber;
                return this;
            }

            /**
             * IsSystemAdmin.
             */
            public Builder isSystemAdmin(Boolean isSystemAdmin) {
                this.isSystemAdmin = isSystemAdmin;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
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
             * PersonalPhotoUrl.
             */
            public Builder personalPhotoUrl(String personalPhotoUrl) {
                this.personalPhotoUrl = personalPhotoUrl;
                return this;
            }

            /**
             * PinyinNameAll.
             */
            public Builder pinyinNameAll(String pinyinNameAll) {
                this.pinyinNameAll = pinyinNameAll;
                return this;
            }

            /**
             * PinyinNickName.
             */
            public Builder pinyinNickName(String pinyinNickName) {
                this.pinyinNickName = pinyinNickName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * SuperUserId.
             */
            public Builder superUserId(String superUserId) {
                this.superUserId = superUserId;
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

            public Actioner build() {
                return new Actioner(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMeCorpSubmissionResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeCorpSubmissionResponseBody</p>
     */
    public static class CurrentActivityInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private String activityId;

        @com.aliyun.core.annotation.NameInMap("ActivityInstanceStatus")
        private String activityInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("ActivityNameEn")
        private String activityNameEn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private CurrentActivityInstances(Builder builder) {
            this.activityId = builder.activityId;
            this.activityInstanceStatus = builder.activityInstanceStatus;
            this.activityName = builder.activityName;
            this.activityNameEn = builder.activityNameEn;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentActivityInstances create() {
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
         * @return activityNameEn
         */
        public String getActivityNameEn() {
            return this.activityNameEn;
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
            private String activityNameEn; 
            private Long id; 

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
             * ActivityNameEn.
             */
            public Builder activityNameEn(String activityNameEn) {
                this.activityNameEn = activityNameEn;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public CurrentActivityInstances build() {
                return new CurrentActivityInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMeCorpSubmissionResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeCorpSubmissionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actioner")
        private java.util.List < Actioner> actioner;

        @com.aliyun.core.annotation.NameInMap("ActionerId")
        private java.util.List < String > actionerId;

        @com.aliyun.core.annotation.NameInMap("ActionerName")
        private java.util.List < String > actionerName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("CreateTimeGMT")
        private String createTimeGMT;

        @com.aliyun.core.annotation.NameInMap("CurrentActivityInstances")
        private java.util.List < CurrentActivityInstances> currentActivityInstances;

        @com.aliyun.core.annotation.NameInMap("DataMap")
        private java.util.Map < String, ? > dataMap;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("FinishTimeGMT")
        private String finishTimeGMT;

        @com.aliyun.core.annotation.NameInMap("FormInstanceId")
        private String formInstanceId;

        @com.aliyun.core.annotation.NameInMap("FormUuid")
        private String formUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceValue")
        private String instanceValue;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimeGMT")
        private String modifiedTimeGMT;

        @com.aliyun.core.annotation.NameInMap("OriginatorAvatar")
        private String originatorAvatar;

        @com.aliyun.core.annotation.NameInMap("OriginatorDisplayName")
        private String originatorDisplayName;

        @com.aliyun.core.annotation.NameInMap("OriginatorId")
        private String originatorId;

        @com.aliyun.core.annotation.NameInMap("ProcessApprovedResult")
        private String processApprovedResult;

        @com.aliyun.core.annotation.NameInMap("ProcessApprovedResultText")
        private String processApprovedResultText;

        @com.aliyun.core.annotation.NameInMap("ProcessCode")
        private String processCode;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private Long processId;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceStatus")
        private String processInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceStatusText")
        private String processInstanceStatusText;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.actioner = builder.actioner;
            this.actionerId = builder.actionerId;
            this.actionerName = builder.actionerName;
            this.appType = builder.appType;
            this.createTimeGMT = builder.createTimeGMT;
            this.currentActivityInstances = builder.currentActivityInstances;
            this.dataMap = builder.dataMap;
            this.dataType = builder.dataType;
            this.finishTimeGMT = builder.finishTimeGMT;
            this.formInstanceId = builder.formInstanceId;
            this.formUuid = builder.formUuid;
            this.instanceValue = builder.instanceValue;
            this.modifiedTimeGMT = builder.modifiedTimeGMT;
            this.originatorAvatar = builder.originatorAvatar;
            this.originatorDisplayName = builder.originatorDisplayName;
            this.originatorId = builder.originatorId;
            this.processApprovedResult = builder.processApprovedResult;
            this.processApprovedResultText = builder.processApprovedResultText;
            this.processCode = builder.processCode;
            this.processId = builder.processId;
            this.processInstanceId = builder.processInstanceId;
            this.processInstanceStatus = builder.processInstanceStatus;
            this.processInstanceStatusText = builder.processInstanceStatusText;
            this.processName = builder.processName;
            this.title = builder.title;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actioner
         */
        public java.util.List < Actioner> getActioner() {
            return this.actioner;
        }

        /**
         * @return actionerId
         */
        public java.util.List < String > getActionerId() {
            return this.actionerId;
        }

        /**
         * @return actionerName
         */
        public java.util.List < String > getActionerName() {
            return this.actionerName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return createTimeGMT
         */
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        /**
         * @return currentActivityInstances
         */
        public java.util.List < CurrentActivityInstances> getCurrentActivityInstances() {
            return this.currentActivityInstances;
        }

        /**
         * @return dataMap
         */
        public java.util.Map < String, ? > getDataMap() {
            return this.dataMap;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return finishTimeGMT
         */
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        /**
         * @return formInstanceId
         */
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        /**
         * @return formUuid
         */
        public String getFormUuid() {
            return this.formUuid;
        }

        /**
         * @return instanceValue
         */
        public String getInstanceValue() {
            return this.instanceValue;
        }

        /**
         * @return modifiedTimeGMT
         */
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        /**
         * @return originatorAvatar
         */
        public String getOriginatorAvatar() {
            return this.originatorAvatar;
        }

        /**
         * @return originatorDisplayName
         */
        public String getOriginatorDisplayName() {
            return this.originatorDisplayName;
        }

        /**
         * @return originatorId
         */
        public String getOriginatorId() {
            return this.originatorId;
        }

        /**
         * @return processApprovedResult
         */
        public String getProcessApprovedResult() {
            return this.processApprovedResult;
        }

        /**
         * @return processApprovedResultText
         */
        public String getProcessApprovedResultText() {
            return this.processApprovedResultText;
        }

        /**
         * @return processCode
         */
        public String getProcessCode() {
            return this.processCode;
        }

        /**
         * @return processId
         */
        public Long getProcessId() {
            return this.processId;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return processInstanceStatus
         */
        public String getProcessInstanceStatus() {
            return this.processInstanceStatus;
        }

        /**
         * @return processInstanceStatusText
         */
        public String getProcessInstanceStatusText() {
            return this.processInstanceStatusText;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List < Actioner> actioner; 
            private java.util.List < String > actionerId; 
            private java.util.List < String > actionerName; 
            private String appType; 
            private String createTimeGMT; 
            private java.util.List < CurrentActivityInstances> currentActivityInstances; 
            private java.util.Map < String, ? > dataMap; 
            private String dataType; 
            private String finishTimeGMT; 
            private String formInstanceId; 
            private String formUuid; 
            private String instanceValue; 
            private String modifiedTimeGMT; 
            private String originatorAvatar; 
            private String originatorDisplayName; 
            private String originatorId; 
            private String processApprovedResult; 
            private String processApprovedResultText; 
            private String processCode; 
            private Long processId; 
            private String processInstanceId; 
            private String processInstanceStatus; 
            private String processInstanceStatusText; 
            private String processName; 
            private String title; 
            private Long version; 

            /**
             * Actioner.
             */
            public Builder actioner(java.util.List < Actioner> actioner) {
                this.actioner = actioner;
                return this;
            }

            /**
             * ActionerId.
             */
            public Builder actionerId(java.util.List < String > actionerId) {
                this.actionerId = actionerId;
                return this;
            }

            /**
             * ActionerName.
             */
            public Builder actionerName(java.util.List < String > actionerName) {
                this.actionerName = actionerName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * CreateTimeGMT.
             */
            public Builder createTimeGMT(String createTimeGMT) {
                this.createTimeGMT = createTimeGMT;
                return this;
            }

            /**
             * CurrentActivityInstances.
             */
            public Builder currentActivityInstances(java.util.List < CurrentActivityInstances> currentActivityInstances) {
                this.currentActivityInstances = currentActivityInstances;
                return this;
            }

            /**
             * DataMap.
             */
            public Builder dataMap(java.util.Map < String, ? > dataMap) {
                this.dataMap = dataMap;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * FinishTimeGMT.
             */
            public Builder finishTimeGMT(String finishTimeGMT) {
                this.finishTimeGMT = finishTimeGMT;
                return this;
            }

            /**
             * FormInstanceId.
             */
            public Builder formInstanceId(String formInstanceId) {
                this.formInstanceId = formInstanceId;
                return this;
            }

            /**
             * FormUuid.
             */
            public Builder formUuid(String formUuid) {
                this.formUuid = formUuid;
                return this;
            }

            /**
             * InstanceValue.
             */
            public Builder instanceValue(String instanceValue) {
                this.instanceValue = instanceValue;
                return this;
            }

            /**
             * ModifiedTimeGMT.
             */
            public Builder modifiedTimeGMT(String modifiedTimeGMT) {
                this.modifiedTimeGMT = modifiedTimeGMT;
                return this;
            }

            /**
             * OriginatorAvatar.
             */
            public Builder originatorAvatar(String originatorAvatar) {
                this.originatorAvatar = originatorAvatar;
                return this;
            }

            /**
             * OriginatorDisplayName.
             */
            public Builder originatorDisplayName(String originatorDisplayName) {
                this.originatorDisplayName = originatorDisplayName;
                return this;
            }

            /**
             * OriginatorId.
             */
            public Builder originatorId(String originatorId) {
                this.originatorId = originatorId;
                return this;
            }

            /**
             * ProcessApprovedResult.
             */
            public Builder processApprovedResult(String processApprovedResult) {
                this.processApprovedResult = processApprovedResult;
                return this;
            }

            /**
             * ProcessApprovedResultText.
             */
            public Builder processApprovedResultText(String processApprovedResultText) {
                this.processApprovedResultText = processApprovedResultText;
                return this;
            }

            /**
             * ProcessCode.
             */
            public Builder processCode(String processCode) {
                this.processCode = processCode;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(Long processId) {
                this.processId = processId;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * ProcessInstanceStatus.
             */
            public Builder processInstanceStatus(String processInstanceStatus) {
                this.processInstanceStatus = processInstanceStatus;
                return this;
            }

            /**
             * ProcessInstanceStatusText.
             */
            public Builder processInstanceStatusText(String processInstanceStatusText) {
                this.processInstanceStatusText = processInstanceStatusText;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
