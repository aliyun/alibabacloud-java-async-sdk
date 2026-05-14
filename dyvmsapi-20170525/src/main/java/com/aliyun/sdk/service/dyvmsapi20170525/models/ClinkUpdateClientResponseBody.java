// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkUpdateClientResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkUpdateClientResponseBody</p>
 */
public class ClinkUpdateClientResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkUpdateClientResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkUpdateClientResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkUpdateClientResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
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

        public ClinkUpdateClientResponseBody build() {
            return new ClinkUpdateClientResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkUpdateClientResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkUpdateClientResponseBody</p>
     */
    public static class ClidArea extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaGroupName")
        private String areaGroupName;

        @com.aliyun.core.annotation.NameInMap("AssignType")
        private Long assignType;

        @com.aliyun.core.annotation.NameInMap("DynamicTelGroupName")
        private String dynamicTelGroupName;

        @com.aliyun.core.annotation.NameInMap("ObClids")
        private java.util.List<String> obClids;

        private ClidArea(Builder builder) {
            this.areaGroupName = builder.areaGroupName;
            this.assignType = builder.assignType;
            this.dynamicTelGroupName = builder.dynamicTelGroupName;
            this.obClids = builder.obClids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClidArea create() {
            return builder().build();
        }

        /**
         * @return areaGroupName
         */
        public String getAreaGroupName() {
            return this.areaGroupName;
        }

        /**
         * @return assignType
         */
        public Long getAssignType() {
            return this.assignType;
        }

        /**
         * @return dynamicTelGroupName
         */
        public String getDynamicTelGroupName() {
            return this.dynamicTelGroupName;
        }

        /**
         * @return obClids
         */
        public java.util.List<String> getObClids() {
            return this.obClids;
        }

        public static final class Builder {
            private String areaGroupName; 
            private Long assignType; 
            private String dynamicTelGroupName; 
            private java.util.List<String> obClids; 

            private Builder() {
            } 

            private Builder(ClidArea model) {
                this.areaGroupName = model.areaGroupName;
                this.assignType = model.assignType;
                this.dynamicTelGroupName = model.dynamicTelGroupName;
                this.obClids = model.obClids;
            } 

            /**
             * <p>地区组名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder areaGroupName(String areaGroupName) {
                this.areaGroupName = areaGroupName;
                return this;
            }

            /**
             * <p>号码类型，默认值为0，0: 号码；1: 动态号码组</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assignType(Long assignType) {
                this.assignType = assignType;
                return this;
            }

            /**
             * <p>动态号码组名称，当assignType（号码类型）值为1（动态号码组）时为必填项</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder dynamicTelGroupName(String dynamicTelGroupName) {
                this.dynamicTelGroupName = dynamicTelGroupName;
                return this;
            }

            /**
             * <p>外显号码</p>
             */
            public Builder obClids(java.util.List<String> obClids) {
                this.obClids = obClids;
                return this;
            }

            public ClidArea build() {
                return new ClidArea(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkUpdateClientResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkUpdateClientResponseBody</p>
     */
    public static class Permission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Asr")
        private Long asr;

        @com.aliyun.core.annotation.NameInMap("Call")
        private Long call;

        @com.aliyun.core.annotation.NameInMap("Cdr")
        private Long cdr;

        @com.aliyun.core.annotation.NameInMap("Chat")
        private Long chat;

        @com.aliyun.core.annotation.NameInMap("OtherData")
        private Long otherData;

        @com.aliyun.core.annotation.NameInMap("Record")
        private Long record;

        @com.aliyun.core.annotation.NameInMap("RecordDownload")
        private Long recordDownload;

        @com.aliyun.core.annotation.NameInMap("Sms")
        private Long sms;

        @com.aliyun.core.annotation.NameInMap("TaskInventory")
        private Long taskInventory;

        @com.aliyun.core.annotation.NameInMap("Transfer")
        private Long transfer;

        private Permission(Builder builder) {
            this.asr = builder.asr;
            this.call = builder.call;
            this.cdr = builder.cdr;
            this.chat = builder.chat;
            this.otherData = builder.otherData;
            this.record = builder.record;
            this.recordDownload = builder.recordDownload;
            this.sms = builder.sms;
            this.taskInventory = builder.taskInventory;
            this.transfer = builder.transfer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permission create() {
            return builder().build();
        }

        /**
         * @return asr
         */
        public Long getAsr() {
            return this.asr;
        }

        /**
         * @return call
         */
        public Long getCall() {
            return this.call;
        }

        /**
         * @return cdr
         */
        public Long getCdr() {
            return this.cdr;
        }

        /**
         * @return chat
         */
        public Long getChat() {
            return this.chat;
        }

        /**
         * @return otherData
         */
        public Long getOtherData() {
            return this.otherData;
        }

        /**
         * @return record
         */
        public Long getRecord() {
            return this.record;
        }

        /**
         * @return recordDownload
         */
        public Long getRecordDownload() {
            return this.recordDownload;
        }

        /**
         * @return sms
         */
        public Long getSms() {
            return this.sms;
        }

        /**
         * @return taskInventory
         */
        public Long getTaskInventory() {
            return this.taskInventory;
        }

        /**
         * @return transfer
         */
        public Long getTransfer() {
            return this.transfer;
        }

        public static final class Builder {
            private Long asr; 
            private Long call; 
            private Long cdr; 
            private Long chat; 
            private Long otherData; 
            private Long record; 
            private Long recordDownload; 
            private Long sms; 
            private Long taskInventory; 
            private Long transfer; 

            private Builder() {
            } 

            private Builder(Permission model) {
                this.asr = model.asr;
                this.call = model.call;
                this.cdr = model.cdr;
                this.chat = model.chat;
                this.otherData = model.otherData;
                this.record = model.record;
                this.recordDownload = model.recordDownload;
                this.sms = model.sms;
                this.taskInventory = model.taskInventory;
                this.transfer = model.transfer;
            } 

            /**
             * <p>语音转写，0: 关闭；1: 呼入开启；2 外呼开启；3 全部开启；默认值为 0</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder asr(Long asr) {
                this.asr = asr;
                return this;
            }

            /**
             * <p>外呼权限，0: 关闭；1: 无限制；2: 国内长途；3: 国内本地，默认值为 1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder call(Long call) {
                this.call = call;
                return this;
            }

            /**
             * <p>通话记录查看权限，1: 全部；2: 所属队列；3:本座席，默认值为 1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cdr(Long cdr) {
                this.cdr = cdr;
                return this;
            }

            /**
             * <p>在线客服查看会话记录权限 ，0：全部、1：所属队列、2：本座席； 默认值为 0</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chat(Long chat) {
                this.chat = chat;
                return this;
            }

            /**
             * <p>其他数据查看权限：1：全部 2：所属员工组 3：自己 4:指定员工组 ,默认所属员工组</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder otherData(Long otherData) {
                this.otherData = otherData;
                return this;
            }

            /**
             * <p>通话录音权限，0: 关闭；1: 呼入；2: 外呼；3: 全部，默认值为 3</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder record(Long record) {
                this.record = record;
                return this;
            }

            /**
             * <p>录音试听下载权限，0: 关闭；1: 试听下载；2：试听，默认值 1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recordDownload(Long recordDownload) {
                this.recordDownload = recordDownload;
                return this;
            }

            /**
             * <p>短信发送权限，0: 关闭；1: 开启，默认值为 0</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sms(Long sms) {
                this.sms = sms;
                return this;
            }

            /**
             * <p>外呼任务查看权限，1：全部 3：自己，默认全部</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskInventory(Long taskInventory) {
                this.taskInventory = taskInventory;
                return this;
            }

            /**
             * <p>通话转移/咨询权限，可选范围，0：全部，1：所属员工组, 默认所属员工组</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder transfer(Long transfer) {
                this.transfer = transfer;
                return this;
            }

            public Permission build() {
                return new Permission(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkUpdateClientResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkUpdateClientResponseBody</p>
     */
    public static class Client extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Long active;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("AssignType")
        private Long assignType;

        @com.aliyun.core.annotation.NameInMap("Clid")
        private java.util.List<String> clid;

        @com.aliyun.core.annotation.NameInMap("ClidArea")
        private java.util.List<ClidArea> clidArea;

        @com.aliyun.core.annotation.NameInMap("ClidDefault")
        private java.util.List<String> clidDefault;

        @com.aliyun.core.annotation.NameInMap("ClidRule")
        private Long clidRule;

        @com.aliyun.core.annotation.NameInMap("ClidType")
        private Long clidType;

        @com.aliyun.core.annotation.NameInMap("CloudNumberEnabled")
        private Long cloudNumberEnabled;

        @com.aliyun.core.annotation.NameInMap("CloudNumberModes")
        private java.util.List<Long> cloudNumberModes;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private Long cno;

        @com.aliyun.core.annotation.NameInMap("CrmId")
        private Long crmId;

        @com.aliyun.core.annotation.NameInMap("DynamicTelGroupName")
        private String dynamicTelGroupName;

        @com.aliyun.core.annotation.NameInMap("HiddenTel")
        private Long hiddenTel;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private Permission permission;

        @com.aliyun.core.annotation.NameInMap("Qnos")
        private java.util.List<String> qnos;

        @com.aliyun.core.annotation.NameInMap("RecurrentselectionType")
        private Long recurrentselectionType;

        @com.aliyun.core.annotation.NameInMap("RecurrentselectionValue")
        private Long recurrentselectionValue;

        @com.aliyun.core.annotation.NameInMap("Role")
        private Long role;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        @com.aliyun.core.annotation.NameInMap("WrapupTime")
        private Long wrapupTime;

        private Client(Builder builder) {
            this.active = builder.active;
            this.areaCode = builder.areaCode;
            this.assignType = builder.assignType;
            this.clid = builder.clid;
            this.clidArea = builder.clidArea;
            this.clidDefault = builder.clidDefault;
            this.clidRule = builder.clidRule;
            this.clidType = builder.clidType;
            this.cloudNumberEnabled = builder.cloudNumberEnabled;
            this.cloudNumberModes = builder.cloudNumberModes;
            this.cno = builder.cno;
            this.crmId = builder.crmId;
            this.dynamicTelGroupName = builder.dynamicTelGroupName;
            this.hiddenTel = builder.hiddenTel;
            this.name = builder.name;
            this.password = builder.password;
            this.permission = builder.permission;
            this.qnos = builder.qnos;
            this.recurrentselectionType = builder.recurrentselectionType;
            this.recurrentselectionValue = builder.recurrentselectionValue;
            this.role = builder.role;
            this.type = builder.type;
            this.wrapupTime = builder.wrapupTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Client create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Long getActive() {
            return this.active;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return assignType
         */
        public Long getAssignType() {
            return this.assignType;
        }

        /**
         * @return clid
         */
        public java.util.List<String> getClid() {
            return this.clid;
        }

        /**
         * @return clidArea
         */
        public java.util.List<ClidArea> getClidArea() {
            return this.clidArea;
        }

        /**
         * @return clidDefault
         */
        public java.util.List<String> getClidDefault() {
            return this.clidDefault;
        }

        /**
         * @return clidRule
         */
        public Long getClidRule() {
            return this.clidRule;
        }

        /**
         * @return clidType
         */
        public Long getClidType() {
            return this.clidType;
        }

        /**
         * @return cloudNumberEnabled
         */
        public Long getCloudNumberEnabled() {
            return this.cloudNumberEnabled;
        }

        /**
         * @return cloudNumberModes
         */
        public java.util.List<Long> getCloudNumberModes() {
            return this.cloudNumberModes;
        }

        /**
         * @return cno
         */
        public Long getCno() {
            return this.cno;
        }

        /**
         * @return crmId
         */
        public Long getCrmId() {
            return this.crmId;
        }

        /**
         * @return dynamicTelGroupName
         */
        public String getDynamicTelGroupName() {
            return this.dynamicTelGroupName;
        }

        /**
         * @return hiddenTel
         */
        public Long getHiddenTel() {
            return this.hiddenTel;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return permission
         */
        public Permission getPermission() {
            return this.permission;
        }

        /**
         * @return qnos
         */
        public java.util.List<String> getQnos() {
            return this.qnos;
        }

        /**
         * @return recurrentselectionType
         */
        public Long getRecurrentselectionType() {
            return this.recurrentselectionType;
        }

        /**
         * @return recurrentselectionValue
         */
        public Long getRecurrentselectionValue() {
            return this.recurrentselectionValue;
        }

        /**
         * @return role
         */
        public Long getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return wrapupTime
         */
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

        public static final class Builder {
            private Long active; 
            private String areaCode; 
            private Long assignType; 
            private java.util.List<String> clid; 
            private java.util.List<ClidArea> clidArea; 
            private java.util.List<String> clidDefault; 
            private Long clidRule; 
            private Long clidType; 
            private Long cloudNumberEnabled; 
            private java.util.List<Long> cloudNumberModes; 
            private Long cno; 
            private Long crmId; 
            private String dynamicTelGroupName; 
            private Long hiddenTel; 
            private String name; 
            private String password; 
            private Permission permission; 
            private java.util.List<String> qnos; 
            private Long recurrentselectionType; 
            private Long recurrentselectionValue; 
            private Long role; 
            private Long type; 
            private Long wrapupTime; 

            private Builder() {
            } 

            private Builder(Client model) {
                this.active = model.active;
                this.areaCode = model.areaCode;
                this.assignType = model.assignType;
                this.clid = model.clid;
                this.clidArea = model.clidArea;
                this.clidDefault = model.clidDefault;
                this.clidRule = model.clidRule;
                this.clidType = model.clidType;
                this.cloudNumberEnabled = model.cloudNumberEnabled;
                this.cloudNumberModes = model.cloudNumberModes;
                this.cno = model.cno;
                this.crmId = model.crmId;
                this.dynamicTelGroupName = model.dynamicTelGroupName;
                this.hiddenTel = model.hiddenTel;
                this.name = model.name;
                this.password = model.password;
                this.permission = model.permission;
                this.qnos = model.qnos;
                this.recurrentselectionType = model.recurrentselectionType;
                this.recurrentselectionValue = model.recurrentselectionValue;
                this.role = model.role;
                this.type = model.type;
                this.wrapupTime = model.wrapupTime;
            } 

            /**
             * <p>启用状态，0: 停用；1: 启用</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * <p>所属区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>号码类型，默认值为0，0: 号码；1: 动态号码组</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assignType(Long assignType) {
                this.assignType = assignType;
                return this;
            }

            /**
             * <p>可外显号码集合</p>
             */
            public Builder clid(java.util.List<String> clid) {
                this.clid = clid;
                return this;
            }

            /**
             * <p>给地区指定可外显号码</p>
             */
            public Builder clidArea(java.util.List<ClidArea> clidArea) {
                this.clidArea = clidArea;
                return this;
            }

            /**
             * <p>缺省外显号码集合，当clidType（外显号码类型）值为3且clidRule（外显规则）值为1时，支持配置缺省外显</p>
             */
            public Builder clidDefault(java.util.List<String> clidDefault) {
                this.clidDefault = clidDefault;
                return this;
            }

            /**
             * <p>外显规则，根据外显号码类型值来定义，1: 随机；2: 轮选 或 1: 动态；2: 自定义</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clidRule(Long clidRule) {
                this.clidRule = clidRule;
                return this;
            }

            /**
             * <p>外显号码类型，0: 全部；2: 座席指定；3: 智能外显</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder clidType(Long clidType) {
                this.clidType = clidType;
                return this;
            }

            /**
             * <p>云号码外呼开关，0-关，1-开</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cloudNumberEnabled(Long cloudNumberEnabled) {
                this.cloudNumberEnabled = cloudNumberEnabled;
                return this;
            }

            /**
             * <p>云号码四种呼叫模式；数组长度 为 4，依次对应云号码外呼的四种模式（实体卡、工作卡、两端呼、RTC)的开启状态；</p>
             */
            public Builder cloudNumberModes(java.util.List<Long> cloudNumberModes) {
                this.cloudNumberModes = cloudNumberModes;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(Long cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>CRM 编号，与第三方 CRM 系统对接时，可作为唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder crmId(Long crmId) {
                this.crmId = crmId;
                return this;
            }

            /**
             * <p>动态号码组名称，当assignType（号码类型）值为1（动态号码组）时为必填项</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder dynamicTelGroupName(String dynamicTelGroupName) {
                this.dynamicTelGroupName = dynamicTelGroupName;
                return this;
            }

            /**
             * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hiddenTel(Long hiddenTel) {
                this.hiddenTel = hiddenTel;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>座席密码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>permission</p>
             */
            public Builder permission(Permission permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>所属队列号集合</p>
             */
            public Builder qnos(java.util.List<String> qnos) {
                this.qnos = qnos;
                return this;
            }

            /**
             * <p>轮选方式，1: 按天轮选；2: 按次轮选</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recurrentselectionType(Long recurrentselectionType) {
                this.recurrentselectionType = recurrentselectionType;
                return this;
            }

            /**
             * <p>轮选值设置 1: 按天轮选，每 n 天外呼更换一次外显号码，可设置 1-30 天 2: 按次轮选，每 n 次外呼更换一次外显号码，可设置 1-30 次</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recurrentselectionValue(Long recurrentselectionValue) {
                this.recurrentselectionValue = recurrentselectionValue;
                return this;
            }

            /**
             * <p>座席角色，0: 普通座席；1: 班长座席</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder role(Long role) {
                this.role = role;
                return this;
            }

            /**
             * <p>座席类型，1：全渠道、2：呼叫中心、3：在线客服</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * <p>整理时长，座席进行外呼操作后的整理时间</p>
             * 
             * <strong>example:</strong>
             * <p>79</p>
             */
            public Builder wrapupTime(Long wrapupTime) {
                this.wrapupTime = wrapupTime;
                return this;
            }

            public Client build() {
                return new Client(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkUpdateClientResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkUpdateClientResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Client")
        private Client client;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        private Data(Builder builder) {
            this.client = builder.client;
            this.clinkRequestId = builder.clinkRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return client
         */
        public Client getClient() {
            return this.client;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public static final class Builder {
            private Client client; 
            private String clinkRequestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.client = model.client;
                this.clinkRequestId = model.clinkRequestId;
            } 

            /**
             * Client.
             */
            public Builder client(Client client) {
                this.client = client;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
