// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link QueryMaterialDirectoryTreeRequest} extends {@link RequestModel}
 *
 * <p>QueryMaterialDirectoryTreeRequest</p>
 */
public class QueryMaterialDirectoryTreeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenPublic")
    private Boolean hiddenPublic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Root")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean root;

    private QueryMaterialDirectoryTreeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.hiddenPublic = builder.hiddenPublic;
        this.root = builder.root;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMaterialDirectoryTreeRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return hiddenPublic
     */
    public Boolean getHiddenPublic() {
        return this.hiddenPublic;
    }

    /**
     * @return root
     */
    public Boolean getRoot() {
        return this.root;
    }

    public static final class Builder extends Request.Builder<QueryMaterialDirectoryTreeRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private Boolean hiddenPublic; 
        private Boolean root; 

        private Builder() {
            super();
        } 

        private Builder(QueryMaterialDirectoryTreeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.hiddenPublic = request.hiddenPublic;
            this.root = request.root;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * HiddenPublic.
         */
        public Builder hiddenPublic(Boolean hiddenPublic) {
            this.putQueryParameter("HiddenPublic", hiddenPublic);
            this.hiddenPublic = hiddenPublic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder root(Boolean root) {
            this.putQueryParameter("Root", root);
            this.root = root;
            return this;
        }

        @Override
        public QueryMaterialDirectoryTreeRequest build() {
            return new QueryMaterialDirectoryTreeRequest(this);
        } 

    } 

}
