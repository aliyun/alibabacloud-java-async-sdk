// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link PutEventTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutEventTargetsRequest</p>
 */
public class PutEventTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactParameters")
    private java.util.List<ContactParameters> contactParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FcParameters")
    private java.util.List<FcParameters> fcParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MnsParameters")
    private java.util.List<MnsParameters> mnsParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsParameters")
    private java.util.List<SlsParameters> slsParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebhookParameters")
    private java.util.List<WebhookParameters> webhookParameters;

    private PutEventTargetsRequest(Builder builder) {
        super(builder);
        this.contactParameters = builder.contactParameters;
        this.fcParameters = builder.fcParameters;
        this.mnsParameters = builder.mnsParameters;
        this.ruleName = builder.ruleName;
        this.slsParameters = builder.slsParameters;
        this.webhookParameters = builder.webhookParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventTargetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactParameters
     */
    public java.util.List<ContactParameters> getContactParameters() {
        return this.contactParameters;
    }

    /**
     * @return fcParameters
     */
    public java.util.List<FcParameters> getFcParameters() {
        return this.fcParameters;
    }

    /**
     * @return mnsParameters
     */
    public java.util.List<MnsParameters> getMnsParameters() {
        return this.mnsParameters;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return slsParameters
     */
    public java.util.List<SlsParameters> getSlsParameters() {
        return this.slsParameters;
    }

    /**
     * @return webhookParameters
     */
    public java.util.List<WebhookParameters> getWebhookParameters() {
        return this.webhookParameters;
    }

    public static final class Builder extends Request.Builder<PutEventTargetsRequest, Builder> {
        private java.util.List<ContactParameters> contactParameters; 
        private java.util.List<FcParameters> fcParameters; 
        private java.util.List<MnsParameters> mnsParameters; 
        private String ruleName; 
        private java.util.List<SlsParameters> slsParameters; 
        private java.util.List<WebhookParameters> webhookParameters; 

        private Builder() {
            super();
        } 

        private Builder(PutEventTargetsRequest request) {
            super(request);
            this.contactParameters = request.contactParameters;
            this.fcParameters = request.fcParameters;
            this.mnsParameters = request.mnsParameters;
            this.ruleName = request.ruleName;
            this.slsParameters = request.slsParameters;
            this.webhookParameters = request.webhookParameters;
        } 

        /**
         * ContactParameters.
         */
        public Builder contactParameters(java.util.List<ContactParameters> contactParameters) {
            this.putQueryParameter("ContactParameters", contactParameters);
            this.contactParameters = contactParameters;
            return this;
        }

        /**
         * FcParameters.
         */
        public Builder fcParameters(java.util.List<FcParameters> fcParameters) {
            this.putQueryParameter("FcParameters", fcParameters);
            this.fcParameters = fcParameters;
            return this;
        }

        /**
         * MnsParameters.
         */
        public Builder mnsParameters(java.util.List<MnsParameters> mnsParameters) {
            this.putQueryParameter("MnsParameters", mnsParameters);
            this.mnsParameters = mnsParameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * SlsParameters.
         */
        public Builder slsParameters(java.util.List<SlsParameters> slsParameters) {
            this.putQueryParameter("SlsParameters", slsParameters);
            this.slsParameters = slsParameters;
            return this;
        }

        /**
         * WebhookParameters.
         */
        public Builder webhookParameters(java.util.List<WebhookParameters> webhookParameters) {
            this.putQueryParameter("WebhookParameters", webhookParameters);
            this.webhookParameters = webhookParameters;
            return this;
        }

        @Override
        public PutEventTargetsRequest build() {
            return new PutEventTargetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutEventTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventTargetsRequest</p>
     */
    public static class ContactParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private ContactParameters(Builder builder) {
            this.contactGroupName = builder.contactGroupName;
            this.id = builder.id;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactParameters create() {
            return builder().build();
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String contactGroupName; 
            private String id; 
            private String level; 

            private Builder() {
            } 

            private Builder(ContactParameters model) {
                this.contactGroupName = model.contactGroupName;
                this.id = model.id;
                this.level = model.level;
            } 

            /**
             * ContactGroupName.
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public ContactParameters build() {
                return new ContactParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventTargetsRequest</p>
     */
    public static class FcParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private FcParameters(Builder builder) {
            this.functionName = builder.functionName;
            this.id = builder.id;
            this.region = builder.region;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcParameters create() {
            return builder().build();
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String functionName; 
            private String id; 
            private String region; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(FcParameters model) {
                this.functionName = model.functionName;
                this.id = model.id;
                this.region = model.region;
                this.serviceName = model.serviceName;
            } 

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FcParameters build() {
                return new FcParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventTargetsRequest</p>
     */
    public static class MnsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private MnsParameters(Builder builder) {
            this.id = builder.id;
            this.queue = builder.queue;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParameters create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String id; 
            private String queue; 
            private String region; 

            private Builder() {
            } 

            private Builder(MnsParameters model) {
                this.id = model.id;
                this.queue = model.queue;
                this.region = model.region;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public MnsParameters build() {
                return new MnsParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventTargetsRequest</p>
     */
    public static class SlsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private SlsParameters(Builder builder) {
            this.id = builder.id;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsParameters create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String id; 
            private String logStore; 
            private String project; 
            private String region; 

            private Builder() {
            } 

            private Builder(SlsParameters model) {
                this.id = model.id;
                this.logStore = model.logStore;
                this.project = model.project;
                this.region = model.region;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LogStore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public SlsParameters build() {
                return new SlsParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventTargetsRequest</p>
     */
    public static class WebhookParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private WebhookParameters(Builder builder) {
            this.id = builder.id;
            this.method = builder.method;
            this.protocol = builder.protocol;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookParameters create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String method; 
            private String protocol; 
            private String url; 

            private Builder() {
            } 

            private Builder(WebhookParameters model) {
                this.id = model.id;
                this.method = model.method;
                this.protocol = model.protocol;
                this.url = model.url;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public WebhookParameters build() {
                return new WebhookParameters(this);
            } 

        } 

    }
}
