// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetServiceObservabilityResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceObservabilityResponseBody</p>
 */
public class GetServiceObservabilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("entryPointInfo")
    private EntryPointInfo entryPointInfo;

    @com.aliyun.core.annotation.NameInMap("feeType")
    private String feeType;

    @com.aliyun.core.annotation.NameInMap("quotas")
    private java.util.Map<String, String> quotas;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("settings")
    private java.util.Map<String, String> settings;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private GetServiceObservabilityResponseBody(Builder builder) {
        this.entryPointInfo = builder.entryPointInfo;
        this.feeType = builder.feeType;
        this.quotas = builder.quotas;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.settings = builder.settings;
        this.status = builder.status;
        this.type = builder.type;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceObservabilityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entryPointInfo
     */
    public EntryPointInfo getEntryPointInfo() {
        return this.entryPointInfo;
    }

    /**
     * @return feeType
     */
    public String getFeeType() {
        return this.feeType;
    }

    /**
     * @return quotas
     */
    public java.util.Map<String, String> getQuotas() {
        return this.quotas;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return settings
     */
    public java.util.Map<String, String> getSettings() {
        return this.settings;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private EntryPointInfo entryPointInfo; 
        private String feeType; 
        private java.util.Map<String, String> quotas; 
        private String regionId; 
        private String requestId; 
        private java.util.Map<String, String> settings; 
        private String status; 
        private String type; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(GetServiceObservabilityResponseBody model) {
            this.entryPointInfo = model.entryPointInfo;
            this.feeType = model.feeType;
            this.quotas = model.quotas;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.settings = model.settings;
            this.status = model.status;
            this.type = model.type;
            this.workspace = model.workspace;
        } 

        /**
         * entryPointInfo.
         */
        public Builder entryPointInfo(EntryPointInfo entryPointInfo) {
            this.entryPointInfo = entryPointInfo;
            return this;
        }

        /**
         * feeType.
         */
        public Builder feeType(String feeType) {
            this.feeType = feeType;
            return this;
        }

        /**
         * quotas.
         */
        public Builder quotas(java.util.Map<String, String> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * settings.
         */
        public Builder settings(java.util.Map<String, String> settings) {
            this.settings = settings;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetServiceObservabilityResponseBody build() {
            return new GetServiceObservabilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceObservabilityResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceObservabilityResponseBody</p>
     */
    public static class EntryPointInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("privateDomain")
        private String privateDomain;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("publicDomain")
        private String publicDomain;

        private EntryPointInfo(Builder builder) {
            this.authToken = builder.authToken;
            this.privateDomain = builder.privateDomain;
            this.project = builder.project;
            this.publicDomain = builder.publicDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryPointInfo create() {
            return builder().build();
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return privateDomain
         */
        public String getPrivateDomain() {
            return this.privateDomain;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return publicDomain
         */
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public static final class Builder {
            private String authToken; 
            private String privateDomain; 
            private String project; 
            private String publicDomain; 

            private Builder() {
            } 

            private Builder(EntryPointInfo model) {
                this.authToken = model.authToken;
                this.privateDomain = model.privateDomain;
                this.project = model.project;
                this.publicDomain = model.publicDomain;
            } 

            /**
             * authToken.
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * privateDomain.
             */
            public Builder privateDomain(String privateDomain) {
                this.privateDomain = privateDomain;
                return this;
            }

            /**
             * <p>SLS Project</p>
             * 
             * <strong>example:</strong>
             * <p>proj-xtrace-xxxxx</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * publicDomain.
             */
            public Builder publicDomain(String publicDomain) {
                this.publicDomain = publicDomain;
                return this;
            }

            public EntryPointInfo build() {
                return new EntryPointInfo(this);
            } 

        } 

    }
}
