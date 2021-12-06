// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteAccessAssignmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessAssignmentRequest</p>
 */
public class DeleteAccessAssignmentRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DeprovisionStrategy")
    private String deprovisionStrategy;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("PrincipalId")
    private String principalId;

    @Query
    @NameInMap("PrincipalType")
    private String principalType;

    @Query
    @NameInMap("TargetId")
    private String targetId;

    @Query
    @NameInMap("TargetType")
    private String targetType;


    private DeleteAccessAssignmentRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.deprovisionStrategy = builder.deprovisionStrategy;
        this.directoryId = builder.directoryId;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessAssignmentRequest create() {
        return builder().build();
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return deprovisionStrategy
     */
    public String getDeprovisionStrategy() {
        return this.deprovisionStrategy;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder {
        private String accessConfigurationId; 
        private String deprovisionStrategy; 
        private String directoryId; 
        private String principalId; 
        private String principalType; 
        private String targetId; 
        private String targetType; 

        /**
         * <p>AccessConfigurationId.</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>DeprovisionStrategy.</p>
         */
        public Builder deprovisionStrategy(String deprovisionStrategy) {
            this.putQueryParameter("DeprovisionStrategy", deprovisionStrategy);
            this.deprovisionStrategy = deprovisionStrategy;
            return this;
        }

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>PrincipalId.</p>
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>PrincipalType.</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * <p>TargetId.</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>TargetType.</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        public DeleteAccessAssignmentRequest build() {
            return new DeleteAccessAssignmentRequest(this);
        } 

    } 

}
