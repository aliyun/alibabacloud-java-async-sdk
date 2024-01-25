// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncAddMaterialRequest} extends {@link RequestModel}
 *
 * <p>SyncAddMaterialRequest</p>
 */
public class SyncAddMaterialRequest extends Request {
    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private SyncAddMaterialRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncAddMaterialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<SyncAddMaterialRequest, Builder> {
        private String content; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(SyncAddMaterialRequest request) {
            super(request);
            this.content = request.content;
            this.name = request.name;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public SyncAddMaterialRequest build() {
            return new SyncAddMaterialRequest(this);
        } 

    } 

}
