// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvestigateFileRequest} extends {@link RequestModel}
 *
 * <p>InvestigateFileRequest</p>
 */
public class InvestigateFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_file_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < DriveFileIds> driveFileIds;

    private InvestigateFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveFileIds = builder.driveFileIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvestigateFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveFileIds
     */
    public java.util.List < DriveFileIds> getDriveFileIds() {
        return this.driveFileIds;
    }

    public static final class Builder extends Request.Builder<InvestigateFileRequest, Builder> {
        private String domainId; 
        private java.util.List < DriveFileIds> driveFileIds; 

        private Builder() {
            super();
        } 

        private Builder(InvestigateFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveFileIds = request.driveFileIds;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * drive_file_ids.
         */
        public Builder driveFileIds(java.util.List < DriveFileIds> driveFileIds) {
            this.putBodyParameter("drive_file_ids", driveFileIds);
            this.driveFileIds = driveFileIds;
            return this;
        }

        @Override
        public InvestigateFileRequest build() {
            return new InvestigateFileRequest(this);
        } 

    } 

    public static class DriveFileIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("drive_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String driveId;

        @com.aliyun.core.annotation.NameInMap("file_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        private DriveFileIds(Builder builder) {
            this.driveId = builder.driveId;
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriveFileIds create() {
            return builder().build();
        }

        /**
         * @return driveId
         */
        public String getDriveId() {
            return this.driveId;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private String driveId; 
            private String fileId; 

            /**
             * drive_id.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * file_id.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            public DriveFileIds build() {
                return new DriveFileIds(this);
            } 

        } 

    }
}
