// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link PrecheckVideoCharacterReplaceJobRequest} extends {@link RequestModel}
 *
 * <p>PrecheckVideoCharacterReplaceJobRequest</p>
 */
public class PrecheckVideoCharacterReplaceJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppParams")
    private String appParams;

    private PrecheckVideoCharacterReplaceJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appParams = builder.appParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckVideoCharacterReplaceJobRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appParams
     */
    public String getAppParams() {
        return this.appParams;
    }

    public static final class Builder extends Request.Builder<PrecheckVideoCharacterReplaceJobRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appParams; 

        private Builder() {
            super();
        } 

        private Builder(PrecheckVideoCharacterReplaceJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appParams = request.appParams;
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
         * <p>The ID of the video character replacement application. Use a configured application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application input parameters, which are provided as a JSON-serialized string. The field names and material requirements are subject to the input definition of the corresponding AppId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;LoadImage.1.TargetImage&quot;:&quot;1a7852b032c371f0b64fe6f6c74b****&quot;}</p>
         */
        public Builder appParams(String appParams) {
            this.putQueryParameter("AppParams", appParams);
            this.appParams = appParams;
            return this;
        }

        @Override
        public PrecheckVideoCharacterReplaceJobRequest build() {
            return new PrecheckVideoCharacterReplaceJobRequest(this);
        } 

    } 

}
