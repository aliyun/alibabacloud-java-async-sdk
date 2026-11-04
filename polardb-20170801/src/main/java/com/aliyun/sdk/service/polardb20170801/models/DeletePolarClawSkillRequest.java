// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarClawSkillRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarClawSkillRequest</p>
 */
public class DeletePolarClawSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    private DeletePolarClawSkillRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarClawSkillRequest create() {
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
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    public static final class Builder extends Request.Builder<DeletePolarClawSkillRequest, Builder> {
        private String regionId; 
        private String skillName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarClawSkillRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.skillName = request.skillName;
        } 

        /**
         * <p>The region ID of the region where the parameter template resides.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region IDs.</p>
         * </blockquote>
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
         * <p>The name of the skill.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclawhub</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        @Override
        public DeletePolarClawSkillRequest build() {
            return new DeletePolarClawSkillRequest(this);
        } 

    } 

}
