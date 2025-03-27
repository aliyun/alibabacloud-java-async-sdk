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
 * {@link GetCommissionDetailFileListResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommissionDetailFileListResponseBody</p>
 */
public class GetCommissionDetailFileListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCommissionDetailFileListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommissionDetailFileListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCommissionDetailFileListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCommissionDetailFileListResponseBody build() {
            return new GetCommissionDetailFileListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCommissionDetailFileListResponseBody} extends {@link TeaModel}
     *
     * <p>GetCommissionDetailFileListResponseBody</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommissionPolicyName")
        private String commissionPolicyName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        private FileList(Builder builder) {
            this.commissionPolicyName = builder.commissionPolicyName;
            this.fileType = builder.fileType;
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return commissionPolicyName
         */
        public String getCommissionPolicyName() {
            return this.commissionPolicyName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private String commissionPolicyName; 
            private String fileType; 
            private String fileUrl; 

            private Builder() {
            } 

            private Builder(FileList model) {
                this.commissionPolicyName = model.commissionPolicyName;
                this.fileType = model.fileType;
                this.fileUrl = model.fileUrl;
            } 

            /**
             * CommissionPolicyName.
             */
            public Builder commissionPolicyName(String commissionPolicyName) {
                this.commissionPolicyName = commissionPolicyName;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCommissionDetailFileListResponseBody} extends {@link TeaModel}
     *
     * <p>GetCommissionDetailFileListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillMonth")
        private String billMonth;

        @com.aliyun.core.annotation.NameInMap("FileList")
        private java.util.List<FileList> fileList;

        @com.aliyun.core.annotation.NameInMap("PartnerUid")
        private String partnerUid;

        private Data(Builder builder) {
            this.billMonth = builder.billMonth;
            this.fileList = builder.fileList;
            this.partnerUid = builder.partnerUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return billMonth
         */
        public String getBillMonth() {
            return this.billMonth;
        }

        /**
         * @return fileList
         */
        public java.util.List<FileList> getFileList() {
            return this.fileList;
        }

        /**
         * @return partnerUid
         */
        public String getPartnerUid() {
            return this.partnerUid;
        }

        public static final class Builder {
            private String billMonth; 
            private java.util.List<FileList> fileList; 
            private String partnerUid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.billMonth = model.billMonth;
                this.fileList = model.fileList;
                this.partnerUid = model.partnerUid;
            } 

            /**
             * BillMonth.
             */
            public Builder billMonth(String billMonth) {
                this.billMonth = billMonth;
                return this;
            }

            /**
             * FileList.
             */
            public Builder fileList(java.util.List<FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * PartnerUid.
             */
            public Builder partnerUid(String partnerUid) {
                this.partnerUid = partnerUid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
