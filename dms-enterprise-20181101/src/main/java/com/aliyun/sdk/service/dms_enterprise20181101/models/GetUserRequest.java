// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserRequest} extends {@link RequestModel}
 *
 * <p>GetUserRequest</p>
 */
public class GetUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tid = builder.tid;
        this.uid = builder.uid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserRequest create() {
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetUserRequest, Builder> {
        private String regionId; 
        private Long tid; 
        private String uid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.tid = request.tid;
            this.uid = request.uid;
            this.userId = request.userId;
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
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account. You can view your UID by moving the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console.</p>
         * 
         * <strong>example:</strong>
         * <p>22973492647626****</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>The ID of the user. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> operation to query the ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetUserRequest build() {
            return new GetUserRequest(this);
        } 

    } 

}
