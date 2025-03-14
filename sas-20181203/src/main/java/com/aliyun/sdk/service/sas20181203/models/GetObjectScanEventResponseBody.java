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
 * {@link GetObjectScanEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetObjectScanEventResponseBody</p>
 */
public class GetObjectScanEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetObjectScanEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectScanEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetObjectScanEventResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetObjectScanEventResponseBody build() {
            return new GetObjectScanEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetObjectScanEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetObjectScanEventResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoType")
        private String infoType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameDisplay")
        private String nameDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueDisplay")
        private String valueDisplay;

        private Details(Builder builder) {
            this.infoType = builder.infoType;
            this.name = builder.name;
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.value = builder.value;
            this.valueDisplay = builder.valueDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return infoType
         */
        public String getInfoType() {
            return this.infoType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameDisplay
         */
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueDisplay
         */
        public String getValueDisplay() {
            return this.valueDisplay;
        }

        public static final class Builder {
            private String infoType; 
            private String name; 
            private String nameDisplay; 
            private String type; 
            private String value; 
            private String valueDisplay; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.infoType = model.infoType;
                this.name = model.name;
                this.nameDisplay = model.nameDisplay;
                this.type = model.type;
                this.value = model.value;
                this.valueDisplay = model.valueDisplay;
            } 

            /**
             * <p>The type of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>html</p>
             */
            public Builder infoType(String infoType) {
                this.infoType = infoType;
                return this;
            }

            /**
             * <p>The name of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>DownloadUrl</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display name of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>DownloadUrl</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>The type of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>html</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>http://****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The display value of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>http://****</p>
             */
            public Builder valueDisplay(String valueDisplay) {
                this.valueDisplay = valueDisplay;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetObjectScanEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetObjectScanEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        private Data(Builder builder) {
            this.details = builder.details;
            this.eventName = builder.eventName;
            this.fileName = builder.fileName;
            this.md5 = builder.md5;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        public static final class Builder {
            private java.util.List<Details> details; 
            private String eventName; 
            private String fileName; 
            private String md5; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.details = model.details;
                this.eventName = model.eventName;
                this.fileName = model.fileName;
                this.md5 = model.md5;
            } 

            /**
             * <p>The details of the alert event.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The name of the alert item.</p>
             * 
             * <strong>example:</strong>
             * <p>WebShell</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>sca_2023****</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The MD5 hash value of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>0552c44e243abdea1729d4507bce****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
