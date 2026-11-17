// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link CustomerNoteListDetailResponseBody} extends {@link TeaModel}
 *
 * <p>CustomerNoteListDetailResponseBody</p>
 */
public class CustomerNoteListDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CustomerNoteListDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerNoteListDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CustomerNoteListDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information about the access denial returned in the POP API response when the RAM user lacks the required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code used in the POP API response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The prompt message, which is the same as Message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CustomerNoteListDetailResponseBody build() {
            return new CustomerNoteListDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CustomerNoteListDetailResponseBody} extends {@link TeaModel}
     *
     * <p>CustomerNoteListDetailResponseBody</p>
     */
    public static class Attachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Attachment(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.id = builder.id;
            this.name = builder.name;
            this.signature = builder.signature;
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachment create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long id; 
            private String name; 
            private String signature; 
            private Long size; 
            private String type; 

            private Builder() {
            } 

            private Builder(Attachment model) {
                this.downloadUrl = model.downloadUrl;
                this.id = model.id;
                this.name = model.name;
                this.signature = model.signature;
                this.size = model.size;
                this.type = model.type;
            } 

            /**
             * <p>The download URL of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv4-inner/common/v1.20251010002216.dex?Expires=1760062445&OSSAccessKeyId=x6R87i97yKeKRggz&Signature=">http://geoip-sdk-user.oss-cn-zhangjiakou.aliyuncs.com/product/v1/ipv4-inner/common/v1.20251010002216.dex?Expires=1760062445&amp;OSSAccessKeyId=x6R87i97yKeKRggz&amp;Signature=</a>****</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The ID of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>307</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>Course training</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The signature of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>hF2UrEMc4XWy990sh9LGM0+ScI8=</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The size of the attachment. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>111222121</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The type of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>image/png</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Attachment build() {
                return new Attachment(this);
            } 

        } 

    }
    /**
     * 
     * {@link CustomerNoteListDetailResponseBody} extends {@link TeaModel}
     *
     * <p>CustomerNoteListDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiResult")
        private String aiResult;

        @com.aliyun.core.annotation.NameInMap("Attachment")
        private java.util.List<Attachment> attachment;

        @com.aliyun.core.annotation.NameInMap("ContactInformation")
        private String contactInformation;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Long creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("CustomerName")
        private String customerName;

        @com.aliyun.core.annotation.NameInMap("CustomerUid")
        private Long customerUid;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("NoteContent")
        private String noteContent;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private Long noteId;

        @com.aliyun.core.annotation.NameInMap("NoteType")
        private String noteType;

        @com.aliyun.core.annotation.NameInMap("NoteTypeLabel")
        private String noteTypeLabel;

        @com.aliyun.core.annotation.NameInMap("TouchDate")
        private String touchDate;

        private Data(Builder builder) {
            this.aiResult = builder.aiResult;
            this.attachment = builder.attachment;
            this.contactInformation = builder.contactInformation;
            this.contactName = builder.contactName;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.customerName = builder.customerName;
            this.customerUid = builder.customerUid;
            this.gmtCreate = builder.gmtCreate;
            this.noteContent = builder.noteContent;
            this.noteId = builder.noteId;
            this.noteType = builder.noteType;
            this.noteTypeLabel = builder.noteTypeLabel;
            this.touchDate = builder.touchDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aiResult
         */
        public String getAiResult() {
            return this.aiResult;
        }

        /**
         * @return attachment
         */
        public java.util.List<Attachment> getAttachment() {
            return this.attachment;
        }

        /**
         * @return contactInformation
         */
        public String getContactInformation() {
            return this.contactInformation;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return customerName
         */
        public String getCustomerName() {
            return this.customerName;
        }

        /**
         * @return customerUid
         */
        public Long getCustomerUid() {
            return this.customerUid;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return noteContent
         */
        public String getNoteContent() {
            return this.noteContent;
        }

        /**
         * @return noteId
         */
        public Long getNoteId() {
            return this.noteId;
        }

        /**
         * @return noteType
         */
        public String getNoteType() {
            return this.noteType;
        }

        /**
         * @return noteTypeLabel
         */
        public String getNoteTypeLabel() {
            return this.noteTypeLabel;
        }

        /**
         * @return touchDate
         */
        public String getTouchDate() {
            return this.touchDate;
        }

        public static final class Builder {
            private String aiResult; 
            private java.util.List<Attachment> attachment; 
            private String contactInformation; 
            private String contactName; 
            private Long creator; 
            private String creatorName; 
            private String customerName; 
            private Long customerUid; 
            private String gmtCreate; 
            private String noteContent; 
            private Long noteId; 
            private String noteType; 
            private String noteTypeLabel; 
            private String touchDate; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aiResult = model.aiResult;
                this.attachment = model.attachment;
                this.contactInformation = model.contactInformation;
                this.contactName = model.contactName;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.customerName = model.customerName;
                this.customerUid = model.customerUid;
                this.gmtCreate = model.gmtCreate;
                this.noteContent = model.noteContent;
                this.noteId = model.noteId;
                this.noteType = model.noteType;
                this.noteTypeLabel = model.noteTypeLabel;
                this.touchDate = model.touchDate;
            } 

            /**
             * <p>The AI analysis result. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Contact date&quot;:&quot;2026-07-17 10:00:01&quot;}</p>
             */
            public Builder aiResult(String aiResult) {
                this.aiResult = aiResult;
                return this;
            }

            /**
             * <p>The list of attachments.</p>
             */
            public Builder attachment(java.util.List<Attachment> attachment) {
                this.attachment = attachment;
                return this;
            }

            /**
             * <p>The contact information.</p>
             * 
             * <strong>example:</strong>
             * <p>13833333333</p>
             */
            public Builder contactInformation(String contactInformation) {
                this.contactInformation = contactInformation;
                return this;
            }

            /**
             * <p>The name of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The UID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>291688841144601701</p>
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The logon name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The name of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>XXXX Co., Ltd</p>
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
                return this;
            }

            /**
             * <p>The UID of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>1271202085096245</p>
             */
            public Builder customerUid(Long customerUid) {
                this.customerUid = customerUid;
                return this;
            }

            /**
             * <p>The time when the note was created. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07 10:27:46</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The content of the note.</p>
             * 
             * <strong>example:</strong>
             * <p>Note content</p>
             */
            public Builder noteContent(String noteContent) {
                this.noteContent = noteContent;
                return this;
            }

            /**
             * <p>The ID of the note.</p>
             * 
             * <strong>example:</strong>
             * <p>1620737</p>
             */
            public Builder noteId(Long noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * <p>The type of the note.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMER</p>
             */
            public Builder noteType(String noteType) {
                this.noteType = noteType;
                return this;
            }

            /**
             * <p>The name of the note type.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer</p>
             */
            public Builder noteTypeLabel(String noteTypeLabel) {
                this.noteTypeLabel = noteTypeLabel;
                return this;
            }

            /**
             * <p>The contact date. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1784266662000</p>
             */
            public Builder touchDate(String touchDate) {
                this.touchDate = touchDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
