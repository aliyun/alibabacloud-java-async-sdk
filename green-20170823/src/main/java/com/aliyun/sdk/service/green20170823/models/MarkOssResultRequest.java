// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MarkOssResultRequest} extends {@link RequestModel}
 *
 * <p>MarkOssResultRequest</p>
 */
public class MarkOssResultRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Stock")
    @Validation(required = true)
    private Boolean stock;

    private MarkOssResultRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.lang = builder.lang;
        this.operation = builder.operation;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
        this.sourceIp = builder.sourceIp;
        this.stock = builder.stock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkOssResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return stock
     */
    public Boolean getStock() {
        return this.stock;
    }

    public static final class Builder extends Request.Builder<MarkOssResultRequest, Builder> {
        private String ids; 
        private String lang; 
        private String operation; 
        private String resourceType; 
        private String scene; 
        private String sourceIp; 
        private Boolean stock; 

        private Builder() {
            super();
        } 

        private Builder(MarkOssResultRequest request) {
            super(request);
            this.ids = request.ids;
            this.lang = request.lang;
            this.operation = request.operation;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
            this.sourceIp = request.sourceIp;
            this.stock = request.stock;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Stock.
         */
        public Builder stock(Boolean stock) {
            this.putQueryParameter("Stock", stock);
            this.stock = stock;
            return this;
        }

        @Override
        public MarkOssResultRequest build() {
            return new MarkOssResultRequest(this);
        } 

    } 

}
