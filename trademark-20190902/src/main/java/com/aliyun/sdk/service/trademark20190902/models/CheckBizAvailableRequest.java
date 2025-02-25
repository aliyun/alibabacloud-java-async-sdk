// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBizAvailableRequest} extends {@link RequestModel}
 *
 * <p>CheckBizAvailableRequest</p>
 */
public class CheckBizAvailableRequest extends Request {
    @Query
    @NameInMap("Biz")
    @Validation(required = true)
    private String biz;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    private CheckBizAvailableRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBizAvailableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<CheckBizAvailableRequest, Builder> {
        private String biz; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(CheckBizAvailableRequest request) {
            super(request);
            this.biz = request.biz;
            this.scene = request.scene;
        } 

        /**
         * Biz.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public CheckBizAvailableRequest build() {
            return new CheckBizAvailableRequest(this);
        } 

    } 

}
