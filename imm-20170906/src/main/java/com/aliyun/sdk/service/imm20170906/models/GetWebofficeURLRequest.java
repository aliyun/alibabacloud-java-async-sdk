// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebofficeURLRequest} extends {@link RequestModel}
 *
 * <p>GetWebofficeURLRequest</p>
 */
public class GetWebofficeURLRequest extends Request {
    @Query
    @NameInMap("File")
    @Validation(required = true)
    private String file;

    @Query
    @NameInMap("FileID")
    @Validation(required = true)
    private String fileID;

    @Query
    @NameInMap("Hidecmb")
    private Boolean hidecmb;

    @Query
    @NameInMap("NotifyEndpoint")
    private String notifyEndpoint;

    @Query
    @NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @Query
    @NameInMap("Permission")
    @Validation(required = true)
    private String permission;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SrcType")
    private String srcType;

    @Query
    @NameInMap("User")
    @Validation(required = true)
    private String user;

    @Query
    @NameInMap("Watermark")
    private String watermark;

    private GetWebofficeURLRequest(Builder builder) {
        super(builder);
        this.file = builder.file;
        this.fileID = builder.fileID;
        this.hidecmb = builder.hidecmb;
        this.notifyEndpoint = builder.notifyEndpoint;
        this.notifyTopicName = builder.notifyTopicName;
        this.permission = builder.permission;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.srcType = builder.srcType;
        this.user = builder.user;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebofficeURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return file
     */
    public String getFile() {
        return this.file;
    }

    /**
     * @return fileID
     */
    public String getFileID() {
        return this.fileID;
    }

    /**
     * @return hidecmb
     */
    public Boolean getHidecmb() {
        return this.hidecmb;
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
     * @return permission
     */
    public String getPermission() {
        return this.permission;
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
     * @return srcType
     */
    public String getSrcType() {
        return this.srcType;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return watermark
     */
    public String getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<GetWebofficeURLRequest, Builder> {
        private String file; 
        private String fileID; 
        private Boolean hidecmb; 
        private String notifyEndpoint; 
        private String notifyTopicName; 
        private String permission; 
        private String project; 
        private String regionId; 
        private String srcType; 
        private String user; 
        private String watermark; 

        private Builder() {
            super();
        } 

        private Builder(GetWebofficeURLRequest response) {
            super(response);
            this.file = response.file;
            this.fileID = response.fileID;
            this.hidecmb = response.hidecmb;
            this.notifyEndpoint = response.notifyEndpoint;
            this.notifyTopicName = response.notifyTopicName;
            this.permission = response.permission;
            this.project = response.project;
            this.regionId = response.regionId;
            this.srcType = response.srcType;
            this.user = response.user;
            this.watermark = response.watermark;
        } 

        /**
         * File.
         */
        public Builder file(String file) {
            this.putQueryParameter("File", file);
            this.file = file;
            return this;
        }

        /**
         * FileID.
         */
        public Builder fileID(String fileID) {
            this.putQueryParameter("FileID", fileID);
            this.fileID = fileID;
            return this;
        }

        /**
         * Hidecmb.
         */
        public Builder hidecmb(Boolean hidecmb) {
            this.putQueryParameter("Hidecmb", hidecmb);
            this.hidecmb = hidecmb;
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
         * Permission.
         */
        public Builder permission(String permission) {
            this.putQueryParameter("Permission", permission);
            this.permission = permission;
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
         * SrcType.
         */
        public Builder srcType(String srcType) {
            this.putQueryParameter("SrcType", srcType);
            this.srcType = srcType;
            return this;
        }

        /**
         * User.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(String watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        @Override
        public GetWebofficeURLRequest build() {
            return new GetWebofficeURLRequest(this);
        } 

    } 

}
