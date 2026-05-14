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
 * {@link ClinkListIvrNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListIvrNodesResponseBody</p>
 */
public class ClinkListIvrNodesResponseBody extends TeaModel {
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

    private ClinkListIvrNodesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListIvrNodesResponseBody create() {
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

        private Builder(ClinkListIvrNodesResponseBody model) {
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

        public ClinkListIvrNodesResponseBody build() {
            return new ClinkListIvrNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListIvrNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListIvrNodesResponseBody</p>
     */
    public static class IvrNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("FrequentlyPath")
        private String frequentlyPath;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IvrId")
        private Long ivrId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Statistic")
        private Long statistic;

        private IvrNodes(Builder builder) {
            this.endpoint = builder.endpoint;
            this.frequentlyPath = builder.frequentlyPath;
            this.id = builder.id;
            this.ivrId = builder.ivrId;
            this.name = builder.name;
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrNodes create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return frequentlyPath
         */
        public String getFrequentlyPath() {
            return this.frequentlyPath;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ivrId
         */
        public Long getIvrId() {
            return this.ivrId;
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
            private String endpoint; 
            private String frequentlyPath; 
            private Long id; 
            private Long ivrId; 
            private String name; 
            private Long statistic; 

            private Builder() {
            } 

            private Builder(IvrNodes model) {
                this.endpoint = model.endpoint;
                this.frequentlyPath = model.frequentlyPath;
                this.id = model.id;
                this.ivrId = model.ivrId;
                this.name = model.name;
                this.statistic = model.statistic;
            } 

            /**
             * <p>语音导航节点</p>
             * 
             * <strong>example:</strong>
             * <p>E91_rp0D1</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>语音导航常用节点</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder frequentlyPath(String frequentlyPath) {
                this.frequentlyPath = frequentlyPath;
                return this;
            }

            /**
             * <p>语音导航节点id</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>语音导航id</p>
             * 
             * <strong>example:</strong>
             * <p>53</p>
             */
            public Builder ivrId(Long ivrId) {
                this.ivrId = ivrId;
                return this;
            }

            /**
             * <p>语音导航节点名称</p>
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

            public IvrNodes build() {
                return new IvrNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListIvrNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListIvrNodesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("IvrNodes")
        private java.util.List<IvrNodes> ivrNodes;

        private Data(Builder builder) {
            this.clinkRequestId = builder.clinkRequestId;
            this.ivrNodes = builder.ivrNodes;
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
         * @return ivrNodes
         */
        public java.util.List<IvrNodes> getIvrNodes() {
            return this.ivrNodes;
        }

        public static final class Builder {
            private String clinkRequestId; 
            private java.util.List<IvrNodes> ivrNodes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clinkRequestId = model.clinkRequestId;
                this.ivrNodes = model.ivrNodes;
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
             * <p>语音导航节点列表</p>
             */
            public Builder ivrNodes(java.util.List<IvrNodes> ivrNodes) {
                this.ivrNodes = ivrNodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
