// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateResourceRequest} extends {@link RequestModel}
 *
 * <p>MigrateResourceRequest</p>
 */
public class MigrateResourceRequest extends Request {
    @Body
    @NameInMap("ActionCode")
    @Validation(required = true)
    private String actionCode;

    @Body
    @NameInMap("Content")
    private String content;

    private MigrateResourceRequest(Builder builder) {
        super(builder);
        this.actionCode = builder.actionCode;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionCode
     */
    public String getActionCode() {
        return this.actionCode;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<MigrateResourceRequest, Builder> {
        private String actionCode; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(MigrateResourceRequest request) {
            super(request);
            this.actionCode = request.actionCode;
            this.content = request.content;
        } 

        /**
         * ActionCode.
         */
        public Builder actionCode(String actionCode) {
            this.putBodyParameter("ActionCode", actionCode);
            this.actionCode = actionCode;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        @Override
        public MigrateResourceRequest build() {
            return new MigrateResourceRequest(this);
        } 

    } 

}
