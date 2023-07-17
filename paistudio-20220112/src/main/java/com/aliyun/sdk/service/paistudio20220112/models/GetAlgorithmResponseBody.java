// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmResponseBody</p>
 */
public class GetAlgorithmResponseBody extends TeaModel {
    @NameInMap("AlgorithmDescription")
    private String algorithmDescription;

    @NameInMap("AlgorithmId")
    private String algorithmId;

    @NameInMap("AlgorithmName")
    private String algorithmName;

    @NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantId")
    private String tenantId;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private GetAlgorithmResponseBody(Builder builder) {
        this.algorithmDescription = builder.algorithmDescription;
        this.algorithmId = builder.algorithmId;
        this.algorithmName = builder.algorithmName;
        this.algorithmProvider = builder.algorithmProvider;
        this.displayName = builder.displayName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmResponseBody create() {
        return builder().build();
    }

    /**
     * @return algorithmDescription
     */
    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return algorithmName
     */
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * @return algorithmProvider
     */
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String algorithmDescription; 
        private String algorithmId; 
        private String algorithmName; 
        private String algorithmProvider; 
        private String displayName; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String requestId; 
        private String tenantId; 
        private String userId; 
        private String workspaceId; 

        /**
         * AlgorithmDescription.
         */
        public Builder algorithmDescription(String algorithmDescription) {
            this.algorithmDescription = algorithmDescription;
            return this;
        }

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * AlgorithmName.
         */
        public Builder algorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * AlgorithmProvider.
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetAlgorithmResponseBody build() {
            return new GetAlgorithmResponseBody(this);
        } 

    } 

}
