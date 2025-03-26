// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link RevokeCoordinatePrivilegeRequest} extends {@link RequestModel}
 *
 * <p>RevokeCoordinatePrivilegeRequest</p>
 */
public class RevokeCoordinatePrivilegeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private RevokeCoordinatePrivilegeRequest(Builder builder) {
        super(builder);
        this.coId = builder.coId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.userType = builder.userType;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeCoordinatePrivilegeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coId
     */
    public String getCoId() {
        return this.coId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<RevokeCoordinatePrivilegeRequest, Builder> {
        private String coId; 
        private String endUserId; 
        private String regionId; 
        private String userType; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(RevokeCoordinatePrivilegeRequest request) {
            super(request);
            this.coId = request.coId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.userType = request.userType;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The ID of the stream coordination task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>co-fqsm6e8ee75w61fp9</p>
         */
        public Builder coId(String coId) {
            this.putQueryParameter("CoId", coId);
            this.coId = coId;
            return this;
        }

        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of user who requires the coordinate permissions.</p>
         * <p>Set the value to TENANT_ADMIN. Only tenant administrators can be granted with the coordinate permissions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT_ADMIN</p>
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        /**
         * <p>The unique identifier of the client. If you use an Alibaba Cloud Workspace client, click <strong>About</strong> on the client logon page to view the identifier of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>C78CA9E99315687575DD2844C1F3****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public RevokeCoordinatePrivilegeRequest build() {
            return new RevokeCoordinatePrivilegeRequest(this);
        } 

    } 

}
