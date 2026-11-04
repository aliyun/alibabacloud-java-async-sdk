// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link TransferDeviceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>TransferDeviceInstanceResponseBody</p>
 */
public class TransferDeviceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TransferDeviceInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferDeviceInstanceResponseBody create() {
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TransferDeviceInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code:</p>
         * <ul>
         * <li><strong>200</strong>: The call was successful.</li>
         * <li>Other values: The call failed. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The source instance and the target instance cannot be the same</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>27AF2E38-12ED-4F67-BD20-36E812CD7A42</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TransferDeviceInstanceResponseBody build() {
            return new TransferDeviceInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TransferDeviceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>TransferDeviceInstanceResponseBody</p>
     */
    public static class FailedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private FailedList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String deviceName; 
            private String message; 

            private Builder() {
            } 

            private Builder(FailedList model) {
                this.deviceName = model.deviceName;
                this.message = model.message;
            } 

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>e5jdfalekj****</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The description of the failed transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>The device has already been transferred or does not belong to the source instance</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public FailedList build() {
                return new FailedList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransferDeviceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>TransferDeviceInstanceResponseBody</p>
     */
    public static class SuccessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private SuccessList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String deviceName; 
            private String message; 

            private Builder() {
            } 

            private Builder(SuccessList model) {
                this.deviceName = model.deviceName;
                this.message = model.message;
            } 

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>e598798j****</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The description of the successful transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public SuccessList build() {
                return new SuccessList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransferDeviceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>TransferDeviceInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedList")
        private java.util.List<FailedList> failedList;

        @com.aliyun.core.annotation.NameInMap("SuccessList")
        private java.util.List<SuccessList> successList;

        private Data(Builder builder) {
            this.failedList = builder.failedList;
            this.successList = builder.successList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedList
         */
        public java.util.List<FailedList> getFailedList() {
            return this.failedList;
        }

        /**
         * @return successList
         */
        public java.util.List<SuccessList> getSuccessList() {
            return this.successList;
        }

        public static final class Builder {
            private java.util.List<FailedList> failedList; 
            private java.util.List<SuccessList> successList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedList = model.failedList;
                this.successList = model.successList;
            } 

            /**
             * <p>The list of devices that failed to be transferred.</p>
             */
            public Builder failedList(java.util.List<FailedList> failedList) {
                this.failedList = failedList;
                return this;
            }

            /**
             * <p>The list of devices that were successfully transferred.</p>
             */
            public Builder successList(java.util.List<SuccessList> successList) {
                this.successList = successList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
