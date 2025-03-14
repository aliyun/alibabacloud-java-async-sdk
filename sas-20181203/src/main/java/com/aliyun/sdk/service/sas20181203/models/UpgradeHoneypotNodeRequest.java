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
 * {@link UpgradeHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>UpgradeHoneypotNodeRequest</p>
 */
public class UpgradeHoneypotNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowHoneypotAccessInternet")
    private Boolean allowHoneypotAccessInternet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private UpgradeHoneypotNodeRequest(Builder builder) {
        super(builder);
        this.allowHoneypotAccessInternet = builder.allowHoneypotAccessInternet;
        this.lang = builder.lang;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeHoneypotNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowHoneypotAccessInternet
     */
    public Boolean getAllowHoneypotAccessInternet() {
        return this.allowHoneypotAccessInternet;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<UpgradeHoneypotNodeRequest, Builder> {
        private Boolean allowHoneypotAccessInternet; 
        private String lang; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeHoneypotNodeRequest request) {
            super(request);
            this.allowHoneypotAccessInternet = request.allowHoneypotAccessInternet;
            this.lang = request.lang;
            this.nodeId = request.nodeId;
        } 

        /**
         * <p>Specifies whether to allow the honeypot to access the Internet. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
            this.putQueryParameter("AllowHoneypotAccessInternet", allowHoneypotAccessInternet);
            this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
            return this;
        }

        /**
         * <p>The language of the content within the request and response.</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the management node that you want to upgrade.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to obtain the ID.</p>
         * </blockquote>
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
        public UpgradeHoneypotNodeRequest build() {
            return new UpgradeHoneypotNodeRequest(this);
        } 

    } 

}
