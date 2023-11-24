// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceInfo} extends {@link TeaModel}
 *
 * <p>InstanceInfo</p>
 */
public class InstanceInfo extends TeaModel {
    @NameInMap("imageUrl")
    private String imageUrl;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("status")
    private String status;

    @NameInMap("versionId")
    private String versionId;

    private InstanceInfo(Builder builder) {
        this.imageUrl = builder.imageUrl;
        this.instanceId = builder.instanceId;
        this.status = builder.status;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceInfo create() {
        return builder().build();
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String imageUrl; 
        private String instanceId; 
        private String status; 
        private String versionId; 

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public InstanceInfo build() {
            return new InstanceInfo(this);
        } 

    } 

}
