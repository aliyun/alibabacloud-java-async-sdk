// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MoveAppResourceRequest} extends {@link RequestModel}
 *
 * <p>MoveAppResourceRequest</p>
 */
public class MoveAppResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetAppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetAppId;

    private MoveAppResourceRequest(Builder builder) {
        super(builder);
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.targetAppId = builder.targetAppId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveAppResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return targetAppId
     */
    public String getTargetAppId() {
        return this.targetAppId;
    }

    public static final class Builder extends Request.Builder<MoveAppResourceRequest, Builder> {
        private String resourceIds; 
        private String resourceType; 
        private String targetAppId; 

        private Builder() {
            super();
        } 

        private Builder(MoveAppResourceRequest request) {
            super(request);
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.targetAppId = request.targetAppId;
        } 

        /**
         * <p>The resource ID. You can specify a maximum of 20 IDs at a time. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9afb4<strong><strong>06de180880e,f7bba</strong></strong>caa546cfe2ba</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><strong>video</strong>: video files.</li>
         * <li><strong>image</strong>: image files.</li>
         * <li><strong>attached</strong>: auxiliary media assets.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the application to which resources are migrated. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Use the multi-application service</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder targetAppId(String targetAppId) {
            this.putQueryParameter("TargetAppId", targetAppId);
            this.targetAppId = targetAppId;
            return this;
        }

        @Override
        public MoveAppResourceRequest build() {
            return new MoveAppResourceRequest(this);
        } 

    } 

}
