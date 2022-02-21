// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IndexVideoRequest} extends {@link RequestModel}
 *
 * <p>IndexVideoRequest</p>
 */
public class IndexVideoRequest extends Request {
    @Query
    @NameInMap("ExternalId")
    private String externalId;

    @Query
    @NameInMap("NotifyEndpoint")
    private String notifyEndpoint;

    @Query
    @NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RemarksA")
    private String remarksA;

    @Query
    @NameInMap("RemarksB")
    private String remarksB;

    @Query
    @NameInMap("RemarksC")
    private String remarksC;

    @Query
    @NameInMap("RemarksD")
    private String remarksD;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    @Query
    @NameInMap("TgtUri")
    private String tgtUri;

    @Query
    @NameInMap("VideoUri")
    @Validation(required = true)
    private String videoUri;

    private IndexVideoRequest(Builder builder) {
        super(builder);
        this.externalId = builder.externalId;
        this.notifyEndpoint = builder.notifyEndpoint;
        this.notifyTopicName = builder.notifyTopicName;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.remarksA = builder.remarksA;
        this.remarksB = builder.remarksB;
        this.remarksC = builder.remarksC;
        this.remarksD = builder.remarksD;
        this.setId = builder.setId;
        this.tgtUri = builder.tgtUri;
        this.videoUri = builder.videoUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * @return notifyEndpoint
     */
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remarksA
     */
    public String getRemarksA() {
        return this.remarksA;
    }

    /**
     * @return remarksB
     */
    public String getRemarksB() {
        return this.remarksB;
    }

    /**
     * @return remarksC
     */
    public String getRemarksC() {
        return this.remarksC;
    }

    /**
     * @return remarksD
     */
    public String getRemarksD() {
        return this.remarksD;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return tgtUri
     */
    public String getTgtUri() {
        return this.tgtUri;
    }

    /**
     * @return videoUri
     */
    public String getVideoUri() {
        return this.videoUri;
    }

    public static final class Builder extends Request.Builder<IndexVideoRequest, Builder> {
        private String externalId; 
        private String notifyEndpoint; 
        private String notifyTopicName; 
        private String project; 
        private String regionId; 
        private String remarksA; 
        private String remarksB; 
        private String remarksC; 
        private String remarksD; 
        private String setId; 
        private String tgtUri; 
        private String videoUri; 

        private Builder() {
            super();
        } 

        private Builder(IndexVideoRequest response) {
            super(response);
            this.externalId = response.externalId;
            this.notifyEndpoint = response.notifyEndpoint;
            this.notifyTopicName = response.notifyTopicName;
            this.project = response.project;
            this.regionId = response.regionId;
            this.remarksA = response.remarksA;
            this.remarksB = response.remarksB;
            this.remarksC = response.remarksC;
            this.remarksD = response.remarksD;
            this.setId = response.setId;
            this.tgtUri = response.tgtUri;
            this.videoUri = response.videoUri;
        } 

        /**
         * ExternalId.
         */
        public Builder externalId(String externalId) {
            this.putQueryParameter("ExternalId", externalId);
            this.externalId = externalId;
            return this;
        }

        /**
         * NotifyEndpoint.
         */
        public Builder notifyEndpoint(String notifyEndpoint) {
            this.putQueryParameter("NotifyEndpoint", notifyEndpoint);
            this.notifyEndpoint = notifyEndpoint;
            return this;
        }

        /**
         * NotifyTopicName.
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putQueryParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemarksA.
         */
        public Builder remarksA(String remarksA) {
            this.putQueryParameter("RemarksA", remarksA);
            this.remarksA = remarksA;
            return this;
        }

        /**
         * RemarksB.
         */
        public Builder remarksB(String remarksB) {
            this.putQueryParameter("RemarksB", remarksB);
            this.remarksB = remarksB;
            return this;
        }

        /**
         * RemarksC.
         */
        public Builder remarksC(String remarksC) {
            this.putQueryParameter("RemarksC", remarksC);
            this.remarksC = remarksC;
            return this;
        }

        /**
         * RemarksD.
         */
        public Builder remarksD(String remarksD) {
            this.putQueryParameter("RemarksD", remarksD);
            this.remarksD = remarksD;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        /**
         * TgtUri.
         */
        public Builder tgtUri(String tgtUri) {
            this.putQueryParameter("TgtUri", tgtUri);
            this.tgtUri = tgtUri;
            return this;
        }

        /**
         * VideoUri.
         */
        public Builder videoUri(String videoUri) {
            this.putQueryParameter("VideoUri", videoUri);
            this.videoUri = videoUri;
            return this;
        }

        @Override
        public IndexVideoRequest build() {
            return new IndexVideoRequest(this);
        } 

    } 

}
