// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link ApplyScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>ApplyScalingGroupRequest</p>
 */
public class ApplyScalingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Format")
    private String format;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ApplyScalingGroupRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.format = builder.format;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyScalingGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ApplyScalingGroupRequest, Builder> {
        private String content; 
        private String format; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyScalingGroupRequest request) {
            super(request);
            this.content = request.content;
            this.format = request.format;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The content of the configuration file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: apps/v1
         * kind: Deployment
         * metadata:
         *   name: nginx-deployment
         *   labels:
         *     app: nginx
         * spec:
         *   replicas: 3
         *   selector:
         *     matchLabels:
         *       app: nginx
         *   template:
         *     metadata:
         *       labels:
         *         app: nginx
         *       annotations:
         *         k8s.aliyun.com/eip-bandwidth: 10
         *         k8s.aliyun.com/eci-with-eip: true
         *     spec:
         *       containers:
         *       - name: nginx
         *         image: nginx:1.14.2
         *         ports:
         *         - containerPort: 80</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>Optional. The format of the configuration file. Default value: YAML. Set the value to YAML.</p>
         * 
         * <strong>example:</strong>
         * <p>YAML</p>
         */
        public Builder format(String format) {
            this.putQueryParameter("Format", format);
            this.format = format;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ApplyScalingGroupRequest build() {
            return new ApplyScalingGroupRequest(this);
        } 

    } 

}
