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
 * {@link CreateAntCloudAuthSceneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAntCloudAuthSceneResponseBody</p>
 */
public class CreateAntCloudAuthSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    private CreateAntCloudAuthSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntCloudAuthSceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder {
        private String requestId; 
        private Long sceneId; 

        private Builder() {
        } 

        private Builder(CreateAntCloudAuthSceneResponseBody model) {
            this.requestId = model.requestId;
            this.sceneId = model.sceneId;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01D3BDC6-64C0-58E2-8760-3F1B56AAE299</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000015112</p>
         */
        public Builder sceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        public CreateAntCloudAuthSceneResponseBody build() {
            return new CreateAntCloudAuthSceneResponseBody(this);
        } 

    } 

}
