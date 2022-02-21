// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigOfVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigOfVersionRequest</p>
 */
public class DescribeConfigOfVersionRequest extends Request {
    @Query
    @NameInMap("FunctionId")
    private Integer functionId;

    @Query
    @NameInMap("FunctionName")
    private String functionName;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private DescribeConfigOfVersionRequest(Builder builder) {
        super(builder);
        this.functionId = builder.functionId;
        this.functionName = builder.functionName;
        this.groupId = builder.groupId;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigOfVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionId
     */
    public Integer getFunctionId() {
        return this.functionId;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DescribeConfigOfVersionRequest, Builder> {
        private Integer functionId; 
        private String functionName; 
        private Long groupId; 
        private Long ownerId; 
        private String securityToken; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigOfVersionRequest response) {
            super(response);
            this.functionId = response.functionId;
            this.functionName = response.functionName;
            this.groupId = response.groupId;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
            this.versionId = response.versionId;
        } 

        /**
         * FunctionId.
         */
        public Builder functionId(Integer functionId) {
            this.putQueryParameter("FunctionId", functionId);
            this.functionId = functionId;
            return this;
        }

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DescribeConfigOfVersionRequest build() {
            return new DescribeConfigOfVersionRequest(this);
        } 

    } 

}
