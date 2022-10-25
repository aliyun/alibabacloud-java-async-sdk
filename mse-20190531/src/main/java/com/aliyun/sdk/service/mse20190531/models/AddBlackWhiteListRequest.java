// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBlackWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddBlackWhiteListRequest</p>
 */
public class AddBlackWhiteListRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("IsWhite")
    private Boolean isWhite;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Note")
    private String note;

    @Query
    @NameInMap("ResourceIdJsonList")
    private String resourceIdJsonList;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    private AddBlackWhiteListRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.content = builder.content;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.isWhite = builder.isWhite;
        this.name = builder.name;
        this.note = builder.note;
        this.resourceIdJsonList = builder.resourceIdJsonList;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBlackWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return isWhite
     */
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return resourceIdJsonList
     */
    public String getResourceIdJsonList() {
        return this.resourceIdJsonList;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddBlackWhiteListRequest, Builder> {
        private String acceptLanguage; 
        private String content; 
        private String gatewayUniqueId; 
        private Boolean isWhite; 
        private String name; 
        private String note; 
        private String resourceIdJsonList; 
        private String resourceType; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddBlackWhiteListRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.content = request.content;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.isWhite = request.isWhite;
            this.name = request.name;
            this.note = request.note;
            this.resourceIdJsonList = request.resourceIdJsonList;
            this.resourceType = request.resourceType;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * IsWhite.
         */
        public Builder isWhite(Boolean isWhite) {
            this.putQueryParameter("IsWhite", isWhite);
            this.isWhite = isWhite;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * ResourceIdJsonList.
         */
        public Builder resourceIdJsonList(String resourceIdJsonList) {
            this.putQueryParameter("ResourceIdJsonList", resourceIdJsonList);
            this.resourceIdJsonList = resourceIdJsonList;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddBlackWhiteListRequest build() {
            return new AddBlackWhiteListRequest(this);
        } 

    } 

}
