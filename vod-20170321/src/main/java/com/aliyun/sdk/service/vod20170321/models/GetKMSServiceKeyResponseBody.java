// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetKMSServiceKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetKMSServiceKeyResponseBody</p>
 */
public class GetKMSServiceKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KmsKeyInfoList")
    private java.util.List<KmsKeyInfoList> kmsKeyInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetKMSServiceKeyResponseBody(Builder builder) {
        this.kmsKeyInfoList = builder.kmsKeyInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKMSServiceKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsKeyInfoList
     */
    public java.util.List<KmsKeyInfoList> getKmsKeyInfoList() {
        return this.kmsKeyInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<KmsKeyInfoList> kmsKeyInfoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetKMSServiceKeyResponseBody model) {
            this.kmsKeyInfoList = model.kmsKeyInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * KmsKeyInfoList.
         */
        public Builder kmsKeyInfoList(java.util.List<KmsKeyInfoList> kmsKeyInfoList) {
            this.kmsKeyInfoList = kmsKeyInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetKMSServiceKeyResponseBody build() {
            return new GetKMSServiceKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKMSServiceKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetKMSServiceKeyResponseBody</p>
     */
    public static class KmsKeyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("CreationDate")
        private String creationDate;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DeleteDate")
        private String deleteDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("KeyState")
        private String keyState;

        @com.aliyun.core.annotation.NameInMap("KeyUsage")
        private String keyUsage;

        private KmsKeyInfoList(Builder builder) {
            this.arn = builder.arn;
            this.creationDate = builder.creationDate;
            this.creator = builder.creator;
            this.deleteDate = builder.deleteDate;
            this.description = builder.description;
            this.keyId = builder.keyId;
            this.keyState = builder.keyState;
            this.keyUsage = builder.keyUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsKeyInfoList create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return creationDate
         */
        public String getCreationDate() {
            return this.creationDate;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deleteDate
         */
        public String getDeleteDate() {
            return this.deleteDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return keyState
         */
        public String getKeyState() {
            return this.keyState;
        }

        /**
         * @return keyUsage
         */
        public String getKeyUsage() {
            return this.keyUsage;
        }

        public static final class Builder {
            private String arn; 
            private String creationDate; 
            private String creator; 
            private String deleteDate; 
            private String description; 
            private String keyId; 
            private String keyState; 
            private String keyUsage; 

            private Builder() {
            } 

            private Builder(KmsKeyInfoList model) {
                this.arn = model.arn;
                this.creationDate = model.creationDate;
                this.creator = model.creator;
                this.deleteDate = model.deleteDate;
                this.description = model.description;
                this.keyId = model.keyId;
                this.keyState = model.keyState;
                this.keyUsage = model.keyUsage;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * CreationDate.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DeleteDate.
             */
            public Builder deleteDate(String deleteDate) {
                this.deleteDate = deleteDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * KeyId.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * KeyState.
             */
            public Builder keyState(String keyState) {
                this.keyState = keyState;
                return this;
            }

            /**
             * KeyUsage.
             */
            public Builder keyUsage(String keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            public KmsKeyInfoList build() {
                return new KmsKeyInfoList(this);
            } 

        } 

    }
}
