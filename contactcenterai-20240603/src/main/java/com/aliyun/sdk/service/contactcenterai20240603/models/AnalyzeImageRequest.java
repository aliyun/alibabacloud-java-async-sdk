// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link AnalyzeImageRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeImageRequest</p>
 */
public class AnalyzeImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrls")
    private java.util.List<String> imageUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("responseFormatType")
    private String responseFormatType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resultTypes")
    private java.util.List<String> resultTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean stream;

    private AnalyzeImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.imageUrls = builder.imageUrls;
        this.responseFormatType = builder.responseFormatType;
        this.resultTypes = builder.resultTypes;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeImageRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return imageUrls
     */
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    /**
     * @return responseFormatType
     */
    public String getResponseFormatType() {
        return this.responseFormatType;
    }

    /**
     * @return resultTypes
     */
    public java.util.List<String> getResultTypes() {
        return this.resultTypes;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<AnalyzeImageRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String appId; 
        private java.util.List<String> imageUrls; 
        private String responseFormatType; 
        private java.util.List<String> resultTypes; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.imageUrls = request.imageUrls;
            this.responseFormatType = request.responseFormatType;
            this.resultTypes = request.resultTypes;
            this.stream = request.stream;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * imageUrls.
         */
        public Builder imageUrls(java.util.List<String> imageUrls) {
            this.putBodyParameter("imageUrls", imageUrls);
            this.imageUrls = imageUrls;
            return this;
        }

        /**
         * responseFormatType.
         */
        public Builder responseFormatType(String responseFormatType) {
            this.putBodyParameter("responseFormatType", responseFormatType);
            this.responseFormatType = responseFormatType;
            return this;
        }

        /**
         * resultTypes.
         */
        public Builder resultTypes(java.util.List<String> resultTypes) {
            this.putBodyParameter("resultTypes", resultTypes);
            this.resultTypes = resultTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public AnalyzeImageRequest build() {
            return new AnalyzeImageRequest(this);
        } 

    } 

}
