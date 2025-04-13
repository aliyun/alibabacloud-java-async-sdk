// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.et_industry_openapi20200824.models;

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
 * {@link ListMeasurePointListByNodeCodePageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMeasurePointListByNodeCodePageResponseBody</p>
 */
public class ListMeasurePointListByNodeCodePageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListMeasurePointListByNodeCodePageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMeasurePointListByNodeCodePageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListMeasurePointListByNodeCodePageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListMeasurePointListByNodeCodePageResponseBody build() {
            return new ListMeasurePointListByNodeCodePageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMeasurePointListByNodeCodePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMeasurePointListByNodeCodePageResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMeasurePointListByNodeCodePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMeasurePointListByNodeCodePageResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcqFreq")
        private String acqFreq;

        @com.aliyun.core.annotation.NameInMap("AlarmAttribute")
        private String alarmAttribute;

        @com.aliyun.core.annotation.NameInMap("AlarmLevel")
        private String alarmLevel;

        @com.aliyun.core.annotation.NameInMap("CalcAttribute")
        private String calcAttribute;

        @com.aliyun.core.annotation.NameInMap("CalcFormula")
        private String calcFormula;

        @com.aliyun.core.annotation.NameInMap("CalcType")
        private String calcType;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrMsgDetail")
        private String errMsgDetail;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private Long gmtModify;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("InitValue")
        private String initValue;

        @com.aliyun.core.annotation.NameInMap("IsEnable")
        private String isEnable;

        @com.aliyun.core.annotation.NameInMap("LastUploadTime")
        private String lastUploadTime;

        @com.aliyun.core.annotation.NameInMap("LatestValue")
        private String latestValue;

        @com.aliyun.core.annotation.NameInMap("LowerLimit")
        private String lowerLimit;

        @com.aliyun.core.annotation.NameInMap("MeasurePointState")
        private String measurePointState;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeCode")
        private String nodeCode;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Integer nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ParentFullName")
        private String parentFullName;

        @com.aliyun.core.annotation.NameInMap("PayLoad")
        private String payLoad;

        @com.aliyun.core.annotation.NameInMap("ProtocolConfig")
        private String protocolConfig;

        @com.aliyun.core.annotation.NameInMap("SourcePoint")
        private String sourcePoint;

        @com.aliyun.core.annotation.NameInMap("TenantCode")
        private String tenantCode;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("UpperLimit")
        private String upperLimit;

        private DataList(Builder builder) {
            this.acqFreq = builder.acqFreq;
            this.alarmAttribute = builder.alarmAttribute;
            this.alarmLevel = builder.alarmLevel;
            this.calcAttribute = builder.calcAttribute;
            this.calcFormula = builder.calcFormula;
            this.calcType = builder.calcType;
            this.code = builder.code;
            this.createUser = builder.createUser;
            this.dataSourceId = builder.dataSourceId;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.errMsgDetail = builder.errMsgDetail;
            this.fullName = builder.fullName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.id = builder.id;
            this.initValue = builder.initValue;
            this.isEnable = builder.isEnable;
            this.lastUploadTime = builder.lastUploadTime;
            this.latestValue = builder.latestValue;
            this.lowerLimit = builder.lowerLimit;
            this.measurePointState = builder.measurePointState;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.nodeCode = builder.nodeCode;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.parentFullName = builder.parentFullName;
            this.payLoad = builder.payLoad;
            this.protocolConfig = builder.protocolConfig;
            this.sourcePoint = builder.sourcePoint;
            this.tenantCode = builder.tenantCode;
            this.time = builder.time;
            this.type = builder.type;
            this.unit = builder.unit;
            this.upperLimit = builder.upperLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return acqFreq
         */
        public String getAcqFreq() {
            return this.acqFreq;
        }

        /**
         * @return alarmAttribute
         */
        public String getAlarmAttribute() {
            return this.alarmAttribute;
        }

        /**
         * @return alarmLevel
         */
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        /**
         * @return calcAttribute
         */
        public String getCalcAttribute() {
            return this.calcAttribute;
        }

        /**
         * @return calcFormula
         */
        public String getCalcFormula() {
            return this.calcFormula;
        }

        /**
         * @return calcType
         */
        public String getCalcType() {
            return this.calcType;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errMsgDetail
         */
        public String getErrMsgDetail() {
            return this.errMsgDetail;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public Long getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return initValue
         */
        public String getInitValue() {
            return this.initValue;
        }

        /**
         * @return isEnable
         */
        public String getIsEnable() {
            return this.isEnable;
        }

        /**
         * @return lastUploadTime
         */
        public String getLastUploadTime() {
            return this.lastUploadTime;
        }

        /**
         * @return latestValue
         */
        public String getLatestValue() {
            return this.latestValue;
        }

        /**
         * @return lowerLimit
         */
        public String getLowerLimit() {
            return this.lowerLimit;
        }

        /**
         * @return measurePointState
         */
        public String getMeasurePointState() {
            return this.measurePointState;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeCode
         */
        public String getNodeCode() {
            return this.nodeCode;
        }

        /**
         * @return nodeId
         */
        public Integer getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return parentFullName
         */
        public String getParentFullName() {
            return this.parentFullName;
        }

        /**
         * @return payLoad
         */
        public String getPayLoad() {
            return this.payLoad;
        }

        /**
         * @return protocolConfig
         */
        public String getProtocolConfig() {
            return this.protocolConfig;
        }

        /**
         * @return sourcePoint
         */
        public String getSourcePoint() {
            return this.sourcePoint;
        }

        /**
         * @return tenantCode
         */
        public String getTenantCode() {
            return this.tenantCode;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return upperLimit
         */
        public String getUpperLimit() {
            return this.upperLimit;
        }

        public static final class Builder {
            private String acqFreq; 
            private String alarmAttribute; 
            private String alarmLevel; 
            private String calcAttribute; 
            private String calcFormula; 
            private String calcType; 
            private String code; 
            private String createUser; 
            private String dataSourceId; 
            private String dataType; 
            private String description; 
            private String errMsgDetail; 
            private String fullName; 
            private Long gmtCreate; 
            private Long gmtModify; 
            private Integer id; 
            private String initValue; 
            private String isEnable; 
            private String lastUploadTime; 
            private String latestValue; 
            private String lowerLimit; 
            private String measurePointState; 
            private String modifyUser; 
            private String name; 
            private String nodeCode; 
            private Integer nodeId; 
            private String nodeName; 
            private String parentFullName; 
            private String payLoad; 
            private String protocolConfig; 
            private String sourcePoint; 
            private String tenantCode; 
            private String time; 
            private String type; 
            private String unit; 
            private String upperLimit; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.acqFreq = model.acqFreq;
                this.alarmAttribute = model.alarmAttribute;
                this.alarmLevel = model.alarmLevel;
                this.calcAttribute = model.calcAttribute;
                this.calcFormula = model.calcFormula;
                this.calcType = model.calcType;
                this.code = model.code;
                this.createUser = model.createUser;
                this.dataSourceId = model.dataSourceId;
                this.dataType = model.dataType;
                this.description = model.description;
                this.errMsgDetail = model.errMsgDetail;
                this.fullName = model.fullName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.id = model.id;
                this.initValue = model.initValue;
                this.isEnable = model.isEnable;
                this.lastUploadTime = model.lastUploadTime;
                this.latestValue = model.latestValue;
                this.lowerLimit = model.lowerLimit;
                this.measurePointState = model.measurePointState;
                this.modifyUser = model.modifyUser;
                this.name = model.name;
                this.nodeCode = model.nodeCode;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.parentFullName = model.parentFullName;
                this.payLoad = model.payLoad;
                this.protocolConfig = model.protocolConfig;
                this.sourcePoint = model.sourcePoint;
                this.tenantCode = model.tenantCode;
                this.time = model.time;
                this.type = model.type;
                this.unit = model.unit;
                this.upperLimit = model.upperLimit;
            } 

            /**
             * AcqFreq.
             */
            public Builder acqFreq(String acqFreq) {
                this.acqFreq = acqFreq;
                return this;
            }

            /**
             * AlarmAttribute.
             */
            public Builder alarmAttribute(String alarmAttribute) {
                this.alarmAttribute = alarmAttribute;
                return this;
            }

            /**
             * AlarmLevel.
             */
            public Builder alarmLevel(String alarmLevel) {
                this.alarmLevel = alarmLevel;
                return this;
            }

            /**
             * CalcAttribute.
             */
            public Builder calcAttribute(String calcAttribute) {
                this.calcAttribute = calcAttribute;
                return this;
            }

            /**
             * CalcFormula.
             */
            public Builder calcFormula(String calcFormula) {
                this.calcFormula = calcFormula;
                return this;
            }

            /**
             * CalcType.
             */
            public Builder calcType(String calcType) {
                this.calcType = calcType;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ErrMsgDetail.
             */
            public Builder errMsgDetail(String errMsgDetail) {
                this.errMsgDetail = errMsgDetail;
                return this;
            }

            /**
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(Long gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * InitValue.
             */
            public Builder initValue(String initValue) {
                this.initValue = initValue;
                return this;
            }

            /**
             * IsEnable.
             */
            public Builder isEnable(String isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            /**
             * LastUploadTime.
             */
            public Builder lastUploadTime(String lastUploadTime) {
                this.lastUploadTime = lastUploadTime;
                return this;
            }

            /**
             * LatestValue.
             */
            public Builder latestValue(String latestValue) {
                this.latestValue = latestValue;
                return this;
            }

            /**
             * LowerLimit.
             */
            public Builder lowerLimit(String lowerLimit) {
                this.lowerLimit = lowerLimit;
                return this;
            }

            /**
             * MeasurePointState.
             */
            public Builder measurePointState(String measurePointState) {
                this.measurePointState = measurePointState;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
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
             * NodeCode.
             */
            public Builder nodeCode(String nodeCode) {
                this.nodeCode = nodeCode;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Integer nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * ParentFullName.
             */
            public Builder parentFullName(String parentFullName) {
                this.parentFullName = parentFullName;
                return this;
            }

            /**
             * PayLoad.
             */
            public Builder payLoad(String payLoad) {
                this.payLoad = payLoad;
                return this;
            }

            /**
             * ProtocolConfig.
             */
            public Builder protocolConfig(String protocolConfig) {
                this.protocolConfig = protocolConfig;
                return this;
            }

            /**
             * SourcePoint.
             */
            public Builder sourcePoint(String sourcePoint) {
                this.sourcePoint = sourcePoint;
                return this;
            }

            /**
             * TenantCode.
             */
            public Builder tenantCode(String tenantCode) {
                this.tenantCode = tenantCode;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * UpperLimit.
             */
            public Builder upperLimit(String upperLimit) {
                this.upperLimit = upperLimit;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMeasurePointListByNodeCodePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMeasurePointListByNodeCodePageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("DataList")
        private java.util.List<DataList> dataList;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.dataList = builder.dataList;
            this.totalPage = builder.totalPage;
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
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return dataList
         */
        public java.util.List<DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private java.util.List<DataList> dataList; 
            private Integer totalPage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.dataList = model.dataList;
                this.totalPage = model.totalPage;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * DataList.
             */
            public Builder dataList(java.util.List<DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
