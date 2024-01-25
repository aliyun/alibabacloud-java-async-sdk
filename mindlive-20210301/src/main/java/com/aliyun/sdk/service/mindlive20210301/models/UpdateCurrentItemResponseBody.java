// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCurrentItemResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCurrentItemResponseBody</p>
 */
public class UpdateCurrentItemResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UpdateCurrentItemResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCurrentItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
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

        public UpdateCurrentItemResponseBody build() {
            return new UpdateCurrentItemResponseBody(this);
        } 

    } 

    public static class ItemBackground extends TeaModel {
        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ResourceUuid")
        private String resourceUuid;

        @NameInMap("Scope")
        private String scope;

        private ItemBackground(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.fileType = builder.fileType;
            this.itemId = builder.itemId;
            this.resourceUuid = builder.resourceUuid;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemBackground create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return resourceUuid
         */
        public String getResourceUuid() {
            return this.resourceUuid;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String fileType; 
            private String itemId; 
            private String resourceUuid; 
            private String scope; 

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
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
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ResourceUuid.
             */
            public Builder resourceUuid(String resourceUuid) {
                this.resourceUuid = resourceUuid;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public ItemBackground build() {
                return new ItemBackground(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ItemBackground")
        private ItemBackground itemBackground;

        private Data(Builder builder) {
            this.itemBackground = builder.itemBackground;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return itemBackground
         */
        public ItemBackground getItemBackground() {
            return this.itemBackground;
        }

        public static final class Builder {
            private ItemBackground itemBackground; 

            /**
             * ItemBackground.
             */
            public Builder itemBackground(ItemBackground itemBackground) {
                this.itemBackground = itemBackground;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
