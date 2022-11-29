// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReleaseRequest} extends {@link RequestModel}
 *
 * <p>GetReleaseRequest</p>
 */
public class GetReleaseRequest extends Request {
    @Path
    @NameInMap("appName")
    private String appName;

    @Path
    @NameInMap("versionId")
    private Long versionId;

    private GetReleaseRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReleaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return versionId
     */
    public Long getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<GetReleaseRequest, Builder> {
        private String appName; 
        private Long versionId; 

        private Builder() {
            super();
        } 

        private Builder(GetReleaseRequest request) {
            super(request);
            this.appName = request.appName;
            this.versionId = request.versionId;
        } 

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * 版本ID
         */
        public Builder versionId(Long versionId) {
            this.putPathParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public GetReleaseRequest build() {
            return new GetReleaseRequest(this);
        } 

    } 

}
