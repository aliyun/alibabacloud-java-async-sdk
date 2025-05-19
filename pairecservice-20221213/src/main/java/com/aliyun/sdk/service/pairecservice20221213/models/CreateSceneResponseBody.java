// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateSceneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSceneResponseBody</p>
 */
public class CreateSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    private CreateSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneResponseBody create() {
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
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder {
        private String requestId; 
        private String sceneId; 

        private Builder() {
        } 

        private Builder(CreateSceneResponseBody model) {
            this.requestId = model.requestId;
            this.sceneId = model.sceneId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FCF741D8-9C30-578E-807F-B935487DB34A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        public CreateSceneResponseBody build() {
            return new CreateSceneResponseBody(this);
        } 

    } 

}
