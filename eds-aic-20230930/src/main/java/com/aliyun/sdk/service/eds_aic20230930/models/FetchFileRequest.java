// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchFileRequest} extends {@link RequestModel}
 *
 * <p>FetchFileRequest</p>
 */
public class FetchFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > androidInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadUrl;

    private FetchFileRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.sourceFilePath = builder.sourceFilePath;
        this.uploadEndpoint = builder.uploadEndpoint;
        this.uploadType = builder.uploadType;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIdList
     */
    public java.util.List < String > getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    /**
     * @return sourceFilePath
     */
    public String getSourceFilePath() {
        return this.sourceFilePath;
    }

    /**
     * @return uploadEndpoint
     */
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder extends Request.Builder<FetchFileRequest, Builder> {
        private java.util.List < String > androidInstanceIdList; 
        private String sourceFilePath; 
        private String uploadEndpoint; 
        private String uploadType; 
        private String uploadUrl; 

        private Builder() {
            super();
        } 

        private Builder(FetchFileRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.sourceFilePath = request.sourceFilePath;
            this.uploadEndpoint = request.uploadEndpoint;
            this.uploadType = request.uploadType;
            this.uploadUrl = request.uploadUrl;
        } 

        /**
         * AndroidInstanceIdList.
         */
        public Builder androidInstanceIdList(java.util.List < String > androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * SourceFilePath.
         */
        public Builder sourceFilePath(String sourceFilePath) {
            this.putQueryParameter("SourceFilePath", sourceFilePath);
            this.sourceFilePath = sourceFilePath;
            return this;
        }

        /**
         * UploadEndpoint.
         */
        public Builder uploadEndpoint(String uploadEndpoint) {
            this.putQueryParameter("UploadEndpoint", uploadEndpoint);
            this.uploadEndpoint = uploadEndpoint;
            return this;
        }

        /**
         * UploadType.
         */
        public Builder uploadType(String uploadType) {
            this.putQueryParameter("UploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        /**
         * UploadUrl.
         */
        public Builder uploadUrl(String uploadUrl) {
            this.putQueryParameter("UploadUrl", uploadUrl);
            this.uploadUrl = uploadUrl;
            return this;
        }

        @Override
        public FetchFileRequest build() {
            return new FetchFileRequest(this);
        } 

    } 

}
