// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link SaveHotspotTagListRequest} extends {@link RequestModel}
 *
 * <p>SaveHotspotTagListRequest</p>
 */
public class SaveHotspotTagListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotspotListJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotspotListJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private SaveHotspotTagListRequest(Builder builder) {
        super(builder);
        this.hotspotListJson = builder.hotspotListJson;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveHotspotTagListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotspotListJson
     */
    public String getHotspotListJson() {
        return this.hotspotListJson;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<SaveHotspotTagListRequest, Builder> {
        private String hotspotListJson; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(SaveHotspotTagListRequest request) {
            super(request);
            this.hotspotListJson = request.hotspotListJson;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{}]</p>
         */
        public Builder hotspotListJson(String hotspotListJson) {
            this.putQueryParameter("HotspotListJson", hotspotListJson);
            this.hotspotListJson = hotspotListJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tqwiuwetwet****</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public SaveHotspotTagListRequest build() {
            return new SaveHotspotTagListRequest(this);
        } 

    } 

}
