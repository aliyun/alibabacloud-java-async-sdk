// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApplicationConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationConfigRequest</p>
 */
public class DescribeApplicationConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private DescribeApplicationConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationConfigRequest, Builder> {
        private String appId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.versionId = request.versionId;
        } 

        /**
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>0026ff7f-2b57-4127-bdd0-9bf202bb****</p>
         * 
         * <strong>example:</strong>
         * <p>0026ff7f-2b57-4127-bdd0-9bf202bb****</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DescribeApplicationConfigRequest build() {
            return new DescribeApplicationConfigRequest(this);
        } 

    } 

}
