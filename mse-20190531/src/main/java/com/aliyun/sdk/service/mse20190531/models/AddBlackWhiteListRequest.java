// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddBlackWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddBlackWhiteListRequest</p>
 */
public class AddBlackWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsWhite")
    private Boolean isWhite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIdJsonList")
    private String resourceIdJsonList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The content of the blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>1.117.115.51</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-0fe488252dc44d55a9dd57875193****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The whitelist. Default value: No.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isWhite(Boolean isWhite) {
            this.putQueryParameter("IsWhite", isWhite);
            this.isWhite = isWhite;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a note</p>
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>The resource IDs in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[123]</p>
         */
        public Builder resourceIdJsonList(String resourceIdJsonList) {
            this.putQueryParameter("ResourceIdJsonList", resourceIdJsonList);
            this.resourceIdJsonList = resourceIdJsonList;
            return this;
        }

        /**
         * <p>The effective scope of the blacklist or whitelist. Valid values:</p>
         * <ul>
         * <li>GATEWAY</li>
         * <li>DOMAIN</li>
         * <li>ROUTE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GATEWAY</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The status of the blacklist.</p>
         * <ul>
         * <li>on: enabled</li>
         * <li>off: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of object in the blacklist or whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
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
