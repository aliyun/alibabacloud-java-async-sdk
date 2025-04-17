// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListImageLabelsRequest} extends {@link RequestModel}
 *
 * <p>ListImageLabelsRequest</p>
 */
public class ListImageLabelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelFilter")
    private String labelFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelKeys")
    private String labelKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListImageLabelsRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.labelFilter = builder.labelFilter;
        this.labelKeys = builder.labelKeys;
        this.region = builder.region;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageLabelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return labelFilter
     */
    public String getLabelFilter() {
        return this.labelFilter;
    }

    /**
     * @return labelKeys
     */
    public String getLabelKeys() {
        return this.labelKeys;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListImageLabelsRequest, Builder> {
        private String imageId; 
        private String labelFilter; 
        private String labelKeys; 
        private String region; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListImageLabelsRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.labelFilter = request.labelFilter;
            this.labelKeys = request.labelKeys;
            this.region = request.region;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>image-4c62******53uor</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The tag filter conditions, separated with commas (,). The format of a single condition filter is <code>key=value</code>. Takes effect independently from LabelKeys.</p>
         * 
         * <strong>example:</strong>
         * <p>system.framework=XGBoost 1.6.0,system.official=true</p>
         */
        public Builder labelFilter(String labelFilter) {
            this.putQueryParameter("LabelFilter", labelFilter);
            this.labelFilter = labelFilter;
            return this;
        }

        /**
         * <p>The tag keys, separated with commas (,). System tags start with system and take effect independently from LabelFilter.</p>
         * 
         * <strong>example:</strong>
         * <p>system.framework,system.official</p>
         */
        public Builder labelKeys(String labelKeys) {
            this.putQueryParameter("LabelKeys", labelKeys);
            this.labelKeys = labelKeys;
            return this;
        }

        /**
         * <p>The region where the image resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListImageLabelsRequest build() {
            return new ListImageLabelsRequest(this);
        } 

    } 

}
