// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExperimentBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentBasicInfoRequest</p>
 */
public class UpdateExperimentBasicInfoRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExperimentId")
    private String experimentId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NameSpace")
    private String nameSpace;

    @Query
    @NameInMap("Tags")
    private java.util.List < String > tags;

    private UpdateExperimentBasicInfoRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.description = builder.description;
        this.experimentId = builder.experimentId;
        this.name = builder.name;
        this.nameSpace = builder.nameSpace;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentBasicInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
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
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentBasicInfoRequest, Builder> {
        private String ahasRegionId; 
        private String description; 
        private String experimentId; 
        private String name; 
        private String nameSpace; 
        private java.util.List < String > tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentBasicInfoRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.description = response.description;
            this.experimentId = response.experimentId;
            this.name = response.name;
            this.nameSpace = response.nameSpace;
            this.tags = response.tags;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
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
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateExperimentBasicInfoRequest build() {
            return new UpdateExperimentBasicInfoRequest(this);
        } 

    } 

}
