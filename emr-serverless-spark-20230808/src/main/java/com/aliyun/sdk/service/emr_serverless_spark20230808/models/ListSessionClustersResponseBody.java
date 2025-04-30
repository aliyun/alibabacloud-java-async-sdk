// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListSessionClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListSessionClustersResponseBody</p>
 */
public class ListSessionClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionClusters")
    private java.util.List<SessionClusters> sessionClusters;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListSessionClustersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.sessionClusters = builder.sessionClusters;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSessionClustersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return sessionClusters
     */
    public java.util.List<SessionClusters> getSessionClusters() {
        return this.sessionClusters;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SessionClusters> sessionClusters; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSessionClustersResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.sessionClusters = model.sessionClusters;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sessions.</p>
         */
        public Builder sessionClusters(java.util.List<SessionClusters> sessionClusters) {
            this.sessionClusters = sessionClusters;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSessionClustersResponseBody build() {
            return new ListSessionClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSessionClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionClustersResponseBody</p>
     */
    public static class ApplicationConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configFileName")
        private String configFileName;

        @com.aliyun.core.annotation.NameInMap("configItemKey")
        private String configItemKey;

        @com.aliyun.core.annotation.NameInMap("configItemValue")
        private String configItemValue;

        private ApplicationConfigs(Builder builder) {
            this.configFileName = builder.configFileName;
            this.configItemKey = builder.configItemKey;
            this.configItemValue = builder.configItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationConfigs create() {
            return builder().build();
        }

        /**
         * @return configFileName
         */
        public String getConfigFileName() {
            return this.configFileName;
        }

        /**
         * @return configItemKey
         */
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        /**
         * @return configItemValue
         */
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public static final class Builder {
            private String configFileName; 
            private String configItemKey; 
            private String configItemValue; 

            private Builder() {
            } 

            private Builder(ApplicationConfigs model) {
                this.configFileName = model.configFileName;
                this.configItemKey = model.configItemKey;
                this.configItemValue = model.configItemValue;
            } 

            /**
             * <p>The name of the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-default.conf</p>
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * <p>The key of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>spark.app.name</p>
             */
            public Builder configItemKey(String configItemKey) {
                this.configItemKey = configItemKey;
                return this;
            }

            /**
             * <p>The configuration value.</p>
             * 
             * <strong>example:</strong>
             * <p>test_application</p>
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            public ApplicationConfigs build() {
                return new ApplicationConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionClustersResponseBody</p>
     */
    public static class AutoStartConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private AutoStartConfiguration(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoStartConfiguration create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(AutoStartConfiguration model) {
                this.enable = model.enable;
            } 

            /**
             * <p>Indicates whether automatic startup is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public AutoStartConfiguration build() {
                return new AutoStartConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionClustersResponseBody</p>
     */
    public static class AutoStopConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("idleTimeoutMinutes")
        private Integer idleTimeoutMinutes;

        private AutoStopConfiguration(Builder builder) {
            this.enable = builder.enable;
            this.idleTimeoutMinutes = builder.idleTimeoutMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoStopConfiguration create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return idleTimeoutMinutes
         */
        public Integer getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

        public static final class Builder {
            private Boolean enable; 
            private Integer idleTimeoutMinutes; 

            private Builder() {
            } 

            private Builder(AutoStopConfiguration model) {
                this.enable = model.enable;
                this.idleTimeoutMinutes = model.idleTimeoutMinutes;
            } 

            /**
             * <p>Indicates whether automatic termination is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The idle timeout period. The session is automatically terminated when the idle timeout period is exceeded.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder idleTimeoutMinutes(Integer idleTimeoutMinutes) {
                this.idleTimeoutMinutes = idleTimeoutMinutes;
                return this;
            }

            public AutoStopConfiguration build() {
                return new AutoStopConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionClustersResponseBody</p>
     */
    public static class StateChangeReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private StateChangeReason(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateChangeReason create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(StateChangeReason model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The status change code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The status change message.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public StateChangeReason build() {
                return new StateChangeReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionClustersResponseBody</p>
     */
    public static class SessionClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationConfigs")
        private java.util.List<ApplicationConfigs> applicationConfigs;

        @com.aliyun.core.annotation.NameInMap("autoStartConfiguration")
        private AutoStartConfiguration autoStartConfiguration;

        @com.aliyun.core.annotation.NameInMap("autoStopConfiguration")
        private AutoStopConfiguration autoStopConfiguration;

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("domainInner")
        private String domainInner;

        @com.aliyun.core.annotation.NameInMap("draftId")
        private String draftId;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("fusion")
        private Boolean fusion;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("releaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("sessionClusterId")
        private String sessionClusterId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("stateChangeReason")
        private StateChangeReason stateChangeReason;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("webUI")
        private String webUI;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private SessionClusters(Builder builder) {
            this.applicationConfigs = builder.applicationConfigs;
            this.autoStartConfiguration = builder.autoStartConfiguration;
            this.autoStopConfiguration = builder.autoStopConfiguration;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.domain = builder.domain;
            this.domainInner = builder.domainInner;
            this.draftId = builder.draftId;
            this.extra = builder.extra;
            this.fusion = builder.fusion;
            this.gmtCreate = builder.gmtCreate;
            this.kind = builder.kind;
            this.name = builder.name;
            this.queueName = builder.queueName;
            this.releaseVersion = builder.releaseVersion;
            this.sessionClusterId = builder.sessionClusterId;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.stateChangeReason = builder.stateChangeReason;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.webUI = builder.webUI;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionClusters create() {
            return builder().build();
        }

        /**
         * @return applicationConfigs
         */
        public java.util.List<ApplicationConfigs> getApplicationConfigs() {
            return this.applicationConfigs;
        }

        /**
         * @return autoStartConfiguration
         */
        public AutoStartConfiguration getAutoStartConfiguration() {
            return this.autoStartConfiguration;
        }

        /**
         * @return autoStopConfiguration
         */
        public AutoStopConfiguration getAutoStopConfiguration() {
            return this.autoStopConfiguration;
        }

        /**
         * @return displayReleaseVersion
         */
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainInner
         */
        public String getDomainInner() {
            return this.domainInner;
        }

        /**
         * @return draftId
         */
        public String getDraftId() {
            return this.draftId;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return fusion
         */
        public Boolean getFusion() {
            return this.fusion;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return sessionClusterId
         */
        public String getSessionClusterId() {
            return this.sessionClusterId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateChangeReason
         */
        public StateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return webUI
         */
        public String getWebUI() {
            return this.webUI;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.List<ApplicationConfigs> applicationConfigs; 
            private AutoStartConfiguration autoStartConfiguration; 
            private AutoStopConfiguration autoStopConfiguration; 
            private String displayReleaseVersion; 
            private String domain; 
            private String domainInner; 
            private String draftId; 
            private String extra; 
            private Boolean fusion; 
            private Long gmtCreate; 
            private String kind; 
            private String name; 
            private String queueName; 
            private String releaseVersion; 
            private String sessionClusterId; 
            private Long startTime; 
            private String state; 
            private StateChangeReason stateChangeReason; 
            private String userId; 
            private String userName; 
            private String webUI; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(SessionClusters model) {
                this.applicationConfigs = model.applicationConfigs;
                this.autoStartConfiguration = model.autoStartConfiguration;
                this.autoStopConfiguration = model.autoStopConfiguration;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.domain = model.domain;
                this.domainInner = model.domainInner;
                this.draftId = model.draftId;
                this.extra = model.extra;
                this.fusion = model.fusion;
                this.gmtCreate = model.gmtCreate;
                this.kind = model.kind;
                this.name = model.name;
                this.queueName = model.queueName;
                this.releaseVersion = model.releaseVersion;
                this.sessionClusterId = model.sessionClusterId;
                this.startTime = model.startTime;
                this.state = model.state;
                this.stateChangeReason = model.stateChangeReason;
                this.userId = model.userId;
                this.userName = model.userName;
                this.webUI = model.webUI;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The session configurations, which are equivalent to the configurations of the Spark job.</p>
             */
            public Builder applicationConfigs(java.util.List<ApplicationConfigs> applicationConfigs) {
                this.applicationConfigs = applicationConfigs;
                return this;
            }

            /**
             * <p>The automatic startup configurations.</p>
             */
            public Builder autoStartConfiguration(AutoStartConfiguration autoStartConfiguration) {
                this.autoStartConfiguration = autoStartConfiguration;
                return this;
            }

            /**
             * <p>The configurations of automatic termination.</p>
             */
            public Builder autoStopConfiguration(AutoStopConfiguration autoStopConfiguration) {
                this.autoStopConfiguration = autoStopConfiguration;
                return this;
            }

            /**
             * <p>The version of the Spark engine.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>The public endpoint of the Thrift server.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-gateway-cn-hangzhou.data.aliyun.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The internal endpoint of the Thrift server.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-gateway-cn-hangzhou-internal.data.aliyuncs.com</p>
             */
            public Builder domainInner(String domainInner) {
                this.domainInner = domainInner;
                return this;
            }

            /**
             * <p>The ID of the job that is associated with the session.</p>
             * 
             * <strong>example:</strong>
             * <p>TSK-xxxxxxxxx</p>
             */
            public Builder draftId(String draftId) {
                this.draftId = draftId;
                return this;
            }

            /**
             * <p>The additional metadata of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;extraInfoKey&quot;:&quot;extraInfoValue&quot;}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>Indicates whether the Fusion engine is used for acceleration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fusion(Boolean fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1732267598000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The session type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NOTEBOOK</li>
             * <li>THRIFT</li>
             * <li>SQL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The name of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>adhoc_query</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the queue that is used to run the session.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The version of EMR Serverless Spark.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-2.1</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sc-123131</p>
             */
            public Builder sessionClusterId(String sessionClusterId) {
                this.sessionClusterId = sessionClusterId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1732267598000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the session.</p>
             * <ul>
             * <li>Starting</li>
             * <li>Running</li>
             * <li>Stopping</li>
             * <li>Stopped</li>
             * <li>Error</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The details of the most recent status change of the session.</p>
             */
            public Builder stateChangeReason(StateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123131</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The Spark UI of the session.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://spark-ui-xxxx">http://spark-ui-xxxx</a></p>
             */
            public Builder webUI(String webUI) {
                this.webUI = webUI;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>w-1234abcd</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public SessionClusters build() {
                return new SessionClusters(this);
            } 

        } 

    }
}
