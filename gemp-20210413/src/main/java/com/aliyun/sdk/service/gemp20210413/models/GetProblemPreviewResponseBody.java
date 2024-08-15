// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemPreviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetProblemPreviewResponseBody</p>
 */
public class GetProblemPreviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
         * data
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
        @com.aliyun.core.annotation.NameInMap("username")
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
             * username.
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
        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("users")
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
             * count.
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
        @com.aliyun.core.annotation.NameInMap("serviceGroupDescription")
        private String serviceGroupDescription;

        @com.aliyun.core.annotation.NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @com.aliyun.core.annotation.NameInMap("serviceGroupName")
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
             * serviceGroupDescription.
             */
            public Builder serviceGroupDescription(String serviceGroupDescription) {
                this.serviceGroupDescription = serviceGroupDescription;
                return this;
            }

            /**
             * serviceGroupId.
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * serviceGroupName.
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
        @com.aliyun.core.annotation.NameInMap("serviceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
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
             * serviceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * serviceName.
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
        @com.aliyun.core.annotation.NameInMap("coordinationGroups")
        private java.util.List < CoordinationGroups> coordinationGroups;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("discoverTime")
        private String discoverTime;

        @com.aliyun.core.annotation.NameInMap("effectionServices")
        private java.util.List < EffectionServices> effectionServices;

        @com.aliyun.core.annotation.NameInMap("isManual")
        private Boolean isManual;

        @com.aliyun.core.annotation.NameInMap("isUpgrade")
        private Boolean isUpgrade;

        @com.aliyun.core.annotation.NameInMap("mainHandlerId")
        private String mainHandlerId;

        @com.aliyun.core.annotation.NameInMap("mainHandlerName")
        private String mainHandlerName;

        @com.aliyun.core.annotation.NameInMap("preliminaryReason")
        private String preliminaryReason;

        @com.aliyun.core.annotation.NameInMap("problemId")
        private Long problemId;

        @com.aliyun.core.annotation.NameInMap("problemLevel")
        private String problemLevel;

        @com.aliyun.core.annotation.NameInMap("problemName")
        private String problemName;

        @com.aliyun.core.annotation.NameInMap("problemStatus")
        private String problemStatus;

        @com.aliyun.core.annotation.NameInMap("progressSummary")
        private String progressSummary;

        @com.aliyun.core.annotation.NameInMap("progressSummaryRichTextId")
        private Long progressSummaryRichTextId;

        @com.aliyun.core.annotation.NameInMap("recoveryTime")
        private String recoveryTime;

        @com.aliyun.core.annotation.NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
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
             * coordinationGroups.
             */
            public Builder coordinationGroups(java.util.List < CoordinationGroups> coordinationGroups) {
                this.coordinationGroups = coordinationGroups;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * discoverTime.
             */
            public Builder discoverTime(String discoverTime) {
                this.discoverTime = discoverTime;
                return this;
            }

            /**
             * effectionServices.
             */
            public Builder effectionServices(java.util.List < EffectionServices> effectionServices) {
                this.effectionServices = effectionServices;
                return this;
            }

            /**
             * isManual.
             */
            public Builder isManual(Boolean isManual) {
                this.isManual = isManual;
                return this;
            }

            /**
             * isUpgrade.
             */
            public Builder isUpgrade(Boolean isUpgrade) {
                this.isUpgrade = isUpgrade;
                return this;
            }

            /**
             * mainHandlerId.
             */
            public Builder mainHandlerId(String mainHandlerId) {
                this.mainHandlerId = mainHandlerId;
                return this;
            }

            /**
             * mainHandlerName.
             */
            public Builder mainHandlerName(String mainHandlerName) {
                this.mainHandlerName = mainHandlerName;
                return this;
            }

            /**
             * preliminaryReason.
             */
            public Builder preliminaryReason(String preliminaryReason) {
                this.preliminaryReason = preliminaryReason;
                return this;
            }

            /**
             * problemId.
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * problemLevel.
             */
            public Builder problemLevel(String problemLevel) {
                this.problemLevel = problemLevel;
                return this;
            }

            /**
             * problemName.
             */
            public Builder problemName(String problemName) {
                this.problemName = problemName;
                return this;
            }

            /**
             * problemStatus.
             */
            public Builder problemStatus(String problemStatus) {
                this.problemStatus = problemStatus;
                return this;
            }

            /**
             * progressSummary.
             */
            public Builder progressSummary(String progressSummary) {
                this.progressSummary = progressSummary;
                return this;
            }

            /**
             * progressSummaryRichTextId.
             */
            public Builder progressSummaryRichTextId(Long progressSummaryRichTextId) {
                this.progressSummaryRichTextId = progressSummaryRichTextId;
                return this;
            }

            /**
             * recoveryTime.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * relatedServiceId.
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * serviceName.
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
        @com.aliyun.core.annotation.NameInMap("username")
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
             * username.
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
        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("users")
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
             * count.
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
        @com.aliyun.core.annotation.NameInMap("username")
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
             * username.
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
        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("users")
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
             * count.
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
        @com.aliyun.core.annotation.NameInMap("serviceName")
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
             * serviceName.
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
        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("serviceGroups")
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
             * count.
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
        @com.aliyun.core.annotation.NameInMap("deAfterData")
        private String deAfterData;

        @com.aliyun.core.annotation.NameInMap("deBeforeData")
        private String deBeforeData;

        @com.aliyun.core.annotation.NameInMap("mail")
        private Mail mail;

        @com.aliyun.core.annotation.NameInMap("problem")
        private Problem problem;

        @com.aliyun.core.annotation.NameInMap("sms")
        private Sms sms;

        @com.aliyun.core.annotation.NameInMap("upAfterData")
        private String upAfterData;

        @com.aliyun.core.annotation.NameInMap("upBeforeData")
        private String upBeforeData;

        @com.aliyun.core.annotation.NameInMap("voice")
        private Voice voice;

        @com.aliyun.core.annotation.NameInMap("webhook")
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
             * deAfterData.
             */
            public Builder deAfterData(String deAfterData) {
                this.deAfterData = deAfterData;
                return this;
            }

            /**
             * deBeforeData.
             */
            public Builder deBeforeData(String deBeforeData) {
                this.deBeforeData = deBeforeData;
                return this;
            }

            /**
             * mail.
             */
            public Builder mail(Mail mail) {
                this.mail = mail;
                return this;
            }

            /**
             * object
             */
            public Builder problem(Problem problem) {
                this.problem = problem;
                return this;
            }

            /**
             * sms.
             */
            public Builder sms(Sms sms) {
                this.sms = sms;
                return this;
            }

            /**
             * upAfterData.
             */
            public Builder upAfterData(String upAfterData) {
                this.upAfterData = upAfterData;
                return this;
            }

            /**
             * upBeforeData.
             */
            public Builder upBeforeData(String upBeforeData) {
                this.upBeforeData = upBeforeData;
                return this;
            }

            /**
             * voice.
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
