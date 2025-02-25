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

    private ListAbnormalyEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAbnormalyEventsResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 

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
    public static class Opts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Opts(Builder builder) {
            this.label = builder.label;
            this.params = builder.params;
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
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String label; 
            private String params; 
            private String type; 

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * params.
             */
            public Builder params(String params) {
                this.params = params;
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
        private Float createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("opts")
        private Opts opts;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.id = builder.id;
            this.instance = builder.instance;
            this.item = builder.item;
            this.opts = builder.opts;
            this.regionId = builder.regionId;
            this.type = builder.type;
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
        public Float getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return opts
         */
        public Opts getOpts() {
            return this.opts;
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

        public static final class Builder {
            private Float createdAt; 
            private String description; 
            private String id; 
            private String instance; 
            private String item; 
            private Opts opts; 
            private String regionId; 
            private String type; 

            /**
             * created_at.
             */
            public Builder createdAt(Float createdAt) {
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * opts.
             */
            public Builder opts(Opts opts) {
                this.opts = opts;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
