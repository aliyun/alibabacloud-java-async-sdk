// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link CreateCatalogRequest} extends {@link RequestModel}
 *
 * <p>CreateCatalogRequest</p>
 */
public class CreateCatalogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isShared")
    private Boolean isShared;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareId")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateCatalogRequest(Builder builder) {
        super(builder);
        this.isShared = builder.isShared;
        this.name = builder.name;
        this.options = builder.options;
        this.shareId = builder.shareId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCatalogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isShared
     */
    public Boolean getIsShared() {
        return this.isShared;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return options
     */
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCatalogRequest, Builder> {
        private Boolean isShared; 
        private String name; 
        private java.util.Map<String, String> options; 
        private String shareId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCatalogRequest request) {
            super(request);
            this.isShared = request.isShared;
            this.name = request.name;
            this.options = request.options;
            this.shareId = request.shareId;
            this.type = request.type;
        } 

        /**
         * isShared.
         */
        public Builder isShared(Boolean isShared) {
            this.putBodyParameter("isShared", isShared);
            this.isShared = isShared;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, String> options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * shareId.
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("shareId", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCatalogRequest build() {
            return new CreateCatalogRequest(this);
        } 

    } 

}
