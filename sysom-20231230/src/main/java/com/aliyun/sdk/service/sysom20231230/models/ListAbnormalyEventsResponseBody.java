// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListAbnormalyEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAbnormalyEventsResponseBody</p>
 */
public class ListAbnormalyEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAbnormalyEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAbnormalyEventsResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAbnormalyEventsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.total = model.total;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAbnormalyEventsResponseBody build() {
            return new ListAbnormalyEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAbnormalyEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAbnormalyEventsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Result(Builder builder) {
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String status; 
            private String url; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAbnormalyEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAbnormalyEventsResponseBody</p>
     */
    public static class Opts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Opts(Builder builder) {
            this.label = builder.label;
            this.result = builder.result;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Opts create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String label; 
            private Result result; 
            private String type; 

            private Builder() {
            } 

            private Builder(Opts model) {
                this.label = model.label;
                this.result = model.result;
                this.type = model.type;
            } 

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Opts build() {
                return new Opts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAbnormalyEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAbnormalyEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created_at")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("diag_status")
        private Integer diagStatus;

        @com.aliyun.core.annotation.NameInMap("end_at")
        private Long endAt;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("opts")
        private java.util.List<Opts> opts;

        @com.aliyun.core.annotation.NameInMap("pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.diagStatus = builder.diagStatus;
            this.endAt = builder.endAt;
            this.instance = builder.instance;
            this.item = builder.item;
            this.level = builder.level;
            this.namespace = builder.namespace;
            this.opts = builder.opts;
            this.pod = builder.pod;
            this.regionId = builder.regionId;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diagStatus
         */
        public Integer getDiagStatus() {
            return this.diagStatus;
        }

        /**
         * @return endAt
         */
        public Long getEndAt() {
            return this.endAt;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return opts
         */
        public java.util.List<Opts> getOpts() {
            return this.opts;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long createdAt; 
            private String description; 
            private Integer diagStatus; 
            private Long endAt; 
            private String instance; 
            private String item; 
            private String level; 
            private String namespace; 
            private java.util.List<Opts> opts; 
            private String pod; 
            private String regionId; 
            private String type; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.diagStatus = model.diagStatus;
                this.endAt = model.endAt;
                this.instance = model.instance;
                this.item = model.item;
                this.level = model.level;
                this.namespace = model.namespace;
                this.opts = model.opts;
                this.pod = model.pod;
                this.regionId = model.regionId;
                this.type = model.type;
                this.uuid = model.uuid;
            } 

            /**
             * created_at.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * diag_status.
             */
            public Builder diagStatus(Integer diagStatus) {
                this.diagStatus = diagStatus;
                return this;
            }

            /**
             * end_at.
             */
            public Builder endAt(Long endAt) {
                this.endAt = endAt;
                return this;
            }

            /**
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * opts.
             */
            public Builder opts(java.util.List<Opts> opts) {
                this.opts = opts;
                return this;
            }

            /**
             * pod.
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * region_id.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * uuid.
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
