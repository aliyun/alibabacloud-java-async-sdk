// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportPrometheusRulesRequest} extends {@link RequestModel}
 *
 * <p>ImportPrometheusRulesRequest</p>
 */
public class ImportPrometheusRulesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NameSpace")
    @Validation(required = true)
    private String nameSpace;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ImportPrometheusRulesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.content = builder.content;
        this.name = builder.name;
        this.nameSpace = builder.nameSpace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportPrometheusRulesRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ImportPrometheusRulesRequest, Builder> {
        private String clusterId; 
        private String content; 
        private String name; 
        private String nameSpace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ImportPrometheusRulesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.content = request.content;
            this.name = request.name;
            this.nameSpace = request.nameSpace;
            this.regionId = request.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NameSpace.
         */
        public Builder nameSpace(String nameSpace) {
            this.putQueryParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ImportPrometheusRulesRequest build() {
            return new ImportPrometheusRulesRequest(this);
        } 

    } 

}
