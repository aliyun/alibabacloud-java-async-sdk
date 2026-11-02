// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link DeleteAccessAssignmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessAssignmentRequest</p>
 */
public class DeleteAccessAssignmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeprovisionStrategy")
    private String deprovisionStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginTargetId")
    private String originTargetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalId")
    private String principalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    private String principalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private DeleteAccessAssignmentRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.deprovisionStrategy = builder.deprovisionStrategy;
        this.directoryId = builder.directoryId;
        this.originTargetId = builder.originTargetId;
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

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return originTargetId
     */
    public String getOriginTargetId() {
        return this.originTargetId;
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

    public static final class Builder extends Request.Builder<DeleteAccessAssignmentRequest, Builder> {
        private String accessConfigurationId; 
        private String deprovisionStrategy; 
        private String directoryId; 
        private String originTargetId; 
        private String principalId; 
        private String principalType; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessAssignmentRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.deprovisionStrategy = request.deprovisionStrategy;
            this.directoryId = request.directoryId;
            this.originTargetId = request.originTargetId;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The access configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>Specifies whether to remove the access configuration deployment when you remove the last authorization that uses the access configuration on an account in a resource directory. Valid values:</p>
         * <ul>
         * <li>DeprovisionForLastAccessAssignmentOnAccount: Removes the access configuration deployment.</li>
         * <li>None: Does not remove the access configuration deployment. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder deprovisionStrategy(String deprovisionStrategy) {
            this.putQueryParameter("DeprovisionStrategy", deprovisionStrategy);
            this.deprovisionStrategy = deprovisionStrategy;
            return this;
        }

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the authorization target.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder originTargetId(String originTargetId) {
            this.putQueryParameter("OriginTargetId", originTargetId);
            this.originTargetId = originTargetId;
            return this;
        }

        /**
         * <p>The CloudSSO identity ID. The value varies based on the principal type:</p>
         * <ul>
         * <li>If <code>PrincipalType</code> is <code>User</code>, <code>PrincipalId</code> is the CloudSSO user ID.</li>
         * <li>If <code>PrincipalType</code> is <code>Group</code>, <code>PrincipalId</code> is the CloudSSO group ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>The CloudSSO identity type. Valid values:</p>
         * <ul>
         * <li>User: user</li>
         * <li>Group: group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * <p>The target ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The target type of the task. Valid values:</p>
         * <ul>
         * <li>RD-Account: The task target is an account in a resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public DeleteAccessAssignmentRequest build() {
            return new DeleteAccessAssignmentRequest(this);
        } 

    } 

}
