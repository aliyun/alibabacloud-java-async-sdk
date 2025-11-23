// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DeleteAbacAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>DeleteAbacAuthorizationRequest</p>
 */
public class DeleteAbacAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authorizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private DeleteAbacAuthorizationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationId = builder.authorizationId;
        this.identityType = builder.identityType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAbacAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authorizationId
     */
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<DeleteAbacAuthorizationRequest, Builder> {
        private String regionId; 
        private Long authorizationId; 
        private String identityType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAbacAuthorizationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationId = request.authorizationId;
            this.identityType = request.identityType;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The authorization ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder authorizationId(Long authorizationId) {
            this.putQueryParameter("AuthorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * <p>The type of object to which you want to attach the policy.********</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>USER</li>
         * <li>ROLE</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DeleteAbacAuthorizationRequest build() {
            return new DeleteAbacAuthorizationRequest(this);
        } 

    } 

}
