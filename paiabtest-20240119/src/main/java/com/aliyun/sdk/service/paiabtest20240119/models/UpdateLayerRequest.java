// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLayerRequest} extends {@link RequestModel}
 *
 * <p>UpdateLayerRequest</p>
 */
public class UpdateLayerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LayerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("Regionid")
    private String regionid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private UpdateLayerRequest(Builder builder) {
        super(builder);
        this.layerId = builder.layerId;
        this.regionid = builder.regionid;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLayerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return regionid
     */
    public String getRegionid() {
        return this.regionid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<UpdateLayerRequest, Builder> {
        private String layerId; 
        private String regionid; 
        private String description; 
        private String domainId; 
        private String name; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLayerRequest request) {
            super(request);
            this.layerId = request.layerId;
            this.regionid = request.regionid;
            this.description = request.description;
            this.domainId = request.domainId;
            this.name = request.name;
            this.projectId = request.projectId;
        } 

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.putPathParameter("LayerId", layerId);
            this.layerId = layerId;
            return this;
        }

        /**
         * Regionid.
         */
        public Builder regionid(String regionid) {
            this.putHostParameter("Regionid", regionid);
            this.regionid = regionid;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.putBodyParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public UpdateLayerRequest build() {
            return new UpdateLayerRequest(this);
        } 

    } 

}
