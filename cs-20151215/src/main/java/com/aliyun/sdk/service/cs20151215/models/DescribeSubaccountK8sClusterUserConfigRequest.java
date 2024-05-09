// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the RAM user or RAM role whose cluster kubeconfig file that you want to obtain.
         */
        public Builder uid(String uid) {
            this.putPathParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * Specifies whether to obtain the kubeconfig file used to connect to the cluster over the internal network. Valid values:
         * <p>
         * 
         * *   `true`: Obtain the kubeconfig file used to connect to the cluster over the internal network.
         * *   `false`: Obtain the kubeconfig file used to connect to the cluster over the Internet.
         * 
         * Default value: `false`.
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The validity period of the temporary kubeconfig file. Unit: minutes.
         * <p>
         * 
         * Valid values: 15 to 4320 (three days).
         * 
         * > If you leave this parameter empty, the system sets a longer validity period and returns the value in the expiration parameter of the response.
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
