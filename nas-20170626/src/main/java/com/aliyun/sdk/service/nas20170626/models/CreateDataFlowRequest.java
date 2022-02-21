// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateDataFlowRequest</p>
 */
public class CreateDataFlowRequest extends Request {
    @Query
    @NameInMap("AutoRefreshInterval")
    @Validation(maximum = 525600, minimum = 5)
    private Long autoRefreshInterval;

    @Query
    @NameInMap("AutoRefreshPolicy")
    private String autoRefreshPolicy;

    @Query
    @NameInMap("AutoRefreshs")
    private java.util.List < AutoRefreshs> autoRefreshs;

    @Query
    @NameInMap("ClientToken")
    @Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("FsetId")
    @Validation(required = true)
    private String fsetId;

    @Query
    @NameInMap("SourceSecurityType")
    private String sourceSecurityType;

    @Query
    @NameInMap("SourceStorage")
    @Validation(required = true, maxLength = 128, minLength = 8)
    private String sourceStorage;

    @Query
    @NameInMap("Throughput")
    @Validation(required = true)
    private Long throughput;

    private CreateDataFlowRequest(Builder builder) {
        super(builder);
        this.autoRefreshInterval = builder.autoRefreshInterval;
        this.autoRefreshPolicy = builder.autoRefreshPolicy;
        this.autoRefreshs = builder.autoRefreshs;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.fsetId = builder.fsetId;
        this.sourceSecurityType = builder.sourceSecurityType;
        this.sourceStorage = builder.sourceStorage;
        this.throughput = builder.throughput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRefreshInterval
     */
    public Long getAutoRefreshInterval() {
        return this.autoRefreshInterval;
    }

    /**
     * @return autoRefreshPolicy
     */
    public String getAutoRefreshPolicy() {
        return this.autoRefreshPolicy;
    }

    /**
     * @return autoRefreshs
     */
    public java.util.List < AutoRefreshs> getAutoRefreshs() {
        return this.autoRefreshs;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return fsetId
     */
    public String getFsetId() {
        return this.fsetId;
    }

    /**
     * @return sourceSecurityType
     */
    public String getSourceSecurityType() {
        return this.sourceSecurityType;
    }

    /**
     * @return sourceStorage
     */
    public String getSourceStorage() {
        return this.sourceStorage;
    }

    /**
     * @return throughput
     */
    public Long getThroughput() {
        return this.throughput;
    }

    public static final class Builder extends Request.Builder<CreateDataFlowRequest, Builder> {
        private Long autoRefreshInterval; 
        private String autoRefreshPolicy; 
        private java.util.List < AutoRefreshs> autoRefreshs; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String fsetId; 
        private String sourceSecurityType; 
        private String sourceStorage; 
        private Long throughput; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataFlowRequest response) {
            super(response);
            this.autoRefreshInterval = response.autoRefreshInterval;
            this.autoRefreshPolicy = response.autoRefreshPolicy;
            this.autoRefreshs = response.autoRefreshs;
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.dryRun = response.dryRun;
            this.fileSystemId = response.fileSystemId;
            this.fsetId = response.fsetId;
            this.sourceSecurityType = response.sourceSecurityType;
            this.sourceStorage = response.sourceStorage;
            this.throughput = response.throughput;
        } 

        /**
         * AutoRefreshInterval.
         */
        public Builder autoRefreshInterval(Long autoRefreshInterval) {
            this.putQueryParameter("AutoRefreshInterval", autoRefreshInterval);
            this.autoRefreshInterval = autoRefreshInterval;
            return this;
        }

        /**
         * AutoRefreshPolicy.
         */
        public Builder autoRefreshPolicy(String autoRefreshPolicy) {
            this.putQueryParameter("AutoRefreshPolicy", autoRefreshPolicy);
            this.autoRefreshPolicy = autoRefreshPolicy;
            return this;
        }

        /**
         * AutoRefreshs.
         */
        public Builder autoRefreshs(java.util.List < AutoRefreshs> autoRefreshs) {
            this.putQueryParameter("AutoRefreshs", autoRefreshs);
            this.autoRefreshs = autoRefreshs;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * FsetId.
         */
        public Builder fsetId(String fsetId) {
            this.putQueryParameter("FsetId", fsetId);
            this.fsetId = fsetId;
            return this;
        }

        /**
         * SourceSecurityType.
         */
        public Builder sourceSecurityType(String sourceSecurityType) {
            this.putQueryParameter("SourceSecurityType", sourceSecurityType);
            this.sourceSecurityType = sourceSecurityType;
            return this;
        }

        /**
         * SourceStorage.
         */
        public Builder sourceStorage(String sourceStorage) {
            this.putQueryParameter("SourceStorage", sourceStorage);
            this.sourceStorage = sourceStorage;
            return this;
        }

        /**
         * Throughput.
         */
        public Builder throughput(Long throughput) {
            this.putQueryParameter("Throughput", throughput);
            this.throughput = throughput;
            return this;
        }

        @Override
        public CreateDataFlowRequest build() {
            return new CreateDataFlowRequest(this);
        } 

    } 

    public static class AutoRefreshs extends TeaModel {
        @NameInMap("RefreshPath")
        @Validation(maxLength = 1024, minLength = 2)
        private String refreshPath;

        private AutoRefreshs(Builder builder) {
            this.refreshPath = builder.refreshPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRefreshs create() {
            return builder().build();
        }

        /**
         * @return refreshPath
         */
        public String getRefreshPath() {
            return this.refreshPath;
        }

        public static final class Builder {
            private String refreshPath; 

            /**
             * RefreshPath.
             */
            public Builder refreshPath(String refreshPath) {
                this.refreshPath = refreshPath;
                return this;
            }

            public AutoRefreshs build() {
                return new AutoRefreshs(this);
            } 

        } 

    }
}
