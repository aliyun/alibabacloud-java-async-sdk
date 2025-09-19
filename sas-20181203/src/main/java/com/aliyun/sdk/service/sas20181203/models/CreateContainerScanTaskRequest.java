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
 * {@link CreateContainerScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateContainerScanTaskRequest</p>
 */
public class CreateContainerScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerIds")
    private String containerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private CreateContainerScanTaskRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerIds = builder.containerIds;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContainerScanTaskRequest create() {
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
     * @return containerIds
     */
    public String getContainerIds() {
        return this.containerIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<CreateContainerScanTaskRequest, Builder> {
        private String clusterId; 
        private String containerIds; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CreateContainerScanTaskRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerIds = request.containerIds;
            this.lang = request.lang;
        } 

        /**
         * <p>The ID of the cluster to which the container belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c22143730ab6e40b09ec7c1c51d4d****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>c927cf190e886696db53cda0efb57145394ccf0bf9f525353fa5c22a26e4****</p>
         */
        public Builder containerIds(String containerIds) {
            this.putQueryParameter("ContainerIds", containerIds);
            this.containerIds = containerIds;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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

        @Override
        public CreateContainerScanTaskRequest build() {
            return new CreateContainerScanTaskRequest(this);
        } 

    } 

}
