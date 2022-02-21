// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemPreviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetProblemPreviewResponseBody</p>
 */
public class GetProblemPreviewResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetProblemPreviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProblemPreviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProblemPreviewResponseBody build() {
            return new GetProblemPreviewResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @NameInMap("username")
        private String username;

        private Users(Builder builder) {
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String username; 

            /**
             * 用户名称
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    public static class Mail extends TeaModel {
        @NameInMap("count")
        private Long count;

        @NameInMap("users")
        private java.util.List < Users> users;

        private Mail(Builder builder) {
            this.count = builder.count;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mail create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return users
         */
        public java.util.List < Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private Long count; 
            private java.util.List < Users> users; 

            /**
             * 数量
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * users.
             */
            public Builder users(java.util.List < Users> users) {
                this.users = users;
                return this;
            }

            public Mail build() {
                return new Mail(this);
            } 

        } 

    }
    public static class CoordinationGroups extends TeaModel {
        @NameInMap("serviceGroupDescription")
        private String serviceGroupDescription;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("serviceGroupName")
        private String serviceGroupName;

        private CoordinationGroups(Builder builder) {
            this.serviceGroupDescription = builder.serviceGroupDescription;
            this.serviceGroupId = builder.serviceGroupId;
            this.serviceGroupName = builder.serviceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinationGroups create() {
            return builder().build();
        }

        /**
         * @return serviceGroupDescription
         */
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        /**
         * @return serviceGroupName
         */
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public static final class Builder {
            private String serviceGroupDescription; 
            private Long serviceGroupId; 
            private String serviceGroupName; 

            /**
             * 服务组Maison
             */
            public Builder serviceGroupDescription(String serviceGroupDescription) {
                this.serviceGroupDescription = serviceGroupDescription;
                return this;
            }

            /**
             * 服务Id
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * 服务组名称
             */
            public Builder serviceGroupName(String serviceGroupName) {
                this.serviceGroupName = serviceGroupName;
                return this;
            }

            public CoordinationGroups build() {
                return new CoordinationGroups(this);
            } 

        } 

    }
    public static class EffectionServices extends TeaModel {
        @NameInMap("serviceId")
        private Long serviceId;

        @NameInMap("serviceName")
        private String serviceName;

        private EffectionServices(Builder builder) {
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectionServices create() {
            return builder().build();
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private Long serviceId; 
            private String serviceName; 

            /**
             * 影响服务Id
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * 影响服务名称
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public EffectionServices build() {
                return new EffectionServices(this);
            } 

        } 

    }
    public static class Problem extends TeaModel {
        @NameInMap("coordinationGroups")
        private java.util.List < CoordinationGroups> coordinationGroups;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("discoverTime")
        private String discoverTime;

        @NameInMap("effectionServices")
        private java.util.List < EffectionServices> effectionServices;

        @NameInMap("isManual")
        private Boolean isManual;

        @NameInMap("isUpgrade")
        private Boolean isUpgrade;

        @NameInMap("mainHandlerId")
        private String mainHandlerId;

        @NameInMap("mainHandlerName")
        private String mainHandlerName;

        @NameInMap("preliminaryReason")
        private String preliminaryReason;

        @NameInMap("problemId")
        private Long problemId;

        @NameInMap("problemLevel")
        private String problemLevel;

        @NameInMap("problemName")
        private String problemName;

        @NameInMap("problemStatus")
        private String problemStatus;

        @NameInMap("progressSummary")
        private String progressSummary;

        @NameInMap("progressSummaryRichTextId")
        private Long progressSummaryRichTextId;

        @NameInMap("recoveryTime")
        private String recoveryTime;

        @NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @NameInMap("serviceName")
        private String serviceName;

        private Problem(Builder builder) {
            this.coordinationGroups = builder.coordinationGroups;
            this.createTime = builder.createTime;
            this.discoverTime = builder.discoverTime;
            this.effectionServices = builder.effectionServices;
            this.isManual = builder.isManual;
            this.isUpgrade = builder.isUpgrade;
            this.mainHandlerId = builder.mainHandlerId;
            this.mainHandlerName = builder.mainHandlerName;
            this.preliminaryReason = builder.preliminaryReason;
            this.problemId = builder.problemId;
            this.problemLevel = builder.problemLevel;
            this.problemName = builder.problemName;
            this.problemStatus = builder.problemStatus;
            this.progressSummary = builder.progressSummary;
            this.progressSummaryRichTextId = builder.progressSummaryRichTextId;
            this.recoveryTime = builder.recoveryTime;
            this.relatedServiceId = builder.relatedServiceId;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Problem create() {
            return builder().build();
        }

        /**
         * @return coordinationGroups
         */
        public java.util.List < CoordinationGroups> getCoordinationGroups() {
            return this.coordinationGroups;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return discoverTime
         */
        public String getDiscoverTime() {
            return this.discoverTime;
        }

        /**
         * @return effectionServices
         */
        public java.util.List < EffectionServices> getEffectionServices() {
            return this.effectionServices;
        }

        /**
         * @return isManual
         */
        public Boolean getIsManual() {
            return this.isManual;
        }

        /**
         * @return isUpgrade
         */
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        /**
         * @return mainHandlerId
         */
        public String getMainHandlerId() {
            return this.mainHandlerId;
        }

        /**
         * @return mainHandlerName
         */
        public String getMainHandlerName() {
            return this.mainHandlerName;
        }

        /**
         * @return preliminaryReason
         */
        public String getPreliminaryReason() {
            return this.preliminaryReason;
        }

        /**
         * @return problemId
         */
        public Long getProblemId() {
            return this.problemId;
        }

        /**
         * @return problemLevel
         */
        public String getProblemLevel() {
            return this.problemLevel;
        }

        /**
         * @return problemName
         */
        public String getProblemName() {
            return this.problemName;
        }

        /**
         * @return problemStatus
         */
        public String getProblemStatus() {
            return this.problemStatus;
        }

        /**
         * @return progressSummary
         */
        public String getProgressSummary() {
            return this.progressSummary;
        }

        /**
         * @return progressSummaryRichTextId
         */
        public Long getProgressSummaryRichTextId() {
            return this.progressSummaryRichTextId;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return relatedServiceId
         */
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List < CoordinationGroups> coordinationGroups; 
            private String createTime; 
            private String discoverTime; 
            private java.util.List < EffectionServices> effectionServices; 
            private Boolean isManual; 
            private Boolean isUpgrade; 
            private String mainHandlerId; 
            private String mainHandlerName; 
            private String preliminaryReason; 
            private Long problemId; 
            private String problemLevel; 
            private String problemName; 
            private String problemStatus; 
            private String progressSummary; 
            private Long progressSummaryRichTextId; 
            private String recoveryTime; 
            private Long relatedServiceId; 
            private String serviceName; 

            /**
             * 应急协同组
             */
            public Builder coordinationGroups(java.util.List < CoordinationGroups> coordinationGroups) {
                this.coordinationGroups = coordinationGroups;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 发现时间
             */
            public Builder discoverTime(String discoverTime) {
                this.discoverTime = discoverTime;
                return this;
            }

            /**
             * 影响服务
             */
            public Builder effectionServices(java.util.List < EffectionServices> effectionServices) {
                this.effectionServices = effectionServices;
                return this;
            }

            /**
             * 是否手动
             */
            public Builder isManual(Boolean isManual) {
                this.isManual = isManual;
                return this;
            }

            /**
             * 是否升级
             */
            public Builder isUpgrade(Boolean isUpgrade) {
                this.isUpgrade = isUpgrade;
                return this;
            }

            /**
             * 主要处理人Id
             */
            public Builder mainHandlerId(String mainHandlerId) {
                this.mainHandlerId = mainHandlerId;
                return this;
            }

            /**
             * 主要处理人
             */
            public Builder mainHandlerName(String mainHandlerName) {
                this.mainHandlerName = mainHandlerName;
                return this;
            }

            /**
             * 初步原因
             */
            public Builder preliminaryReason(String preliminaryReason) {
                this.preliminaryReason = preliminaryReason;
                return this;
            }

            /**
             * 故障Id
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * 故障等级 1=P1 2=P2 3=P3 4=P4
             */
            public Builder problemLevel(String problemLevel) {
                this.problemLevel = problemLevel;
                return this;
            }

            /**
             * 故障名称
             */
            public Builder problemName(String problemName) {
                this.problemName = problemName;
                return this;
            }

            /**
             * 故障状态 1 处理中 2已恢复 3复盘中 4已复盘 5已取消
             */
            public Builder problemStatus(String problemStatus) {
                this.problemStatus = problemStatus;
                return this;
            }

            /**
             * 进展摘要
             */
            public Builder progressSummary(String progressSummary) {
                this.progressSummary = progressSummary;
                return this;
            }

            /**
             * 富文本id
             */
            public Builder progressSummaryRichTextId(Long progressSummaryRichTextId) {
                this.progressSummaryRichTextId = progressSummaryRichTextId;
                return this;
            }

            /**
             * 恢复时间
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * 关联服务ID
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * 关联服务 名称
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Problem build() {
                return new Problem(this);
            } 

        } 

    }
    public static class SmsUsers extends TeaModel {
        @NameInMap("username")
        private String username;

        private SmsUsers(Builder builder) {
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsUsers create() {
            return builder().build();
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String username; 

            /**
             * 用户名称
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public SmsUsers build() {
                return new SmsUsers(this);
            } 

        } 

    }
    public static class Sms extends TeaModel {
        @NameInMap("count")
        private Long count;

        @NameInMap("users")
        private java.util.List < SmsUsers> users;

        private Sms(Builder builder) {
            this.count = builder.count;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sms create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return users
         */
        public java.util.List < SmsUsers> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private Long count; 
            private java.util.List < SmsUsers> users; 

            /**
             * 数量
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * users.
             */
            public Builder users(java.util.List < SmsUsers> users) {
                this.users = users;
                return this;
            }

            public Sms build() {
                return new Sms(this);
            } 

        } 

    }
    public static class VoiceUsers extends TeaModel {
        @NameInMap("username")
        private String username;

        private VoiceUsers(Builder builder) {
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceUsers create() {
            return builder().build();
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String username; 

            /**
             * 用户
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public VoiceUsers build() {
                return new VoiceUsers(this);
            } 

        } 

    }
    public static class Voice extends TeaModel {
        @NameInMap("count")
        private Long count;

        @NameInMap("users")
        private java.util.List < VoiceUsers> users;

        private Voice(Builder builder) {
            this.count = builder.count;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Voice create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return users
         */
        public java.util.List < VoiceUsers> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private Long count; 
            private java.util.List < VoiceUsers> users; 

            /**
             * 数量
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * users.
             */
            public Builder users(java.util.List < VoiceUsers> users) {
                this.users = users;
                return this;
            }

            public Voice build() {
                return new Voice(this);
            } 

        } 

    }
    public static class ServiceGroups extends TeaModel {
        @NameInMap("serviceName")
        private String serviceName;

        private ServiceGroups(Builder builder) {
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceGroups create() {
            return builder().build();
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String serviceName; 

            /**
             * 服务名称
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServiceGroups build() {
                return new ServiceGroups(this);
            } 

        } 

    }
    public static class Webhook extends TeaModel {
        @NameInMap("count")
        private Long count;

        @NameInMap("serviceGroups")
        private java.util.List < ServiceGroups> serviceGroups;

        private Webhook(Builder builder) {
            this.count = builder.count;
            this.serviceGroups = builder.serviceGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Webhook create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return serviceGroups
         */
        public java.util.List < ServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

        public static final class Builder {
            private Long count; 
            private java.util.List < ServiceGroups> serviceGroups; 

            /**
             * 数量
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * serviceGroups.
             */
            public Builder serviceGroups(java.util.List < ServiceGroups> serviceGroups) {
                this.serviceGroups = serviceGroups;
                return this;
            }

            public Webhook build() {
                return new Webhook(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("deAfterData")
        private String deAfterData;

        @NameInMap("deBeforeData")
        private String deBeforeData;

        @NameInMap("mail")
        private Mail mail;

        @NameInMap("problem")
        private Problem problem;

        @NameInMap("sms")
        private Sms sms;

        @NameInMap("upAfterData")
        private String upAfterData;

        @NameInMap("upBeforeData")
        private String upBeforeData;

        @NameInMap("voice")
        private Voice voice;

        @NameInMap("webhook")
        private Webhook webhook;

        private Data(Builder builder) {
            this.deAfterData = builder.deAfterData;
            this.deBeforeData = builder.deBeforeData;
            this.mail = builder.mail;
            this.problem = builder.problem;
            this.sms = builder.sms;
            this.upAfterData = builder.upAfterData;
            this.upBeforeData = builder.upBeforeData;
            this.voice = builder.voice;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deAfterData
         */
        public String getDeAfterData() {
            return this.deAfterData;
        }

        /**
         * @return deBeforeData
         */
        public String getDeBeforeData() {
            return this.deBeforeData;
        }

        /**
         * @return mail
         */
        public Mail getMail() {
            return this.mail;
        }

        /**
         * @return problem
         */
        public Problem getProblem() {
            return this.problem;
        }

        /**
         * @return sms
         */
        public Sms getSms() {
            return this.sms;
        }

        /**
         * @return upAfterData
         */
        public String getUpAfterData() {
            return this.upAfterData;
        }

        /**
         * @return upBeforeData
         */
        public String getUpBeforeData() {
            return this.upBeforeData;
        }

        /**
         * @return voice
         */
        public Voice getVoice() {
            return this.voice;
        }

        /**
         * @return webhook
         */
        public Webhook getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String deAfterData; 
            private String deBeforeData; 
            private Mail mail; 
            private Problem problem; 
            private Sms sms; 
            private String upAfterData; 
            private String upBeforeData; 
            private Voice voice; 
            private Webhook webhook; 

            /**
             * 降级后数据
             */
            public Builder deAfterData(String deAfterData) {
                this.deAfterData = deAfterData;
                return this;
            }

            /**
             * 降级前数据
             */
            public Builder deBeforeData(String deBeforeData) {
                this.deBeforeData = deBeforeData;
                return this;
            }

            /**
             * 邮箱
             */
            public Builder mail(Mail mail) {
                this.mail = mail;
                return this;
            }

            /**
             * problem.
             */
            public Builder problem(Problem problem) {
                this.problem = problem;
                return this;
            }

            /**
             * 短信
             */
            public Builder sms(Sms sms) {
                this.sms = sms;
                return this;
            }

            /**
             * 升级后数据
             */
            public Builder upAfterData(String upAfterData) {
                this.upAfterData = upAfterData;
                return this;
            }

            /**
             * 升级前数据
             */
            public Builder upBeforeData(String upBeforeData) {
                this.upBeforeData = upBeforeData;
                return this;
            }

            /**
             * 语音
             */
            public Builder voice(Voice voice) {
                this.voice = voice;
                return this;
            }

            /**
             * webhook
             */
            public Builder webhook(Webhook webhook) {
                this.webhook = webhook;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
