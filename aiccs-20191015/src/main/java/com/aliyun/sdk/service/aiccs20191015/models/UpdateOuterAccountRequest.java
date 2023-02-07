// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOuterAccountRequest} extends {@link RequestModel}
 *
 * <p>UpdateOuterAccountRequest</p>
 */
public class UpdateOuterAccountRequest extends Request {
    @Query
    @NameInMap("Avatar")
    private String avatar;

    @Query
    @NameInMap("Ext")
    private String ext;

    @Query
    @NameInMap("OuterAccountId")
    @Validation(required = true)
    private String outerAccountId;

    @Query
    @NameInMap("OuterAccountName")
    private String outerAccountName;

    @Query
    @NameInMap("OuterAccountType")
    @Validation(required = true)
    private String outerAccountType;

    @Query
    @NameInMap("OuterDepartmentId")
    private String outerDepartmentId;

    @Query
    @NameInMap("OuterDepartmentType")
    private String outerDepartmentType;

    @Query
    @NameInMap("OuterGroupIds")
    private String outerGroupIds;

    @Query
    @NameInMap("OuterGroupType")
    private String outerGroupType;

    @Query
    @NameInMap("RealName")
    private String realName;

    private UpdateOuterAccountRequest(Builder builder) {
        super(builder);
        this.avatar = builder.avatar;
        this.ext = builder.ext;
        this.outerAccountId = builder.outerAccountId;
        this.outerAccountName = builder.outerAccountName;
        this.outerAccountType = builder.outerAccountType;
        this.outerDepartmentId = builder.outerDepartmentId;
        this.outerDepartmentType = builder.outerDepartmentType;
        this.outerGroupIds = builder.outerGroupIds;
        this.outerGroupType = builder.outerGroupType;
        this.realName = builder.realName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOuterAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
    }

    /**
     * @return outerAccountId
     */
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    /**
     * @return outerAccountName
     */
    public String getOuterAccountName() {
        return this.outerAccountName;
    }

    /**
     * @return outerAccountType
     */
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

    /**
     * @return outerDepartmentId
     */
    public String getOuterDepartmentId() {
        return this.outerDepartmentId;
    }

    /**
     * @return outerDepartmentType
     */
    public String getOuterDepartmentType() {
        return this.outerDepartmentType;
    }

    /**
     * @return outerGroupIds
     */
    public String getOuterGroupIds() {
        return this.outerGroupIds;
    }

    /**
     * @return outerGroupType
     */
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    /**
     * @return realName
     */
    public String getRealName() {
        return this.realName;
    }

    public static final class Builder extends Request.Builder<UpdateOuterAccountRequest, Builder> {
        private String avatar; 
        private String ext; 
        private String outerAccountId; 
        private String outerAccountName; 
        private String outerAccountType; 
        private String outerDepartmentId; 
        private String outerDepartmentType; 
        private String outerGroupIds; 
        private String outerGroupType; 
        private String realName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOuterAccountRequest request) {
            super(request);
            this.avatar = request.avatar;
            this.ext = request.ext;
            this.outerAccountId = request.outerAccountId;
            this.outerAccountName = request.outerAccountName;
            this.outerAccountType = request.outerAccountType;
            this.outerDepartmentId = request.outerDepartmentId;
            this.outerDepartmentType = request.outerDepartmentType;
            this.outerGroupIds = request.outerGroupIds;
            this.outerGroupType = request.outerGroupType;
            this.realName = request.realName;
        } 

        /**
         * Avatar.
         */
        public Builder avatar(String avatar) {
            this.putQueryParameter("Avatar", avatar);
            this.avatar = avatar;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(String ext) {
            this.putQueryParameter("Ext", ext);
            this.ext = ext;
            return this;
        }

        /**
         * OuterAccountId.
         */
        public Builder outerAccountId(String outerAccountId) {
            this.putQueryParameter("OuterAccountId", outerAccountId);
            this.outerAccountId = outerAccountId;
            return this;
        }

        /**
         * OuterAccountName.
         */
        public Builder outerAccountName(String outerAccountName) {
            this.putQueryParameter("OuterAccountName", outerAccountName);
            this.outerAccountName = outerAccountName;
            return this;
        }

        /**
         * OuterAccountType.
         */
        public Builder outerAccountType(String outerAccountType) {
            this.putQueryParameter("OuterAccountType", outerAccountType);
            this.outerAccountType = outerAccountType;
            return this;
        }

        /**
         * OuterDepartmentId.
         */
        public Builder outerDepartmentId(String outerDepartmentId) {
            this.putQueryParameter("OuterDepartmentId", outerDepartmentId);
            this.outerDepartmentId = outerDepartmentId;
            return this;
        }

        /**
         * OuterDepartmentType.
         */
        public Builder outerDepartmentType(String outerDepartmentType) {
            this.putQueryParameter("OuterDepartmentType", outerDepartmentType);
            this.outerDepartmentType = outerDepartmentType;
            return this;
        }

        /**
         * OuterGroupIds.
         */
        public Builder outerGroupIds(String outerGroupIds) {
            this.putQueryParameter("OuterGroupIds", outerGroupIds);
            this.outerGroupIds = outerGroupIds;
            return this;
        }

        /**
         * OuterGroupType.
         */
        public Builder outerGroupType(String outerGroupType) {
            this.putQueryParameter("OuterGroupType", outerGroupType);
            this.outerGroupType = outerGroupType;
            return this;
        }

        /**
         * RealName.
         */
        public Builder realName(String realName) {
            this.putQueryParameter("RealName", realName);
            this.realName = realName;
            return this;
        }

        @Override
        public UpdateOuterAccountRequest build() {
            return new UpdateOuterAccountRequest(this);
        } 

    } 

}
