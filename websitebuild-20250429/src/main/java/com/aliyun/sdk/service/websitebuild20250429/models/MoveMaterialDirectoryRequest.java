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
 * {@link MoveMaterialDirectoryRequest} extends {@link RequestModel}
 *
 * <p>MoveMaterialDirectoryRequest</p>
 */
public class MoveMaterialDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentDirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sortNum;

    private MoveMaterialDirectoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.directoryId = builder.directoryId;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.sortNum = builder.sortNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveMaterialDirectoryRequest create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return sortNum
     */
    public Integer getSortNum() {
        return this.sortNum;
    }

    public static final class Builder extends Request.Builder<MoveMaterialDirectoryRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String directoryId; 
        private String parentDirectoryId; 
        private Integer sortNum; 

        private Builder() {
            super();
        } 

        private Builder(MoveMaterialDirectoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.directoryId = request.directoryId;
            this.parentDirectoryId = request.parentDirectoryId;
            this.sortNum = request.sortNum;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>58157a0a-769a-4364-bbdc-a0e2cf3d5a2</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putQueryParameter("ParentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sortNum(Integer sortNum) {
            this.putQueryParameter("SortNum", sortNum);
            this.sortNum = sortNum;
            return this;
        }

        @Override
        public MoveMaterialDirectoryRequest build() {
            return new MoveMaterialDirectoryRequest(this);
        } 

    } 

}
