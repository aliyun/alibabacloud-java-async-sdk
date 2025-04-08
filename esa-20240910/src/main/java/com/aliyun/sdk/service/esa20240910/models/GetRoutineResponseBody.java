// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineResponseBody</p>
 */
public class GetRoutineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultRelatedRecord")
    private String defaultRelatedRecord;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List<Envs> envs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRoutineResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.defaultRelatedRecord = builder.defaultRelatedRecord;
        this.description = builder.description;
        this.envs = builder.envs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return defaultRelatedRecord
     */
    public String getDefaultRelatedRecord() {
        return this.defaultRelatedRecord;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envs
     */
    public java.util.List<Envs> getEnvs() {
        return this.envs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createTime; 
        private String defaultRelatedRecord; 
        private String description; 
        private java.util.List<Envs> envs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRoutineResponseBody model) {
            this.createTime = model.createTime;
            this.defaultRelatedRecord = model.defaultRelatedRecord;
            this.description = model.description;
            this.envs = model.envs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time when the routine was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-11T01:23:21Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The default record name to access.</p>
         * 
         * <strong>example:</strong>
         * <p>routine1.example.com</p>
         */
        public Builder defaultRelatedRecord(String defaultRelatedRecord) {
            this.defaultRelatedRecord = defaultRelatedRecord;
            return this;
        }

        /**
         * <p>The description of the routine.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The information about the environments.</p>
         */
        public Builder envs(java.util.List<Envs> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRoutineResponseBody build() {
            return new GetRoutineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoutineResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoutineResponseBody</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanaryAreaList")
        private java.util.List<String> canaryAreaList;

        @com.aliyun.core.annotation.NameInMap("CanaryCodeVersion")
        private String canaryCodeVersion;

        @com.aliyun.core.annotation.NameInMap("CodeVersion")
        private String codeVersion;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        private Envs(Builder builder) {
            this.canaryAreaList = builder.canaryAreaList;
            this.canaryCodeVersion = builder.canaryCodeVersion;
            this.codeVersion = builder.codeVersion;
            this.env = builder.env;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
            return builder().build();
        }

        /**
         * @return canaryAreaList
         */
        public java.util.List<String> getCanaryAreaList() {
            return this.canaryAreaList;
        }

        /**
         * @return canaryCodeVersion
         */
        public String getCanaryCodeVersion() {
            return this.canaryCodeVersion;
        }

        /**
         * @return codeVersion
         */
        public String getCodeVersion() {
            return this.codeVersion;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        public static final class Builder {
            private java.util.List<String> canaryAreaList; 
            private String canaryCodeVersion; 
            private String codeVersion; 
            private String env; 

            private Builder() {
            } 

            private Builder(Envs model) {
                this.canaryAreaList = model.canaryAreaList;
                this.canaryCodeVersion = model.canaryCodeVersion;
                this.codeVersion = model.codeVersion;
                this.env = model.env;
            } 

            /**
             * <p>The regions for canary release.</p>
             */
            public Builder canaryAreaList(java.util.List<String> canaryAreaList) {
                this.canaryAreaList = canaryAreaList;
                return this;
            }

            /**
             * <p>The version number for canary release.</p>
             * 
             * <strong>example:</strong>
             * <p>1710120201067577628</p>
             */
            public Builder canaryCodeVersion(String canaryCodeVersion) {
                this.canaryCodeVersion = canaryCodeVersion;
                return this;
            }

            /**
             * <p>The version number of the code in the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>1710120201067577628</p>
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * <p>The environment type.</p>
             * 
             * <strong>example:</strong>
             * <p>production</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
}
