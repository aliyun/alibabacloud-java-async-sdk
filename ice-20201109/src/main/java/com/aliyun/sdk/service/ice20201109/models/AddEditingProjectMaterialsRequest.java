// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AddEditingProjectMaterialsRequest} extends {@link RequestModel}
 *
 * <p>AddEditingProjectMaterialsRequest</p>
 */
public class AddEditingProjectMaterialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialMaps")
    @com.aliyun.core.annotation.Validation(required = true)
    private String materialMaps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private AddEditingProjectMaterialsRequest(Builder builder) {
        super(builder);
        this.materialMaps = builder.materialMaps;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEditingProjectMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return materialMaps
     */
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<AddEditingProjectMaterialsRequest, Builder> {
        private String materialMaps; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(AddEditingProjectMaterialsRequest request) {
            super(request);
            this.materialMaps = request.materialMaps;
            this.projectId = request.projectId;
        } 

        /**
         * <p>The material ID. Separate multiple material IDs with commas (,). Each type supports up to 10 material IDs. The following material types are supported:</p>
         * <ul>
         * <li>video</li>
         * <li>audio</li>
         * <li>image</li>
         * <li>liveStream</li>
         * <li>editingProject</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;video&quot;:&quot;<em><strong><strong>2e057304fcd9b145c5cafc</strong></strong></em>&quot;, &quot;image&quot;:&quot;<strong><strong>8021a8d493da643c8acd98</strong></strong>*,<em><strong><strong>cb6307a4edea614d8b3f3c</strong></strong></em>&quot;, &quot;liveStream&quot;: &quot;[{&quot;appName&quot;:&quot;testrecord&quot;,&quot;domainName&quot;:&quot;test.alivecdn.com&quot;,&quot;liveUrl&quot;:&quot;rtmp://test.alivecdn.com/testrecord/teststream&quot;,&quot;streamName&quot;:&quot;teststream&quot;}]&quot;, &quot;editingProject&quot;: &quot;<em><strong><strong>9b145c5cafc2e057304fcd</strong></strong></em>&quot;}</p>
         */
        public Builder materialMaps(String materialMaps) {
            this.putQueryParameter("MaterialMaps", materialMaps);
            this.materialMaps = materialMaps;
            return this;
        }

        /**
         * <p>The ID of the online editing project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>b2101cb318c</strong></strong></em></p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public AddEditingProjectMaterialsRequest build() {
            return new AddEditingProjectMaterialsRequest(this);
        } 

    } 

}
