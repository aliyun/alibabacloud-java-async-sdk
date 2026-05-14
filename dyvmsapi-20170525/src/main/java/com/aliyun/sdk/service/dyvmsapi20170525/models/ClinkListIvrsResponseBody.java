// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkListIvrsResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListIvrsResponseBody</p>
 */
public class ClinkListIvrsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkListIvrsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListIvrsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkListIvrsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClinkListIvrsResponseBody build() {
            return new ClinkListIvrsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListIvrsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListIvrsResponseBody</p>
     */
    public static class Ivrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Statistic")
        private Long statistic;

        private Ivrs(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ivrs create() {
            return builder().build();
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
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return statistic
         */
        public Long getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private Long statistic; 

            private Builder() {
            } 

            private Builder(Ivrs model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.statistic = model.statistic;
            } 

            /**
             * <p>语音导航描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>语音导航id</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>语音导航名称</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>是否开启节点统计，0：不开启；1：开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder statistic(Long statistic) {
                this.statistic = statistic;
                return this;
            }

            public Ivrs build() {
                return new Ivrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListIvrsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListIvrsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("Ivrs")
        private java.util.List<Ivrs> ivrs;

        private Data(Builder builder) {
            this.clinkRequestId = builder.clinkRequestId;
            this.ivrs = builder.ivrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return ivrs
         */
        public java.util.List<Ivrs> getIvrs() {
            return this.ivrs;
        }

        public static final class Builder {
            private String clinkRequestId; 
            private java.util.List<Ivrs> ivrs; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clinkRequestId = model.clinkRequestId;
                this.ivrs = model.ivrs;
            } 

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * <p>语音导航列表</p>
             */
            public Builder ivrs(java.util.List<Ivrs> ivrs) {
                this.ivrs = ivrs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
