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
 * {@link CloudImportTaskTelRequest} extends {@link RequestModel}
 *
 * <p>CloudImportTaskTelRequest</p>
 */
public class CloudImportTaskTelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeVoicePath")
    private String bridgeVoicePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeVoiceType")
    private Long bridgeVoiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    private Long fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportTelAutoStart")
    private Long importTelAutoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRepeat")
    private Long isRepeat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTelList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TaskTelList> taskTelList;

    private CloudImportTaskTelRequest(Builder builder) {
        super(builder);
        this.bridgeVoicePath = builder.bridgeVoicePath;
        this.bridgeVoiceType = builder.bridgeVoiceType;
        this.enterpriseId = builder.enterpriseId;
        this.fileId = builder.fileId;
        this.importTelAutoStart = builder.importTelAutoStart;
        this.isRepeat = builder.isRepeat;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
        this.taskTelList = builder.taskTelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudImportTaskTelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bridgeVoicePath
     */
    public String getBridgeVoicePath() {
        return this.bridgeVoicePath;
    }

    /**
     * @return bridgeVoiceType
     */
    public Long getBridgeVoiceType() {
        return this.bridgeVoiceType;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return importTelAutoStart
     */
    public Long getImportTelAutoStart() {
        return this.importTelAutoStart;
    }

    /**
     * @return isRepeat
     */
    public Long getIsRepeat() {
        return this.isRepeat;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskTelList
     */
    public java.util.List<TaskTelList> getTaskTelList() {
        return this.taskTelList;
    }

    public static final class Builder extends Request.Builder<CloudImportTaskTelRequest, Builder> {
        private String bridgeVoicePath; 
        private Long bridgeVoiceType; 
        private Long enterpriseId; 
        private Long fileId; 
        private Long importTelAutoStart; 
        private Long isRepeat; 
        private String name; 
        private Long ownerId; 
        private Long priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long taskId; 
        private java.util.List<TaskTelList> taskTelList; 

        private Builder() {
            super();
        } 

        private Builder(CloudImportTaskTelRequest request) {
            super(request);
            this.bridgeVoicePath = request.bridgeVoicePath;
            this.bridgeVoiceType = request.bridgeVoiceType;
            this.enterpriseId = request.enterpriseId;
            this.fileId = request.fileId;
            this.importTelAutoStart = request.importTelAutoStart;
            this.isRepeat = request.isRepeat;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
            this.taskTelList = request.taskTelList;
        } 

        /**
         * <p>座席接听时自动在双侧播放开场白语音，指定语音变量值；企业语音库里的语音变量值</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder bridgeVoicePath(String bridgeVoicePath) {
            this.putQueryParameter("BridgeVoicePath", bridgeVoicePath);
            this.bridgeVoicePath = bridgeVoicePath;
            return this;
        }

        /**
         * <p>座席接听时自动在双侧播放开场白语音类型；1. 公共语音库；2. 企业语音库，静态话术； 3. 企业语音库，动态话术（座席号），传bridgeVoicePath后生效，默认为3</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder bridgeVoiceType(Long bridgeVoiceType) {
            this.putQueryParameter("BridgeVoiceType", bridgeVoiceType);
            this.bridgeVoiceType = bridgeVoiceType;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>批次Id；传此值表示在批次中增加号码</p>
         * 
         * <strong>example:</strong>
         * <p>666</p>
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>是否自动启动任务；0:不自动启动 1:自动启动，默认为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder importTelAutoStart(Long importTelAutoStart) {
            this.putQueryParameter("ImportTelAutoStart", importTelAutoStart);
            this.importTelAutoStart = importTelAutoStart;
            return this;
        }

        /**
         * <p>是否排重；0.不排重 1.任务内排重 2.导入号码排重 3.批次内排重，默认为1。注：任务内排重与批次内排重不能同时支持，如果中途切换，则从本次切换开始进行排重。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isRepeat(Long isRepeat) {
            this.putQueryParameter("IsRepeat", isRepeat);
            this.isRepeat = isRepeat;
            return this;
        }

        /**
         * <p>批次名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>优先级；默认0，值越大越优先，最大999999</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder priority(Long priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>任务Id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>任务号码列表；CtiLinkTaskTel中只有Tel是必选字段，长度大小不超过8MB 注：获取导入失败明细，需配置<a href="../%E5%AD%97%E6%AE%B5%E5%AE%9A%E4%B9%89/%E6%8E%A8%E9%80%81%E5%8F%98%E9%87%8F%E5%92%8C%E5%80%BC/%E9%A2%84%E6%B5%8B%E5%A4%96%E5%91%BC%E5%AF%BC%E5%85%A5%E5%8F%B7%E7%A0%81%E5%A4%B1%E8%B4%A5%E6%8E%A8%E9%80%81%E5%8F%98%E9%87%8F.md">事件推送</a></p>
         * <p>This parameter is required.</p>
         */
        public Builder taskTelList(java.util.List<TaskTelList> taskTelList) {
            String taskTelListShrink = shrink(taskTelList, "TaskTelList", "json");
            this.putQueryParameter("TaskTelList", taskTelListShrink);
            this.taskTelList = taskTelList;
            return this;
        }

        @Override
        public CloudImportTaskTelRequest build() {
            return new CloudImportTaskTelRequest(this);
        } 

    } 

    /**
     * 
     * {@link CloudImportTaskTelRequest} extends {@link TeaModel}
     *
     * <p>CloudImportTaskTelRequest</p>
     */
    public static class TaskTelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupTels")
        private String backupTels;

        @com.aliyun.core.annotation.NameInMap("Clid")
        private String clid;

        @com.aliyun.core.annotation.NameInMap("ClidGroup")
        private String clidGroup;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("Tel")
        private String tel;

        private TaskTelList(Builder builder) {
            this.backupTels = builder.backupTels;
            this.clid = builder.clid;
            this.clidGroup = builder.clidGroup;
            this.priority = builder.priority;
            this.property = builder.property;
            this.tel = builder.tel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskTelList create() {
            return builder().build();
        }

        /**
         * @return backupTels
         */
        public String getBackupTels() {
            return this.backupTels;
        }

        /**
         * @return clid
         */
        public String getClid() {
            return this.clid;
        }

        /**
         * @return clidGroup
         */
        public String getClidGroup() {
            return this.clidGroup;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return tel
         */
        public String getTel() {
            return this.tel;
        }

        public static final class Builder {
            private String backupTels; 
            private String clid; 
            private String clidGroup; 
            private Long priority; 
            private String property; 
            private String tel; 

            private Builder() {
            } 

            private Builder(TaskTelList model) {
                this.backupTels = model.backupTels;
                this.clid = model.clid;
                this.clidGroup = model.clidGroup;
                this.priority = model.priority;
                this.property = model.property;
                this.tel = model.tel;
            } 

            /**
             * <p>备选号码，tel呼叫不通时，呼叫备选号码最多支持8个，号码之间用英文逗号&quot;,&quot;分隔</p>
             * 
             * <strong>example:</strong>
             * <p>7455332</p>
             */
            public Builder backupTels(String backupTels) {
                this.backupTels = backupTels;
                return this;
            }

            /**
             * <p>电话号对应的外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>7766551</p>
             */
            public Builder clid(String clid) {
                this.clid = clid;
                return this;
            }

            /**
             * <p>使用clidGroup需要账号支持按标识路由，使用此参数是clid参数无效</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder clidGroup(String clidGroup) {
                this.clidGroup = clidGroup;
                return this;
            }

            /**
             * <p>优先级，默认为0，值越大优先级越高，最大999999</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>属性，json格式</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * <p>电话号</p>
             * 
             * <strong>example:</strong>
             * <p>7455441</p>
             */
            public Builder tel(String tel) {
                this.tel = tel;
                return this;
            }

            public TaskTelList build() {
                return new TaskTelList(this);
            } 

        } 

    }
}
