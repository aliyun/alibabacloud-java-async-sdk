// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeListAntCloudAuthScenesRequest} extends {@link RequestModel}
 *
 * <p>DescribeListAntCloudAuthScenesRequest</p>
 */
public class DescribeListAntCloudAuthScenesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    private DescribeListAntCloudAuthScenesRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListAntCloudAuthScenesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DescribeListAntCloudAuthScenesRequest, Builder> {
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeListAntCloudAuthScenesRequest request) {
            super(request);
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>Scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100000xxxx</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DescribeListAntCloudAuthScenesRequest build() {
            return new DescribeListAntCloudAuthScenesRequest(this);
        } 

    } 

}
