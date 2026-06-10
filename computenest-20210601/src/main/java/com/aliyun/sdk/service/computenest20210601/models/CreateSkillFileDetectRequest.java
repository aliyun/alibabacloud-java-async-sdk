// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateSkillFileDetectRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillFileDetectRequest</p>
 */
public class CreateSkillFileDetectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateSkillFileDetectRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ossUrl = builder.ossUrl;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillFileDetectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSkillFileDetectRequest, Builder> {
        private String clientToken; 
        private String ossUrl; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillFileDetectRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ossUrl = request.ossUrl;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570.zip">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570.zip</a></p>
         */
        public Builder ossUrl(String ossUrl) {
            this.putQueryParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateSkillFileDetectRequest build() {
            return new CreateSkillFileDetectRequest(this);
        } 

    } 

}
