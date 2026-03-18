// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ApiKeyDTO} extends {@link TeaModel}
 *
 * <p>ApiKeyDTO</p>
 */
public class ApiKeyDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("client")
    private ClientDTO client;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("keyPreview")
    private String keyPreview;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ApiKeyDTO(Builder builder) {
        this.client = builder.client;
        this.clientId = builder.clientId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.keyPreview = builder.keyPreview;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiKeyDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return client
     */
    public ClientDTO getClient() {
        return this.client;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return keyPreview
     */
    public String getKeyPreview() {
        return this.keyPreview;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private ClientDTO client; 
        private Long clientId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String keyPreview; 
        private String name; 

        private Builder() {
        } 

        private Builder(ApiKeyDTO model) {
            this.client = model.client;
            this.clientId = model.clientId;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.keyPreview = model.keyPreview;
            this.name = model.name;
        } 

        /**
         * client.
         */
        public Builder client(ClientDTO client) {
            this.client = client;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * keyPreview.
         */
        public Builder keyPreview(String keyPreview) {
            this.keyPreview = keyPreview;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ApiKeyDTO build() {
            return new ApiKeyDTO(this);
        } 

    } 

}
