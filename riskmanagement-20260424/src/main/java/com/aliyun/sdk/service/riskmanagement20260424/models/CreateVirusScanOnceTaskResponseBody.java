// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link CreateVirusScanOnceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirusScanOnceTaskResponseBody</p>
 */
public class CreateVirusScanOnceTaskResponseBody extends TeaModel {
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

    private CreateVirusScanOnceTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirusScanOnceTaskResponseBody create() {
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

        private Builder(CreateVirusScanOnceTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, refer to error codes.</p>
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
         * <p>The message information.</p>
         * 
         * <strong>example:</strong>
         * <p>successful‌</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>739705BB-B0EF-554B-B3A8-383F4F93E067</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call is successful.                               </li>
         * <li><strong>false</strong>: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateVirusScanOnceTaskResponseBody build() {
            return new CreateVirusScanOnceTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateVirusScanOnceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateVirusScanOnceTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SelectionKey")
        private Integer selectionKey;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.businessType = builder.businessType;
            this.platform = builder.platform;
            this.requestId = builder.requestId;
            this.selectionKey = builder.selectionKey;
            this.targetType = builder.targetType;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return selectionKey
         */
        public Integer getSelectionKey() {
            return this.selectionKey;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String businessType; 
            private String platform; 
            private String requestId; 
            private Integer selectionKey; 
            private String targetType; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.businessType = model.businessType;
                this.platform = model.platform;
                this.requestId = model.requestId;
                this.selectionKey = model.selectionKey;
                this.targetType = model.targetType;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The asset selection business type. Valid values:</p>
             * <ul>
             * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: virus scan configuration</li>
             * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: virus scan one-time task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The operating system of the target asset. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows operating system</li>
             * <li><strong>linux</strong>: Linux operating system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1D345A09-5ABD-593C-9C26-5C2B28632CD6</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The unique identifier of this asset selection, which can be used to query or modify the assets corresponding to this selection.</p>
             * 
             * <strong>example:</strong>
             * <p>87af4d19-38fc-408d-9549-2bf7b6c2a4b9</p>
             */
            public Builder selectionKey(Integer selectionKey) {
                this.selectionKey = selectionKey;
                return this;
            }

            /**
             * <p>The target asset type. Valid values:</p>
             * <ul>
             * <li><strong>all_instance</strong>: all servers</li>
             * <li><strong>instance</strong>: select by server</li>
             * <li><strong>group</strong>: select by group</li>
             * <li><strong>vpc</strong>: select by VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all_instance</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9ef1a02e1de695cb7f9fea2c6c145853eklEsP2JP0Z</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
