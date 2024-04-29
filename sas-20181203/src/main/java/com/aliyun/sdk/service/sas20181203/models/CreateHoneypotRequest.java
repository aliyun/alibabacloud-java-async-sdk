// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotRequest</p>
 */
public class CreateHoneypotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotImageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotImageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Meta")
    private String meta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    private CreateHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotImageId = builder.honeypotImageId;
        this.honeypotImageName = builder.honeypotImageName;
        this.honeypotName = builder.honeypotName;
        this.meta = builder.meta;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeypotImageId
     */
    public String getHoneypotImageId() {
        return this.honeypotImageId;
    }

    /**
     * @return honeypotImageName
     */
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    /**
     * @return honeypotName
     */
    public String getHoneypotName() {
        return this.honeypotName;
    }

    /**
     * @return meta
     */
    public String getMeta() {
        return this.meta;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<CreateHoneypotRequest, Builder> {
        private String honeypotImageId; 
        private String honeypotImageName; 
        private String honeypotName; 
        private String meta; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHoneypotRequest request) {
            super(request);
            this.honeypotImageId = request.honeypotImageId;
            this.honeypotImageName = request.honeypotImageName;
            this.honeypotName = request.honeypotName;
            this.meta = request.meta;
            this.nodeId = request.nodeId;
        } 

        /**
         * The ID of the honeypot image.
         * <p>
         * 
         * > You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to query the IDs of images from the **HoneypotImageId** response parameter.
         */
        public Builder honeypotImageId(String honeypotImageId) {
            this.putQueryParameter("HoneypotImageId", honeypotImageId);
            this.honeypotImageId = honeypotImageId;
            return this;
        }

        /**
         * The name of the honeypot image.
         * <p>
         * 
         * > You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to query the names of images from the **HoneypotImageName** response parameter.
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * The custom name of the honeypot.
         */
        public Builder honeypotName(String honeypotName) {
            this.putQueryParameter("HoneypotName", honeypotName);
            this.honeypotName = honeypotName;
            return this;
        }

        /**
         * The custom configuration of the honeypot in the JSON format. The value contains the following fields:
         * <p>
         * 
         * *   **trojan_git**: Git-specific Defense. Valid values:
         * 
         *     *   **zip**: Git Source Code Package
         *     *   **web**: Git Directory Leak
         *     *   **close**: Disabled
         * 
         * *   **trojan_git_addr**: Git Trojan Address.
         * 
         * *   **trojan_git.zip**: Git Trojan.
         * 
         * *   **burp**: Burp-specific Defense. Valid values:
         * 
         *     *   **open**: Enable
         *     *   **close**: Disable
         * 
         * *   **portrait_option**: Source Tracing Configuration. Valid values:
         * 
         *     *   **false**: Disable
         *     *   **true**: Enable
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * The ID of the management node.
         * <p>
         * 
         * > You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to query the IDs of management nodes.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public CreateHoneypotRequest build() {
            return new CreateHoneypotRequest(this);
        } 

    } 

}
