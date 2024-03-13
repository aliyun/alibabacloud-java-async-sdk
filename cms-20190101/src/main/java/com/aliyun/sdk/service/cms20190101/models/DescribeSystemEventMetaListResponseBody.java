// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventMetaListResponseBody</p>
 */
public class DescribeSystemEventMetaListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSystemEventMetaListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemEventMetaListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed meta information.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSystemEventMetaListResponseBody build() {
            return new DescribeSystemEventMetaListResponseBody(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Level")
        private String level;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameDesc")
        private String nameDesc;

        @NameInMap("NameDesc.En")
        private String nameDesc_en;

        @NameInMap("Product")
        private String product;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusDesc")
        private String statusDesc;

        private Resource(Builder builder) {
            this.eventType = builder.eventType;
            this.level = builder.level;
            this.name = builder.name;
            this.nameDesc = builder.nameDesc;
            this.nameDesc_en = builder.nameDesc_en;
            this.product = builder.product;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameDesc
         */
        public String getNameDesc() {
            return this.nameDesc;
        }

        /**
         * @return nameDesc_en
         */
        public String getNameDesc_en() {
            return this.nameDesc_en;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private String eventType; 
            private String level; 
            private String name; 
            private String nameDesc; 
            private String nameDesc_en; 
            private String product; 
            private String status; 
            private String statusDesc; 

            /**
             * The type of the system event. Valid values:
             * <p>
             * 
             * *   StatusNotification
             * *   Exception
             * *   Maintenance
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   CRITICAL
             * *   WARN
             * *   INFO
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The name of the system event.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The description of the system event, in Chinese.
             */
            public Builder nameDesc(String nameDesc) {
                this.nameDesc = nameDesc;
                return this;
            }

            /**
             * NameDesc.En.
             */
            public Builder nameDesc_en(String nameDesc_en) {
                this.nameDesc_en = nameDesc_en;
                return this;
            }

            /**
             * The abbreviation of the service name.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The status of the system event.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The description of the event status.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Data(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
