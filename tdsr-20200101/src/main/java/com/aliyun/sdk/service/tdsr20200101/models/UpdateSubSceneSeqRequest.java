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
 * {@link UpdateSubSceneSeqRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubSceneSeqRequest</p>
 */
public class UpdateSubSceneSeqRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortSubSceneIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> sortSubSceneIds;

    private UpdateSubSceneSeqRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
        this.sortSubSceneIds = builder.sortSubSceneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubSceneSeqRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sortSubSceneIds
     */
    public java.util.List<String> getSortSubSceneIds() {
        return this.sortSubSceneIds;
    }

    public static final class Builder extends Request.Builder<UpdateSubSceneSeqRequest, Builder> {
        private String sceneId; 
        private java.util.List<String> sortSubSceneIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubSceneSeqRequest request) {
            super(request);
            this.sceneId = request.sceneId;
            this.sortSubSceneIds = request.sortSubSceneIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgyuyewyew****</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sortSubSceneIds(java.util.List<String> sortSubSceneIds) {
            String sortSubSceneIdsShrink = shrink(sortSubSceneIds, "SortSubSceneIds", "json");
            this.putQueryParameter("SortSubSceneIds", sortSubSceneIdsShrink);
            this.sortSubSceneIds = sortSubSceneIds;
            return this;
        }

        @Override
        public UpdateSubSceneSeqRequest build() {
            return new UpdateSubSceneSeqRequest(this);
        } 

    } 

}
