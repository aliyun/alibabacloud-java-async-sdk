// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeSubaccountK8sClusterUserConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubaccountK8sClusterUserConfigRequest</p>
 */
public class DescribeSubaccountK8sClusterUserConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private Boolean privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemporaryDurationMinutes")
    private Long temporaryDurationMinutes;

    private DescribeSubaccountK8sClusterUserConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.uid = builder.uid;
        this.privateIpAddress = builder.privateIpAddress;
        this.temporaryDurationMinutes = builder.temporaryDurationMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubaccountK8sClusterUserConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return privateIpAddress
     */
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return temporaryDurationMinutes
     */
    public Long getTemporaryDurationMinutes() {
        return this.temporaryDurationMinutes;
    }

    public static final class Builder extends Request.Builder<DescribeSubaccountK8sClusterUserConfigRequest, Builder> {
        private String clusterId; 
        private String uid; 
        private Boolean privateIpAddress; 
        private Long temporaryDurationMinutes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSubaccountK8sClusterUserConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.uid = request.uid;
            this.privateIpAddress = request.privateIpAddress;
            this.temporaryDurationMinutes = request.temporaryDurationMinutes;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b5e80b0b64a4bf6939d2d8f****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the RAM user or RAM role whose cluster kubeconfig file that you want to obtain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>26562443851650****</p>
         */
        public Builder uid(String uid) {
            this.putPathParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>Specifies whether to obtain the kubeconfig file used to connect to the cluster over the internal network. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Obtain the kubeconfig file used to connect to the cluster over the internal network.</li>
         * <li><code>false</code>: Obtain the kubeconfig file used to connect to the cluster over the Internet.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The validity period of the temporary kubeconfig file. Unit: minutes.</p>
         * <p>Valid values: 15 to 4320 (three days).</p>
         * <blockquote>
         * <p>If you leave this parameter empty, the system sets a longer validity period and returns the value in the expiration parameter of the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder temporaryDurationMinutes(Long temporaryDurationMinutes) {
            this.putQueryParameter("TemporaryDurationMinutes", temporaryDurationMinutes);
            this.temporaryDurationMinutes = temporaryDurationMinutes;
            return this;
        }

        @Override
        public DescribeSubaccountK8sClusterUserConfigRequest build() {
            return new DescribeSubaccountK8sClusterUserConfigRequest(this);
        } 

    } 

}
