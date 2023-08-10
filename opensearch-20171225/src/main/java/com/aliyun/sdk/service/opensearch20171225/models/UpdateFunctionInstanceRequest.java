// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateFunctionInstanceRequest</p>
 */
public class UpdateFunctionInstanceRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("instanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("createParameters")
    private java.util.List < CreateParameters> createParameters;

    @Body
    @NameInMap("cron")
    private String cron;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("usageParameters")
    private java.util.List < UsageParameters> usageParameters;

    private UpdateFunctionInstanceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.instanceName = builder.instanceName;
        this.createParameters = builder.createParameters;
        this.cron = builder.cron;
        this.description = builder.description;
        this.usageParameters = builder.usageParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return createParameters
     */
    public java.util.List < CreateParameters> getCreateParameters() {
        return this.createParameters;
    }

    /**
     * @return cron
     */
    public String getCron() {
        return this.cron;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return usageParameters
     */
    public java.util.List < UsageParameters> getUsageParameters() {
        return this.usageParameters;
    }

    public static final class Builder extends Request.Builder<UpdateFunctionInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private String instanceName; 
        private java.util.List < CreateParameters> createParameters; 
        private String cron; 
        private String description; 
        private java.util.List < UsageParameters> usageParameters; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionInstanceRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.functionName = request.functionName;
            this.instanceName = request.instanceName;
            this.createParameters = request.createParameters;
            this.cron = request.cron;
            this.description = request.description;
            this.usageParameters = request.usageParameters;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The name of the feature.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The parameters that are used to create the instance.
         */
        public Builder createParameters(java.util.List < CreateParameters> createParameters) {
            this.putBodyParameter("createParameters", createParameters);
            this.createParameters = createParameters;
            return this;
        }

        /**
         * The cron expression used to schedule periodic training, in the format of (Minutes Hours DayofMonth Month DayofWeek). The default value is empty, which indicates that no periodic training is performed. DayofWeek 0 indicates Sunday.
         */
        public Builder cron(String cron) {
            this.putBodyParameter("cron", cron);
            this.cron = cron;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The parameters that are used.
         */
        public Builder usageParameters(java.util.List < UsageParameters> usageParameters) {
            this.putBodyParameter("usageParameters", usageParameters);
            this.usageParameters = usageParameters;
            return this;
        }

        @Override
        public UpdateFunctionInstanceRequest build() {
            return new UpdateFunctionInstanceRequest(this);
        } 

    } 

    public static class CreateParameters extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("value")
        private String value;

        private CreateParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CreateParameters build() {
                return new CreateParameters(this);
            } 

        } 

    }
    public static class UsageParameters extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("value")
        private String value;

        private UsageParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UsageParameters build() {
                return new UsageParameters(this);
            } 

        } 

    }
}
