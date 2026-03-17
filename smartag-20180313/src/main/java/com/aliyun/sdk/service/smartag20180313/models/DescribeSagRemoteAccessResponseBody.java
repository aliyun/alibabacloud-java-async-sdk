// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagRemoteAccessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagRemoteAccessResponseBody</p>
 */
public class DescribeSagRemoteAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RemoteAccesses")
    private RemoteAccesses remoteAccesses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSagRemoteAccessResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.remoteAccesses = builder.remoteAccesses;
        this.requestId = builder.requestId;
        this.smartAGId = builder.smartAGId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagRemoteAccessResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return remoteAccesses
     */
    public RemoteAccesses getRemoteAccesses() {
        return this.remoteAccesses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private RemoteAccesses remoteAccesses; 
        private String requestId; 
        private String smartAGId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeSagRemoteAccessResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.remoteAccesses = model.remoteAccesses;
            this.requestId = model.requestId;
            this.smartAGId = model.smartAGId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. The 200 error code indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message. The Successful error message indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Remote logon information about the SAG device.</p>
         */
        public Builder remoteAccesses(RemoteAccesses remoteAccesses) {
            this.remoteAccesses = remoteAccesses;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E38E950D-28A4-4C41-9428-A8908EC6AE5C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-1um5x5nwhilymw****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>Indicates whether the query task is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The query task is successful.</li>
         * <li><strong>false</strong>: The query task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSagRemoteAccessResponseBody build() {
            return new DescribeSagRemoteAccessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagRemoteAccessResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagRemoteAccessResponseBody</p>
     */
    public static class RemoteAccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemoteAccessIp")
        private String remoteAccessIp;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        private RemoteAccess(Builder builder) {
            this.remoteAccessIp = builder.remoteAccessIp;
            this.serialNumber = builder.serialNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoteAccess create() {
            return builder().build();
        }

        /**
         * @return remoteAccessIp
         */
        public String getRemoteAccessIp() {
            return this.remoteAccessIp;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public static final class Builder {
            private String remoteAccessIp; 
            private String serialNumber; 

            private Builder() {
            } 

            private Builder(RemoteAccess model) {
                this.remoteAccessIp = model.remoteAccessIp;
                this.serialNumber = model.serialNumber;
            } 

            /**
             * <p>The private IP address where the remote logon is initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder remoteAccessIp(String remoteAccessIp) {
                this.remoteAccessIp = remoteAccessIp;
                return this;
            }

            /**
             * <p>The serial number of the SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>sage62x022502****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            public RemoteAccess build() {
                return new RemoteAccess(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSagRemoteAccessResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagRemoteAccessResponseBody</p>
     */
    public static class RemoteAccesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemoteAccess")
        private java.util.List<RemoteAccess> remoteAccess;

        private RemoteAccesses(Builder builder) {
            this.remoteAccess = builder.remoteAccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoteAccesses create() {
            return builder().build();
        }

        /**
         * @return remoteAccess
         */
        public java.util.List<RemoteAccess> getRemoteAccess() {
            return this.remoteAccess;
        }

        public static final class Builder {
            private java.util.List<RemoteAccess> remoteAccess; 

            private Builder() {
            } 

            private Builder(RemoteAccesses model) {
                this.remoteAccess = model.remoteAccess;
            } 

            /**
             * RemoteAccess.
             */
            public Builder remoteAccess(java.util.List<RemoteAccess> remoteAccess) {
                this.remoteAccess = remoteAccess;
                return this;
            }

            public RemoteAccesses build() {
                return new RemoteAccesses(this);
            } 

        } 

    }
}
