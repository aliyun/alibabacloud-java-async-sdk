// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAclAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAclAttributeRequest</p>
 */
public class UpdateAclAttributeRequest extends Request {
    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("AclName")
    @Validation(required = true)
    private String aclName;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    private UpdateAclAttributeRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAclAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return aclName
     */
    public String getAclName() {
        return this.aclName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<UpdateAclAttributeRequest, Builder> {
        private String aclId; 
        private String aclName; 
        private String clientToken; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAclAttributeRequest response) {
            super(response);
            this.aclId = response.aclId;
            this.aclName = response.aclName;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
        } 

        /**
         * AclId
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * 访问控制策略名称
         */
        public Builder aclName(String aclName) {
            this.putQueryParameter("AclName", aclName);
            this.aclName = aclName;
            return this;
        }

        /**
         * 幂等参数
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 是否预校验请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public UpdateAclAttributeRequest build() {
            return new UpdateAclAttributeRequest(this);
        } 

    } 

}
