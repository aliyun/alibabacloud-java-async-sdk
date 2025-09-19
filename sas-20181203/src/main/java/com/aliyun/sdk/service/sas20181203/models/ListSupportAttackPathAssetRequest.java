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
 * {@link ListSupportAttackPathAssetRequest} extends {@link RequestModel}
 *
 * <p>ListSupportAttackPathAssetRequest</p>
 */
public class ListSupportAttackPathAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathName")
    private String pathName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathType")
    private String pathType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String supportType;

    private ListSupportAttackPathAssetRequest(Builder builder) {
        super(builder);
        this.nodeType = builder.nodeType;
        this.pathName = builder.pathName;
        this.pathType = builder.pathType;
        this.supportType = builder.supportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportAttackPathAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return pathName
     */
    public String getPathName() {
        return this.pathName;
    }

    /**
     * @return pathType
     */
    public String getPathType() {
        return this.pathType;
    }

    /**
     * @return supportType
     */
    public String getSupportType() {
        return this.supportType;
    }

    public static final class Builder extends Request.Builder<ListSupportAttackPathAssetRequest, Builder> {
        private String nodeType; 
        private String pathName; 
        private String pathType; 
        private String supportType; 

        private Builder() {
            super();
        } 

        private Builder(ListSupportAttackPathAssetRequest request) {
            super(request);
            this.nodeType = request.nodeType;
            this.pathName = request.pathName;
            this.pathType = request.pathType;
            this.supportType = request.supportType;
        } 

        /**
         * <p>Node type, with values:</p>
         * <ul>
         * <li><strong>start</strong>: Start point.</li>
         * <li><strong>end</strong>: End point.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>Path name.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs_get_credential_by_create_login_profile</p>
         */
        public Builder pathName(String pathName) {
            this.putQueryParameter("PathName", pathName);
            this.pathName = pathName;
            return this;
        }

        /**
         * <p>Path type.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>role_escalation</p>
         */
        public Builder pathType(String pathType) {
            this.putQueryParameter("PathType", pathType);
            this.pathType = pathType;
            return this;
        }

        /**
         * <p>Support type, with values:</p>
         * <ul>
         * <li><strong>event</strong>: Attack path alert event.</li>
         * <li><strong>whitelist</strong>: Attack path whitelist.</li>
         * <li><strong>sensitive</strong>: Sensitive assets in the attack path.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>event</p>
         */
        public Builder supportType(String supportType) {
            this.putQueryParameter("SupportType", supportType);
            this.supportType = supportType;
            return this;
        }

        @Override
        public ListSupportAttackPathAssetRequest build() {
            return new ListSupportAttackPathAssetRequest(this);
        } 

    } 

}
