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
 * {@link PunishFileRequest} extends {@link RequestModel}
 *
 * <p>PunishFileRequest</p>
 */
public class PunishFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("punish_reason")
    private String punishReason;

    private PunishFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.actionCode = builder.actionCode;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.punishReason = builder.punishReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PunishFileRequest create() {
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
     * @return actionCode
     */
    public String getActionCode() {
        return this.actionCode;
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

    /**
     * @return punishReason
     */
    public String getPunishReason() {
        return this.punishReason;
    }

    public static final class Builder extends Request.Builder<PunishFileRequest, Builder> {
        private String domainId; 
        private String actionCode; 
        private String driveId; 
        private String fileId; 
        private String punishReason; 

        private Builder() {
            super();
        } 

        private Builder(PunishFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.actionCode = request.actionCode;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.punishReason = request.punishReason;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pds_file_meta_frozen</p>
         */
        public Builder actionCode(String actionCode) {
            this.putBodyParameter("action_code", actionCode);
            this.actionCode = actionCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2498DZ2</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * punish_reason.
         */
        public Builder punishReason(String punishReason) {
            this.putBodyParameter("punish_reason", punishReason);
            this.punishReason = punishReason;
            return this;
        }

        @Override
        public PunishFileRequest build() {
            return new PunishFileRequest(this);
        } 

    } 

}
