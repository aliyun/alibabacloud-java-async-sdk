// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateScreenshotRequest} extends {@link RequestModel}
 *
 * <p>CreateScreenshotRequest</p>
 */
public class CreateScreenshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> androidInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScreenshotId")
    private String screenshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipCheckPolicyConfig")
    private String skipCheckPolicyConfig;

    private CreateScreenshotRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.ossBucketName = builder.ossBucketName;
        this.screenshotId = builder.screenshotId;
        this.skipCheckPolicyConfig = builder.skipCheckPolicyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScreenshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIdList
     */
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return screenshotId
     */
    public String getScreenshotId() {
        return this.screenshotId;
    }

    /**
     * @return skipCheckPolicyConfig
     */
    public String getSkipCheckPolicyConfig() {
        return this.skipCheckPolicyConfig;
    }

    public static final class Builder extends Request.Builder<CreateScreenshotRequest, Builder> {
        private java.util.List<String> androidInstanceIdList; 
        private String ossBucketName; 
        private String screenshotId; 
        private String skipCheckPolicyConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateScreenshotRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.ossBucketName = request.ossBucketName;
            this.screenshotId = request.screenshotId;
            this.skipCheckPolicyConfig = request.skipCheckPolicyConfig;
        } 

        /**
         * <p>The list of instance IDs. Batch screenshots are supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder androidInstanceIdList(java.util.List<String> androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * <p>The custom OSS bucket. The bucket name must start with the cloudphone-saved-bucket- prefix. The cloud phone instance and the OSS bucket must be in the same region. If you leave this parameter empty, a default bucket named cloudphone-saved-bucket-{RegionOfCloudPhone}-{AliUid} is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudphone-saved-bucket-cn-shanghai-default</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>The screenshot ID. The generated screenshot is named &quot;ScreenshotId_AndroidInstanceId.png.&quot;</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The ScreenshotId must be 2 to 128 characters long, beginning with a letter, but cannot start with http\:// or https\://. Allowed characters include letters, digits, underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder screenshotId(String screenshotId) {
            this.putQueryParameter("ScreenshotId", screenshotId);
            this.screenshotId = screenshotId;
            return this;
        }

        /**
         * <p>Specifies whether to skip the screenshot policy check. The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipCheckPolicyConfig(String skipCheckPolicyConfig) {
            this.putQueryParameter("SkipCheckPolicyConfig", skipCheckPolicyConfig);
            this.skipCheckPolicyConfig = skipCheckPolicyConfig;
            return this;
        }

        @Override
        public CreateScreenshotRequest build() {
            return new CreateScreenshotRequest(this);
        } 

    } 

}
