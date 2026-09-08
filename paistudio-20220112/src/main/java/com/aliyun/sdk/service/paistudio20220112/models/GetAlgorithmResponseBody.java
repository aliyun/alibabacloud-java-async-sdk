// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetAlgorithmResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmResponseBody</p>
 */
public class GetAlgorithmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmDescription")
    private String algorithmDescription;

    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.NameInMap("AlgorithmName")
    private String algorithmName;

    @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAlgorithmResponseBody model) {
            this.algorithmDescription = model.algorithmDescription;
            this.algorithmId = model.algorithmId;
            this.algorithmName = model.algorithmName;
            this.algorithmProvider = model.algorithmProvider;
            this.displayName = model.displayName;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>Algorithm description.</p>
         * 
         * <strong>example:</strong>
         * <p>Large language model training.</p>
         */
        public Builder algorithmDescription(String algorithmDescription) {
            this.algorithmDescription = algorithmDescription;
            return this;
        }

        /**
         * <p>Algorithm ID.</p>
         * 
         * <strong>example:</strong>
         * <p>algo-xsldfvu1334</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * <p>Algorithm name.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_training</p>
         */
        public Builder algorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * <p>Algorithm provider.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * <p>Display name of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_training</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Time when the algorithm was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Time when the algorithm was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Tenant ID of the algorithm owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>User ID of the algorithm owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>Workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
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
