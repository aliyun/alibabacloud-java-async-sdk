// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>AddSkillGroupRequest</p>
 */
public class AddSkillGroupRequest extends Request {
    @Query
    @NameInMap("OuterDepartmentId")
    private String outerDepartmentId;

    @Query
    @NameInMap("OuterDepartmentType")
    private String outerDepartmentType;

    @Query
    @NameInMap("OuterGroupId")
    @Validation(required = true)
    private String outerGroupId;

    @Query
    @NameInMap("OuterGroupName")
    @Validation(required = true)
    private String outerGroupName;

    @Query
    @NameInMap("OuterGroupType")
    @Validation(required = true)
    private String outerGroupType;

    private AddSkillGroupRequest(Builder builder) {
        super(builder);
        this.outerDepartmentId = builder.outerDepartmentId;
        this.outerDepartmentType = builder.outerDepartmentType;
        this.outerGroupId = builder.outerGroupId;
        this.outerGroupName = builder.outerGroupName;
        this.outerGroupType = builder.outerGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSkillGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return outerGroupId
     */
    public String getOuterGroupId() {
        return this.outerGroupId;
    }

    /**
     * @return outerGroupName
     */
    public String getOuterGroupName() {
        return this.outerGroupName;
    }

    /**
     * @return outerGroupType
     */
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    public static final class Builder extends Request.Builder<AddSkillGroupRequest, Builder> {
        private String outerDepartmentId; 
        private String outerDepartmentType; 
        private String outerGroupId; 
        private String outerGroupName; 
        private String outerGroupType; 

        private Builder() {
            super();
        } 

        private Builder(AddSkillGroupRequest response) {
            super(response);
            this.outerDepartmentId = response.outerDepartmentId;
            this.outerDepartmentType = response.outerDepartmentType;
            this.outerGroupId = response.outerGroupId;
            this.outerGroupName = response.outerGroupName;
            this.outerGroupType = response.outerGroupType;
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
         * OuterGroupId.
         */
        public Builder outerGroupId(String outerGroupId) {
            this.putQueryParameter("OuterGroupId", outerGroupId);
            this.outerGroupId = outerGroupId;
            return this;
        }

        /**
         * OuterGroupName.
         */
        public Builder outerGroupName(String outerGroupName) {
            this.putQueryParameter("OuterGroupName", outerGroupName);
            this.outerGroupName = outerGroupName;
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

        @Override
        public AddSkillGroupRequest build() {
            return new AddSkillGroupRequest(this);
        } 

    } 

}
