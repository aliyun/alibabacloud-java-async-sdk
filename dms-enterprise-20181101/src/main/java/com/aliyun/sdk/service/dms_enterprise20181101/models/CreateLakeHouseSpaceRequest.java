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
 * {@link CreateLakeHouseSpaceRequest} extends {@link RequestModel}
 *
 * <p>CreateLakeHouseSpaceRequest</p>
 */
public class CreateLakeHouseSpaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevDbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devDbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DwDbType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dwDbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdDbId")
    private String prodDbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpaceConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateLakeHouseSpaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.devDbId = builder.devDbId;
        this.dwDbType = builder.dwDbType;
        this.mode = builder.mode;
        this.prodDbId = builder.prodDbId;
        this.spaceConfig = builder.spaceConfig;
        this.spaceName = builder.spaceName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLakeHouseSpaceRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return devDbId
     */
    public String getDevDbId() {
        return this.devDbId;
    }

    /**
     * @return dwDbType
     */
    public String getDwDbType() {
        return this.dwDbType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return prodDbId
     */
    public String getProdDbId() {
        return this.prodDbId;
    }

    /**
     * @return spaceConfig
     */
    public String getSpaceConfig() {
        return this.spaceConfig;
    }

    /**
     * @return spaceName
     */
    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateLakeHouseSpaceRequest, Builder> {
        private String regionId; 
        private String description; 
        private String devDbId; 
        private String dwDbType; 
        private String mode; 
        private String prodDbId; 
        private String spaceConfig; 
        private String spaceName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateLakeHouseSpaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.devDbId = request.devDbId;
            this.dwDbType = request.dwDbType;
            this.mode = request.mode;
            this.prodDbId = request.prodDbId;
            this.spaceConfig = request.spaceConfig;
            this.spaceName = request.spaceName;
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
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the development database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2435****</p>
         */
        public Builder devDbId(String devDbId) {
            this.putQueryParameter("DevDbId", devDbId);
            this.devDbId = devDbId;
            return this;
        }

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><strong>14</strong>: AnalyticDB for MySQL</li>
         * <li><strong>18</strong>: AnalyticDB for PostgreSQL</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder dwDbType(String dwDbType) {
            this.putQueryParameter("DwDbType", dwDbType);
            this.dwDbType = dwDbType;
            return this;
        }

        /**
         * <p>The mode in which the workspace runs. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: basic mode. This mode is unavailable.</li>
         * <li><strong>1</strong>: standard mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The ID of the production database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2442****</p>
         */
        public Builder prodDbId(String prodDbId) {
            this.putQueryParameter("ProdDbId", prodDbId);
            this.prodDbId = prodDbId;
            return this;
        }

        /**
         * <p>The configuration of the workspace. Valid values:</p>
         * <ul>
         * <li><strong>skipManualRunCheck</strong>: No security rule check is required in the trial run phase.</li>
         * <li><strong>skipPublishApprove</strong>: No approval is required for publishing and O&amp;M.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;skipManualRunCheck&quot;:true,&quot;skipPublishApprove&quot;:true}</p>
         */
        public Builder spaceConfig(String spaceConfig) {
            this.putQueryParameter("SpaceConfig", spaceConfig);
            this.spaceConfig = spaceConfig;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_space</p>
         */
        public Builder spaceName(String spaceName) {
            this.putQueryParameter("SpaceName", spaceName);
            this.spaceName = spaceName;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
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
        public CreateLakeHouseSpaceRequest build() {
            return new CreateLakeHouseSpaceRequest(this);
        } 

    } 

}
