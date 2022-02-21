// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFaceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaceGroupRequest</p>
 */
public class UpdateFaceGroupRequest extends Request {
    @Query
    @NameInMap("ExternalId")
    private String externalId;

    @Query
    @NameInMap("GroupCoverFaceId")
    private String groupCoverFaceId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

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
    @NameInMap("RemarksArrayA")
    private String remarksArrayA;

    @Query
    @NameInMap("RemarksArrayB")
    private String remarksArrayB;

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
    @NameInMap("ResetItems")
    private String resetItems;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    private UpdateFaceGroupRequest(Builder builder) {
        super(builder);
        this.externalId = builder.externalId;
        this.groupCoverFaceId = builder.groupCoverFaceId;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.remarksA = builder.remarksA;
        this.remarksArrayA = builder.remarksArrayA;
        this.remarksArrayB = builder.remarksArrayB;
        this.remarksB = builder.remarksB;
        this.remarksC = builder.remarksC;
        this.remarksD = builder.remarksD;
        this.resetItems = builder.resetItems;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaceGroupRequest create() {
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
     * @return groupCoverFaceId
     */
    public String getGroupCoverFaceId() {
        return this.groupCoverFaceId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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
     * @return remarksArrayA
     */
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    /**
     * @return remarksArrayB
     */
    public String getRemarksArrayB() {
        return this.remarksArrayB;
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
     * @return resetItems
     */
    public String getResetItems() {
        return this.resetItems;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder extends Request.Builder<UpdateFaceGroupRequest, Builder> {
        private String externalId; 
        private String groupCoverFaceId; 
        private String groupId; 
        private String groupName; 
        private String project; 
        private String regionId; 
        private String remarksA; 
        private String remarksArrayA; 
        private String remarksArrayB; 
        private String remarksB; 
        private String remarksC; 
        private String remarksD; 
        private String resetItems; 
        private String setId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFaceGroupRequest response) {
            super(response);
            this.externalId = response.externalId;
            this.groupCoverFaceId = response.groupCoverFaceId;
            this.groupId = response.groupId;
            this.groupName = response.groupName;
            this.project = response.project;
            this.regionId = response.regionId;
            this.remarksA = response.remarksA;
            this.remarksArrayA = response.remarksArrayA;
            this.remarksArrayB = response.remarksArrayB;
            this.remarksB = response.remarksB;
            this.remarksC = response.remarksC;
            this.remarksD = response.remarksD;
            this.resetItems = response.resetItems;
            this.setId = response.setId;
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
         * GroupCoverFaceId.
         */
        public Builder groupCoverFaceId(String groupCoverFaceId) {
            this.putQueryParameter("GroupCoverFaceId", groupCoverFaceId);
            this.groupCoverFaceId = groupCoverFaceId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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
         * RemarksArrayA.
         */
        public Builder remarksArrayA(String remarksArrayA) {
            this.putQueryParameter("RemarksArrayA", remarksArrayA);
            this.remarksArrayA = remarksArrayA;
            return this;
        }

        /**
         * RemarksArrayB.
         */
        public Builder remarksArrayB(String remarksArrayB) {
            this.putQueryParameter("RemarksArrayB", remarksArrayB);
            this.remarksArrayB = remarksArrayB;
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
         * ResetItems.
         */
        public Builder resetItems(String resetItems) {
            this.putQueryParameter("ResetItems", resetItems);
            this.resetItems = resetItems;
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

        @Override
        public UpdateFaceGroupRequest build() {
            return new UpdateFaceGroupRequest(this);
        } 

    } 

}
