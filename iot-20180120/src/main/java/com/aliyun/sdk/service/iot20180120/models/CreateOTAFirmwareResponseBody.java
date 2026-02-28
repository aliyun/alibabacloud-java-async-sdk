// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateOTAFirmwareResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOTAFirmwareResponseBody</p>
 */
public class CreateOTAFirmwareResponseBody extends TeaModel {
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

    private CreateOTAFirmwareResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOTAFirmwareResponseBody create() {
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

        private Builder(CreateOTAFirmwareResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The OTA update package information that is returned if the call is successful. For more information, see the &quot;<strong>Data</strong>&quot; section of this topic.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>291438BA-6E10-4C4C-B761-243B9A0D324F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful. The value indicates that the OTA update package was created.</li>
         * <li><strong>false</strong>: The call failed. The value indicates that the system failed to create the OTA update package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateOTAFirmwareResponseBody build() {
            return new CreateOTAFirmwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOTAFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOTAFirmwareResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirmwareId")
        private String firmwareId;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        private Data(Builder builder) {
            this.firmwareId = builder.firmwareId;
            this.utcCreate = builder.utcCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return firmwareId
         */
        public String getFirmwareId() {
            return this.firmwareId;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public static final class Builder {
            private String firmwareId; 
            private String utcCreate; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.firmwareId = model.firmwareId;
                this.utcCreate = model.utcCreate;
            } 

            /**
             * <p>The ID of the OTA update package. The ID is a unique identifier issued by IoT Platform to the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>s8SSHiKjpBfrM3BSN0z803****</p>
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * <p>The time when the OTA update package was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-04T06:21:54.607Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
