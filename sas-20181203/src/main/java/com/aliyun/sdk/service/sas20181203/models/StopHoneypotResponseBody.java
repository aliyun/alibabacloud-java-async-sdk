// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link StopHoneypotResponseBody} extends {@link TeaModel}
 *
 * <p>StopHoneypotResponseBody</p>
 */
public class StopHoneypotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private StopHoneypotResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopHoneypotResponseBody create() {
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(StopHoneypotResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public StopHoneypotResponseBody build() {
            return new StopHoneypotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StopHoneypotResponseBody} extends {@link TeaModel}
     *
     * <p>StopHoneypotResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlNodeName")
        private String controlNodeName;

        @com.aliyun.core.annotation.NameInMap("HoneypotId")
        private String honeypotId;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageDisplayName")
        private String honeypotImageDisplayName;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
        private String honeypotImageName;

        @com.aliyun.core.annotation.NameInMap("HoneypotName")
        private String honeypotName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PresetId")
        private String presetId;

        @com.aliyun.core.annotation.NameInMap("State")
        private java.util.List<String> state;

        private Data(Builder builder) {
            this.controlNodeName = builder.controlNodeName;
            this.honeypotId = builder.honeypotId;
            this.honeypotImageDisplayName = builder.honeypotImageDisplayName;
            this.honeypotImageName = builder.honeypotImageName;
            this.honeypotName = builder.honeypotName;
            this.nodeId = builder.nodeId;
            this.presetId = builder.presetId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return controlNodeName
         */
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        /**
         * @return honeypotId
         */
        public String getHoneypotId() {
            return this.honeypotId;
        }

        /**
         * @return honeypotImageDisplayName
         */
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        /**
         * @return honeypotImageName
         */
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        /**
         * @return honeypotName
         */
        public String getHoneypotName() {
            return this.honeypotName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return presetId
         */
        public String getPresetId() {
            return this.presetId;
        }

        /**
         * @return state
         */
        public java.util.List<String> getState() {
            return this.state;
        }

        public static final class Builder {
            private String controlNodeName; 
            private String honeypotId; 
            private String honeypotImageDisplayName; 
            private String honeypotImageName; 
            private String honeypotName; 
            private String nodeId; 
            private String presetId; 
            private java.util.List<String> state; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.controlNodeName = model.controlNodeName;
                this.honeypotId = model.honeypotId;
                this.honeypotImageDisplayName = model.honeypotImageDisplayName;
                this.honeypotImageName = model.honeypotImageName;
                this.honeypotName = model.honeypotName;
                this.nodeId = model.nodeId;
                this.presetId = model.presetId;
                this.state = model.state;
            } 

            /**
             * <p>The name of the management node to which the honeypot belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>managerNoden****</p>
             */
            public Builder controlNodeName(String controlNodeName) {
                this.controlNodeName = controlNodeName;
                return this;
            }

            /**
             * <p>The ID of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>9bf8cd373112263d4bc102fc5dba9d9f812ee05d4d35c487d330d52e937f****</p>
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            /**
             * <p>The display name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>RuoYi</p>
             */
            public Builder honeypotImageDisplayName(String honeypotImageDisplayName) {
                this.honeypotImageDisplayName = honeypotImageDisplayName;
                return this;
            }

            /**
             * <p>The name of the image that is used for the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>metabase</p>
             */
            public Builder honeypotImageName(String honeypotImageName) {
                this.honeypotImageName = honeypotImageName;
                return this;
            }

            /**
             * <p>The name of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>hyl-phpmya****</p>
             */
            public Builder honeypotName(String honeypotName) {
                this.honeypotName = honeypotName;
                return this;
            }

            /**
             * <p>The ID of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the honeypot custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>868a7579-00b5-4a74-999d-8bd3f411****</p>
             */
            public Builder presetId(String presetId) {
                this.presetId = presetId;
                return this;
            }

            /**
             * <p>The statuses of the honeypots.</p>
             */
            public Builder state(java.util.List<String> state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
