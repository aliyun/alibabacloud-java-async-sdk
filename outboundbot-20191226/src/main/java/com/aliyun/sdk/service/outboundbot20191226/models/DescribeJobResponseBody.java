// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResponseBody</p>
 */
public class DescribeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.job = builder.job;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
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
        private String code; 
        private Integer httpStatusCode; 
        private Job job; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeJobResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.job = model.job;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The job information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The API response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeJobResponseBody build() {
            return new DescribeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Honorific")
        private String honorific;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Contacts(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.honorific = builder.honorific;
            this.jobId = builder.jobId;
            this.phoneNumber = builder.phoneNumber;
            this.referenceId = builder.referenceId;
            this.role = builder.role;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return honorific
         */
        public String getHonorific() {
            return this.honorific;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String contactId; 
            private String contactName; 
            private String honorific; 
            private String jobId; 
            private String phoneNumber; 
            private String referenceId; 
            private String role; 
            private String state; 

            private Builder() {
            } 

            private Builder(Contacts model) {
                this.contactId = model.contactId;
                this.contactName = model.contactName;
                this.honorific = model.honorific;
                this.jobId = model.jobId;
                this.phoneNumber = model.phoneNumber;
                this.referenceId = model.referenceId;
                this.role = model.role;
                this.state = model.state;
            } 

            /**
             * <p>The contact ID. This ID is generated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The name of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The honorific of the contact. It is consistent with the contact name.</p>
             * 
             * <strong>example:</strong>
             * <p>Mr. Zhang</p>
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>72dcd26b-f12d-4c27-b3af-18f6aed5b160</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1358****8888</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The business ID of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The role of the contact.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The contact status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Extras extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Extras(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extras create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Extras model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the business parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>djrq</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the business parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-21 09:49:59.0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Extras build() {
                return new Extras(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrConfig")
        private String asrConfig;

        @com.aliyun.core.annotation.NameInMap("ChatbotId")
        private String chatbotId;

        @com.aliyun.core.annotation.NameInMap("DebugStatus")
        private String debugStatus;

        @com.aliyun.core.annotation.NameInMap("Industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @com.aliyun.core.annotation.NameInMap("IsDrafted")
        private Boolean isDrafted;

        @com.aliyun.core.annotation.NameInMap("MiniPlaybackConfigEnabled")
        private Boolean miniPlaybackConfigEnabled;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("ScriptDescription")
        private String scriptDescription;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TtsConfig")
        private String ttsConfig;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Script(Builder builder) {
            this.asrConfig = builder.asrConfig;
            this.chatbotId = builder.chatbotId;
            this.debugStatus = builder.debugStatus;
            this.industry = builder.industry;
            this.isDebugDrafted = builder.isDebugDrafted;
            this.isDrafted = builder.isDrafted;
            this.miniPlaybackConfigEnabled = builder.miniPlaybackConfigEnabled;
            this.name = builder.name;
            this.scene = builder.scene;
            this.scriptDescription = builder.scriptDescription;
            this.scriptId = builder.scriptId;
            this.status = builder.status;
            this.ttsConfig = builder.ttsConfig;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return asrConfig
         */
        public String getAsrConfig() {
            return this.asrConfig;
        }

        /**
         * @return chatbotId
         */
        public String getChatbotId() {
            return this.chatbotId;
        }

        /**
         * @return debugStatus
         */
        public String getDebugStatus() {
            return this.debugStatus;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return isDebugDrafted
         */
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        /**
         * @return isDrafted
         */
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        /**
         * @return miniPlaybackConfigEnabled
         */
        public Boolean getMiniPlaybackConfigEnabled() {
            return this.miniPlaybackConfigEnabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return scriptDescription
         */
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return ttsConfig
         */
        public String getTtsConfig() {
            return this.ttsConfig;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String asrConfig; 
            private String chatbotId; 
            private String debugStatus; 
            private String industry; 
            private Boolean isDebugDrafted; 
            private Boolean isDrafted; 
            private Boolean miniPlaybackConfigEnabled; 
            private String name; 
            private String scene; 
            private String scriptDescription; 
            private String scriptId; 
            private String status; 
            private String ttsConfig; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Script model) {
                this.asrConfig = model.asrConfig;
                this.chatbotId = model.chatbotId;
                this.debugStatus = model.debugStatus;
                this.industry = model.industry;
                this.isDebugDrafted = model.isDebugDrafted;
                this.isDrafted = model.isDrafted;
                this.miniPlaybackConfigEnabled = model.miniPlaybackConfigEnabled;
                this.name = model.name;
                this.scene = model.scene;
                this.scriptDescription = model.scriptDescription;
                this.scriptId = model.scriptId;
                this.status = model.status;
                this.ttsConfig = model.ttsConfig;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The ASR configuration of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;AppKey\&quot;:\&quot;3GHttnsvir1FeWWb\&quot;}</p>
             */
            public Builder asrConfig(String asrConfig) {
                this.asrConfig = asrConfig;
                return this;
            }

            /**
             * <p>The chatbot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>chatbot-cn-EJfqqa***</p>
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * <p>The debug status.</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFTED</p>
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * <p>The industry.</p>
             * 
             * <strong>example:</strong>
             * <p>Finance</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>Specifies whether the debug version is in the draft state.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDebugDrafted(Boolean isDebugDrafted) {
                this.isDebugDrafted = isDebugDrafted;
                return this;
            }

            /**
             * <p>Specifies whether the script is in the draft state.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDrafted(Boolean isDrafted) {
                this.isDrafted = isDrafted;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Specifies whether the tone continuation feature is enabled. No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder miniPlaybackConfigEnabled(Boolean miniPlaybackConfigEnabled) {
                this.miniPlaybackConfigEnabled = miniPlaybackConfigEnabled;
                return this;
            }

            /**
             * <p>The script name.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection script</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The script description.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection script</p>
             */
            public Builder scriptDescription(String scriptDescription) {
                this.scriptDescription = scriptDescription;
                return this;
            }

            /**
             * <p>The script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>810b5872-57f0-4b27-80ab-7b3f4d8a6374</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The TTS configuration of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;voice\&quot;:\&quot;xiaobei\&quot;,\&quot;volume\&quot;:\&quot;50\&quot;,\&quot;speechRate\&quot;:\&quot;-150\&quot;,\&quot;pitchRate\&quot;:\&quot;0\&quot;}</p>
             */
            public Builder ttsConfig(String ttsConfig) {
                this.ttsConfig = ttsConfig;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578881227000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("SummaryName")
        private String summaryName;

        private Summary(Builder builder) {
            this.category = builder.category;
            this.content = builder.content;
            this.summaryName = builder.summaryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return summaryName
         */
        public String getSummaryName() {
            return this.summaryName;
        }

        public static final class Builder {
            private String category; 
            private String content; 
            private String summaryName; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.category = model.category;
                this.content = model.content;
                this.summaryName = model.summaryName;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The dialogue summary category. This is a legacy field and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>score</p>
             */
            public Builder summaryName(String summaryName) {
                this.summaryName = summaryName;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Honorific")
        private String honorific;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Contact(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.honorific = builder.honorific;
            this.jobId = builder.jobId;
            this.phoneNumber = builder.phoneNumber;
            this.referenceId = builder.referenceId;
            this.role = builder.role;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return honorific
         */
        public String getHonorific() {
            return this.honorific;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String contactId; 
            private String contactName; 
            private String honorific; 
            private String jobId; 
            private String phoneNumber; 
            private String referenceId; 
            private String role; 
            private String state; 

            private Builder() {
            } 

            private Builder(Contact model) {
                this.contactId = model.contactId;
                this.contactName = model.contactName;
                this.honorific = model.honorific;
                this.jobId = model.jobId;
                this.phoneNumber = model.phoneNumber;
                this.referenceId = model.referenceId;
                this.role = model.role;
                this.state = model.state;
            } 

            /**
             * <p>The contact ID. This ID is generated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The name of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The honorific of the contact. It is consistent with the contact name.</p>
             * 
             * <strong>example:</strong>
             * <p>Mr. Zhang</p>
             */
            public Builder honorific(String honorific) {
                this.honorific = honorific;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1351****8888</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The business system ID of the contact.</p>
             * <blockquote>
             * <p>This ID is customized and uploaded by the customer through the ContactId parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The role of the contact.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The contact status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class ConversationSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("SummaryName")
        private String summaryName;

        private ConversationSummary(Builder builder) {
            this.category = builder.category;
            this.content = builder.content;
            this.summaryName = builder.summaryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationSummary create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return summaryName
         */
        public String getSummaryName() {
            return this.summaryName;
        }

        public static final class Builder {
            private String category; 
            private String content; 
            private String summaryName; 

            private Builder() {
            } 

            private Builder(ConversationSummary model) {
                this.category = model.category;
                this.content = model.content;
                this.summaryName = model.summaryName;
            } 

            /**
             * <p>The dialogue summary category. This is a legacy field and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The summary content.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The summary name.</p>
             * 
             * <strong>example:</strong>
             * <p>score</p>
             */
            public Builder summaryName(String summaryName) {
                this.summaryName = summaryName;
                return this;
            }

            public ConversationSummary build() {
                return new ConversationSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Conversation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionParams")
        private String actionParams;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("SequenceId")
        private String sequenceId;

        @com.aliyun.core.annotation.NameInMap("Speaker")
        private String speaker;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private java.util.List<ConversationSummary> summary;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Conversation(Builder builder) {
            this.action = builder.action;
            this.actionParams = builder.actionParams;
            this.script = builder.script;
            this.sequenceId = builder.sequenceId;
            this.speaker = builder.speaker;
            this.summary = builder.summary;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversation create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionParams
         */
        public String getActionParams() {
            return this.actionParams;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return sequenceId
         */
        public String getSequenceId() {
            return this.sequenceId;
        }

        /**
         * @return speaker
         */
        public String getSpeaker() {
            return this.speaker;
        }

        /**
         * @return summary
         */
        public java.util.List<ConversationSummary> getSummary() {
            return this.summary;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String actionParams; 
            private String script; 
            private String sequenceId; 
            private String speaker; 
            private java.util.List<ConversationSummary> summary; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Conversation model) {
                this.action = model.action;
                this.actionParams = model.actionParams;
                this.script = model.script;
                this.sequenceId = model.sequenceId;
                this.speaker = model.speaker;
                this.summary = model.summary;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The action.</p>
             * 
             * <strong>example:</strong>
             * <p>Broadcast</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The action parameters.</p>
             * <ul>
             * <li>When the interruption feature is enabled, you can obtain the text content already broadcasted by the robot through the answer parameter value in the robot dialogue text. Example:<ul>
             * <li>{&quot;abortDialogueInfo&quot;:{&quot;abortDialogueType&quot;:&quot;Interrupted&quot;,&quot;answer&quot;:&quot;This is the interrupted text message&quot;,&quot;sequenceId&quot;:&quot;xxxxx&quot;},&quot;streamEnd&quot;:true}</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder actionParams(String actionParams) {
                this.actionParams = actionParams;
                return this;
            }

            /**
             * <p>The dialogue text.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello, I am **customer service</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fd279983-93b9-b13b-9a34-64e5df473225</p>
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * <p>The speaker of the dialogue. Valid values: Robot (the robot) and Contact (the contact).</p>
             * 
             * <strong>example:</strong>
             * <p>Robot</p>
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The dialogue summary data. This is legacy data and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder summary(java.util.List<ConversationSummary> summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The summary creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424883</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Conversation build() {
                return new Conversation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualTime")
        private Long actualTime;

        @com.aliyun.core.annotation.NameInMap("Brief")
        private String brief;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ChatbotId")
        private String chatbotId;

        @com.aliyun.core.annotation.NameInMap("Contact")
        private Contact contact;

        @com.aliyun.core.annotation.NameInMap("Conversation")
        private java.util.List<Conversation> conversation;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private String endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("HangUpDirection")
        private String hangUpDirection;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("PlanedTime")
        private Long planedTime;

        @com.aliyun.core.annotation.NameInMap("RealRingingDuration")
        private Long realRingingDuration;

        @com.aliyun.core.annotation.NameInMap("RingingDuration")
        private Long ringingDuration;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("SipCode")
        private String sipCode;

        @com.aliyun.core.annotation.NameInMap("SipDuration")
        private Long sipDuration;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        private Tasks(Builder builder) {
            this.actualTime = builder.actualTime;
            this.brief = builder.brief;
            this.callId = builder.callId;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.chatbotId = builder.chatbotId;
            this.contact = builder.contact;
            this.conversation = builder.conversation;
            this.duration = builder.duration;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.hangUpDirection = builder.hangUpDirection;
            this.jobId = builder.jobId;
            this.planedTime = builder.planedTime;
            this.realRingingDuration = builder.realRingingDuration;
            this.ringingDuration = builder.ringingDuration;
            this.scenarioId = builder.scenarioId;
            this.sipCode = builder.sipCode;
            this.sipDuration = builder.sipDuration;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.totalDuration = builder.totalDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
        }

        /**
         * @return brief
         */
        public String getBrief() {
            return this.brief;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return chatbotId
         */
        public String getChatbotId() {
            return this.chatbotId;
        }

        /**
         * @return contact
         */
        public Contact getContact() {
            return this.contact;
        }

        /**
         * @return conversation
         */
        public java.util.List<Conversation> getConversation() {
            return this.conversation;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return endReason
         */
        public String getEndReason() {
            return this.endReason;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return hangUpDirection
         */
        public String getHangUpDirection() {
            return this.hangUpDirection;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return planedTime
         */
        public Long getPlanedTime() {
            return this.planedTime;
        }

        /**
         * @return realRingingDuration
         */
        public Long getRealRingingDuration() {
            return this.realRingingDuration;
        }

        /**
         * @return ringingDuration
         */
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return sipCode
         */
        public String getSipCode() {
            return this.sipCode;
        }

        /**
         * @return sipDuration
         */
        public Long getSipDuration() {
            return this.sipDuration;
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
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public static final class Builder {
            private Long actualTime; 
            private String brief; 
            private String callId; 
            private String calledNumber; 
            private String callingNumber; 
            private String chatbotId; 
            private Contact contact; 
            private java.util.List<Conversation> conversation; 
            private Integer duration; 
            private String endReason; 
            private Long endTime; 
            private String hangUpDirection; 
            private String jobId; 
            private Long planedTime; 
            private Long realRingingDuration; 
            private Long ringingDuration; 
            private String scenarioId; 
            private String sipCode; 
            private Long sipDuration; 
            private String status; 
            private String taskId; 
            private Long totalDuration; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.actualTime = model.actualTime;
                this.brief = model.brief;
                this.callId = model.callId;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.chatbotId = model.chatbotId;
                this.contact = model.contact;
                this.conversation = model.conversation;
                this.duration = model.duration;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.hangUpDirection = model.hangUpDirection;
                this.jobId = model.jobId;
                this.planedTime = model.planedTime;
                this.realRingingDuration = model.realRingingDuration;
                this.ringingDuration = model.ringingDuration;
                this.scenarioId = model.scenarioId;
                this.sipCode = model.sipCode;
                this.sipDuration = model.sipDuration;
                this.status = model.status;
                this.taskId = model.taskId;
                this.totalDuration = model.totalDuration;
            } 

            /**
             * <p>The actual execution time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424883</p>
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * <p>The business result. This is a legacy field and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder brief(String brief) {
                this.brief = brief;
                return this;
            }

            /**
             * <p>The SIP call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1528189846043</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>135****8888</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571****3106</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The ID of the robot for the dialogue.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder chatbotId(String chatbotId) {
                this.chatbotId = chatbotId;
                return this;
            }

            /**
             * <p>The contact information.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder contact(Contact contact) {
                this.contact = contact;
                return this;
            }

            /**
             * <p>The dialogue text list of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder conversation(java.util.List<Conversation> conversation) {
                this.conversation = conversation;
                return this;
            }

            /**
             * <p>The dialogue duration. This field is not returned.</p>
             * <blockquote>
             * <p>This data is returned in the ActionParams parameter of the last dictionary in the Conversation list.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The call completion reason. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: FINISHED (Normal completion).</li>
             * <li><strong>2</strong>: CHATBOT_HANGUP_AFTER_NOANSWER (Robot hung up after unrecognized input).</li>
             * <li><strong>3</strong>: CHATBOT_HANGUP_AFTER_SILENCE (Robot hung up after silence timeout).</li>
             * <li><strong>4</strong>: CLIENT_HANGUP_AFTER_NOANSWER (User hung up after unrecognized input).</li>
             * <li><strong>5</strong>: CLIENT_HANGUP (User hung up without reason).</li>
             * <li><strong>6</strong>: TRANSFER_BY_INTENT (Transferred to human agent due to intent match).</li>
             * <li><strong>7</strong>: TRANSFER_AFTER_NOANSWER (Transferred to human agent after unrecognized input).</li>
             * <li><strong>8</strong>: INO_INTERACTION (No interaction from the user).</li>
             * <li><strong>9</strong>: ERROR (Interrupted by system error).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder endReason(String endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * <p>The actual end time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424883</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The party that hung up. Valid values:</p>
             * <ul>
             * <li>client: The customer.</li>
             * <li>ivr: The robot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>client</p>
             */
            public Builder hangUpDirection(String hangUpDirection) {
                this.hangUpDirection = hangUpDirection;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The scheduled dialing time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424883</p>
             */
            public Builder planedTime(Long planedTime) {
                this.planedTime = planedTime;
                return this;
            }

            /**
             * <p>The actual ringing duration.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder realRingingDuration(Long realRingingDuration) {
                this.realRingingDuration = realRingingDuration;
                return this;
            }

            /**
             * <p>The ringing duration.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder ringingDuration(Long ringingDuration) {
                this.ringingDuration = ringingDuration;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The SIP status code of the call task.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder sipCode(String sipCode) {
                this.sipCode = sipCode;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The SIP signaling duration.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder sipDuration(Long sipDuration) {
                this.sipDuration = sipDuration;
                return this;
            }

            /**
             * <p>The task status. Valid values:
             * Note: The <strong>Succeeded</strong> status is subdivided into specific reasons. The general <strong>Succeeded</strong>: 1 (Connected) status is no longer returned. Instead, specific subdivided reasons are returned.</p>
             * <ul>
             * <li><strong>Executing</strong>: 0 (Dialing).</li>
             * <li><strong>Succeeded</strong>: 1 (Connected).</li>
             * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
             * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
             * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
             * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
             * <li><strong>Failed</strong>: 6 (Failed).</li>
             * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
             * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
             * <li><strong>OutOfService</strong>: 9 (Not connected - Out of service).</li>
             * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
             * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, not dialed).</li>
             * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
             * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
             * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Calling number not registered).</li>
             * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
             * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Canceled due to pre-call verification failure).</li>
             * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Out of service, not dialed).</li>
             * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Overdue payment, not dialed).</li>
             * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Calling number does not exist).</li>
             * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
             * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after unrecognized input).</li>
             * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Robot hung up after silence timeout).</li>
             * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized input).</li>
             * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
             * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to human agent due to intent match).</li>
             * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to human agent after unrecognized input).</li>
             * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction from the user).</li>
             * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted by system error).</li>
             * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
             * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension transfer).</li>
             * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected - Special interception - Custom interception).</li>
             * <li><strong>HighRiskSipCode</strong>: 32 (Not dialed - High risk, not dialed).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SucceededTransferByIntent</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ff44709e-39a6-43ba-959b-20fcabe3e496</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total call duration.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualTime")
        private Long actualTime;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumbers")
        private java.util.List<String> callingNumbers;

        @com.aliyun.core.annotation.NameInMap("Contacts")
        private java.util.List<Contacts> contacts;

        @com.aliyun.core.annotation.NameInMap("DsReport")
        private String dsReport;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private Integer endReason;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private java.util.List<Extras> extras;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("NextExecutionTime")
        private Long nextExecutionTime;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private java.util.List<Summary> summary;

        @com.aliyun.core.annotation.NameInMap("SystemPriority")
        private Integer systemPriority;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<Tasks> tasks;

        private Job(Builder builder) {
            this.actualTime = builder.actualTime;
            this.calledNumber = builder.calledNumber;
            this.callingNumbers = builder.callingNumbers;
            this.contacts = builder.contacts;
            this.dsReport = builder.dsReport;
            this.endReason = builder.endReason;
            this.extras = builder.extras;
            this.failureReason = builder.failureReason;
            this.instanceId = builder.instanceId;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.nextExecutionTime = builder.nextExecutionTime;
            this.priority = builder.priority;
            this.referenceId = builder.referenceId;
            this.scenarioId = builder.scenarioId;
            this.script = builder.script;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
            this.summary = builder.summary;
            this.systemPriority = builder.systemPriority;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingNumbers
         */
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        /**
         * @return contacts
         */
        public java.util.List<Contacts> getContacts() {
            return this.contacts;
        }

        /**
         * @return dsReport
         */
        public String getDsReport() {
            return this.dsReport;
        }

        /**
         * @return endReason
         */
        public Integer getEndReason() {
            return this.endReason;
        }

        /**
         * @return extras
         */
        public java.util.List<Extras> getExtras() {
            return this.extras;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return nextExecutionTime
         */
        public Long getNextExecutionTime() {
            return this.nextExecutionTime;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return script
         */
        public Script getScript() {
            return this.script;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return summary
         */
        public java.util.List<Summary> getSummary() {
            return this.summary;
        }

        /**
         * @return systemPriority
         */
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

        /**
         * @return tasks
         */
        public java.util.List<Tasks> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private Long actualTime; 
            private String calledNumber; 
            private java.util.List<String> callingNumbers; 
            private java.util.List<Contacts> contacts; 
            private String dsReport; 
            private Integer endReason; 
            private java.util.List<Extras> extras; 
            private String failureReason; 
            private String instanceId; 
            private String jobGroupId; 
            private String jobId; 
            private Long nextExecutionTime; 
            private Integer priority; 
            private String referenceId; 
            private String scenarioId; 
            private Script script; 
            private String status; 
            private String strategyId; 
            private java.util.List<Summary> summary; 
            private Integer systemPriority; 
            private java.util.List<Tasks> tasks; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.actualTime = model.actualTime;
                this.calledNumber = model.calledNumber;
                this.callingNumbers = model.callingNumbers;
                this.contacts = model.contacts;
                this.dsReport = model.dsReport;
                this.endReason = model.endReason;
                this.extras = model.extras;
                this.failureReason = model.failureReason;
                this.instanceId = model.instanceId;
                this.jobGroupId = model.jobGroupId;
                this.jobId = model.jobId;
                this.nextExecutionTime = model.nextExecutionTime;
                this.priority = model.priority;
                this.referenceId = model.referenceId;
                this.scenarioId = model.scenarioId;
                this.script = model.script;
                this.status = model.status;
                this.strategyId = model.strategyId;
                this.summary = model.summary;
                this.systemPriority = model.systemPriority;
                this.tasks = model.tasks;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The actual execution time of the job. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640068026385</p>
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>137****7777</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The list of calling numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;057126883106&quot;]</p>
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * <p>The contact information.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder contacts(java.util.List<Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The tag hit status of the task.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder dsReport(String dsReport) {
                this.dsReport = dsReport;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The completion reason.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder endReason(Integer endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * <p>The business parameters.</p>
             * <blockquote>
             * <p>TenantId and ServiceId are generated by the system. Other parameters are custom and passed as references.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder extras(java.util.List<Extras> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>The reason why the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>NoAnswer</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The job group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The next execution time of the task. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640068026385</p>
             */
            public Builder nextExecutionTime(Long nextExecutionTime) {
                this.nextExecutionTime = nextExecutionTime;
                return this;
            }

            /**
             * <p>The priority of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The business ID of the job, which is customized by the business side.</p>
             * <blockquote>
             * <p>The uploaded ContactId value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The script scenario.</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Scheduling: The job is being scheduled.</li>
             * <li>Executing: The job is being executed.</li>
             * <li>Succeeded: The job succeeded.</li>
             * <li>Paused: The job is paused.</li>
             * <li>Failed: The job failed.</li>
             * <li>Cancelled: The job is canceled.</li>
             * <li>Drafted: The job is in the draft state, which is a temporary state during file import.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The strategy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c8a2b7f2-ad1a-4865-b872-d0080d9802d9</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The dialogue business tag data:</p>
             * <ul>
             * <li>In large model scenarios: the tag hit data after the dialogue ends.</li>
             * <li>In small model scenarios: the variable value data after the dialogue ends.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder summary(java.util.List<Summary> summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The system priority of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder systemPriority(Integer systemPriority) {
                this.systemPriority = systemPriority;
                return this;
            }

            /**
             * <p>The call list.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder tasks(java.util.List<Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
