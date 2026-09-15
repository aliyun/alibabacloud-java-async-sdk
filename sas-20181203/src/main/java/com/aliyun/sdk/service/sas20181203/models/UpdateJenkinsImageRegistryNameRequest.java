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
 * {@link UpdateJenkinsImageRegistryNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateJenkinsImageRegistryNameRequest</p>
 */
public class UpdateJenkinsImageRegistryNameRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryId")
    private Long registryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryName")
    private String registryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private UpdateJenkinsImageRegistryNameRequest(Builder builder) {
        super(builder);
        this.registryId = builder.registryId;
        this.registryName = builder.registryName;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJenkinsImageRegistryNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryId
     */
    public Long getRegistryId() {
        return this.registryId;
    }

    /**
     * @return registryName
     */
    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<UpdateJenkinsImageRegistryNameRequest, Builder> {
        private Long registryId; 
        private String registryName; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJenkinsImageRegistryNameRequest request) {
            super(request);
            this.registryId = request.registryId;
            this.registryName = request.registryName;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The image repository ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>25090</p>
         */
        public Builder registryId(Long registryId) {
            this.putBodyParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        /**
         * <p>The image repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>a0603tk1</p>
         */
        public Builder registryName(String registryName) {
            this.putBodyParameter("RegistryName", registryName);
            this.registryName = registryName;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>121.33.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public UpdateJenkinsImageRegistryNameRequest build() {
            return new UpdateJenkinsImageRegistryNameRequest(this);
        } 

    } 

}
