// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSmsConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsConfigResponseBody</p>
 */
public class GetSmsConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SmsConfigs")
    private SmsConfigs smsConfigs;

    @NameInMap("Success")
    private Boolean success;

    private GetSmsConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.smsConfigs = builder.smsConfigs;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsConfigResponseBody create() {
        return builder().build();
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
     * @return smsConfigs
     */
    public SmsConfigs getSmsConfigs() {
        return this.smsConfigs;
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
        private String message; 
        private String requestId; 
        private SmsConfigs smsConfigs; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * SmsConfigs.
         */
        public Builder smsConfigs(SmsConfigs smsConfigs) {
            this.smsConfigs = smsConfigs;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSmsConfigResponseBody build() {
            return new GetSmsConfigResponseBody(this);
        } 

    } 

    public static class SmsConfig extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Extra")
        private String extra;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Instance")
        private String instance;

        @NameInMap("Name")
        private String name;

        @NameInMap("Scenario")
        private Integer scenario;

        @NameInMap("SignName")
        private String signName;

        @NameInMap("TemplateCode")
        private String templateCode;

        private SmsConfig(Builder builder) {
            this.description = builder.description;
            this.extra = builder.extra;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instance = builder.instance;
            this.name = builder.name;
            this.scenario = builder.scenario;
            this.signName = builder.signName;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsConfig create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scenario
         */
        public Integer getScenario() {
            return this.scenario;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String description; 
            private String extra; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String instance; 
            private String name; 
            private Integer scenario; 
            private String signName; 
            private String templateCode; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
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
             * Scenario.
             */
            public Builder scenario(Integer scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public SmsConfig build() {
                return new SmsConfig(this);
            } 

        } 

    }
    public static class SmsConfigs extends TeaModel {
        @NameInMap("SmsConfig")
        private java.util.List < SmsConfig> smsConfig;

        private SmsConfigs(Builder builder) {
            this.smsConfig = builder.smsConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsConfigs create() {
            return builder().build();
        }

        /**
         * @return smsConfig
         */
        public java.util.List < SmsConfig> getSmsConfig() {
            return this.smsConfig;
        }

        public static final class Builder {
            private java.util.List < SmsConfig> smsConfig; 

            /**
             * SmsConfig.
             */
            public Builder smsConfig(java.util.List < SmsConfig> smsConfig) {
                this.smsConfig = smsConfig;
                return this;
            }

            public SmsConfigs build() {
                return new SmsConfigs(this);
            } 

        } 

    }
}
