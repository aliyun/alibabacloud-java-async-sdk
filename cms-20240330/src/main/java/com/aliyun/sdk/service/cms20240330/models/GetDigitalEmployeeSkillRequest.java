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
 * {@link GetDigitalEmployeeSkillRequest} extends {@link RequestModel}
 *
 * <p>GetDigitalEmployeeSkillRequest</p>
 */
public class GetDigitalEmployeeSkillRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private GetDigitalEmployeeSkillRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.skillName = builder.skillName;
        this.regionId = builder.regionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalEmployeeSkillRequest create() {
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetDigitalEmployeeSkillRequest, Builder> {
        private String name; 
        private String skillName; 
        private String regionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetDigitalEmployeeSkillRequest request) {
            super(request);
            this.name = request.name;
            this.skillName = request.skillName;
            this.regionId = request.regionId;
            this.version = request.version;
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

        /**
         * version.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetDigitalEmployeeSkillRequest build() {
            return new GetDigitalEmployeeSkillRequest(this);
        } 

    } 

}
