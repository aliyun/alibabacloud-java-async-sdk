// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The ID of the honeypot image.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListAvailableHoneypot~~">ListAvailableHoneypot</a> operation to query the IDs of images from the <strong>HoneypotImageId</strong> response parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:ebc4c102ac407d53733c2373e8888a733ddce86f163ccbe7492ae1cbf26****</p>
         */
        public Builder honeypotImageId(String honeypotImageId) {
            this.putQueryParameter("HoneypotImageId", honeypotImageId);
            this.honeypotImageId = honeypotImageId;
            return this;
        }

        /**
         * <p>The name of the honeypot image.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListAvailableHoneypot~~">ListAvailableHoneypot</a> operation to query the names of images from the <strong>HoneypotImageName</strong> response parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HoneyPotImageName</p>
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * <p>The custom name of the honeypot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ruoyi</p>
         */
        public Builder honeypotName(String honeypotName) {
            this.putQueryParameter("HoneypotName", honeypotName);
            this.honeypotName = honeypotName;
            return this;
        }

        /**
         * <p>The custom configuration of the honeypot in the JSON format. The value contains the following fields:</p>
         * <ul>
         * <li><p><strong>trojan_git</strong>: Git-specific Defense. Valid values:</p>
         * <ul>
         * <li><strong>zip</strong>: Git Source Code Package</li>
         * <li><strong>web</strong>: Git Directory Leak</li>
         * <li><strong>close</strong>: Disabled</li>
         * </ul>
         * </li>
         * <li><p><strong>trojan_git_addr</strong>: Git Trojan Address.</p>
         * </li>
         * <li><p><strong>trojan_git.zip</strong>: Git Trojan.</p>
         * </li>
         * <li><p><strong>burp</strong>: Burp-specific Defense. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: Enable</li>
         * <li><strong>close</strong>: Disable</li>
         * </ul>
         * </li>
         * <li><p><strong>portrait_option</strong>: Source Tracing Configuration. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Disable</li>
         * <li><strong>true</strong>: Enable</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;trojan_git&quot;:&quot;close&quot;,&quot;burp&quot;:&quot;close&quot;,&quot;portrait_option&quot;:&quot;false&quot;}</p>
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * <p>The ID of the management node.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to query the IDs of management nodes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
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
