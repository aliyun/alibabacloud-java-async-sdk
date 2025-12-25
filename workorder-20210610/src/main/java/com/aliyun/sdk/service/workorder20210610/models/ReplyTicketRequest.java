// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link ReplyTicketRequest} extends {@link RequestModel}
 *
 * <p>ReplyTicketRequest</p>
 */
public class ReplyTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Encrypt")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean encrypt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileNameList")
    private java.util.List<String> fileNameList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private ReplyTicketRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.encrypt = builder.encrypt;
        this.fileNameList = builder.fileNameList;
        this.ticketId = builder.ticketId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplyTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return encrypt
     */
    public Boolean getEncrypt() {
        return this.encrypt;
    }

    /**
     * @return fileNameList
     */
    public java.util.List<String> getFileNameList() {
        return this.fileNameList;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ReplyTicketRequest, Builder> {
        private String content; 
        private Boolean encrypt; 
        private java.util.List<String> fileNameList; 
        private String ticketId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(ReplyTicketRequest request) {
            super(request);
            this.content = request.content;
            this.encrypt = request.encrypt;
            this.fileNameList = request.fileNameList;
            this.ticketId = request.ticketId;
            this.uid = request.uid;
        } 

        /**
         * <p>Content of the ticket reply</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why ECS backup failed?</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>Encryption status</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encrypt(Boolean encrypt) {
            this.putBodyParameter("Encrypt", encrypt);
            this.encrypt = encrypt;
            return this;
        }

        /**
         * <p>The list of attachment names, GetAttachmentUploadUrl the ObjectKey field returned by the interface.</p>
         */
        public Builder fileNameList(java.util.List<String> fileNameList) {
            String fileNameListShrink = shrink(fileNameList, "FileNameList", "simple");
            this.putQueryParameter("FileNameList", fileNameListShrink);
            this.fileNameList = fileNameList;
            return this;
        }

        /**
         * <p>The ID of the ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0005PYGCW</p>
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * <p>Alibaba Cloud UID</p>
         * 
         * <strong>example:</strong>
         * <p>1289427240739141</p>
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ReplyTicketRequest build() {
            return new ReplyTicketRequest(this);
        } 

    } 

}
