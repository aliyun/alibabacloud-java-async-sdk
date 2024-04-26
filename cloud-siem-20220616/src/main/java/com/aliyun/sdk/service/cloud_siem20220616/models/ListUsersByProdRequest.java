// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersByProdRequest} extends {@link RequestModel}
 *
 * <p>ListUsersByProdRequest</p>
 */
public class ListUsersByProdRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleFor")
    private Long roleFor;

    @Body
    @NameInMap("RoleType")
    private Integer roleType;

    @Body
    @NameInMap("SourceProdCode")
    @Validation(required = true)
    private String sourceProdCode;

    private ListUsersByProdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.sourceProdCode = builder.sourceProdCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersByProdRequest create() {
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

    /**
     * @return sourceProdCode
     */
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

    public static final class Builder extends Request.Builder<ListUsersByProdRequest, Builder> {
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String sourceProdCode; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersByProdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.sourceProdCode = request.sourceProdCode;
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

        /**
         * The code of the cloud service.
         */
        public Builder sourceProdCode(String sourceProdCode) {
            this.putBodyParameter("SourceProdCode", sourceProdCode);
            this.sourceProdCode = sourceProdCode;
            return this;
        }

        @Override
        public ListUsersByProdRequest build() {
            return new ListUsersByProdRequest(this);
        } 

    } 

}
