// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UnbindK8sSlbRequest} extends {@link RequestModel}
 *
 * <p>UnbindK8sSlbRequest</p>
 */
public class UnbindK8sSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbName")
    private String slbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UnbindK8sSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.slbName = builder.slbName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindK8sSlbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return slbName
     */
    public String getSlbName() {
        return this.slbName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UnbindK8sSlbRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private String slbName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UnbindK8sSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.clusterId = request.clusterId;
            this.slbName = request.slbName;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the cluster. You can call the GetK8sCluster operation to query the cluster ID. For more information, see <a href="https://help.aliyun.com/document_detail/181437.html">GetK8sCluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>712082c3-<strong><strong>-</strong></strong>-9217-a947b5cde6ee</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>a2d4ab12666544a479cdd0711a97****</p>
         */
        public Builder slbName(String slbName) {
            this.putQueryParameter("SlbName", slbName);
            this.slbName = slbName;
            return this;
        }

        /**
         * <p>The type of the SLB instance. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: Internet-facing SLB instance</li>
         * <li><strong>intranet</strong>: internal-facing SLB instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UnbindK8sSlbRequest build() {
            return new UnbindK8sSlbRequest(this);
        } 

    } 

}
