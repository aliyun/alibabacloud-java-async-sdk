// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BasePunishLogResponse} extends {@link TeaModel}
 *
 * <p>BasePunishLogResponse</p>
 */
public class BasePunishLogResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_message")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("punished_at")
    private String punishedAt;

    @com.aliyun.core.annotation.NameInMap("punishee")
    private Punishee punishee;

    @com.aliyun.core.annotation.NameInMap("punishment_detail")
    private PunishmentDetail punishmentDetail;

    @com.aliyun.core.annotation.NameInMap("punishment_id")
    private String punishmentId;

    @com.aliyun.core.annotation.NameInMap("punishment_operation")
    private String punishmentOperation;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private BasePunishLogResponse(BuilderImpl builder) {
        super(builder);
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.punishedAt = builder.punishedAt;
        this.punishee = builder.punishee;
        this.punishmentDetail = builder.punishmentDetail;
        this.punishmentId = builder.punishmentId;
        this.punishmentOperation = builder.punishmentOperation;
        this.status = builder.status;
    }

    public static BasePunishLogResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return punishedAt
     */
    public String getPunishedAt() {
        return this.punishedAt;
    }

    /**
     * @return punishee
     */
    public Punishee getPunishee() {
        return this.punishee;
    }

    /**
     * @return punishmentDetail
     */
    public PunishmentDetail getPunishmentDetail() {
        return this.punishmentDetail;
    }

    /**
     * @return punishmentId
     */
    public String getPunishmentId() {
        return this.punishmentId;
    }

    /**
     * @return punishmentOperation
     */
    public String getPunishmentOperation() {
        return this.punishmentOperation;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public interface Builder extends Response.Builder<BasePunishLogResponse, Builder> {

        Builder errorCode(String errorCode);

        Builder errorMessage(String errorMessage);

        Builder punishedAt(String punishedAt);

        Builder punishee(Punishee punishee);

        Builder punishmentDetail(PunishmentDetail punishmentDetail);

        Builder punishmentId(String punishmentId);

        Builder punishmentOperation(String punishmentOperation);

        Builder status(String status);

        @Override
        BasePunishLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BasePunishLogResponse, Builder>
            implements Builder {
        private String errorCode; 
        private String errorMessage; 
        private String punishedAt; 
        private Punishee punishee; 
        private PunishmentDetail punishmentDetail; 
        private String punishmentId; 
        private String punishmentOperation; 
        private String status; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BasePunishLogResponse response) {
            super(response);
            this.errorCode = response.errorCode;
            this.errorMessage = response.errorMessage;
            this.punishedAt = response.punishedAt;
            this.punishee = response.punishee;
            this.punishmentDetail = response.punishmentDetail;
            this.punishmentId = response.punishmentId;
            this.punishmentOperation = response.punishmentOperation;
            this.status = response.status;
        } 

        /**
         * error_code.
         */
        @Override
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_message.
         */
        @Override
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * punished_at.
         */
        @Override
        public Builder punishedAt(String punishedAt) {
            this.punishedAt = punishedAt;
            return this;
        }

        /**
         * punishee.
         */
        @Override
        public Builder punishee(Punishee punishee) {
            this.punishee = punishee;
            return this;
        }

        /**
         * punishment_detail.
         */
        @Override
        public Builder punishmentDetail(PunishmentDetail punishmentDetail) {
            this.punishmentDetail = punishmentDetail;
            return this;
        }

        /**
         * punishment_id.
         */
        @Override
        public Builder punishmentId(String punishmentId) {
            this.punishmentId = punishmentId;
            return this;
        }

        /**
         * punishment_operation.
         */
        @Override
        public Builder punishmentOperation(String punishmentOperation) {
            this.punishmentOperation = punishmentOperation;
            return this;
        }

        /**
         * status.
         */
        @Override
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public BasePunishLogResponse build() {
            return new BasePunishLogResponse(this);
        } 

    } 

    public static class ContentHash extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hash_hex_str")
        private String hashHexStr;

        @com.aliyun.core.annotation.NameInMap("hash_name")
        private String hashName;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        private ContentHash(Builder builder) {
            this.hashHexStr = builder.hashHexStr;
            this.hashName = builder.hashName;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentHash create() {
            return builder().build();
        }

        /**
         * @return hashHexStr
         */
        public String getHashHexStr() {
            return this.hashHexStr;
        }

        /**
         * @return hashName
         */
        public String getHashName() {
            return this.hashName;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String hashHexStr; 
            private String hashName; 
            private Long size; 

            /**
             * hash_hex_str.
             */
            public Builder hashHexStr(String hashHexStr) {
                this.hashHexStr = hashHexStr;
                return this;
            }

            /**
             * hash_name.
             */
            public Builder hashName(String hashName) {
                this.hashName = hashName;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public ContentHash build() {
                return new ContentHash(this);
            } 

        } 

    }
    public static class Punishee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content_hash")
        private ContentHash contentHash;

        @com.aliyun.core.annotation.NameInMap("drive_id")
        private String driveId;

        @com.aliyun.core.annotation.NameInMap("face_group_id")
        private String faceGroupId;

        @com.aliyun.core.annotation.NameInMap("file_id")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("revision_id")
        private String revisionId;

        @com.aliyun.core.annotation.NameInMap("share_id")
        private String shareId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private Punishee(Builder builder) {
            this.contentHash = builder.contentHash;
            this.driveId = builder.driveId;
            this.faceGroupId = builder.faceGroupId;
            this.fileId = builder.fileId;
            this.revisionId = builder.revisionId;
            this.shareId = builder.shareId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Punishee create() {
            return builder().build();
        }

        /**
         * @return contentHash
         */
        public ContentHash getContentHash() {
            return this.contentHash;
        }

        /**
         * @return driveId
         */
        public String getDriveId() {
            return this.driveId;
        }

        /**
         * @return faceGroupId
         */
        public String getFaceGroupId() {
            return this.faceGroupId;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return revisionId
         */
        public String getRevisionId() {
            return this.revisionId;
        }

        /**
         * @return shareId
         */
        public String getShareId() {
            return this.shareId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private ContentHash contentHash; 
            private String driveId; 
            private String faceGroupId; 
            private String fileId; 
            private String revisionId; 
            private String shareId; 
            private String userId; 

            /**
             * content_hash.
             */
            public Builder contentHash(ContentHash contentHash) {
                this.contentHash = contentHash;
                return this;
            }

            /**
             * drive_id.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * face_group_id.
             */
            public Builder faceGroupId(String faceGroupId) {
                this.faceGroupId = faceGroupId;
                return this;
            }

            /**
             * file_id.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * revision_id.
             */
            public Builder revisionId(String revisionId) {
                this.revisionId = revisionId;
                return this;
            }

            /**
             * share_id.
             */
            public Builder shareId(String shareId) {
                this.shareId = shareId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Punishee build() {
                return new Punishee(this);
            } 

        } 

    }
    public static class PunishmentDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action_code")
        private String actionCode;

        @com.aliyun.core.annotation.NameInMap("investigation_status")
        private Long investigationStatus;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("punish_reason")
        private String punishReason;

        @com.aliyun.core.annotation.NameInMap("punishments")
        private java.util.List < PunishRule > punishments;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private PunishmentDetail(Builder builder) {
            this.actionCode = builder.actionCode;
            this.investigationStatus = builder.investigationStatus;
            this.method = builder.method;
            this.punishReason = builder.punishReason;
            this.punishments = builder.punishments;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PunishmentDetail create() {
            return builder().build();
        }

        /**
         * @return actionCode
         */
        public String getActionCode() {
            return this.actionCode;
        }

        /**
         * @return investigationStatus
         */
        public Long getInvestigationStatus() {
            return this.investigationStatus;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return punishReason
         */
        public String getPunishReason() {
            return this.punishReason;
        }

        /**
         * @return punishments
         */
        public java.util.List < PunishRule > getPunishments() {
            return this.punishments;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String actionCode; 
            private Long investigationStatus; 
            private String method; 
            private String punishReason; 
            private java.util.List < PunishRule > punishments; 
            private String source; 

            /**
             * action_code.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * investigation_status.
             */
            public Builder investigationStatus(Long investigationStatus) {
                this.investigationStatus = investigationStatus;
                return this;
            }

            /**
             * method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * punish_reason.
             */
            public Builder punishReason(String punishReason) {
                this.punishReason = punishReason;
                return this;
            }

            /**
             * punishments.
             */
            public Builder punishments(java.util.List < PunishRule > punishments) {
                this.punishments = punishments;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public PunishmentDetail build() {
                return new PunishmentDetail(this);
            } 

        } 

    }
}
