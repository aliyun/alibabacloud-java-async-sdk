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
 * {@link CopyAppPluginConfigRequest} extends {@link RequestModel}
 *
 * <p>CopyAppPluginConfigRequest</p>
 */
public class CopyAppPluginConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBizId")
    private String sourceBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetBizId")
    private String targetBizId;

    private CopyAppPluginConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sourceBizId = builder.sourceBizId;
        this.targetBizId = builder.targetBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyAppPluginConfigRequest create() {
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
     * @return sourceBizId
     */
    public String getSourceBizId() {
        return this.sourceBizId;
    }

    /**
     * @return targetBizId
     */
    public String getTargetBizId() {
        return this.targetBizId;
    }

    public static final class Builder extends Request.Builder<CopyAppPluginConfigRequest, Builder> {
        private String regionId; 
        private String sourceBizId; 
        private String targetBizId; 

        private Builder() {
            super();
        } 

        private Builder(CopyAppPluginConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sourceBizId = request.sourceBizId;
            this.targetBizId = request.targetBizId;
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
         * SourceBizId.
         */
        public Builder sourceBizId(String sourceBizId) {
            this.putQueryParameter("SourceBizId", sourceBizId);
            this.sourceBizId = sourceBizId;
            return this;
        }

        /**
         * TargetBizId.
         */
        public Builder targetBizId(String targetBizId) {
            this.putQueryParameter("TargetBizId", targetBizId);
            this.targetBizId = targetBizId;
            return this;
        }

        @Override
        public CopyAppPluginConfigRequest build() {
            return new CopyAppPluginConfigRequest(this);
        } 

    } 

}
