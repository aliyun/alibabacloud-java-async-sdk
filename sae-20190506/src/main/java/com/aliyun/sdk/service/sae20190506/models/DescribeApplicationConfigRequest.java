// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationConfigRequest</p>
 */
public class DescribeApplicationConfigRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("VersionId")
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

        private Builder(DescribeApplicationConfigRequest response) {
            super(response);
            this.appId = response.appId;
            this.versionId = response.versionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * VersionId.
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
