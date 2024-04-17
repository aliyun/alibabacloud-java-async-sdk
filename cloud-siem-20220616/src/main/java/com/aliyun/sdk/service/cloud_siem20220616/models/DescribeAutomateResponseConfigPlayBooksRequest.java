// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutomateResponseConfigPlayBooksRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutomateResponseConfigPlayBooksRequest</p>
 */
public class DescribeAutomateResponseConfigPlayBooksRequest extends Request {
    @Body
    @NameInMap("AutoResponseType")
    private String autoResponseType;

    @Body
    @NameInMap("EntityType")
    private String entityType;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleFor")
    private Long roleFor;

    @Body
    @NameInMap("RoleType")
    private Integer roleType;

    private DescribeAutomateResponseConfigPlayBooksRequest(Builder builder) {
        super(builder);
        this.autoResponseType = builder.autoResponseType;
        this.entityType = builder.entityType;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutomateResponseConfigPlayBooksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoResponseType
     */
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<DescribeAutomateResponseConfigPlayBooksRequest, Builder> {
        private String autoResponseType; 
        private String entityType; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutomateResponseConfigPlayBooksRequest request) {
            super(request);
            this.autoResponseType = request.autoResponseType;
            this.entityType = request.entityType;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * The type of the automated response rule. Valid values:
         * <p>
         * 
         * *   event
         * *   alert
         */
        public Builder autoResponseType(String autoResponseType) {
            this.putBodyParameter("AutoResponseType", autoResponseType);
            this.autoResponseType = autoResponseType;
            return this;
        }

        /**
         * The entity type of the playbook. Valid values:
         * <p>
         * 
         * *   ip
         * *   process
         * *   file
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DescribeAutomateResponseConfigPlayBooksRequest build() {
            return new DescribeAutomateResponseConfigPlayBooksRequest(this);
        } 

    } 

}
