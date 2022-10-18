// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplyTicketRequest} extends {@link RequestModel}
 *
 * <p>ReplyTicketRequest</p>
 */
public class ReplyTicketRequest extends Request {
    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("Encrypt")
    @Validation(required = true)
    private Boolean encrypt;

    @Query
    @NameInMap("FileNameList")
    private java.util.List < String > fileNameList;

    @Body
    @NameInMap("TicketId")
    @Validation(required = true)
    private String ticketId;

    private ReplyTicketRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.encrypt = builder.encrypt;
        this.fileNameList = builder.fileNameList;
        this.ticketId = builder.ticketId;
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
    public java.util.List < String > getFileNameList() {
        return this.fileNameList;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    public static final class Builder extends Request.Builder<ReplyTicketRequest, Builder> {
        private String content; 
        private Boolean encrypt; 
        private java.util.List < String > fileNameList; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(ReplyTicketRequest request) {
            super(request);
            this.content = request.content;
            this.encrypt = request.encrypt;
            this.fileNameList = request.fileNameList;
            this.ticketId = request.ticketId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Encrypt.
         */
        public Builder encrypt(Boolean encrypt) {
            this.putBodyParameter("Encrypt", encrypt);
            this.encrypt = encrypt;
            return this;
        }

        /**
         * FileNameList.
         */
        public Builder fileNameList(java.util.List < String > fileNameList) {
            String fileNameListShrink = shrink(fileNameList, "FileNameList", "simple");
            this.putQueryParameter("FileNameList", fileNameListShrink);
            this.fileNameList = fileNameList;
            return this;
        }

        /**
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public ReplyTicketRequest build() {
            return new ReplyTicketRequest(this);
        } 

    } 

}
