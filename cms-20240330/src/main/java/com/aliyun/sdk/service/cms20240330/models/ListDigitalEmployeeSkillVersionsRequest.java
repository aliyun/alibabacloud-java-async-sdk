// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListDigitalEmployeeSkillVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListDigitalEmployeeSkillVersionsRequest</p>
 */
public class ListDigitalEmployeeSkillVersionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String skillName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListDigitalEmployeeSkillVersionsRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.skillName = builder.skillName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDigitalEmployeeSkillVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDigitalEmployeeSkillVersionsRequest, Builder> {
        private String name; 
        private String skillName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDigitalEmployeeSkillVersionsRequest request) {
            super(request);
            this.name = request.name;
            this.skillName = request.skillName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder skillName(String skillName) {
            this.putPathParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDigitalEmployeeSkillVersionsRequest build() {
            return new ListDigitalEmployeeSkillVersionsRequest(this);
        } 

    } 

}
