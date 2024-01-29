// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPublicDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>GetPublicDatasetResponseBody</p>
 */
public class GetPublicDatasetResponseBody extends TeaModel {
    @NameInMap("About")
    private String about;

    @NameInMap("AccessRequirements")
    private String accessRequirements;

    @NameInMap("Copyright")
    private String copyright;

    @NameInMap("DatasetDescription")
    private String datasetDescription;

    @NameInMap("DatasetName")
    private String datasetName;

    @NameInMap("HostId")
    private String hostId;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("Locations")
    private java.util.List < String > locations;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tags")
    private java.util.List < String > tags;

    @NameInMap("UpdateFrequency")
    private String updateFrequency;

    private GetPublicDatasetResponseBody(Builder builder) {
        this.about = builder.about;
        this.accessRequirements = builder.accessRequirements;
        this.copyright = builder.copyright;
        this.datasetDescription = builder.datasetDescription;
        this.datasetName = builder.datasetName;
        this.hostId = builder.hostId;
        this.lastModified = builder.lastModified;
        this.locations = builder.locations;
        this.requestId = builder.requestId;
        this.tags = builder.tags;
        this.updateFrequency = builder.updateFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublicDatasetResponseBody create() {
        return builder().build();
    }

    /**
     * @return about
     */
    public String getAbout() {
        return this.about;
    }

    /**
     * @return accessRequirements
     */
    public String getAccessRequirements() {
        return this.accessRequirements;
    }

    /**
     * @return copyright
     */
    public String getCopyright() {
        return this.copyright;
    }

    /**
     * @return datasetDescription
     */
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * @return locations
     */
    public java.util.List < String > getLocations() {
        return this.locations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return updateFrequency
     */
    public String getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static final class Builder {
        private String about; 
        private String accessRequirements; 
        private String copyright; 
        private String datasetDescription; 
        private String datasetName; 
        private String hostId; 
        private String lastModified; 
        private java.util.List < String > locations; 
        private String requestId; 
        private java.util.List < String > tags; 
        private String updateFrequency; 

        /**
         * About.
         */
        public Builder about(String about) {
            this.about = about;
            return this;
        }

        /**
         * AccessRequirements.
         */
        public Builder accessRequirements(String accessRequirements) {
            this.accessRequirements = accessRequirements;
            return this;
        }

        /**
         * Copyright.
         */
        public Builder copyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        /**
         * DatasetDescription.
         */
        public Builder datasetDescription(String datasetDescription) {
            this.datasetDescription = datasetDescription;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * LastModified.
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * Locations.
         */
        public Builder locations(java.util.List < String > locations) {
            this.locations = locations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * UpdateFrequency.
         */
        public Builder updateFrequency(String updateFrequency) {
            this.updateFrequency = updateFrequency;
            return this;
        }

        public GetPublicDatasetResponseBody build() {
            return new GetPublicDatasetResponseBody(this);
        } 

    } 

}
