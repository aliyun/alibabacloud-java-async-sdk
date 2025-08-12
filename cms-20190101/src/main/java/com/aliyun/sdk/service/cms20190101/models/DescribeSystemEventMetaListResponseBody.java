// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeSystemEventMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventMetaListResponseBody</p>
 */
public class DescribeSystemEventMetaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSystemEventMetaListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried meta information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A6582C8B-E67C-4A19-BC15-EAEFEBDC7995</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSystemEventMetaListResponseBody build() {
            return new DescribeSystemEventMetaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSystemEventMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventMetaListResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameDesc")
        private String nameDesc;

        @com.aliyun.core.annotation.NameInMap("NameDesc.En")
        private String nameDesc_en;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
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

            private Builder() {
            } 

            private Builder(Resource model) {
                this.eventType = model.eventType;
                this.level = model.level;
                this.name = model.name;
                this.nameDesc = model.nameDesc;
                this.nameDesc_en = model.nameDesc_en;
                this.product = model.product;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
            } 

            /**
             * <p>The type of the system event. Valid values:</p>
             * <ul>
             * <li>StatusNotification: fault notifications</li>
             * <li>Exception: exceptions</li>
             * <li>Maintenance: O&amp;M</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exception</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>CRITICAL</li>
             * <li>WARN</li>
             * <li>INFO</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The name of the system event.</p>
             * 
             * <strong>example:</strong>
             * <p>SelectFailureRate</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description of the event name.</p>
             * 
             * <strong>example:</strong>
             * <p>High query failure rate</p>
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
             * <p>The abbreviation of the service name.</p>
             * 
             * <strong>example:</strong>
             * <p>ADS</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The status of the system event.</p>
             * 
             * <strong>example:</strong>
             * <p>failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description of the event status.</p>
             * 
             * <strong>example:</strong>
             * <p>Operation Failed</p>
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
    /**
     * 
     * {@link DescribeSystemEventMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemEventMetaListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List<Resource> resource;

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
        public java.util.List<Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<Resource> resource; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.resource = model.resource;
            } 

            /**
             * Resource.
             */
            public Builder resource(java.util.List<Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
