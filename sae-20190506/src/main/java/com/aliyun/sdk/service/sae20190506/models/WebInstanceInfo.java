// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebInstanceInfo} extends {@link TeaModel}
 *
 * <p>WebInstanceInfo</p>
 */
public class WebInstanceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private WebInstanceInfo(Builder builder) {
        this.imageUrl = builder.imageUrl;
        this.instanceId = builder.instanceId;
        this.status = builder.status;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebInstanceInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(WebInstanceInfo model) {
            this.imageUrl = model.imageUrl;
            this.instanceId = model.instanceId;
            this.status = model.status;
            this.versionId = model.versionId;
        } 

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public WebInstanceInfo build() {
            return new WebInstanceInfo(this);
        } 

    } 

}
