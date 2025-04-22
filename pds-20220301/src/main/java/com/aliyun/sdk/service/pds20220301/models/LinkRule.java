// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link LinkRule} extends {@link TeaModel}
 *
 * <p>LinkRule</p>
 */
public class LinkRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("link_type")
    private String linkType;

    @com.aliyun.core.annotation.NameInMap("src_drive_id")
    private String srcDriveId;

    @com.aliyun.core.annotation.NameInMap("src_drive_name")
    private String srcDriveName;

    @com.aliyun.core.annotation.NameInMap("src_file_id")
    private String srcFileId;

    @com.aliyun.core.annotation.NameInMap("src_file_name")
    private String srcFileName;

    @com.aliyun.core.annotation.NameInMap("src_valid")
    private Boolean srcValid;

    private LinkRule(Builder builder) {
        this.linkType = builder.linkType;
        this.srcDriveId = builder.srcDriveId;
        this.srcDriveName = builder.srcDriveName;
        this.srcFileId = builder.srcFileId;
        this.srcFileName = builder.srcFileName;
        this.srcValid = builder.srcValid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LinkRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return linkType
     */
    public String getLinkType() {
        return this.linkType;
    }

    /**
     * @return srcDriveId
     */
    public String getSrcDriveId() {
        return this.srcDriveId;
    }

    /**
     * @return srcDriveName
     */
    public String getSrcDriveName() {
        return this.srcDriveName;
    }

    /**
     * @return srcFileId
     */
    public String getSrcFileId() {
        return this.srcFileId;
    }

    /**
     * @return srcFileName
     */
    public String getSrcFileName() {
        return this.srcFileName;
    }

    /**
     * @return srcValid
     */
    public Boolean getSrcValid() {
        return this.srcValid;
    }

    public static final class Builder {
        private String linkType; 
        private String srcDriveId; 
        private String srcDriveName; 
        private String srcFileId; 
        private String srcFileName; 
        private Boolean srcValid; 

        private Builder() {
        } 

        private Builder(LinkRule model) {
            this.linkType = model.linkType;
            this.srcDriveId = model.srcDriveId;
            this.srcDriveName = model.srcDriveName;
            this.srcFileId = model.srcFileId;
            this.srcFileName = model.srcFileName;
            this.srcValid = model.srcValid;
        } 

        /**
         * link_type.
         */
        public Builder linkType(String linkType) {
            this.linkType = linkType;
            return this;
        }

        /**
         * src_drive_id.
         */
        public Builder srcDriveId(String srcDriveId) {
            this.srcDriveId = srcDriveId;
            return this;
        }

        /**
         * src_drive_name.
         */
        public Builder srcDriveName(String srcDriveName) {
            this.srcDriveName = srcDriveName;
            return this;
        }

        /**
         * src_file_id.
         */
        public Builder srcFileId(String srcFileId) {
            this.srcFileId = srcFileId;
            return this;
        }

        /**
         * src_file_name.
         */
        public Builder srcFileName(String srcFileName) {
            this.srcFileName = srcFileName;
            return this;
        }

        /**
         * src_valid.
         */
        public Builder srcValid(Boolean srcValid) {
            this.srcValid = srcValid;
            return this;
        }

        public LinkRule build() {
            return new LinkRule(this);
        } 

    } 

}
