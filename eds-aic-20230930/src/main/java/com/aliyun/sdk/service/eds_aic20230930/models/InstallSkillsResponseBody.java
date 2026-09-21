// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link InstallSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>InstallSkillsResponseBody</p>
 */
public class InstallSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("InstallResults")
    private java.util.List<InstallResults> installResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InstallSkillsResponseBody(Builder builder) {
        this.code = builder.code;
        this.installResults = builder.installResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallSkillsResponseBody create() {
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
     * @return installResults
     */
    public java.util.List<InstallResults> getInstallResults() {
        return this.installResults;
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
        private String code; 
        private java.util.List<InstallResults> installResults; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InstallSkillsResponseBody model) {
            this.code = model.code;
            this.installResults = model.installResults;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The installation results.</p>
         */
        public Builder installResults(java.util.List<InstallResults> installResults) {
            this.installResults = installResults;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallSkillsResponseBody build() {
            return new InstallSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InstallSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>InstallSkillsResponseBody</p>
     */
    public static class InstallResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstallResults(Builder builder) {
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallResults create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstallResults model) {
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * <p>The cloud phone instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-6rnonvrkf59ac****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The installation status.</p>
             * 
             * <strong>example:</strong>
             * <p>INSTALLING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstallResults build() {
                return new InstallResults(this);
            } 

        } 

    }
}
